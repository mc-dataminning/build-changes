import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cit extends chx implements bwx {
   private static final int bZ = 40;
   private static final alc<Byte> ca = alg.a(cit.class, ale.a);
   private static final Map<cwm, Integer> cb = Maps.newEnumMap(Arrays.stream(cwm.values()).collect(Collectors.toMap($$0 -> (cwm)$$0, cit::c)));
   private int cd;
   private ccw ce;

   private static int c(cwm $$0) {
      if ($$0 == cwm.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return ayp.a(255, bae.d((float)ayp.b($$1) * 0.75F), bae.d((float)ayp.c($$1) * 0.75F), bae.d((float)ayp.d($$1) * 0.75F));
      }
   }

   public static int a(cwm $$0) {
      return cb.get($$0);
   }

   public cit(bvr<? extends cit> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.ce = new ccw(this);
      this.bT.a(0, new ccy(this));
      this.bT.a(1, new cdx(this, 1.25));
      this.bT.a(2, new ccq(this, 1.0));
      this.bT.a(3, new cem(this, 1.1, $$0 -> $$0.a(ayd.ah), false));
      this.bT.a(4, new cdd(this, 1.1));
      this.bT.a(5, this.ce);
      this.bT.a(6, new cer(this, 1.0));
      this.bT.a(7, new cdm(this, cpx.class, 6.0F));
      this.bT.a(8, new cdz(this));
   }

   @Override
   public boolean j(cxp $$0) {
      return $$0.a(ayd.ah);
   }

   @Override
   protected void a(ash $$0) {
      this.cd = this.ce.h();
      super.a($$0);
   }

   @Override
   public void d_() {
      if (this.dW().C) {
         this.cd = Math.max(0, this.cd - 1);
      }

      super.d_();
   }

   public static bxn.a p() {
      return chx.gt().a(bxo.s, 8.0).a(bxo.v, 0.23F);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(ca, (byte)0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.cd = 40;
      } else {
         super.b($$0);
      }
   }

   public float J(float $$0) {
      if (this.cd <= 0) {
         return 0.0F;
      } else if (this.cd >= 4 && this.cd <= 36) {
         return 1.0F;
      } else {
         return this.cd < 4 ? ((float)this.cd - $$0) / 4.0F : -((float)(this.cd - 40) - $$0) / 4.0F;
      }
   }

   public float K(float $$0) {
      if (this.cd > 4 && this.cd <= 36) {
         float $$1 = ((float)(this.cd - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * bae.a($$1 * 28.7F);
      } else {
         return this.cd > 0 ? (float) (Math.PI / 5) : this.dO() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      if ($$2.a(cxt.sJ)) {
         if (this.dW() instanceof ash $$3 && this.a()) {
            this.a($$3, axg.h, $$2);
            this.a(ecr.M, $$0);
            $$2.a(1, $$0, d($$1));
            return btj.b;
         }

         return btj.c;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ash $$0, axg $$1, cxp $$2) {
      $$0.a(null, this, axf.wV, $$1, 1.0F, 1.0F);
      this.a($$0, ewl.aV, $$2, ($$0x, $$1x) -> {
         for (int $$2x = 0; $$2x < $$1x.L(); $$2x++) {
            cmb $$3 = this.a($$0x, $$1x.c(1), 1.0F);
            if ($$3 != null) {
               $$3.h($$3.dz().b((double)((this.ae.i() - this.ae.i()) * 0.1F), (double)(this.ae.i() * 0.05F), (double)((this.ae.i() - this.ae.i()) * 0.1F)));
            }
         }
      });
      this.x(true);
   }

   @Override
   public boolean a() {
      return this.bL() && !this.x() && !this.e_();
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Sheared", this.x());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.x($$0.q("Sheared"));
      this.b(cwm.a($$0.f("Color")));
   }

   @Override
   protected axe u() {
      return axf.wS;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.wU;
   }

   @Override
   protected axe o_() {
      return axf.wT;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(axf.wW, 0.15F, 1.0F);
   }

   public cwm t() {
      return cwm.a(this.al.a(ca) & 15);
   }

   public void b(cwm $$0) {
      byte $$1 = this.al.a(ca);
      this.al.a(ca, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean x() {
      return (this.al.a(ca) & 16) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.al.a(ca);
      if ($$0) {
         this.al.a(ca, (byte)($$1 | 16));
      } else {
         this.al.a(ca, (byte)($$1 & -17));
      }
   }

   public static cwm a(bam $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cwm.p;
      } else if ($$1 < 10) {
         return cwm.h;
      } else if ($$1 < 15) {
         return cwm.i;
      } else if ($$1 < 18) {
         return cwm.m;
      } else {
         return $$0.a(500) == 0 ? cwm.g : cwm.a;
      }
   }

   @Nullable
   public cit b(ash $$0, bvb $$1) {
      cit $$2 = bvr.bb.a($$0, bvq.e);
      if ($$2 != null) {
         $$2.b(this.a($$0, this, (cit)$$1));
      }

      return $$2;
   }

   @Override
   public void P() {
      super.P();
      this.x(false);
      if (this.e_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      this.b(a($$0.H_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cwm a(ash $$0, cit $$1, cit $$2) {
      cwm $$3 = $$1.t();
      cwm $$4 = $$2.t();
      dbs $$5 = a($$3, $$4);
      return $$0.s()
         .a(dcp.a, $$5, $$0)
         .map($$2x -> ((dbt)$$2x.b()).a($$5, $$0.K_()))
         .map(cxp::h)
         .filter(cwn.class::isInstance)
         .map(cwn.class::cast)
         .map(cwn::b)
         .orElseGet(() -> $$0.A.h() ? $$3 : $$4);
   }

   private static dbs a(cwm $$0, cwm $$1) {
      return dbs.a(2, 1, List.of(new cxp(cwn.a($$0)), new cxp(cwn.a($$1))));
   }
}
