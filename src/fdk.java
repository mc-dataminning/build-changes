import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fdk(Optional<Long> b, ezs c) implements fdc {
   public static final MapCodec<fdk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(fdk::c), ezs.a.fieldOf("value").forGetter(fdk::d)).apply($$0, fdk::new)
   );

   @Override
   public fdd b() {
      return fde.q;
   }

   @Override
   public Set<bax<?>> a() {
      return this.c.a();
   }

   public boolean a(ezt $$0) {
      arq $$1 = $$0.d();
      long $$2 = $$1.af();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static fdk.a a(ezs $$0) {
      return new fdk.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ezs d() {
      return this.c;
   }

   public static class a implements fdc.a {
      private Optional<Long> a = Optional.empty();
      private final ezs b;

      public a(ezs $$0) {
         this.b = $$0;
      }

      public fdk.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fdk a() {
         return new fdk(this.a, this.b);
      }
   }
}
