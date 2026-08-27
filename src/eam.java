import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import java.util.Map;
import java.util.Set;

public class eam extends eay {
   static final Map<acq, eam.c> a = Maps.newHashMap();
   final ckg b;
   final eam.b c;

   eam(eck[] $$0, ckg $$1, eam.b $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eba b() {
      return ebb.q;
   }

   @Override
   public Set<ebt<?>> a() {
      return ImmutableSet.of(ebw.i);
   }

   @Override
   public cfz a(cfz $$0, dzk $$1) {
      cfz $$2 = $$1.c(ebw.i);
      if ($$2 != null) {
         int $$3 = cki.a(this.b, $$2);
         int $$4 = this.c.a($$1.b(), $$0.L(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static eay.a<?> a(ckg $$0, float $$1, int $$2) {
      return a($$3 -> new eam($$3, $$0, new eam.a($$2, $$1)));
   }

   public static eay.a<?> a(ckg $$0) {
      return a($$1 -> new eam($$1, $$0, new eam.d()));
   }

   public static eay.a<?> b(ckg $$0) {
      return a($$1 -> new eam($$1, $$0, new eam.f(1)));
   }

   public static eay.a<?> a(ckg $$0, int $$1) {
      return a($$2 -> new eam($$2, $$0, new eam.f($$1)));
   }

   static {
      a.put(eam.a.a, eam.a::a);
      a.put(eam.d.a, eam.d::a);
      a.put(eam.f.a, eam.f::a);
   }

   static final class a implements eam.b {
      public static final acq a = new acq("binomial_with_bonus_count");
      private final int b;
      private final float c;

      public a(int $$0, float $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public int a(apf $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public void a(JsonObject $$0, JsonSerializationContext $$1) {
         $$0.addProperty("extra", this.b);
         $$0.addProperty("probability", this.c);
      }

      public static eam.b a(JsonObject $$0, JsonDeserializationContext $$1) {
         int $$2 = aor.o($$0, "extra");
         float $$3 = aor.m($$0, "probability");
         return new eam.a($$2, $$3);
      }

      @Override
      public acq a() {
         return a;
      }
   }

   interface b {
      int a(apf var1, int var2, int var3);

      void a(JsonObject var1, JsonSerializationContext var2);

      acq a();
   }

   interface c {
      eam.b deserialize(JsonObject var1, JsonDeserializationContext var2);
   }

   static final class d implements eam.b {
      public static final acq a = new acq("ore_drops");

      @Override
      public int a(apf $$0, int $$1, int $$2) {
         if ($$2 > 0) {
            int $$3 = $$0.a($$2 + 2) - 1;
            if ($$3 < 0) {
               $$3 = 0;
            }

            return $$1 * ($$3 + 1);
         } else {
            return $$1;
         }
      }

      @Override
      public void a(JsonObject $$0, JsonSerializationContext $$1) {
      }

      public static eam.b a(JsonObject $$0, JsonDeserializationContext $$1) {
         return new eam.d();
      }

      @Override
      public acq a() {
         return a;
      }
   }

   public static class e extends eay.c<eam> {
      public void a(JsonObject $$0, eam $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("enchantment", jb.g.b($$1.b).toString());
         $$0.addProperty("formula", $$1.c.a().toString());
         JsonObject $$3 = new JsonObject();
         $$1.c.a($$3, $$2);
         if ($$3.size() > 0) {
            $$0.add("parameters", $$3);
         }
      }

      public eam a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         acq $$3 = new acq(aor.i($$0, "enchantment"));
         ckg $$4 = jb.g.b($$3).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + $$3));
         acq $$5 = new acq(aor.i($$0, "formula"));
         eam.c $$6 = eam.a.get($$5);
         if ($$6 == null) {
            throw new JsonParseException("Invalid formula id: " + $$5);
         } else {
            eam.b $$7;
            if ($$0.has("parameters")) {
               $$7 = $$6.deserialize(aor.u($$0, "parameters"), $$1);
            } else {
               $$7 = $$6.deserialize(new JsonObject(), $$1);
            }

            return new eam($$2, $$4, $$7);
         }
      }
   }

   static final class f implements eam.b {
      public static final acq a = new acq("uniform_bonus_count");
      private final int b;

      public f(int $$0) {
         this.b = $$0;
      }

      @Override
      public int a(apf $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.b * $$2 + 1);
      }

      @Override
      public void a(JsonObject $$0, JsonSerializationContext $$1) {
         $$0.addProperty("bonusMultiplier", this.b);
      }

      public static eam.b a(JsonObject $$0, JsonDeserializationContext $$1) {
         int $$2 = aor.o($$0, "bonusMultiplier");
         return new eam.f($$2);
      }

      @Override
      public acq a() {
         return a;
      }
   }
}
