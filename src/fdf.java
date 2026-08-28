import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fdf(Optional<Long> b, ezn c) implements fcx {
   public static final MapCodec<fdf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(fdf::c), ezn.a.fieldOf("value").forGetter(fdf::d)).apply($$0, fdf::new)
   );

   @Override
   public fcy b() {
      return fcz.q;
   }

   @Override
   public Set<bax<?>> a() {
      return this.c.a();
   }

   public boolean a(ezo $$0) {
      arq $$1 = $$0.d();
      long $$2 = $$1.af();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static fdf.a a(ezn $$0) {
      return new fdf.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ezn d() {
      return this.c;
   }

   public static class a implements fcx.a {
      private Optional<Long> a = Optional.empty();
      private final ezn b;

      public a(ezn $$0) {
         this.b = $$0;
      }

      public fdf.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fdf a() {
         return new fdf(this.a, this.b);
      }
   }
}
