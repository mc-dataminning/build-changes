import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dri extends djx implements drp {
   public static final MapCodec<dri> a = b(dri::new);
   public static final dyl b = dyk.G;
   public static final dyl c = dyk.D;
   public static final dyl d = dyk.H;
   protected static final fcr e = dkl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(jm.a.b);

   @Override
   public MapCodec<dri> a() {
      return a;
   }

   public dri(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dhh $$0, jh $$1, dxu $$2, bvj $$3) {
      if ($$0 instanceof ash $$4) {
         asi $$5 = dwh.a($$3);
         if ($$5 != null) {
            $$4.a($$1, duy.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if ($$1 instanceof ash $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, duy.M).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, duy.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Override
   protected fcr b(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return e;
   }

   @Override
   protected fcr d_(dxu $$0) {
      return e;
   }

   @Override
   protected boolean g_(dxu $$0) {
      return true;
   }

   @Nullable
   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dwh($$0, $$1);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == etx.c));
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(c) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, cxo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bsk.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return !$$0.C ? djx.a($$2, duy.M, ($$0x, $$1x, $$2x, $$3) -> ecz.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }
}
