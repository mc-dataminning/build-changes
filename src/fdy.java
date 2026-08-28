import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fdy(Optional<Long> b, fag c) implements fdq {
   public static final MapCodec<fdy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(fdy::c), fag.a.fieldOf("value").forGetter(fdy::d)).apply($$0, fdy::new)
   );

   @Override
   public fdr b() {
      return fds.q;
   }

   @Override
   public Set<baz<?>> a() {
      return this.c.a();
   }

   public boolean a(fah $$0) {
      ars $$1 = $$0.d();
      long $$2 = $$1.af();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static fdy.a a(fag $$0) {
      return new fdy.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public fag d() {
      return this.c;
   }

   public static class a implements fdq.a {
      private Optional<Long> a = Optional.empty();
      private final fag b;

      public a(fag $$0) {
         this.b = $$0;
      }

      public fdy.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fdy a() {
         return new fdy(this.a, this.b);
      }
   }
}
