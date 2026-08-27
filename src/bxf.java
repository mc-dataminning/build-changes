import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxf extends bwj implements blp {
   private static final int bT = 40;
   private static final afm<Byte> bU = afp.a(bxf.class, afo.a);
   private static final Map<cjp, crr> bW = ac.a(Maps.newEnumMap(cjp.class), $$0 -> {
      $$0.put(cjp.a, cuv.bA);
      $$0.put(cjp.b, cuv.bB);
      $$0.put(cjp.c, cuv.bC);
      $$0.put(cjp.d, cuv.bD);
      $$0.put(cjp.e, cuv.bE);
      $$0.put(cjp.f, cuv.bF);
      $$0.put(cjp.g, cuv.bG);
      $$0.put(cjp.h, cuv.bH);
      $$0.put(cjp.i, cuv.bI);
      $$0.put(cjp.j, cuv.bJ);
      $$0.put(cjp.k, cuv.bK);
      $$0.put(cjp.l, cuv.bL);
      $$0.put(cjp.m, cuv.bM);
      $$0.put(cjp.n, cuv.bN);
      $$0.put(cjp.o, cuv.bO);
      $$0.put(cjp.p, cuv.bP);
   });
   private static final Map<cjp, float[]> bX = Maps.newEnumMap(Arrays.stream(cjp.values()).collect(Collectors.toMap($$0 -> (cjp)$$0, bxf::c)));
   private int bY;
   private brl bZ;

   private static float[] c(cjp $$0) {
      if ($$0 == cjp.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(cjp $$0) {
      return bX.get($$0);
   }

   public bxf(bkm<? extends bxf> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bZ = new brl(this);
      this.bO.a(0, new brn(this));
      this.bO.a(1, new bsm(this, 1.25));
      this.bO.a(2, new brf(this, 1.0));
      this.bO.a(3, new btb(this, 1.1, coc.a(cle.oI), false));
      this.bO.a(4, new brs(this, 1.1));
      this.bO.a(5, this.bZ);
      this.bO.a(6, new btg(this, 1.0));
      this.bO.a(7, new bsb(this, cdm.class, 6.0F));
      this.bO.a(8, new bso(this));
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

   public static bmd.a s() {
      return bla.A().a(bme.l, 8.0).a(bme.m, 0.23F);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bU, (byte)0);
   }

   @Override
   public agg S() {
      if (this.y()) {
         return this.ag().j();
      } else {
         return switch (this.t()) {
            case a -> eej.S;
            case b -> eej.T;
            case c -> eej.U;
            case d -> eej.V;
            case e -> eej.W;
            case f -> eej.X;
            case g -> eej.Y;
            case h -> eej.Z;
            case i -> eej.aa;
            case j -> eej.ab;
            case k -> eej.ac;
            case l -> eej.ad;
            case m -> eej.ae;
            case n -> eej.af;
            case o -> eej.ag;
            case p -> eej.ah;
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
         return (float) (Math.PI / 5) + 0.21991149F * ati.a($$1 * 28.7F);
      } else {
         return this.bY > 0 ? (float) (Math.PI / 5) : this.dD() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      if ($$2.a(cle.rh)) {
         if (!this.dL().B && this.a()) {
            this.a(aqo.h);
            this.a(dlg.M, $$0);
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            return biq.a;
         } else {
            return biq.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aqo $$0) {
      this.dL().a(null, this, aqn.uS, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ag.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         caf $$3 = this.a(bW.get(this.t()), 1);
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
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Sheared", this.y());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(cjp.a($$0.f("Color")));
   }

   @Override
   protected aqm w() {
      return aqn.uP;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.uR;
   }

   @Override
   protected aqm m_() {
      return aqn.uQ;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.uT, 0.15F, 1.0F);
   }

   public cjp t() {
      return cjp.a(this.an.b(bU) & 15);
   }

   public void b(cjp $$0) {
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

   public static cjp a(ato $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cjp.p;
      } else if ($$1 < 10) {
         return cjp.h;
      } else if ($$1 < 15) {
         return cjp.i;
      } else if ($$1 < 18) {
         return cjp.m;
      } else {
         return $$0.a(500) == 0 ? cjp.g : cjp.a;
      }
   }

   @Nullable
   public bxf b(ama $$0, bkd $$1) {
      bxf $$2 = bkm.aF.a((crs)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (bxf)$$1));
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
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private cjp a(bwj $$0, bwj $$1) {
      cjp $$2 = ((bxf)$$0).t();
      cjp $$3 = ((bxf)$$1).t();
      cgu $$4 = a($$2, $$3);
      return this.dL()
         .q()
         .a(cok.a, $$4, this.dL())
         .map($$1x -> ((cnv)$$1x.b()).a($$4, this.dL().H_()))
         .map(clb::d)
         .filter(cjq.class::isInstance)
         .map(cjq.class::cast)
         .map(cjq::d)
         .orElseGet(() -> this.dL().z.h() ? $$2 : $$3);
   }

   private static cgu a(cjp $$0, cjp $$1) {
      cgu $$2 = new cie(new cge(null, -1) {
         @Override
         public clb a(cdm $$0, int $$1) {
            return clb.b;
         }

         @Override
         public boolean a(cdm $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new clb(cjq.a($$0)));
      $$2.a(1, new clb(cjq.a($$1)));
      return $$2;
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return 0.95F * $$1.b;
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
