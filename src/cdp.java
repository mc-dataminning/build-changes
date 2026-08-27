import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cdp extends cct implements bru {
   private static final int bY = 40;
   private static final ajk<Byte> bZ = ajo.a(cdp.class, ajm.a);
   private static final Map<cqw, czt> cb = ac.a(Maps.newEnumMap(cqw.class), $$0 -> {
      $$0.put(cqw.a, dcx.bA);
      $$0.put(cqw.b, dcx.bB);
      $$0.put(cqw.c, dcx.bC);
      $$0.put(cqw.d, dcx.bD);
      $$0.put(cqw.e, dcx.bE);
      $$0.put(cqw.f, dcx.bF);
      $$0.put(cqw.g, dcx.bG);
      $$0.put(cqw.h, dcx.bH);
      $$0.put(cqw.i, dcx.bI);
      $$0.put(cqw.j, dcx.bJ);
      $$0.put(cqw.k, dcx.bK);
      $$0.put(cqw.l, dcx.bL);
      $$0.put(cqw.m, dcx.bM);
      $$0.put(cqw.n, dcx.bN);
      $$0.put(cqw.o, dcx.bO);
      $$0.put(cqw.p, dcx.bP);
   });
   private static final Map<cqw, float[]> cc = Maps.newEnumMap(Arrays.stream(cqw.values()).collect(Collectors.toMap($$0 -> (cqw)$$0, cdp::c)));
   private int cd;
   private bxt ce;

   private static float[] c(cqw $$0) {
      if ($$0 == cqw.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(cqw $$0) {
      return cc.get($$0);
   }

   public cdp(bqr<? extends cdp> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.ce = new bxt(this);
      this.bS.a(0, new bxv(this));
      this.bS.a(1, new byu(this, 1.25));
      this.bS.a(2, new bxn(this, 1.0));
      this.bS.a(3, new bzj(this, 1.1, cwd.a(csg.pw), false));
      this.bS.a(4, new bya(this, 1.1));
      this.bS.a(5, this.ce);
      this.bS.a(6, new bzo(this, 1.0));
      this.bS.a(7, new byj(this, ckl.class, 6.0F));
      this.bS.a(8, new byw(this));
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

   public static bsk.a r() {
      return brg.A().a(bsl.q, 8.0).a(bsl.r, 0.23F);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
   }

   @Override
   public akf S() {
      if (this.y()) {
         return this.ai().j();
      } else {
         return switch (this.u()) {
            case a -> eny.af;
            case b -> eny.ag;
            case c -> eny.ah;
            case d -> eny.ai;
            case e -> eny.aj;
            case f -> eny.ak;
            case g -> eny.al;
            case h -> eny.am;
            case i -> eny.an;
            case j -> eny.ao;
            case k -> eny.ap;
            case l -> eny.aq;
            case m -> eny.ar;
            case n -> eny.as;
            case o -> eny.at;
            case p -> eny.au;
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
         return (float) (Math.PI / 5) + 0.21991149F * axw.a($$1 * 28.7F);
      } else {
         return this.cd > 0 ? (float) (Math.PI / 5) : this.dF() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      if ($$2.a(csg.rV)) {
         if (!this.dN().B && this.a()) {
            this.a(ava.h);
            this.a(dur.M, $$0);
            $$2.a(1, $$0, d($$1));
            return boq.a;
         } else {
            return boq.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ava $$0) {
      this.dN().a(null, this, auz.wm, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ah.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cgv $$3 = this.a(cb.get(this.u()), 1);
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
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("Sheared", this.y());
      $$0.a("Color", (byte)this.u().a());
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(cqw.a($$0.f("Color")));
   }

   @Override
   protected auy v() {
      return auz.wj;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.wl;
   }

   @Override
   protected auy o_() {
      return auz.wk;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.wn, 0.15F, 1.0F);
   }

   public cqw u() {
      return cqw.a(this.ao.a(bZ) & 15);
   }

   public void b(cqw $$0) {
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

   public static cqw a(ayd $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cqw.p;
      } else if ($$1 < 10) {
         return cqw.h;
      } else if ($$1 < 15) {
         return cqw.i;
      } else if ($$1 < 18) {
         return cqw.m;
      } else {
         return $$0.a(500) == 0 ? cqw.g : cqw.a;
      }
   }

   @Nullable
   public cdp b(aqe $$0, bqf $$1) {
      cdp $$2 = bqr.aI.a((czu)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cdp)$$1));
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
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cqw a(cct $$0, cct $$1) {
      cqw $$2 = ((cdp)$$0).u();
      cqw $$3 = ((cdp)$$1).u();
      cnx $$4 = a($$2, $$3);
      return this.dN()
         .r()
         .a(cwl.a, $$4, this.dN())
         .map($$1x -> ((cvx)$$1x.b()).a($$4, this.dN().H_()))
         .map(csd::f)
         .filter(cqx.class::isInstance)
         .map(cqx.class::cast)
         .map(cqx::c)
         .orElseGet(() -> this.dN().z.h() ? $$2 : $$3);
   }

   private static cnx a(cqw $$0, cqw $$1) {
      cnx $$2 = new cpk(new cnh(null, -1) {
         @Override
         public csd a(ckl $$0, int $$1) {
            return csd.i;
         }

         @Override
         public boolean a(ckl $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new csd(cqx.a($$0)));
      $$2.a(1, new csd(cqx.a($$1)));
      return $$2;
   }
}
