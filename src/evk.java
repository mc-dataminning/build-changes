import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class evk extends evt {
   public static final MapCodec<evk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eyo.a.fieldOf("levels").forGetter($$0x -> $$0x.b), kf.a(ma.aM).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, evk::new)
   );
   private final eyn b;
   private final Optional<ju<dbw>> c;

   evk(List<exr> $$0, eyn $$1, Optional<ju<dbw>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public evv<evk> b() {
      return evw.g;
   }

   @Override
   public Set<ewz<?>> a() {
      return this.b.a();
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      azv $$2 = $$1.b();
      ke $$3 = $$1.d().H_();
      return dby.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static evk.a a(js.a $$0, eyn $$1) {
      return new evk.a($$1).a($$0.d(ma.aM).b(axg.n));
   }

   public static class a extends evt.a<evk.a> {
      private final eyn a;
      private Optional<ju<dbw>> b = Optional.empty();

      public a(eyn $$0) {
         this.a = $$0;
      }

      protected evk.a a() {
         return this;
      }

      public evk.a a(ju<dbw> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public evu b() {
         return new evk(this.g(), this.a, this.b);
      }
   }
}
