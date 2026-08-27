import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import org.apache.commons.lang3.StringUtils;

public class axc extends DataFix {
   public axc(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.update("pages", $$1 -> (Dynamic)DataFixUtils.orElse($$1.asStreamOpt().map($$0xx -> $$0xx.map($$0xxx -> {
               if (!$$0xxx.asString().result().isPresent()) {
                  return $$0xxx;
               } else {
                  String $$1x = $$0xxx.asString("");
                  te $$2 = null;
                  if (!"null".equals($$1x) && !StringUtils.isEmpty($$1x)) {
                     if ($$1x.charAt(0) == '"' && $$1x.charAt($$1x.length() - 1) == '"' || $$1x.charAt(0) == '{' && $$1x.charAt($$1x.length() - 1) == '}') {
                        try {
                           $$2 = arf.b(atp.a, $$1x, te.class, true);
                           if ($$2 == null) {
                              $$2 = td.a;
                           }
                        } catch (Exception var6) {
                        }

                        if ($$2 == null) {
                           try {
                              $$2 = te.a.a($$1x);
                           } catch (Exception var5) {
                           }
                        }

                        if ($$2 == null) {
                           try {
                              $$2 = te.a.b($$1x);
                           } catch (Exception var4) {
                           }
                        }

                        if ($$2 == null) {
                           $$2 = te.b($$1x);
                        }
                     } else {
                        $$2 = te.b($$1x);
                     }
                  } else {
                     $$2 = td.a;
                  }

                  return $$0xxx.createString(te.a.a($$2));
               }
            })).map($$0::createList).result(), $$0.emptyList()));
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(aym.t);
      OpticFinder<?> $$1 = $$0.findField("tag");
      return this.fixTypeEverywhereTyped(
         "ItemWrittenBookPagesStrictJsonFix", $$0, $$1x -> $$1x.updateTyped($$1, $$0xx -> $$0xx.update(DSL.remainderFinder(), this::a))
      );
   }
}
