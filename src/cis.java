import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cis extends chw implements bww {
   private static final int bZ = 40;
   private static final alc<Byte> ca = alg.a(cis.class, ale.a);
   private static final Map<cwl, Integer> cb = Maps.newEnumMap(Arrays.stream(cwl.values()).collect(Collectors.toMap($$0 -> (cwl)$$0, cis::c)));
   private int cd;
   private ccv ce;

   private static int c(cwl $$0) {
      if ($$0 == cwl.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return ayp.a(255, bae.d((float)ayp.b($$1) * 0.75F), bae.d((float)ayp.c($$1) * 0.75F), bae.d((float)ayp.d($$1) * 0.75F));
      }
   }

   public static int a(cwl $$0) {
      return cb.get($$0);
   }

   public cis(bvq<? extends cis> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.ce = new ccv(this);
      this.bT.a(0, new ccx(this));
      this.bT.a(1, new cdw(this, 1.25));
      this.bT.a(2, new ccp(this, 1.0));
      this.bT.a(3, new cel(this, 1.1, $$0 -> $$0.a(ayd.ah), false));
      this.bT.a(4, new cdc(this, 1.1));
      this.bT.a(5, this.ce);
      this.bT.a(6, new ceq(this, 1.0));
      this.bT.a(7, new cdl(this, cpw.class, 6.0F));
      this.bT.a(8, new cdy(this));
   }

   @Override
   public boolean j(cxo $$0) {
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

   public static bxm.a p() {
      return chw.gt().a(bxn.s, 8.0).a(bxn.v, 0.23F);
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
   public bti b(cpw $$0, bth $$1) {
      cxo $$2 = $$0.b($$1);
      if ($$2.a(cxs.sJ)) {
         if (this.dW() instanceof ash $$3 && this.a()) {
            this.a($$3, axg.h, $$2);
            this.a(ecq.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bti.b;
         }

         return bti.c;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ash $$0, axg $$1, cxo $$2) {
      $$0.a(null, this, axf.wV, $$1, 1.0F, 1.0F);
      this.a($$0, ewk.aV, $$2, ($$0x, $$1x) -> {
         for (int $$2x = 0; $$2x < $$1x.L(); $$2x++) {
            cma $$3 = this.a($$0x, $$1x.c(1), 1.0F);
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
      this.b(cwl.a($$0.f("Color")));
   }

   @Override
   protected axe u() {
      return axf.wS;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.wU;
   }

   @Override
   protected axe o_() {
      return axf.wT;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.wW, 0.15F, 1.0F);
   }

   public cwl t() {
      return cwl.a(this.al.a(ca) & 15);
   }

   public void b(cwl $$0) {
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

   public static cwl a(bam $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cwl.p;
      } else if ($$1 < 10) {
         return cwl.h;
      } else if ($$1 < 15) {
         return cwl.i;
      } else if ($$1 < 18) {
         return cwl.m;
      } else {
         return $$0.a(500) == 0 ? cwl.g : cwl.a;
      }
   }

   @Nullable
   public cis b(ash $$0, bva $$1) {
      cis $$2 = bvq.bb.a($$0, bvp.e);
      if ($$2 != null) {
         $$2.b(this.a($$0, this, (cis)$$1));
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
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      this.b(a($$0.H_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cwl a(ash $$0, cis $$1, cis $$2) {
      cwl $$3 = $$1.t();
      cwl $$4 = $$2.t();
      dbr $$5 = a($$3, $$4);
      return $$0.s()
         .a(dco.a, $$5, $$0)
         .map($$2x -> ((dbs)$$2x.b()).a($$5, $$0.K_()))
         .map(cxo::h)
         .filter(cwm.class::isInstance)
         .map(cwm.class::cast)
         .map(cwm::b)
         .orElseGet(() -> $$0.A.h() ? $$3 : $$4);
   }

   private static dbr a(cwl $$0, cwl $$1) {
      return dbr.a(2, 1, List.of(new cxo(cwm.a($$0)), new cxo(cwm.a($$1))));
   }
}
