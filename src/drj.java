import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drj extends djy implements drq {
   public static final MapCodec<drj> a = b(drj::new);
   public static final dym b = dyl.G;
   public static final dym c = dyl.D;
   public static final dym d = dyl.H;
   protected static final fcs e = dkm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(jm.a.b);

   @Override
   public MapCodec<drj> a() {
      return a;
   }

   public drj(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, bvk $$3) {
      if ($$0 instanceof ash $$4) {
         asi $$5 = dwi.a($$3);
         if ($$5 != null) {
            $$4.a($$1, duz.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if ($$1 instanceof ash $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, duz.M).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, duz.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return e;
   }

   @Override
   protected fcs d_(dxv $$0) {
      return e;
   }

   @Override
   protected boolean g_(dxv $$0) {
      return true;
   }

   @Nullable
   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dwi($$0, $$1);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == ety.c));
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(c) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, cxp $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bsl.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return !$$0.C ? djy.a($$2, duz.M, ($$0x, $$1x, $$2x, $$3) -> eda.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }
}
