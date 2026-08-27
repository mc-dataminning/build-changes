import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cca extends cbe implements bqf {
   private static final int bX = 40;
   private static final aim<Byte> bY = aiq.a(cca.class, aio.a);
   private static final Map<cpd, cxa> ca = ac.a(Maps.newEnumMap(cpd.class), $$0 -> {
      $$0.put(cpd.a, dae.bA);
      $$0.put(cpd.b, dae.bB);
      $$0.put(cpd.c, dae.bC);
      $$0.put(cpd.d, dae.bD);
      $$0.put(cpd.e, dae.bE);
      $$0.put(cpd.f, dae.bF);
      $$0.put(cpd.g, dae.bG);
      $$0.put(cpd.h, dae.bH);
      $$0.put(cpd.i, dae.bI);
      $$0.put(cpd.j, dae.bJ);
      $$0.put(cpd.k, dae.bK);
      $$0.put(cpd.l, dae.bL);
      $$0.put(cpd.m, dae.bM);
      $$0.put(cpd.n, dae.bN);
      $$0.put(cpd.o, dae.bO);
      $$0.put(cpd.p, dae.bP);
   });
   private static final Map<cpd, float[]> cb = Maps.newEnumMap(Arrays.stream(cpd.values()).collect(Collectors.toMap($$0 -> (cpd)$$0, cca::c)));
   private int cc;
   private bwe cd;

   private static float[] c(cpd $$0) {
      if ($$0 == cpd.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(cpd $$0) {
      return cb.get($$0);
   }

   public cca(bpd<? extends cca> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.cd = new bwe(this);
      this.bR.a(0, new bwg(this));
      this.bR.a(1, new bxf(this, 1.25));
      this.bR.a(2, new bvy(this, 1.0));
      this.bR.a(3, new bxu(this, 1.1, ctm.a(cqp.pv), false));
      this.bR.a(4, new bwl(this, 1.1));
      this.bR.a(5, this.cd);
      this.bR.a(6, new bxz(this, 1.0));
      this.bR.a(7, new bwu(this, ciu.class, 6.0F));
      this.bR.a(8, new bxh(this));
   }

   @Override
   protected void Y() {
      this.cc = this.cd.h();
      super.Y();
   }

   @Override
   public void m_() {
      if (this.dM().B) {
         this.cc = Math.max(0, this.cc - 1);
      }

      super.m_();
   }

   public static bqv.a r() {
      return bpr.A().a(bqw.q, 8.0).a(bqw.r, 0.23F);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(bY, (byte)0);
   }

   @Override
   public ajh S() {
      if (this.y()) {
         return this.ai().j();
      } else {
         return switch (this.s()) {
            case a -> eku.ac;
            case b -> eku.ad;
            case c -> eku.ae;
            case d -> eku.af;
            case e -> eku.ag;
            case f -> eku.ah;
            case g -> eku.ai;
            case h -> eku.aj;
            case i -> eku.ak;
            case j -> eku.al;
            case k -> eku.am;
            case l -> eku.an;
            case m -> eku.ao;
            case n -> eku.ap;
            case o -> eku.aq;
            case p -> eku.ar;
         };
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.cc = 40;
      } else {
         super.b($$0);
      }
   }

   public float G(float $$0) {
      if (this.cc <= 0) {
         return 0.0F;
      } else if (this.cc >= 4 && this.cc <= 36) {
         return 1.0F;
      } else {
         return this.cc < 4 ? ((float)this.cc - $$0) / 4.0F : -((float)(this.cc - 40) - $$0) / 4.0F;
      }
   }

   public float H(float $$0) {
      if (this.cc > 4 && this.cc <= 36) {
         float $$1 = ((float)(this.cc - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * aww.a($$1 * 28.7F);
      } else {
         return this.cc > 0 ? (float) (Math.PI / 5) : this.dE() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      if ($$2.a(cqp.rU)) {
         if (!this.dM().B && this.a()) {
            this.a(atz.h);
            this.a(drp.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bnd.a;
         } else {
            return bnd.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(atz $$0) {
      this.dM().a(null, this, aty.wc, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ag.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cfe $$3 = this.a(ca.get(this.s()), 1);
         if ($$3 != null) {
            $$3.g($$3.dp().b((double)((this.ag.i() - this.ag.i()) * 0.1F), (double)(this.ag.i() * 0.05F), (double)((this.ag.i() - this.ag.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bA() && !this.y() && !this.o_();
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Sheared", this.y());
      $$0.a("Color", (byte)this.s().a());
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(cpd.a($$0.f("Color")));
   }

   @Override
   protected atx v() {
      return aty.vZ;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.wb;
   }

   @Override
   protected atx n_() {
      return aty.wa;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.wd, 0.15F, 1.0F);
   }

   public cpd s() {
      return cpd.a(this.an.a(bY) & 15);
   }

   public void b(cpd $$0) {
      byte $$1 = this.an.a(bY);
      this.an.a(bY, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean y() {
      return (this.an.a(bY) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.an.a(bY);
      if ($$0) {
         this.an.a(bY, (byte)($$1 | 16));
      } else {
         this.an.a(bY, (byte)($$1 & -17));
      }
   }

   public static cpd a(axd $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cpd.p;
      } else if ($$1 < 10) {
         return cpd.h;
      } else if ($$1 < 15) {
         return cpd.i;
      } else if ($$1 < 18) {
         return cpd.m;
      } else {
         return $$0.a(500) == 0 ? cpd.g : cpd.a;
      }
   }

   @Nullable
   public cca b(apf $$0, bos $$1) {
      cca $$2 = bpd.aJ.a((cxb)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cca)$$1));
      }

      return $$2;
   }

   @Override
   public void N() {
      super.N();
      this.w(false);
      if (this.o_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cpd a(cbe $$0, cbe $$1) {
      cpd $$2 = ((cca)$$0).s();
      cpd $$3 = ((cca)$$1).s();
      cmg $$4 = a($$2, $$3);
      return this.dM()
         .r()
         .a(ctu.a, $$4, this.dM())
         .map($$1x -> ((ctg)$$1x.b()).a($$4, this.dM().H_()))
         .map(cqm::d)
         .filter(cpe.class::isInstance)
         .map(cpe.class::cast)
         .map(cpe::c)
         .orElseGet(() -> this.dM().z.h() ? $$2 : $$3);
   }

   private static cmg a(cpd $$0, cpd $$1) {
      cmg $$2 = new cnq(new clq(null, -1) {
         @Override
         public cqm a(ciu $$0, int $$1) {
            return cqm.h;
         }

         @Override
         public boolean a(ciu $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cqm(cpe.a($$0)));
      $$2.a(1, new cqm(cpe.a($$1)));
      return $$2;
   }
}
