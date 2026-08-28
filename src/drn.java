import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drn extends dmm implements dkg, drj {
   public static final MapCodec<drn> c = b(drn::new);
   private static final dyf g = dye.J;
   public static final dyl<jm> d = dye.U;
   protected static final float e = 6.0F;
   protected static final fcl f = dkd.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<drn> a() {
      return c;
   }

   public drn(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyj.b).b(g, Boolean.valueOf(false)).b(d, jm.c));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return f;
   }

   @Override
   protected boolean b(dxo $$0, dge $$1, jh $$2) {
      return $$0.a(axk.bz) || $$1.b_($$2.d()).a(etr.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      dxo $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, bvx $$3, cxg $$4) {
      if (!$$0.B_()) {
         jh $$5 = $$1.d();
         dxo $$6 = dmm.c($$0, $$5, this.m().b(b, dyj.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(g) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      if ($$0.c(b) == dyj.a) {
         return super.a($$0, $$1, $$2);
      } else {
         jh $$3 = $$2.e();
         dxo $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return true;
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      if ($$3.c(dmm.b) == dyj.b) {
         jh $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dka.a($$0, $$1, $$2, $$3.c(d));
      } else {
         jh $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float au_() {
      return 0.1F;
   }
}
