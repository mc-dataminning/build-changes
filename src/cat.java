import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cat extends bzx implements boy {
   private static final int bT = 40;
   private static final aie<Byte> bU = aih.a(cat.class, aig.a);
   private static final Map<cnr, cvq> bW = ac.a(Maps.newEnumMap(cnr.class), $$0 -> {
      $$0.put(cnr.a, cyu.bA);
      $$0.put(cnr.b, cyu.bB);
      $$0.put(cnr.c, cyu.bC);
      $$0.put(cnr.d, cyu.bD);
      $$0.put(cnr.e, cyu.bE);
      $$0.put(cnr.f, cyu.bF);
      $$0.put(cnr.g, cyu.bG);
      $$0.put(cnr.h, cyu.bH);
      $$0.put(cnr.i, cyu.bI);
      $$0.put(cnr.j, cyu.bJ);
      $$0.put(cnr.k, cyu.bK);
      $$0.put(cnr.l, cyu.bL);
      $$0.put(cnr.m, cyu.bM);
      $$0.put(cnr.n, cyu.bN);
      $$0.put(cnr.o, cyu.bO);
      $$0.put(cnr.p, cyu.bP);
   });
   private static final Map<cnr, float[]> bX = Maps.newEnumMap(Arrays.stream(cnr.values()).collect(Collectors.toMap($$0 -> (cnr)$$0, cat::c)));
   private int bY;
   private bux bZ;

   private static float[] c(cnr $$0) {
      if ($$0 == cnr.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(cnr $$0) {
      return bX.get($$0);
   }

   public cat(bnw<? extends cat> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bZ = new bux(this);
      this.bO.a(0, new buz(this));
      this.bO.a(1, new bvy(this, 1.25));
      this.bO.a(2, new bur(this, 1.0));
      this.bO.a(3, new bwn(this, 1.1, csc.a(cpg.pv), false));
      this.bO.a(4, new bve(this, 1.1));
      this.bO.a(5, this.bZ);
      this.bO.a(6, new bws(this, 1.0));
      this.bO.a(7, new bvn(this, chl.class, 6.0F));
      this.bO.a(8, new bwa(this));
   }

   @Override
   protected void aa() {
      this.bY = this.bZ.h();
      super.aa();
   }

   @Override
   public void d_() {
      if (this.dM().B) {
         this.bY = Math.max(0, this.bY - 1);
      }

      super.d_();
   }

   public static bpo.a u() {
      return bok.C().a(bpp.n, 8.0).a(bpp.o, 0.23F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bU, (byte)0);
   }

   @Override
   public aiy U() {
      if (this.A()) {
         return this.ai().j();
      } else {
         return switch (this.w()) {
            case a -> eja.ac;
            case b -> eja.ad;
            case c -> eja.ae;
            case d -> eja.af;
            case e -> eja.ag;
            case f -> eja.ah;
            case g -> eja.ai;
            case h -> eja.aj;
            case i -> eja.ak;
            case j -> eja.al;
            case k -> eja.am;
            case l -> eja.an;
            case m -> eja.ao;
            case n -> eja.ap;
            case o -> eja.aq;
            case p -> eja.ar;
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
         return (float) (Math.PI / 5) + 0.21991149F * awi.a($$1 * 28.7F);
      } else {
         return this.bY > 0 ? (float) (Math.PI / 5) : this.dE() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      if ($$2.a(cpg.rU)) {
         if (!this.dM().B && this.a()) {
            this.a(atm.h);
            this.a(dpw.M, $$0);
            $$2.a(1, $$0, d($$1));
            return blw.a;
         } else {
            return blw.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(atm $$0) {
      this.dM().a(null, this, atl.vU, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.af.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cdw $$3 = this.a(bW.get(this.w()), 1);
         if ($$3 != null) {
            $$3.g($$3.dp().b((double)((this.af.i() - this.af.i()) * 0.1F), (double)(this.af.i() * 0.05F), (double)((this.af.i() - this.af.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bx() && !this.A() && !this.o_();
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Sheared", this.A());
      $$0.a("Color", (byte)this.w().a());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(cnr.a($$0.f("Color")));
   }

   @Override
   protected atk y() {
      return atl.vR;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.vT;
   }

   @Override
   protected atk n_() {
      return atl.vS;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.vV, 0.15F, 1.0F);
   }

   public cnr w() {
      return cnr.a(this.am.b(bU) & 15);
   }

   public void b(cnr $$0) {
      byte $$1 = this.am.b(bU);
      this.am.b(bU, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean A() {
      return (this.am.b(bU) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.am.b(bU);
      if ($$0) {
         this.am.b(bU, (byte)($$1 | 16));
      } else {
         this.am.b(bU, (byte)($$1 & -17));
      }
   }

   public static cnr a(awp $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cnr.p;
      } else if ($$1 < 10) {
         return cnr.h;
      } else if ($$1 < 15) {
         return cnr.i;
      } else if ($$1 < 18) {
         return cnr.m;
      } else {
         return $$0.a(500) == 0 ? cnr.g : cnr.a;
      }
   }

   @Nullable
   public cat b(aow $$0, bnl $$1) {
      cat $$2 = bnw.aH.a((cvr)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cat)$$1));
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
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      this.b(a($$0.F_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private cnr a(bzx $$0, bzx $$1) {
      cnr $$2 = ((cat)$$0).w();
      cnr $$3 = ((cat)$$1).w();
      ckv $$4 = a($$2, $$3);
      return this.dM()
         .r()
         .a(csk.a, $$4, this.dM())
         .map($$1x -> ((crw)$$1x.b()).a($$4, this.dM().I_()))
         .map(cpd::d)
         .filter(cns.class::isInstance)
         .map(cns.class::cast)
         .map(cns::d)
         .orElseGet(() -> this.dM().z.h() ? $$2 : $$3);
   }

   private static ckv a(cnr $$0, cnr $$1) {
      ckv $$2 = new cmf(new ckf(null, -1) {
         @Override
         public cpd a(chl $$0, int $$1) {
            return cpd.h;
         }

         @Override
         public boolean a(chl $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cpd(cns.a($$0)));
      $$2.a(1, new cpd(cns.a($$1)));
      return $$2;
   }
}
