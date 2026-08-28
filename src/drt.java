import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drt extends dmv implements dko, drp {
   public static final MapCodec<drt> c = b(drt::new);
   private static final dyl g = dyk.D;
   public static final dyr<jm> d = dyk.S;
   protected static final float e = 6.0F;
   protected static final fcr f = dkl.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<drt> a() {
      return c;
   }

   public drt(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyp.b).b(g, Boolean.valueOf(false)).b(d, jm.c));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return f;
   }

   @Override
   protected boolean b(dxu $$0, dgm $$1, jh $$2) {
      return $$0.a(axu.bz) || $$1.b_($$2.d()).a(etx.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      dxu $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dhh $$0, jh $$1, dxu $$2, bwf $$3, cxo $$4) {
      if (!$$0.B_()) {
         jh $$5 = $$1.d();
         dxu $$6 = dmv.c($$0, $$5, this.m().b(b, dyp.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(g) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      if ($$0.c(b) == dyp.a) {
         return super.a($$0, $$1, $$2);
      } else {
         jh $$3 = $$2.e();
         dxu $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return true;
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      if ($$3.c(dmv.b) == dyp.b) {
         jh $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dki.a($$0, $$1, $$2, $$3.c(d));
      } else {
         jh $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float au_() {
      return 0.1F;
   }
}
