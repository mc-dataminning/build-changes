import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dts extends dta implements drp {
   public static final MapCodec<dts> a = b(dts::new);
   public static final dyl c = dyk.D;

   @Override
   protected MapCodec<? extends dts> a() {
      return a;
   }

   protected dts(dxt.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, Boolean.valueOf($$1.b(etx.c)));
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(c) ? etx.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(c);
   }
}
