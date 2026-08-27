import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cel extends cdp implements bsq {
   private static final int bY = 40;
   private static final ajm<Byte> bZ = ajq.a(cel.class, ajo.a);
   private static final Map<crs, dac> cb = ac.a(Maps.newEnumMap(crs.class), $$0 -> {
      $$0.put(crs.a, ddg.bA);
      $$0.put(crs.b, ddg.bB);
      $$0.put(crs.c, ddg.bC);
      $$0.put(crs.d, ddg.bD);
      $$0.put(crs.e, ddg.bE);
      $$0.put(crs.f, ddg.bF);
      $$0.put(crs.g, ddg.bG);
      $$0.put(crs.h, ddg.bH);
      $$0.put(crs.i, ddg.bI);
      $$0.put(crs.j, ddg.bJ);
      $$0.put(crs.k, ddg.bK);
      $$0.put(crs.l, ddg.bL);
      $$0.put(crs.m, ddg.bM);
      $$0.put(crs.n, ddg.bN);
      $$0.put(crs.o, ddg.bO);
      $$0.put(crs.p, ddg.bP);
   });
   private static final Map<crs, float[]> cc = Maps.newEnumMap(Arrays.stream(crs.values()).collect(Collectors.toMap($$0 -> (crs)$$0, cel::c)));
   private int cd;
   private byp ce;

   private static float[] c(crs $$0) {
      if ($$0 == crs.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(crs $$0) {
      return cc.get($$0);
   }

   public cel(brn<? extends cel> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.ce = new byp(this);
      this.bS.a(0, new byr(this));
      this.bS.a(1, new bzq(this, 1.25));
      this.bS.a(2, new byj(this, 1.0));
      this.bS.a(3, new caf(this, 1.1, $$0 -> $$0.a(avz.ac), false));
      this.bS.a(4, new byw(this, 1.1));
      this.bS.a(5, this.ce);
      this.bS.a(6, new cak(this, 1.0));
      this.bS.a(7, new bzf(this, clh.class, 6.0F));
      this.bS.a(8, new bzs(this));
   }

   @Override
   public boolean o(csz $$0) {
      return $$0.a(avz.ac);
   }

   @Override
   protected void Y() {
      this.cd = this.ce.h();
      super.Y();
   }

   @Override
   public void n_() {
      if (this.dN().B) {
         this.cd = Math.max(0, this.cd - 1);
      }

      super.n_();
   }

   public static btg.a r() {
      return bsc.A().a(bth.q, 8.0).a(bth.r, 0.23F);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
   }

   @Override
   public akg<eoq> S() {
      if (this.y()) {
         return this.ai().j();
      } else {
         return switch (this.u()) {
            case a -> eoj.af;
            case b -> eoj.ag;
            case c -> eoj.ah;
            case d -> eoj.ai;
            case e -> eoj.aj;
            case f -> eoj.ak;
            case g -> eoj.al;
            case h -> eoj.am;
            case i -> eoj.an;
            case j -> eoj.ao;
            case k -> eoj.ap;
            case l -> eoj.aq;
            case m -> eoj.ar;
            case n -> eoj.as;
            case o -> eoj.at;
            case p -> eoj.au;
         };
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.cd = 40;
      } else {
         super.b($$0);
      }
   }

   public float G(float $$0) {
      if (this.cd <= 0) {
         return 0.0F;
      } else if (this.cd >= 4 && this.cd <= 36) {
         return 1.0F;
      } else {
         return this.cd < 4 ? ((float)this.cd - $$0) / 4.0F : -((float)(this.cd - 40) - $$0) / 4.0F;
      }
   }

   public float H(float $$0) {
      if (this.cd > 4 && this.cd <= 36) {
         float $$1 = ((float)(this.cd - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * axz.a($$1 * 28.7F);
      } else {
         return this.cd > 0 ? (float) (Math.PI / 5) : this.dF() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if ($$2.a(ctc.rV)) {
         if (!this.dN().B && this.a()) {
            this.a(avd.h);
            this.a(dva.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bpm.a;
         } else {
            return bpm.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(avd $$0) {
      this.dN().a(null, this, avc.wn, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ah.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         chr $$3 = this.a(cb.get(this.u()), 1);
         if ($$3 != null) {
            $$3.g($$3.dq().b((double)((this.ah.i() - this.ah.i()) * 0.1F), (double)(this.ah.i() * 0.05F), (double)((this.ah.i() - this.ah.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bB() && !this.y() && !this.p_();
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Sheared", this.y());
      $$0.a("Color", (byte)this.u().a());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(crs.a($$0.f("Color")));
   }

   @Override
   protected avb v() {
      return avc.wk;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.wm;
   }

   @Override
   protected avb o_() {
      return avc.wl;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.wo, 0.15F, 1.0F);
   }

   public crs u() {
      return crs.a(this.ao.a(bZ) & 15);
   }

   public void b(crs $$0) {
      byte $$1 = this.ao.a(bZ);
      this.ao.a(bZ, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean y() {
      return (this.ao.a(bZ) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.ao.a(bZ);
      if ($$0) {
         this.ao.a(bZ, (byte)($$1 | 16));
      } else {
         this.ao.a(bZ, (byte)($$1 & -17));
      }
   }

   public static crs a(ayg $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return crs.p;
      } else if ($$1 < 10) {
         return crs.h;
      } else if ($$1 < 15) {
         return crs.i;
      } else if ($$1 < 18) {
         return crs.m;
      } else {
         return $$0.a(500) == 0 ? crs.g : crs.a;
      }
   }

   @Nullable
   public cel b(aqh $$0, brb $$1) {
      cel $$2 = brn.aI.a((dad)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cel)$$1));
      }

      return $$2;
   }

   @Override
   public void N() {
      super.N();
      this.w(false);
      if (this.p_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private crs a(cdp $$0, cdp $$1) {
      crs $$2 = ((cel)$$0).u();
      crs $$3 = ((cel)$$1).u();
      cou $$4 = a($$2, $$3);
      return this.dN()
         .r()
         .a(cxi.a, $$4, this.dN())
         .map($$1x -> ((cwu)$$1x.b()).a($$4, this.dN().H_()))
         .map(csz::f)
         .filter(crt.class::isInstance)
         .map(crt.class::cast)
         .map(crt::c)
         .orElseGet(() -> this.dN().z.h() ? $$2 : $$3);
   }

   private static cou a(crs $$0, crs $$1) {
      cou $$2 = new cqg(new cod(null, -1) {
         @Override
         public csz a(clh $$0, int $$1) {
            return csz.i;
         }

         @Override
         public boolean a(clh $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new csz(crt.a($$0)));
      $$2.a(1, new csz(crt.a($$1)));
      return $$2;
   }
}
