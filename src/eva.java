import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class eva extends evj {
   public static final MapCodec<eva> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eye.a.fieldOf("levels").forGetter($$0x -> $$0x.b), ke.a(ly.aM).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, eva::new)
   );
   private final eyd b;
   private final Optional<jt<dbm>> c;

   eva(List<exh> $$0, eyd $$1, Optional<jt<dbm>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public evl<eva> b() {
      return evm.g;
   }

   @Override
   public Set<ewp<?>> a() {
      return this.b.a();
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      azr $$2 = $$1.b();
      kd $$3 = $$1.d().H_();
      return dbo.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static eva.a a(jr.a $$0, eyd $$1) {
      return new eva.a($$1).a($$0.d(ly.aM).b(axc.n));
   }

   public static class a extends evj.a<eva.a> {
      private final eyd a;
      private Optional<jt<dbm>> b = Optional.empty();

      public a(eyd $$0) {
         this.a = $$0;
      }

      protected eva.a a() {
         return this;
      }

      public eva.a a(jt<dbm> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public evk b() {
         return new eva(this.g(), this.a, this.b);
      }
   }
}
