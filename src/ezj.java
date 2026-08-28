import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezj(Optional<Long> b, evr c) implements ezb {
   public static final MapCodec<ezj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(ezj::c), evr.a.fieldOf("value").forGetter(ezj::d)).apply($$0, ezj::new)
   );

   @Override
   public ezc b() {
      return ezd.q;
   }

   @Override
   public Set<bai<?>> a() {
      return this.c.a();
   }

   public boolean a(evs $$0) {
      ard $$1 = $$0.d();
      long $$2 = $$1.ae();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static ezj.a a(evr $$0) {
      return new ezj.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public evr d() {
      return this.c;
   }

   public static class a implements ezb.a {
      private Optional<Long> a = Optional.empty();
      private final evr b;

      public a(evr $$0) {
         this.b = $$0;
      }

      public ezj.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ezj a() {
         return new ezj(this.a, this.b);
      }
   }
}
