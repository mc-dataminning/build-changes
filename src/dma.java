import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dma extends djy implements drq {
   public static final MapCodec<dma> a = b(dma::new);
   public static final dym b = dyl.D;
   private static final int d = 3;
   protected static final fcs c = dkm.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dma> a() {
      return a;
   }

   public dma(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dvj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return a($$2, duz.A, $$0.C ? dvj::a : dvj::b);
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.b;
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(b) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return c;
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      etx $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(aya.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
