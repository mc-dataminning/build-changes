import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwq extends bvu implements bla {
   private static final int bT = 40;
   private static final afc<Byte> bU = aff.a(bwq.class, afe.a);
   private static final Map<cix, cqy> bW = ac.a(Maps.newEnumMap(cix.class), $$0 -> {
      $$0.put(cix.a, cuc.bA);
      $$0.put(cix.b, cuc.bB);
      $$0.put(cix.c, cuc.bC);
      $$0.put(cix.d, cuc.bD);
      $$0.put(cix.e, cuc.bE);
      $$0.put(cix.f, cuc.bF);
      $$0.put(cix.g, cuc.bG);
      $$0.put(cix.h, cuc.bH);
      $$0.put(cix.i, cuc.bI);
      $$0.put(cix.j, cuc.bJ);
      $$0.put(cix.k, cuc.bK);
      $$0.put(cix.l, cuc.bL);
      $$0.put(cix.m, cuc.bM);
      $$0.put(cix.n, cuc.bN);
      $$0.put(cix.o, cuc.bO);
      $$0.put(cix.p, cuc.bP);
   });
   private static final Map<cix, float[]> bX = Maps.newEnumMap(Arrays.stream(cix.values()).collect(Collectors.toMap($$0 -> (cix)$$0, bwq::c)));
   private int bY;
   private bqw bZ;

   private static float[] c(cix $$0) {
      if ($$0 == cix.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(cix $$0) {
      return bX.get($$0);
   }

   public bwq(bjx<? extends bwq> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bZ = new bqw(this);
      this.bO.a(0, new bqy(this));
      this.bO.a(1, new brx(this, 1.25));
      this.bO.a(2, new bqq(this, 1.0));
      this.bO.a(3, new bsm(this, 1.1, cnk.a(ckm.oI), false));
      this.bO.a(4, new brd(this, 1.1));
      this.bO.a(5, this.bZ);
      this.bO.a(6, new bsr(this, 1.0));
      this.bO.a(7, new brm(this, ccx.class, 6.0F));
      this.bO.a(8, new brz(this));
   }

   @Override
   protected void X() {
      this.bY = this.bZ.h();
      super.X();
   }

   @Override
   public void c_() {
      if (this.dL().B) {
         this.bY = Math.max(0, this.bY - 1);
      }

      super.c_();
   }

   public static blo.a s() {
      return bkl.A().a(blp.l, 8.0).a(blp.m, 0.23F);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bU, (byte)0);
   }

   @Override
   public afw S() {
      if (this.y()) {
         return this.ag().j();
      } else {
         return switch (this.t()) {
            case a -> edg.S;
            case b -> edg.T;
            case c -> edg.U;
            case d -> edg.V;
            case e -> edg.W;
            case f -> edg.X;
            case g -> edg.Y;
            case h -> edg.Z;
            case i -> edg.aa;
            case j -> edg.ab;
            case k -> edg.ac;
            case l -> edg.ad;
            case m -> edg.ae;
            case n -> edg.af;
            case o -> edg.ag;
            case p -> edg.ah;
         };
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.bY = 40;
      } else {
         super.b($$0);
      }
   }

   public float E(float $$0) {
      if (this.bY <= 0) {
         return 0.0F;
      } else if (this.bY >= 4 && this.bY <= 36) {
         return 1.0F;
      } else {
         return this.bY < 4 ? ((float)this.bY - $$0) / 4.0F : -((float)(this.bY - 40) - $$0) / 4.0F;
      }
   }

   public float F(float $$0) {
      if (this.bY > 4 && this.bY <= 36) {
         float $$1 = ((float)(this.bY - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * asy.a($$1 * 28.7F);
      } else {
         return this.bY > 0 ? (float) (Math.PI / 5) : this.dD() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      if ($$2.a(ckm.rg)) {
         if (!this.dL().B && this.a()) {
            this.a(aqe.h);
            this.a(dkl.M, $$0);
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            return bib.a;
         } else {
            return bib.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aqe $$0) {
      this.dL().a(null, this, aqd.uQ, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ag.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         bzq $$3 = this.a(bW.get(this.t()), 1);
         if ($$3 != null) {
            $$3.f($$3.do().b((double)((this.ag.i() - this.ag.i()) * 0.1F), (double)(this.ag.i() * 0.05F), (double)((this.ag.i() - this.ag.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bv() && !this.y() && !this.n_();
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("Sheared", this.y());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(cix.a($$0.f("Color")));
   }

   @Override
   protected aqc w() {
      return aqd.uN;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.uP;
   }

   @Override
   protected aqc m_() {
      return aqd.uO;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.uR, 0.15F, 1.0F);
   }

   public cix t() {
      return cix.a(this.an.b(bU) & 15);
   }

   public void b(cix $$0) {
      byte $$1 = this.an.b(bU);
      this.an.b(bU, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean y() {
      return (this.an.b(bU) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.an.b(bU);
      if ($$0) {
         this.an.b(bU, (byte)($$1 | 16));
      } else {
         this.an.b(bU, (byte)($$1 & -17));
      }
   }

   public static cix a(ate $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cix.p;
      } else if ($$1 < 10) {
         return cix.h;
      } else if ($$1 < 15) {
         return cix.i;
      } else if ($$1 < 18) {
         return cix.m;
      } else {
         return $$0.a(500) == 0 ? cix.g : cix.a;
      }
   }

   @Nullable
   public bwq b(alq $$0, bjo $$1) {
      bwq $$2 = bjx.aF.a((cqz)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (bwq)$$1));
      }

      return $$2;
   }

   @Override
   public void N() {
      super.N();
      this.w(false);
      if (this.n_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private cix a(bvu $$0, bvu $$1) {
      cix $$2 = ((bwq)$$0).t();
      cix $$3 = ((bwq)$$1).t();
      cgd $$4 = a($$2, $$3);
      return this.dL()
         .q()
         .a(cnr.a, $$4, this.dL())
         .map($$1x -> ((cnd)$$1x.b()).a($$4, this.dL().H_()))
         .map(ckj::d)
         .filter(ciy.class::isInstance)
         .map(ciy.class::cast)
         .map(ciy::d)
         .orElseGet(() -> this.dL().z.h() ? $$2 : $$3);
   }

   private static cgd a(cix $$0, cix $$1) {
      cgd $$2 = new chm(new cfp(null, -1) {
         @Override
         public ckj a(ccx $$0, int $$1) {
            return ckj.b;
         }

         @Override
         public boolean a(ccx $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new ckj(ciy.a($$0)));
      $$2.a(1, new ckj(ciy.a($$1)));
      return $$2;
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return 0.95F * $$1.b;
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
