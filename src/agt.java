import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;
import java.util.function.IntConsumer;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;

public class agt {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> te.a("commands.function.error.argument_not_compound", $$0));
   public static final SuggestionProvider<ds> a = ($$0, $$1) -> {
      afd $$2 = ((ds)$$0.getSource()).l().aA();
      dv.a($$2.f(), $$1, "#");
      return dv.a($$2.e(), $$1);
   };

   public static void a(CommandDispatcher<ds> $$0) {
      LiteralArgumentBuilder<ds> $$1 = dt.a("with");

      for (aja.c $$2 : aja.c) {
         $$2.a(
            $$1,
            $$1x -> $$1x.executes($$1xx -> a((ds)$$1xx.getSource(), fu.a($$1xx, "name"), $$2.a($$1xx).a()))
                  .then(dt.a("path", ei.a()).executes($$1xx -> a((ds)$$1xx.getSource(), fu.a($$1xx, "name"), a(ei.a($$1xx, "path"), $$2.a($$1xx)))))
         );
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("function").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("name", fu.a())
                        .suggests(a)
                        .executes($$0x -> a((ds)$$0x.getSource(), fu.a($$0x, "name"), null)))
                     .then(dt.a("arguments", ea.a()).executes($$0x -> a((ds)$$0x.getSource(), fu.a($$0x, "name"), ea.a($$0x, "arguments")))))
                  .then($$1)
            )
      );
   }

   private static qs a(ei.g $$0, aiz $$1) throws CommandSyntaxException {
      rl $$2 = aja.a($$0, $$1);
      if ($$2 instanceof qs) {
         return (qs)$$2;
      } else {
         throw b.create($$2.c().a());
      }
   }

   private static int a(ds $$0, Collection<dn> $$1, @Nullable qs $$2) {
      int $$3 = 0;
      boolean $$4 = false;
      boolean $$5 = false;

      for (dn $$6 : $$1) {
         try {
            agt.a $$7 = a($$0, $$6, $$2);
            $$3 += $$7.a();
            $$4 |= $$7.b();
            $$5 = true;
         } catch (du var9) {
            $$0.b(var9.a());
         }
      }

      if ($$5) {
         int $$9 = $$3;
         if ($$1.size() == 1) {
            if ($$4) {
               $$0.a(() -> te.a("commands.function.success.single.result", $$9, $$1.iterator().next().a()), true);
            } else {
               $$0.a(() -> te.a("commands.function.success.single", $$9, $$1.iterator().next().a()), true);
            }
         } else if ($$4) {
            $$0.a(() -> te.a("commands.function.success.multiple.result", $$1.size()), true);
         } else {
            $$0.a(() -> te.a("commands.function.success.multiple", $$9, $$1.size()), true);
         }
      }

      return $$3;
   }

   public static agt.a a(ds $$0, dn $$1, @Nullable qs $$2) throws du {
      MutableObject<agt.a> $$3 = new MutableObject();
      int $$4 = $$0.l().aA().a($$1, $$0.a().b(2).a((IntConsumer)($$1x -> $$3.setValue(new agt.a($$1x, true)))), null, $$2);
      agt.a $$5 = (agt.a)$$3.getValue();
      return $$5 != null ? $$5 : new agt.a($$4, false);
   }

   public static record a(int a, boolean b) {
   }
}
