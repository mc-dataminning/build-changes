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

public record fap(Map<String, exk> b, exl.b c) implements fau {
   public static final MapCodec<fap> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, exk.a).fieldOf("scores").forGetter(fap::c), exl.b.e.fieldOf("entity").forGetter(fap::d))
            .apply($$0, fap::new)
   );

   @Override
   public fav b() {
      return faw.h;
   }

   @Override
   public Set<bat<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(exl $$0) {
      bvs $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         fdz $$2 = $$0.d().g();

         for (Entry<String, exk> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(exl $$0, bvs $$1, fdz $$2, String $$3, exk $$4) {
      fdr $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         fdv $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static fap.a a(exl.b $$0) {
      return new fap.a($$0);
   }

   public Map<String, exk> c() {
      return this.b;
   }

   public exl.b d() {
      return this.c;
   }

   public static class a implements fau.a {
      private final Builder<String, exk> a = ImmutableMap.builder();
      private final exl.b b;

      public a(exl.b $$0) {
         this.b = $$0;
      }

      public fap.a a(String $$0, exk $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public fau build() {
         return new fap(this.a.build(), this.b);
      }
   }
}
