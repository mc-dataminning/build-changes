import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fag(Optional<Long> b, ewo c) implements ezy {
   public static final MapCodec<fag> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(fag::c), ewo.a.fieldOf("value").forGetter(fag::d)).apply($$0, fag::new)
   );

   @Override
   public ezz b() {
      return faa.q;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.c.a();
   }

   public boolean a(ewp $$0) {
      ash $$1 = $$0.d();
      long $$2 = $$1.ad();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static fag.a a(ewo $$0) {
      return new fag.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ewo d() {
      return this.c;
   }

   public static class a implements ezy.a {
      private Optional<Long> a = Optional.empty();
      private final ewo b;

      public a(ewo $$0) {
         this.b = $$0;
      }

      public fag.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fag a() {
         return new fag(this.a, this.b);
      }
   }
}
