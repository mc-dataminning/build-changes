import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import java.util.Map;
import java.util.Set;

public class edj extends edv {
   static final Map<aep, edj.c> a = Maps.newHashMap();
   final cnd b;
   final edj.b c;

   edj(efh[] $$0, cnd $$1, edj.b $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public edx b() {
      return edy.q;
   }

   @Override
   public Set<eeq<?>> a() {
      return ImmutableSet.of(eet.i);
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      ciw $$2 = $$1.c(eet.i);
      if ($$2 != null) {
         int $$3 = cnf.a(this.b, $$2);
         int $$4 = this.c.a($$1.b(), $$0.L(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static edv.a<?> a(cnd $$0, float $$1, int $$2) {
      return a($$3 -> new edj($$3, $$0, new edj.a($$2, $$1)));
   }

   public static edv.a<?> a(cnd $$0) {
      return a($$1 -> new edj($$1, $$0, new edj.d()));
   }

   public static edv.a<?> b(cnd $$0) {
      return a($$1 -> new edj($$1, $$0, new edj.f(1)));
   }

   public static edv.a<?> a(cnd $$0, int $$1) {
      return a($$2 -> new edj($$2, $$0, new edj.f($$1)));
   }

   static {
      a.put(edj.a.a, edj.a::a);
      a.put(edj.d.a, edj.d::a);
      a.put(edj.f.a, edj.f::a);
   }

   static final class a implements edj.b {
      public static final aep a = new aep("binomial_with_bonus_count");
      private final int b;
      private final float c;

      public a(int $$0, float $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public int a(art $$0, int $$1, int $$2) {
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

      public static edj.b a(JsonObject $$0, JsonDeserializationContext $$1) {
         int $$2 = arf.o($$0, "extra");
         float $$3 = arf.m($$0, "probability");
         return new edj.a($$2, $$3);
      }

      @Override
      public aep a() {
         return a;
      }
   }

   interface b {
      int a(art var1, int var2, int var3);

      void a(JsonObject var1, JsonSerializationContext var2);

      aep a();
   }

   interface c {
      edj.b deserialize(JsonObject var1, JsonDeserializationContext var2);
   }

   static final class d implements edj.b {
      public static final aep a = new aep("ore_drops");

      @Override
      public int a(art $$0, int $$1, int $$2) {
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

      public static edj.b a(JsonObject $$0, JsonDeserializationContext $$1) {
         return new edj.d();
      }

      @Override
      public aep a() {
         return a;
      }
   }

   public static class e extends edv.c<edj> {
      public void a(JsonObject $$0, edj $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("enchantment", jc.g.b($$1.b).toString());
         $$0.addProperty("formula", $$1.c.a().toString());
         JsonObject $$3 = new JsonObject();
         $$1.c.a($$3, $$2);
         if ($$3.size() > 0) {
            $$0.add("parameters", $$3);
         }
      }

      public edj a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         aep $$3 = new aep(arf.i($$0, "enchantment"));
         cnd $$4 = jc.g.b($$3).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + $$3));
         aep $$5 = new aep(arf.i($$0, "formula"));
         edj.c $$6 = edj.a.get($$5);
         if ($$6 == null) {
            throw new JsonParseException("Invalid formula id: " + $$5);
         } else {
            edj.b $$7;
            if ($$0.has("parameters")) {
               $$7 = $$6.deserialize(arf.u($$0, "parameters"), $$1);
            } else {
               $$7 = $$6.deserialize(new JsonObject(), $$1);
            }

            return new edj($$2, $$4, $$7);
         }
      }
   }

   static final class f implements edj.b {
      public static final aep a = new aep("uniform_bonus_count");
      private final int b;

      public f(int $$0) {
         this.b = $$0;
      }

      @Override
      public int a(art $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.b * $$2 + 1);
      }

      @Override
      public void a(JsonObject $$0, JsonSerializationContext $$1) {
         $$0.addProperty("bonusMultiplier", this.b);
      }

      public static edj.b a(JsonObject $$0, JsonDeserializationContext $$1) {
         int $$2 = arf.o($$0, "bonusMultiplier");
         return new edj.f($$2);
      }

      @Override
      public aep a() {
         return a;
      }
   }
}
