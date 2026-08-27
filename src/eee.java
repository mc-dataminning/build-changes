import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class eee extends edv {
   final Map<cnd, egc> a;
   final boolean b;

   eee(efh[] $$0, Map<cnd, egc> $$1, boolean $$2) {
      super($$0);
      this.a = ImmutableMap.copyOf($$1);
      this.b = $$2;
   }

   @Override
   public edx b() {
      return edy.e;
   }

   @Override
   public Set<eeq<?>> a() {
      return this.a.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      Object2IntMap<cnd> $$2 = new Object2IntOpenHashMap();
      this.a.forEach(($$2x, $$3) -> $$2.put($$2x, $$3.a($$1)));
      if ($$0.d() == ciz.qb) {
         ciw $$3 = new ciw(ciz.tC);
         $$2.forEach(($$1x, $$2x) -> chs.a($$3, new cng($$1x, $$2x)));
         return $$3;
      } else {
         Map<cnd, Integer> $$4 = cnf.a($$0);
         if (this.b) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         cnf.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<cnd, Integer> $$0, cnd $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends edv.a<eee.a> {
      private final Map<cnd, egc> a = Maps.newHashMap();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected eee.a a() {
         return this;
      }

      public eee.a a(cnd $$0, egc $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public edw b() {
         return new eee(this.g(), this.a, this.b);
      }
   }

   public static class b extends edv.c<eee> {
      public void a(JsonObject $$0, eee $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         JsonObject $$3 = new JsonObject();
         $$1.a.forEach(($$2x, $$3x) -> {
            aep $$4 = jc.g.b($$2x);
            if ($$4 == null) {
               throw new IllegalArgumentException("Don't know how to serialize enchantment " + $$2x);
            } else {
               $$3.add($$4.toString(), $$2.serialize($$3x));
            }
         });
         $$0.add("enchantments", $$3);
         $$0.addProperty("add", $$1.b);
      }

      public eee a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         Map<cnd, egc> $$3 = Maps.newHashMap();
         if ($$0.has("enchantments")) {
            JsonObject $$4 = arf.u($$0, "enchantments");

            for (Entry<String, JsonElement> $$5 : $$4.entrySet()) {
               String $$6 = $$5.getKey();
               JsonElement $$7 = $$5.getValue();
               cnd $$8 = jc.g.b(new aep($$6)).orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + $$6 + "'"));
               egc $$9 = (egc)$$1.deserialize($$7, egc.class);
               $$3.put($$8, $$9);
            }
         }

         boolean $$10 = arf.a($$0, "add", false);
         return new eee($$2, $$3, $$10);
      }
   }
}
