import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class byy extends byc implements bnf {
   private static final int bU = 40;
   private static final agn<Byte> bV = agq.a(byy.class, agp.a);
   private static final Map<clv, ctw> bX = ac.a(Maps.newEnumMap(clv.class), $$0 -> {
      $$0.put(clv.a, cxa.bA);
      $$0.put(clv.b, cxa.bB);
      $$0.put(clv.c, cxa.bC);
      $$0.put(clv.d, cxa.bD);
      $$0.put(clv.e, cxa.bE);
      $$0.put(clv.f, cxa.bF);
      $$0.put(clv.g, cxa.bG);
      $$0.put(clv.h, cxa.bH);
      $$0.put(clv.i, cxa.bI);
      $$0.put(clv.j, cxa.bJ);
      $$0.put(clv.k, cxa.bK);
      $$0.put(clv.l, cxa.bL);
      $$0.put(clv.m, cxa.bM);
      $$0.put(clv.n, cxa.bN);
      $$0.put(clv.o, cxa.bO);
      $$0.put(clv.p, cxa.bP);
   });
   private static final Map<clv, float[]> bY = Maps.newEnumMap(Arrays.stream(clv.values()).collect(Collectors.toMap($$0 -> (clv)$$0, byy::c)));
   private int bZ;
   private btc ca;

   private static float[] c(clv $$0) {
      if ($$0 == clv.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(clv $$0) {
      return bY.get($$0);
   }

   public byy(bmc<? extends byy> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.ca = new btc(this);
      this.bP.a(0, new bte(this));
      this.bP.a(1, new bud(this, 1.25));
      this.bP.a(2, new bsw(this, 1.0));
      this.bP.a(3, new bus(this, 1.1, cqh.a(cnj.pv), false));
      this.bP.a(4, new btj(this, 1.1));
      this.bP.a(5, this.ca);
      this.bP.a(6, new bux(this, 1.0));
      this.bP.a(7, new bts(this, cfq.class, 6.0F));
      this.bP.a(8, new buf(this));
   }

   @Override
   protected void aa() {
      this.bZ = this.ca.h();
      super.aa();
   }

   @Override
   public void d_() {
      if (this.dL().B) {
         this.bZ = Math.max(0, this.bZ - 1);
      }

      super.d_();
   }

   public static bnt.a u() {
      return bmq.C().a(bnu.n, 8.0).a(bnu.o, 0.23F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bV, (byte)0);
   }

   @Override
   public ahh U() {
      if (this.A()) {
         return this.ai().j();
      } else {
         return switch (this.w()) {
            case a -> ehd.ac;
            case b -> ehd.ad;
            case c -> ehd.ae;
            case d -> ehd.af;
            case e -> ehd.ag;
            case f -> ehd.ah;
            case g -> ehd.ai;
            case h -> ehd.aj;
            case i -> ehd.ak;
            case j -> ehd.al;
            case k -> ehd.am;
            case l -> ehd.an;
            case m -> ehd.ao;
            case n -> ehd.ap;
            case o -> ehd.aq;
            case p -> ehd.ar;
         };
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.bZ = 40;
      } else {
         super.b($$0);
      }
   }

   public float D(float $$0) {
      if (this.bZ <= 0) {
         return 0.0F;
      } else if (this.bZ >= 4 && this.bZ <= 36) {
         return 1.0F;
      } else {
         return this.bZ < 4 ? ((float)this.bZ - $$0) / 4.0F : -((float)(this.bZ - 40) - $$0) / 4.0F;
      }
   }

   public float E(float $$0) {
      if (this.bZ > 4 && this.bZ <= 36) {
         float $$1 = ((float)(this.bZ - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * aup.a($$1 * 28.7F);
      } else {
         return this.bZ > 0 ? (float) (Math.PI / 5) : this.dD() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if ($$2.a(cnj.rU)) {
         if (!this.dL().B && this.a()) {
            this.a(aru.h);
            this.a(dnz.M, $$0);
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            return bkc.a;
         } else {
            return bkc.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aru $$0) {
      this.dL().a(null, this, art.vT, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ag.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ccb $$3 = this.a(bX.get(this.w()), 1);
         if ($$3 != null) {
            $$3.g($$3.do().b((double)((this.ag.i() - this.ag.i()) * 0.1F), (double)(this.ag.i() * 0.05F), (double)((this.ag.i() - this.ag.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bx() && !this.A() && !this.o_();
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("Sheared", this.A());
      $$0.a("Color", (byte)this.w().a());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(clv.a($$0.f("Color")));
   }

   @Override
   protected ars y() {
      return art.vQ;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.vS;
   }

   @Override
   protected ars n_() {
      return art.vR;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.vU, 0.15F, 1.0F);
   }

   public clv w() {
      return clv.a(this.an.b(bV) & 15);
   }

   public void b(clv $$0) {
      byte $$1 = this.an.b(bV);
      this.an.b(bV, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean A() {
      return (this.an.b(bV) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.an.b(bV);
      if ($$0) {
         this.an.b(bV, (byte)($$1 | 16));
      } else {
         this.an.b(bV, (byte)($$1 & -17));
      }
   }

   public static clv a(auw $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return clv.p;
      } else if ($$1 < 10) {
         return clv.h;
      } else if ($$1 < 15) {
         return clv.i;
      } else if ($$1 < 18) {
         return clv.m;
      } else {
         return $$0.a(500) == 0 ? clv.g : clv.a;
      }
   }

   @Nullable
   public byy b(ane $$0, blr $$1) {
      byy $$2 = bmc.aH.a((ctx)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (byy)$$1));
      }

      return $$2;
   }

   @Override
   public void P() {
      super.P();
      this.w(false);
      if (this.o_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      this.b(a($$0.F_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private clv a(byc $$0, byc $$1) {
      clv $$2 = ((byy)$$0).w();
      clv $$3 = ((byy)$$1).w();
      ciz $$4 = a($$2, $$3);
      return this.dL()
         .r()
         .a(cqp.a, $$4, this.dL())
         .map($$1x -> ((cqb)$$1x.b()).a($$4, this.dL().I_()))
         .map(cng::d)
         .filter(clw.class::isInstance)
         .map(clw.class::cast)
         .map(clw::d)
         .orElseGet(() -> this.dL().z.h() ? $$2 : $$3);
   }

   private static ciz a(clv $$0, clv $$1) {
      ciz $$2 = new ckj(new cij(null, -1) {
         @Override
         public cng a(cfq $$0, int $$1) {
            return cng.f;
         }

         @Override
         public boolean a(cfq $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cng(clw.a($$0)));
      $$2.a(1, new cng(clw.a($$1)));
      return $$2;
   }
}
