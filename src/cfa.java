import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cfa extends cee implements bte {
   private static final int ch = 40;
   private static final ajy<Byte> ci = akc.a(cfa.class, aka.a);
   private static final Map<csy, dbz> ck = ad.a(Maps.newEnumMap(csy.class), $$0 -> {
      $$0.put(csy.a, dfe.ck);
      $$0.put(csy.b, dfe.cl);
      $$0.put(csy.c, dfe.cm);
      $$0.put(csy.d, dfe.cn);
      $$0.put(csy.e, dfe.co);
      $$0.put(csy.f, dfe.cp);
      $$0.put(csy.g, dfe.cq);
      $$0.put(csy.h, dfe.cr);
      $$0.put(csy.i, dfe.cs);
      $$0.put(csy.j, dfe.ct);
      $$0.put(csy.k, dfe.cu);
      $$0.put(csy.l, dfe.cv);
      $$0.put(csy.m, dfe.cw);
      $$0.put(csy.n, dfe.cx);
      $$0.put(csy.o, dfe.cy);
      $$0.put(csy.p, dfe.cz);
   });
   private static final Map<csy, float[]> cl = Maps.newEnumMap(Arrays.stream(csy.values()).collect(Collectors.toMap($$0 -> (csy)$$0, cfa::c)));
   private static final Map<csy, float[]> cm = Maps.newEnumMap(Arrays.stream(csy.values()).collect(Collectors.toMap($$0 -> (csy)$$0, cfa::d)));
   private int cn;
   private bzd co;

   private static float[] c(csy $$0) {
      if ($$0 == csy.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   private static float[] d(csy $$0) {
      return $$0 == csy.a ? new float[]{1.0F, 1.0F, 1.0F} : $$0.d();
   }

   public float[] a(csy $$0) {
      return this.dV() ? cm.get($$0) : cl.get($$0);
   }

   public cfa(bsb<? extends cfa> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean dW() {
      return true;
   }

   @Override
   protected void y() {
      this.co = new bzd(this);
      this.cb.a(0, new bzf(this));
      this.cb.a(1, new cae(this, 1.25));
      this.cb.a(2, new byx(this, 1.0));
      this.cb.a(3, new cat(this, 1.1, $$0 -> $$0.a(awm.ac), false));
      this.cb.a(4, new bzk(this, 1.1));
      this.cb.a(5, this.co);
      this.cb.a(6, new cay(this, 1.0));
      this.cb.a(7, new bzt(this, cly.class, 6.0F));
      this.cb.a(8, new cag(this));
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.ac);
   }

   @Override
   protected void Y() {
      this.cn = this.co.h();
      super.Y();
   }

   @Override
   public void m_() {
      if (this.dU().C) {
         this.cn = Math.max(0, this.cn - 1);
      }

      super.m_();
   }

   public static btu.a r() {
      return bsq.A().a(btv.q, 8.0).a(btv.r, 0.23F);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ci, (byte)0);
   }

   @Override
   public aks<eru> S() {
      if (this.x()) {
         return this.ak().j();
      } else if (this.dV()) {
         return switch (this.t()) {
            case a -> ern.ay;
            case b -> ern.az;
            case c -> ern.aA;
            case d -> ern.aB;
            case e -> ern.aC;
            case f -> ern.aD;
            case g -> ern.aE;
            case h -> ern.aF;
            case i -> ern.aG;
            case j -> ern.aH;
            case k -> ern.aI;
            case l -> ern.aJ;
            case m -> ern.aK;
            case n -> ern.aL;
            case o -> ern.aM;
            case p -> ern.aN;
         };
      } else {
         return switch (this.t()) {
            case a -> ern.ai;
            case b -> ern.aj;
            case c -> ern.ak;
            case d -> ern.al;
            case e -> ern.am;
            case f -> ern.an;
            case g -> ern.ao;
            case h -> ern.ap;
            case i -> ern.aq;
            case j -> ern.ar;
            case k -> ern.as;
            case l -> ern.at;
            case m -> ern.au;
            case n -> ern.av;
            case o -> ern.aw;
            case p -> ern.ax;
         };
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.cn = 40;
      } else {
         super.b($$0);
      }
   }

   public float G(float $$0) {
      if (this.cn <= 0) {
         return 0.0F;
      } else if (this.cn >= 4 && this.cn <= 36) {
         return 1.0F;
      } else {
         return this.cn < 4 ? ((float)this.cn - $$0) / 4.0F : -((float)(this.cn - 40) - $$0) / 4.0F;
      }
   }

   public float H(float $$0) {
      if (this.cn > 4 && this.cn <= 36) {
         float $$1 = ((float)(this.cn - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * aym.a($$1 * 28.7F);
      } else {
         return this.cn > 0 ? (float) (Math.PI / 5) : this.dM() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if (this.n($$2)) {
         if (!this.dU().C && this.a()) {
            this.a(avq.h);
            this.a(dxv.M, $$0);
            if (this.dV() && $$0 instanceof aqu $$3) {
               an.ao.a($$3);
            }

            $$2.a(1, $$0, d($$1));
            return bqa.a;
         } else {
            return bqa.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   private boolean n(cuh $$0) {
      return this.dV() ? $$0.a(cuk.AA) : $$0.a(cuk.ts);
   }

   @Override
   public void a(avq $$0) {
      if (this.dV()) {
         cvf.a(this.dU(), this, $$0);
      } else {
         this.dU().a(null, this, avo.wW, $$0, 1.0F, 1.0F);
      }

      this.w(true);
      int $$1 = 1 + this.al.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cig $$3 = this.a(this.gy(), 1);
         if ($$3 != null) {
            $$3.g($$3.dx().b((double)((this.al.i() - this.al.i()) * 0.1F), (double)(this.al.i() * 0.05F), (double)((this.al.i() - this.al.i()) * 0.1F)));
         }
      }
   }

   private dbz gy() {
      return this.dV() ? (dbz)cuk.AD.get(this.t()) : ck.get(this.t());
   }

   @Override
   public boolean a() {
      return this.bI() && !this.x() && !this.o_();
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Sheared", this.x());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(csy.a($$0.f("Color")));
   }

   @Override
   protected avn u() {
      return avo.wT;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.wV;
   }

   @Override
   protected avn n_() {
      return avo.wU;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.wX, 0.15F, 1.0F);
   }

   public csy t() {
      return csy.a(this.as.a(ci) & 15);
   }

   public void b(csy $$0) {
      byte $$1 = this.as.a(ci);
      this.as.a(ci, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean x() {
      return (this.as.a(ci) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.as.a(ci);
      if ($$0) {
         this.as.a(ci, (byte)($$1 | 16));
      } else {
         this.as.a(ci, (byte)($$1 & -17));
      }
   }

   public static csy a(ayt $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return csy.p;
      } else if ($$1 < 10) {
         return csy.h;
      } else if ($$1 < 15) {
         return csy.i;
      } else if ($$1 < 18) {
         return csy.m;
      } else {
         return $$0.a(500) == 0 ? csy.g : csy.a;
      }
   }

   @Nullable
   public cfa b(aqt $$0, brp $$1) {
      cfa $$2 = bsb.aL.a((dca)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cfa)$$1));
      }

      return $$2;
   }

   @Override
   public void M() {
      super.M();
      this.w(false);
      if (this.o_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      this.b(a($$0.F_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private csy a(cee $$0, cee $$1) {
      csy $$2 = ((cfa)$$0).t();
      csy $$3 = ((cfa)$$1).t();
      cpw $$4 = a($$2, $$3);
      return this.dU()
         .r()
         .a(czf.a, $$4, this.dU())
         .map($$1x -> ((cyp)$$1x.b()).a($$4, this.dU().I_()))
         .map(cuh::f)
         .filter(csz.class::isInstance)
         .map(csz.class::cast)
         .map(csz::c)
         .orElseGet(() -> this.dU().A.h() ? $$2 : $$3);
   }

   private static cpw a(csy $$0, csy $$1) {
      cpw $$2 = new crl(new cpg(null, -1) {
         @Override
         public cuh a(cly $$0, int $$1) {
            return cuh.i;
         }

         @Override
         public boolean a(cly $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cuh(csz.a($$0)));
      $$2.a(1, new cuh(csz.a($$1)));
      return $$2;
   }
}
