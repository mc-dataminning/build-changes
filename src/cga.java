import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cga extends cfe implements buf {
   private static final int ca = 40;
   private static final ajw<Byte> cb = aka.a(cga.class, ajy.a);
   private static final Map<cti, dcv> cc = ad.a(Maps.newEnumMap(cti.class), $$0 -> {
      $$0.put(cti.a, dga.bA);
      $$0.put(cti.b, dga.bB);
      $$0.put(cti.c, dga.bC);
      $$0.put(cti.d, dga.bD);
      $$0.put(cti.e, dga.bE);
      $$0.put(cti.f, dga.bF);
      $$0.put(cti.g, dga.bG);
      $$0.put(cti.h, dga.bH);
      $$0.put(cti.i, dga.bI);
      $$0.put(cti.j, dga.bJ);
      $$0.put(cti.k, dga.bK);
      $$0.put(cti.l, dga.bL);
      $$0.put(cti.m, dga.bM);
      $$0.put(cti.n, dga.bN);
      $$0.put(cti.o, dga.bO);
      $$0.put(cti.p, dga.bP);
   });
   private static final Map<cti, Integer> ce = Maps.newEnumMap(Arrays.stream(cti.values()).collect(Collectors.toMap($$0 -> (cti)$$0, cga::c)));
   private int cf;
   private cae cg;

   private static int c(cti $$0) {
      if ($$0 == cti.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return axy.b.a(255, ayo.d((float)axy.b.b($$1) * 0.75F), ayo.d((float)axy.b.c($$1) * 0.75F), ayo.d((float)axy.b.d($$1) * 0.75F));
      }
   }

   public static int a(cti $$0) {
      return ce.get($$0);
   }

   public cga(bsx<? extends cga> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.cg = new cae(this);
      this.bU.a(0, new cag(this));
      this.bU.a(1, new cbf(this, 1.25));
      this.bU.a(2, new bzy(this, 1.0));
      this.bU.a(3, new cbu(this, 1.1, $$0 -> $$0.a(awn.ac), false));
      this.bU.a(4, new cal(this, 1.1));
      this.bU.a(5, this.cg);
      this.bU.a(6, new cbz(this, 1.0));
      this.bU.a(7, new cau(this, cmx.class, 6.0F));
      this.bU.a(8, new cbh(this));
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.ac);
   }

   @Override
   protected void ab() {
      this.cf = this.cg.h();
      super.ab();
   }

   @Override
   public void m_() {
      if (this.dO().B) {
         this.cf = Math.max(0, this.cf - 1);
      }

      super.m_();
   }

   public static buv.a s() {
      return btp.C().a(buw.s, 8.0).a(buw.v, 0.23F);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cb, (byte)0);
   }

   @Override
   public akq<erw> V() {
      if (this.x()) {
         return this.am().k();
      } else {
         return switch (this.t()) {
            case a -> ern.am;
            case b -> ern.an;
            case c -> ern.ao;
            case d -> ern.ap;
            case e -> ern.aq;
            case f -> ern.ar;
            case g -> ern.as;
            case h -> ern.at;
            case i -> ern.au;
            case j -> ern.av;
            case k -> ern.aw;
            case l -> ern.ax;
            case m -> ern.ay;
            case n -> ern.az;
            case o -> ern.aA;
            case p -> ern.aB;
         };
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.cf = 40;
      } else {
         super.b($$0);
      }
   }

   public float H(float $$0) {
      if (this.cf <= 0) {
         return 0.0F;
      } else if (this.cf >= 4 && this.cf <= 36) {
         return 1.0F;
      } else {
         return this.cf < 4 ? ((float)this.cf - $$0) / 4.0F : -((float)(this.cf - 40) - $$0) / 4.0F;
      }
   }

   public float I(float $$0) {
      if (this.cf > 4 && this.cf <= 36) {
         float $$1 = ((float)(this.cf - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * ayo.a($$1 * 28.7F);
      } else {
         return this.cf > 0 ? (float) (Math.PI / 5) : this.dG() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.a(cut.rV)) {
         if (!this.dO().B && this.a()) {
            this.a(avq.h);
            this.a(dxz.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bqr.a;
         } else {
            return bqr.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(avq $$0) {
      this.dO().a(null, this, avp.wB, $$0, 1.0F, 1.0F);
      this.x(true);
      int $$1 = 1 + this.ah.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cjh $$3 = this.a(cc.get(this.t()), 1);
         if ($$3 != null) {
            $$3.i($$3.dr().b((double)((this.ah.i() - this.ah.i()) * 0.1F), (double)(this.ah.i() * 0.05F), (double)((this.ah.i() - this.ah.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bE() && !this.x() && !this.o_();
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Sheared", this.x());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.x($$0.q("Sheared"));
      this.b(cti.a($$0.f("Color")));
   }

   @Override
   protected avo v() {
      return avp.wy;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.wA;
   }

   @Override
   protected avo n_() {
      return avp.wz;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.wC, 0.15F, 1.0F);
   }

   public cti t() {
      return cti.a(this.ao.a(cb) & 15);
   }

   public void b(cti $$0) {
      byte $$1 = this.ao.a(cb);
      this.ao.a(cb, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean x() {
      return (this.ao.a(cb) & 16) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.ao.a(cb);
      if ($$0) {
         this.ao.a(cb, (byte)($$1 | 16));
      } else {
         this.ao.a(cb, (byte)($$1 & -17));
      }
   }

   public static cti a(ayw $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cti.p;
      } else if ($$1 < 10) {
         return cti.h;
      } else if ($$1 < 15) {
         return cti.i;
      } else if ($$1 < 18) {
         return cti.m;
      } else {
         return $$0.a(500) == 0 ? cti.g : cti.a;
      }
   }

   @Nullable
   public cga b(aqu $$0, bsl $$1) {
      cga $$2 = bsx.aJ.a((dcw)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cga)$$1));
      }

      return $$2;
   }

   @Override
   public void Q() {
      super.Q();
      this.x(false);
      if (this.o_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cti a(cfe $$0, cfe $$1) {
      cti $$2 = ((cga)$$0).t();
      cti $$3 = ((cga)$$1).t();
      cyp $$4 = a($$2, $$3);
      return this.dO()
         .r()
         .a(czf.a, $$4, this.dO())
         .map($$1x -> ((cyq)$$1x.b()).a($$4, this.dO().H_()))
         .map(cuq::g)
         .filter(ctj.class::isInstance)
         .map(ctj.class::cast)
         .map(ctj::c)
         .orElseGet(() -> this.dO().z.h() ? $$2 : $$3);
   }

   private static cyp a(cti $$0, cti $$1) {
      return cyp.a(2, 1, List.of(new cuq(ctj.a($$0)), new cuq(ctj.a($$1))));
   }
}
