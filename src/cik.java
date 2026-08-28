import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cik extends cho implements bwo {
   private static final int bZ = 40;
   private static final aks<Byte> ca = akw.a(cik.class, aku.a);
   private static final Map<cwd, Integer> cb = Maps.newEnumMap(Arrays.stream(cwd.values()).collect(Collectors.toMap($$0 -> (cwd)$$0, cik::c)));
   private int cd;
   private ccn ce;

   private static int c(cwd $$0) {
      if ($$0 == cwd.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return ayf.a(255, azu.d((float)ayf.b($$1) * 0.75F), azu.d((float)ayf.c($$1) * 0.75F), azu.d((float)ayf.d($$1) * 0.75F));
      }
   }

   public static int a(cwd $$0) {
      return cb.get($$0);
   }

   public cik(bvi<? extends cik> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.ce = new ccn(this);
      this.bT.a(0, new ccp(this));
      this.bT.a(1, new cdo(this, 1.25));
      this.bT.a(2, new cch(this, 1.0));
      this.bT.a(3, new ced(this, 1.1, $$0 -> $$0.a(axt.ah), false));
      this.bT.a(4, new ccu(this, 1.1));
      this.bT.a(5, this.ce);
      this.bT.a(6, new cei(this, 1.0));
      this.bT.a(7, new cdd(this, cpo.class, 6.0F));
      this.bT.a(8, new cdq(this));
   }

   @Override
   public boolean j(cxg $$0) {
      return $$0.a(axt.ah);
   }

   @Override
   protected void a(arx $$0) {
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

   public static bxe.a p() {
      return cho.gt().a(bxf.s, 8.0).a(bxf.v, 0.23F);
   }

   @Override
   protected void a(akw.a $$0) {
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
         return (float) (Math.PI / 5) + 0.21991149F * azu.a($$1 * 28.7F);
      } else {
         return this.cd > 0 ? (float) (Math.PI / 5) : this.dO() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      if ($$2.a(cxk.sS)) {
         if (this.dW() instanceof arx $$3 && this.a()) {
            this.a($$3, aww.h, $$2);
            this.a(eck.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bta.b;
         }

         return bta.c;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(arx $$0, aww $$1, cxg $$2) {
      $$0.a(null, this, awv.xb, $$1, 1.0F, 1.0F);
      this.a($$0, ewe.aV, $$2, ($$0x, $$1x) -> {
         for (int $$2x = 0; $$2x < $$1x.M(); $$2x++) {
            cls $$3 = this.a($$0x, $$1x.c(1), 1.0F);
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
   public void b(um $$0) {
      super.b($$0);
      $$0.a("Sheared", this.x());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.x($$0.q("Sheared"));
      this.b(cwd.a($$0.f("Color")));
   }

   @Override
   protected awu u() {
      return awv.wY;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.xa;
   }

   @Override
   protected awu o_() {
      return awv.wZ;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.xc, 0.15F, 1.0F);
   }

   public cwd t() {
      return cwd.a(this.al.a(ca) & 15);
   }

   public void b(cwd $$0) {
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

   public static cwd a(bac $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cwd.p;
      } else if ($$1 < 10) {
         return cwd.h;
      } else if ($$1 < 15) {
         return cwd.i;
      } else if ($$1 < 18) {
         return cwd.m;
      } else {
         return $$0.a(500) == 0 ? cwd.g : cwd.a;
      }
   }

   @Nullable
   public cik b(arx $$0, bus $$1) {
      cik $$2 = bvi.bb.a($$0, bvh.e);
      if ($$2 != null) {
         $$2.b(this.a($$0, this, (cik)$$1));
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
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      this.b(a($$0.H_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cwd a(arx $$0, cik $$1, cik $$2) {
      cwd $$3 = $$1.t();
      cwd $$4 = $$2.t();
      dbj $$5 = a($$3, $$4);
      return $$0.t()
         .a(dcg.a, $$5, $$0)
         .map($$2x -> ((dbk)$$2x.b()).a($$5, $$0.K_()))
         .map(cxg::h)
         .filter(cwe.class::isInstance)
         .map(cwe.class::cast)
         .map(cwe::b)
         .orElseGet(() -> $$0.A.h() ? $$3 : $$4);
   }

   private static dbj a(cwd $$0, cwd $$1) {
      return dbj.a(2, 1, List.of(new cxg(cwe.a($$0)), new cxg(cwe.a($$1))));
   }
}
