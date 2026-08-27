import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efn(Optional<Long> b, ecf c) implements eff {
   public static final Codec<efn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqy.a(Codec.LONG, "period").forGetter(efn::c), ecf.a.fieldOf("value").forGetter(efn::d)).apply($$0, efn::new)
   );

   @Override
   public efg b() {
      return efh.r;
   }

   @Override
   public Set<eeo<?>> a() {
      return this.c.a();
   }

   public boolean a(ecg $$0) {
      akk $$1 = $$0.d();
      long $$2 = $$1.W();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static efn.a a(ecf $$0) {
      return new efn.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ecf d() {
      return this.c;
   }

   public static class a implements eff.a {
      private Optional<Long> a = Optional.empty();
      private final ecf b;

      public a(ecf $$0) {
         this.b = $$0;
      }

      public efn.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public efn a() {
         return new efn(this.a, this.b);
      }
   }
}
