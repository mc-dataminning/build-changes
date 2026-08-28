import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fbc(Optional<Long> b, exk c) implements fau {
   public static final MapCodec<fbc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(fbc::c), exk.a.fieldOf("value").forGetter(fbc::d)).apply($$0, fbc::new)
   );

   @Override
   public fav b() {
      return faw.q;
   }

   @Override
   public Set<bat<?>> a() {
      return this.c.a();
   }

   public boolean a(exl $$0) {
      arn $$1 = $$0.d();
      long $$2 = $$1.af();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static fbc.a a(exk $$0) {
      return new fbc.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public exk d() {
      return this.c;
   }

   public static class a implements fau.a {
      private Optional<Long> a = Optional.empty();
      private final exk b;

      public a(exk $$0) {
         this.b = $$0;
      }

      public fbc.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fbc a() {
         return new fbc(this.a, this.b);
      }
   }
}
