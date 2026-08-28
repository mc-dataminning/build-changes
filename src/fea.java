import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fea(Optional<Long> b, fai c) implements fds {
   public static final MapCodec<fea> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(fea::c), fai.a.fieldOf("value").forGetter(fea::d)).apply($$0, fea::new)
   );

   @Override
   public fdt b() {
      return fdu.q;
   }

   @Override
   public Set<bbb<?>> a() {
      return this.c.a();
   }

   public boolean a(faj $$0) {
      aru $$1 = $$0.d();
      long $$2 = $$1.af();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static fea.a a(fai $$0) {
      return new fea.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public fai d() {
      return this.c;
   }

   public static class a implements fds.a {
      private Optional<Long> a = Optional.empty();
      private final fai b;

      public a(fai $$0) {
         this.b = $$0;
      }

      public fea.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fea a() {
         return new fea(this.a, this.b);
      }
   }
}
