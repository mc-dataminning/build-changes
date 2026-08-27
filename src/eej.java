import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eej extends edv {
   private static final Logger a = LogUtils.getLogger();
   final te b;
   @Nullable
   final ech.b c;

   eej(efh[] $$0, @Nullable te $$1, @Nullable ech.b $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public edx b() {
      return edy.k;
   }

   @Override
   public Set<eeq<?>> a() {
      return this.c != null ? ImmutableSet.of(this.c.a()) : ImmutableSet.of();
   }

   public static UnaryOperator<te> a(ech $$0, @Nullable ech.b $$1) {
      if ($$1 != null) {
         big $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ds $$3 = $$2.dc().a(2);
            return $$2x -> {
               try {
                  return tg.a($$3, $$2x, $$2, 0);
               } catch (CommandSyntaxException var4) {
                  a.warn("Failed to resolve text component", var4);
                  return $$2x;
               }
            };
         }
      }

      return $$0x -> $$0x;
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      if (this.b != null) {
         $$0.a(a($$1, this.c).apply(this.b));
      }

      return $$0;
   }

   public static edv.a<?> a(te $$0) {
      return a($$1 -> new eej($$1, $$0, null));
   }

   public static edv.a<?> a(te $$0, ech.b $$1) {
      return a($$2 -> new eej($$2, $$0, $$1));
   }

   public static class a extends edv.c<eej> {
      public void a(JsonObject $$0, eej $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         if ($$1.b != null) {
            $$0.add("name", te.a.c($$1.b));
         }

         if ($$1.c != null) {
            $$0.add("entity", $$2.serialize($$1.c));
         }
      }

      public eej a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         te $$3 = te.a.a($$0.get("name"));
         ech.b $$4 = arf.a($$0, "entity", null, $$1, ech.b.class);
         return new eej($$2, $$3, $$4);
      }
   }
}
