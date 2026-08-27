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

public class ebh extends eay {
   final Map<ckg, edf> a;
   final boolean b;

   ebh(eck[] $$0, Map<ckg, edf> $$1, boolean $$2) {
      super($$0);
      this.a = ImmutableMap.copyOf($$1);
      this.b = $$2;
   }

   @Override
   public eba b() {
      return ebb.e;
   }

   @Override
   public Set<ebt<?>> a() {
      return this.a.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cfz a(cfz $$0, dzk $$1) {
      Object2IntMap<ckg> $$2 = new Object2IntOpenHashMap();
      this.a.forEach(($$2x, $$3) -> $$2.put($$2x, $$3.a($$1)));
      if ($$0.d() == cgc.qb) {
         cfz $$3 = new cfz(cgc.tC);
         $$2.forEach(($$1x, $$2x) -> cev.a($$3, new ckj($$1x, $$2x)));
         return $$3;
      } else {
         Map<ckg, Integer> $$4 = cki.a($$0);
         if (this.b) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         cki.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<ckg, Integer> $$0, ckg $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends eay.a<ebh.a> {
      private final Map<ckg, edf> a = Maps.newHashMap();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected ebh.a a() {
         return this;
      }

      public ebh.a a(ckg $$0, edf $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public eaz b() {
         return new ebh(this.g(), this.a, this.b);
      }
   }

   public static class b extends eay.c<ebh> {
      public void a(JsonObject $$0, ebh $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         JsonObject $$3 = new JsonObject();
         $$1.a.forEach(($$2x, $$3x) -> {
            acq $$4 = jb.g.b($$2x);
            if ($$4 == null) {
               throw new IllegalArgumentException("Don't know how to serialize enchantment " + $$2x);
            } else {
               $$3.add($$4.toString(), $$2.serialize($$3x));
            }
         });
         $$0.add("enchantments", $$3);
         $$0.addProperty("add", $$1.b);
      }

      public ebh a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         Map<ckg, edf> $$3 = Maps.newHashMap();
         if ($$0.has("enchantments")) {
            JsonObject $$4 = aor.u($$0, "enchantments");

            for (Entry<String, JsonElement> $$5 : $$4.entrySet()) {
               String $$6 = $$5.getKey();
               JsonElement $$7 = $$5.getValue();
               ckg $$8 = jb.g.b(new acq($$6)).orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + $$6 + "'"));
               edf $$9 = (edf)$$1.deserialize($$7, edf.class);
               $$3.put($$8, $$9);
            }
         }

         boolean $$10 = aor.a($$0, "add", false);
         return new ebh($$2, $$3, $$10);
      }
   }
}
