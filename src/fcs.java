import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record fcs(Map<String, ezn> b, ezo.b c) implements fcx {
   public static final MapCodec<fcs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ezn.a).fieldOf("scores").forGetter(fcs::c), ezo.b.e.fieldOf("entity").forGetter(fcs::d))
            .apply($$0, fcs::new)
   );

   @Override
   public fcy b() {
      return fcz.h;
   }

   @Override
   public Set<bax<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(ezo $$0) {
      bwi $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         fgc $$2 = $$0.d().g();

         for (Entry<String, ezn> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(ezo $$0, bwi $$1, fgc $$2, String $$3, ezn $$4) {
      ffu $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         ffy $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static fcs.a a(ezo.b $$0) {
      return new fcs.a($$0);
   }

   public Map<String, ezn> c() {
      return this.b;
   }

   public ezo.b d() {
      return this.c;
   }

   public static class a implements fcx.a {
      private final Builder<String, ezn> a = ImmutableMap.builder();
      private final ezo.b b;

      public a(ezo.b $$0) {
         this.b = $$0;
      }

      public fcs.a a(String $$0, ezn $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public fcx build() {
         return new fcs(this.a.build(), this.b);
      }
   }
}
