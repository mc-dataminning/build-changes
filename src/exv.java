import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exv(Optional<Long> b, eub c) implements exn {
   public static final MapCodec<exv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(exv::c), eub.a.fieldOf("value").forGetter(exv::d)).apply($$0, exv::new)
   );

   @Override
   public exo b() {
      return exp.q;
   }

   @Override
   public Set<ewv<?>> a() {
      return this.c.a();
   }

   public boolean a(euc $$0) {
      arn $$1 = $$0.d();
      long $$2 = $$1.ab();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static exv.a a(eub $$0) {
      return new exv.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public eub d() {
      return this.c;
   }

   public static class a implements exn.a {
      private Optional<Long> a = Optional.empty();
      private final eub b;

      public a(eub $$0) {
         this.b = $$0;
      }

      public exv.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public exv a() {
         return new exv(this.a, this.b);
      }
   }
}
