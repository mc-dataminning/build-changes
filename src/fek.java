import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fek(Optional<Long> b, fas c) implements fec {
   public static final MapCodec<fek> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(fek::c), fas.a.fieldOf("value").forGetter(fek::d)).apply($$0, fek::new)
   );

   @Override
   public fed b() {
      return fee.q;
   }

   @Override
   public Set<bbk<?>> a() {
      return this.c.a();
   }

   public boolean a(fat $$0) {
      asb $$1 = $$0.d();
      long $$2 = $$1.af();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static fek.a a(fas $$0) {
      return new fek.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public fas d() {
      return this.c;
   }

   public static class a implements fec.a {
      private Optional<Long> a = Optional.empty();
      private final fas b;

      public a(fas $$0) {
         this.b = $$0;
      }

      public fek.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fek a() {
         return new fek(this.a, this.b);
      }
   }
}
