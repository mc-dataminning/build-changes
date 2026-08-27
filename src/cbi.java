import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cbi extends cam implements bpn {
   private static final int bV = 40;
   private static final aii<Byte> bW = ail.a(cbi.class, aik.a);
   private static final Map<cog, cwd> bY = ac.a(Maps.newEnumMap(cog.class), $$0 -> {
      $$0.put(cog.a, czh.bA);
      $$0.put(cog.b, czh.bB);
      $$0.put(cog.c, czh.bC);
      $$0.put(cog.d, czh.bD);
      $$0.put(cog.e, czh.bE);
      $$0.put(cog.f, czh.bF);
      $$0.put(cog.g, czh.bG);
      $$0.put(cog.h, czh.bH);
      $$0.put(cog.i, czh.bI);
      $$0.put(cog.j, czh.bJ);
      $$0.put(cog.k, czh.bK);
      $$0.put(cog.l, czh.bL);
      $$0.put(cog.m, czh.bM);
      $$0.put(cog.n, czh.bN);
      $$0.put(cog.o, czh.bO);
      $$0.put(cog.p, czh.bP);
   });
   private static final Map<cog, float[]> bZ = Maps.newEnumMap(Arrays.stream(cog.values()).collect(Collectors.toMap($$0 -> (cog)$$0, cbi::c)));
   private int ca;
   private bvm cb;

   private static float[] c(cog $$0) {
      if ($$0 == cog.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(cog $$0) {
      return bZ.get($$0);
   }

   public cbi(bol<? extends cbi> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.cb = new bvm(this);
      this.bP.a(0, new bvo(this));
      this.bP.a(1, new bwn(this, 1.25));
      this.bP.a(2, new bvg(this, 1.0));
      this.bP.a(3, new bxc(this, 1.1, csp.a(cpt.pv), false));
      this.bP.a(4, new bvt(this, 1.1));
      this.bP.a(5, this.cb);
      this.bP.a(6, new bxh(this, 1.0));
      this.bP.a(7, new bwc(this, cia.class, 6.0F));
      this.bP.a(8, new bwp(this));
   }

   @Override
   protected void aa() {
      this.ca = this.cb.h();
      super.aa();
   }

   @Override
   public void d_() {
      if (this.dJ().B) {
         this.ca = Math.max(0, this.ca - 1);
      }

      super.d_();
   }

   public static bqd.a u() {
      return boz.C().a(bqe.n, 8.0).a(bqe.o, 0.23F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bW, (byte)0);
   }

   @Override
   public ajc U() {
      if (this.A()) {
         return this.ai().j();
      } else {
         return switch (this.w()) {
            case a -> ejw.ac;
            case b -> ejw.ad;
            case c -> ejw.ae;
            case d -> ejw.af;
            case e -> ejw.ag;
            case f -> ejw.ah;
            case g -> ejw.ai;
            case h -> ejw.aj;
            case i -> ejw.ak;
            case j -> ejw.al;
            case k -> ejw.am;
            case l -> ejw.an;
            case m -> ejw.ao;
            case n -> ejw.ap;
            case o -> ejw.aq;
            case p -> ejw.ar;
         };
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.ca = 40;
      } else {
         super.b($$0);
      }
   }

   public float E(float $$0) {
      if (this.ca <= 0) {
         return 0.0F;
      } else if (this.ca >= 4 && this.ca <= 36) {
         return 1.0F;
      } else {
         return this.ca < 4 ? ((float)this.ca - $$0) / 4.0F : -((float)(this.ca - 40) - $$0) / 4.0F;
      }
   }

   public float F(float $$0) {
      if (this.ca > 4 && this.ca <= 36) {
         float $$1 = ((float)(this.ca - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * awm.a($$1 * 28.7F);
      } else {
         return this.ca > 0 ? (float) (Math.PI / 5) : this.dB() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if ($$2.a(cpt.rU)) {
         if (!this.dJ().B && this.a()) {
            this.a(atq.h);
            this.a(dqr.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bml.a;
         } else {
            return bml.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(atq $$0) {
      this.dJ().a(null, this, atp.vU, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.af.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cel $$3 = this.a(bY.get(this.w()), 1);
         if ($$3 != null) {
            $$3.g($$3.dm().b((double)((this.af.i() - this.af.i()) * 0.1F), (double)(this.af.i() * 0.05F), (double)((this.af.i() - this.af.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bx() && !this.A() && !this.o_();
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("Sheared", this.A());
      $$0.a("Color", (byte)this.w().a());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(cog.a($$0.f("Color")));
   }

   @Override
   protected ato y() {
      return atp.vR;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.vT;
   }

   @Override
   protected ato n_() {
      return atp.vS;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.vV, 0.15F, 1.0F);
   }

   public cog w() {
      return cog.a(this.am.b(bW) & 15);
   }

   public void b(cog $$0) {
      byte $$1 = this.am.b(bW);
      this.am.b(bW, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean A() {
      return (this.am.b(bW) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.am.b(bW);
      if ($$0) {
         this.am.b(bW, (byte)($$1 | 16));
      } else {
         this.am.b(bW, (byte)($$1 & -17));
      }
   }

   public static cog a(awt $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cog.p;
      } else if ($$1 < 10) {
         return cog.h;
      } else if ($$1 < 15) {
         return cog.i;
      } else if ($$1 < 18) {
         return cog.m;
      } else {
         return $$0.a(500) == 0 ? cog.g : cog.a;
      }
   }

   @Nullable
   public cbi b(apa $$0, boa $$1) {
      cbi $$2 = bol.aH.a((cwe)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cbi)$$1));
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
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      this.b(a($$0.F_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cog a(cam $$0, cam $$1) {
      cog $$2 = ((cbi)$$0).w();
      cog $$3 = ((cbi)$$1).w();
      clk $$4 = a($$2, $$3);
      return this.dJ()
         .r()
         .a(csx.a, $$4, this.dJ())
         .map($$1x -> ((csj)$$1x.b()).a($$4, this.dJ().I_()))
         .map(cpq::d)
         .filter(coh.class::isInstance)
         .map(coh.class::cast)
         .map(coh::c)
         .orElseGet(() -> this.dJ().z.h() ? $$2 : $$3);
   }

   private static clk a(cog $$0, cog $$1) {
      clk $$2 = new cmu(new cku(null, -1) {
         @Override
         public cpq a(cia $$0, int $$1) {
            return cpq.h;
         }

         @Override
         public boolean a(cia $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cpq(coh.a($$0)));
      $$2.a(1, new cpq(coh.a($$1)));
      return $$2;
   }
}
