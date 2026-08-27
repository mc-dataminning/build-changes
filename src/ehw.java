import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record ehw(Map<String, efb> b, efc.b c) implements eib {
   public static final Codec<ehw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, efb.a).fieldOf("scores").forGetter(ehw::c), efc.b.e.fieldOf("entity").forGetter(ehw::d))
            .apply($$0, ehw::new)
   );

   @Override
   public eic b() {
      return eid.i;
   }

   @Override
   public Set<ehk<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(efc $$0) {
      bkv $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         eky $$2 = $$1.dN().J();

         for (Entry<String, efb> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(efc $$0, bkv $$1, eky $$2, String $$3, efb $$4) {
      ekv $$5 = $$2.b($$3);
      if ($$5 == null) {
         return false;
      } else {
         String $$6 = $$1.cy();
         return !$$2.b($$6, $$5) ? false : $$4.b($$0, $$2.c($$6, $$5).b());
      }
   }

   public static ehw.a a(efc.b $$0) {
      return new ehw.a($$0);
   }

   public Map<String, efb> c() {
      return this.b;
   }

   public efc.b d() {
      return this.c;
   }

   public static class a implements eib.a {
      private final Builder<String, efb> a = ImmutableMap.builder();
      private final efc.b b;

      public a(efc.b $$0) {
         this.b = $$0;
      }

      public ehw.a a(String $$0, efb $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public eib build() {
         return new ehw(this.a.build(), this.b);
      }
   }
}
