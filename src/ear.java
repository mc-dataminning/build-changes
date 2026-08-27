import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class ear extends eay {
   private static final Logger a = LogUtils.getLogger();
   final List<ckg> b;

   ear(eck[] $$0, Collection<ckg> $$1) {
      super($$0);
      this.b = ImmutableList.copyOf($$1);
   }

   @Override
   public eba b() {
      return ebb.d;
   }

   @Override
   public cfz a(cfz $$0, dzk $$1) {
      apf $$2 = $$1.b();
      ckg $$5;
      if (this.b.isEmpty()) {
         boolean $$3 = $$0.a(cgc.qb);
         List<ckg> $$4 = jb.g.s().filter(ckg::i).filter($$2x -> $$3 || $$2x.a($$0)).collect(Collectors.toList());
         if ($$4.isEmpty()) {
            a.warn("Couldn't find a compatible enchantment for {}", $$0);
            return $$0;
         }

         $$5 = $$4.get($$2.a($$4.size()));
      } else {
         $$5 = this.b.get($$2.a(this.b.size()));
      }

      return a($$0, $$5, $$2);
   }

   private static cfz a(cfz $$0, ckg $$1, apf $$2) {
      int $$3 = apa.a($$2, $$1.e(), $$1.a());
      if ($$0.a(cgc.qb)) {
         $$0 = new cfz(cgc.tC);
         cev.a($$0, new ckj($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static ear.a c() {
      return new ear.a();
   }

   public static eay.a<?> d() {
      return a($$0 -> new ear($$0, ImmutableList.of()));
   }

   public static class a extends eay.a<ear.a> {
      private final Set<ckg> a = Sets.newHashSet();

      protected ear.a a() {
         return this;
      }

      public ear.a a(ckg $$0) {
         this.a.add($$0);
         return this;
      }

      @Override
      public eaz b() {
         return new ear(this.g(), this.a);
      }
   }

   public static class b extends eay.c<ear> {
      public void a(JsonObject $$0, ear $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         if (!$$1.b.isEmpty()) {
            JsonArray $$3 = new JsonArray();

            for (ckg $$4 : $$1.b) {
               acq $$5 = jb.g.b($$4);
               if ($$5 == null) {
                  throw new IllegalArgumentException("Don't know how to serialize enchantment " + $$4);
               }

               $$3.add(new JsonPrimitive($$5.toString()));
            }

            $$0.add("enchantments", $$3);
         }
      }

      public ear a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         List<ckg> $$3 = Lists.newArrayList();
         if ($$0.has("enchantments")) {
            for (JsonElement $$5 : aor.v($$0, "enchantments")) {
               String $$6 = aor.a($$5, "enchantment");
               ckg $$7 = jb.g.b(new acq($$6)).orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + $$6 + "'"));
               $$3.add($$7);
            }
         }

         return new ear($$2, $$3);
      }
   }
}
