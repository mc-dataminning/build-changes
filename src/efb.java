import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record efb(Map<String, ecg> b, ech.b c) implements efg {
   public static final Codec<efb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ecg.a).fieldOf("scores").forGetter(efb::c), ech.b.e.fieldOf("entity").forGetter(efb::d))
            .apply($$0, efb::new)
   );

   @Override
   public efh b() {
      return efi.i;
   }

   @Override
   public Set<eep<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(ech $$0) {
      bii $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         eid $$2 = $$1.dK().I();

         for (Entry<String, ecg> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(ech $$0, bii $$1, eid $$2, String $$3, ecg $$4) {
      eia $$5 = $$2.b($$3);
      if ($$5 == null) {
         return false;
      } else {
         String $$6 = $$1.cx();
         return !$$2.b($$6, $$5) ? false : $$4.b($$0, $$2.c($$6, $$5).b());
      }
   }

   public static efb.a a(ech.b $$0) {
      return new efb.a($$0);
   }

   public Map<String, ecg> c() {
      return this.b;
   }

   public ech.b d() {
      return this.c;
   }

   public static class a implements efg.a {
      private final Builder<String, ecg> a = ImmutableMap.builder();
      private final ech.b b;

      public a(ech.b $$0) {
         this.b = $$0;
      }

      public efb.a a(String $$0, ecg $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public efg build() {
         return new efb(this.a.build(), this.b);
      }
   }
}
