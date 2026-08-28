import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cio extends chs implements bws {
   private static final int bZ = 40;
   private static final alc<Byte> ca = alg.a(cio.class, ale.a);
   private static final Map<cwh, Integer> cb = Maps.newEnumMap(Arrays.stream(cwh.values()).collect(Collectors.toMap($$0 -> (cwh)$$0, cio::c)));
   private int cd;
   private ccr ce;

   private static int c(cwh $$0) {
      if ($$0 == cwh.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return ayp.a(255, bae.d((float)ayp.b($$1) * 0.75F), bae.d((float)ayp.c($$1) * 0.75F), bae.d((float)ayp.d($$1) * 0.75F));
      }
   }

   public static int a(cwh $$0) {
      return cb.get($$0);
   }

   public cio(bvm<? extends cio> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.ce = new ccr(this);
      this.bT.a(0, new cct(this));
      this.bT.a(1, new cds(this, 1.25));
      this.bT.a(2, new ccl(this, 1.0));
      this.bT.a(3, new ceh(this, 1.1, $$0 -> $$0.a(ayd.ah), false));
      this.bT.a(4, new ccy(this, 1.1));
      this.bT.a(5, this.ce);
      this.bT.a(6, new cem(this, 1.0));
      this.bT.a(7, new cdh(this, cps.class, 6.0F));
      this.bT.a(8, new cdu(this));
   }

   @Override
   public boolean j(cxk $$0) {
      return $$0.a(ayd.ah);
   }

   @Override
   protected void a(ash $$0) {
      this.cd = this.ce.h();
      super.a($$0);
   }

   @Override
   public void d_() {
      if (this.dV().C) {
         this.cd = Math.max(0, this.cd - 1);
      }

      super.d_();
   }

   public static bxi.a p() {
      return chs.gr().a(bxj.s, 8.0).a(bxj.v, 0.23F);
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
         return this.cd > 0 ? (float) (Math.PI / 5) : this.dN() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if ($$2.a(cxo.sJ)) {
         if (this.dV() instanceof ash $$3 && this.a()) {
            this.a($$3, axg.h, $$2);
            this.a(ecj.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bte.b;
         }

         return bte.c;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ash $$0, axg $$1, cxk $$2) {
      $$0.a(null, this, axf.wU, $$1, 1.0F, 1.0F);
      this.a($$0, ewd.aV, $$2, ($$0x, $$1x) -> {
         for (int $$2x = 0; $$2x < $$1x.L(); $$2x++) {
            clw $$3 = this.a($$0x, $$1x.c(1), 1.0F);
            if ($$3 != null) {
               $$3.h($$3.dy().b((double)((this.ae.i() - this.ae.i()) * 0.1F), (double)(this.ae.i() * 0.05F), (double)((this.ae.i() - this.ae.i()) * 0.1F)));
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
      this.b(cwh.a($$0.f("Color")));
   }

   @Override
   protected axe u() {
      return axf.wR;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.wT;
   }

   @Override
   protected axe o_() {
      return axf.wS;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.wV, 0.15F, 1.0F);
   }

   public cwh t() {
      return cwh.a(this.al.a(ca) & 15);
   }

   public void b(cwh $$0) {
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

   public static cwh a(bam $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cwh.p;
      } else if ($$1 < 10) {
         return cwh.h;
      } else if ($$1 < 15) {
         return cwh.i;
      } else if ($$1 < 18) {
         return cwh.m;
      } else {
         return $$0.a(500) == 0 ? cwh.g : cwh.a;
      }
   }

   @Nullable
   public cio b(ash $$0, buw $$1) {
      cio $$2 = bvm.bb.a($$0, bvl.e);
      if ($$2 != null) {
         $$2.b(this.a($$0, this, (cio)$$1));
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
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      this.b(a($$0.H_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cwh a(ash $$0, cio $$1, cio $$2) {
      cwh $$3 = $$1.t();
      cwh $$4 = $$2.t();
      dbo $$5 = a($$3, $$4);
      return $$0.s()
         .a(dcj.a, $$5, $$0)
         .map($$2x -> ((dbp)$$2x.b()).a($$5, $$0.K_()))
         .map(cxk::h)
         .filter(cwi.class::isInstance)
         .map(cwi.class::cast)
         .map(cwi::b)
         .orElseGet(() -> $$0.A.h() ? $$3 : $$4);
   }

   private static dbo a(cwh $$0, cwh $$1) {
      return dbo.a(2, 1, List.of(new cxk(cwi.a($$0)), new cxk(cwi.a($$1))));
   }
}
