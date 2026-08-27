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

public class edo extends edv {
   private static final Logger a = LogUtils.getLogger();
   final List<cnd> b;

   edo(efh[] $$0, Collection<cnd> $$1) {
      super($$0);
      this.b = ImmutableList.copyOf($$1);
   }

   @Override
   public edx b() {
      return edy.d;
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      art $$2 = $$1.b();
      cnd $$5;
      if (this.b.isEmpty()) {
         boolean $$3 = $$0.a(ciz.qb);
         List<cnd> $$4 = jc.g.s().filter(cnd::i).filter($$2x -> $$3 || $$2x.a($$0)).collect(Collectors.toList());
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

   private static ciw a(ciw $$0, cnd $$1, art $$2) {
      int $$3 = aro.a($$2, $$1.e(), $$1.a());
      if ($$0.a(ciz.qb)) {
         $$0 = new ciw(ciz.tC);
         chs.a($$0, new cng($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static edo.a c() {
      return new edo.a();
   }

   public static edv.a<?> d() {
      return a($$0 -> new edo($$0, ImmutableList.of()));
   }

   public static class a extends edv.a<edo.a> {
      private final Set<cnd> a = Sets.newHashSet();

      protected edo.a a() {
         return this;
      }

      public edo.a a(cnd $$0) {
         this.a.add($$0);
         return this;
      }

      @Override
      public edw b() {
         return new edo(this.g(), this.a);
      }
   }

   public static class b extends edv.c<edo> {
      public void a(JsonObject $$0, edo $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         if (!$$1.b.isEmpty()) {
            JsonArray $$3 = new JsonArray();

            for (cnd $$4 : $$1.b) {
               aep $$5 = jc.g.b($$4);
               if ($$5 == null) {
                  throw new IllegalArgumentException("Don't know how to serialize enchantment " + $$4);
               }

               $$3.add(new JsonPrimitive($$5.toString()));
            }

            $$0.add("enchantments", $$3);
         }
      }

      public edo a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         List<cnd> $$3 = Lists.newArrayList();
         if ($$0.has("enchantments")) {
            for (JsonElement $$5 : arf.v($$0, "enchantments")) {
               String $$6 = arf.a($$5, "enchantment");
               cnd $$7 = jc.g.b(new aep($$6)).orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + $$6 + "'"));
               $$3.add($$7);
            }
         }

         return new edo($$2, $$3);
      }
   }
}
