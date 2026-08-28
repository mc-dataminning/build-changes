import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record faf(Optional<Long> b, ewn c) implements ezx {
   public static final MapCodec<faf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(faf::c), ewn.a.fieldOf("value").forGetter(faf::d)).apply($$0, faf::new)
   );

   @Override
   public ezy b() {
      return ezz.q;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.c.a();
   }

   public boolean a(ewo $$0) {
      ash $$1 = $$0.d();
      long $$2 = $$1.ad();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static faf.a a(ewn $$0) {
      return new faf.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ewn d() {
      return this.c;
   }

   public static class a implements ezx.a {
      private Optional<Long> a = Optional.empty();
      private final ewn b;

      public a(ewn $$0) {
         this.b = $$0;
      }

      public faf.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public faf a() {
         return new faf(this.a, this.b);
      }
   }
}
