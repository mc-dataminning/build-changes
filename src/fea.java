import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record fea(Optional<Boolean> b, Optional<Boolean> c) implements fdq {
   public static final MapCodec<fea> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(fea::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(fea::e))
            .apply($$0, fea::new)
   );

   @Override
   public fdr b() {
      return fds.o;
   }

   public boolean a(fah $$0) {
      ars $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ah() ? false : !this.c.isPresent() || this.c.get() == $$1.ag();
   }

   public static fea.a c() {
      return new fea.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements fdq.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public fea.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fea.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public fea a() {
         return new fea(this.a, this.b);
      }
   }
}
