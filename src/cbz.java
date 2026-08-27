import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cbz extends cbd implements bqe {
   private static final int bX = 40;
   private static final aim<Byte> bY = aiq.a(cbz.class, aio.a);
   private static final Map<cpb, cwy> ca = ac.a(Maps.newEnumMap(cpb.class), $$0 -> {
      $$0.put(cpb.a, dac.bA);
      $$0.put(cpb.b, dac.bB);
      $$0.put(cpb.c, dac.bC);
      $$0.put(cpb.d, dac.bD);
      $$0.put(cpb.e, dac.bE);
      $$0.put(cpb.f, dac.bF);
      $$0.put(cpb.g, dac.bG);
      $$0.put(cpb.h, dac.bH);
      $$0.put(cpb.i, dac.bI);
      $$0.put(cpb.j, dac.bJ);
      $$0.put(cpb.k, dac.bK);
      $$0.put(cpb.l, dac.bL);
      $$0.put(cpb.m, dac.bM);
      $$0.put(cpb.n, dac.bN);
      $$0.put(cpb.o, dac.bO);
      $$0.put(cpb.p, dac.bP);
   });
   private static final Map<cpb, float[]> cb = Maps.newEnumMap(Arrays.stream(cpb.values()).collect(Collectors.toMap($$0 -> (cpb)$$0, cbz::c)));
   private int cc;
   private bwd cd;

   private static float[] c(cpb $$0) {
      if ($$0 == cpb.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(cpb $$0) {
      return cb.get($$0);
   }

   public cbz(bpc<? extends cbz> $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.cd = new bwd(this);
      this.bR.a(0, new bwf(this));
      this.bR.a(1, new bxe(this, 1.25));
      this.bR.a(2, new bvx(this, 1.0));
      this.bR.a(3, new bxt(this, 1.1, ctk.a(cqn.pv), false));
      this.bR.a(4, new bwk(this, 1.1));
      this.bR.a(5, this.cd);
      this.bR.a(6, new bxy(this, 1.0));
      this.bR.a(7, new bwt(this, cis.class, 6.0F));
      this.bR.a(8, new bxg(this));
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

   public static bqu.a r() {
      return bpq.A().a(bqv.q, 8.0).a(bqv.r, 0.23F);
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
            case a -> eks.ac;
            case b -> eks.ad;
            case c -> eks.ae;
            case d -> eks.af;
            case e -> eks.ag;
            case f -> eks.ah;
            case g -> eks.ai;
            case h -> eks.aj;
            case i -> eks.ak;
            case j -> eks.al;
            case k -> eks.am;
            case l -> eks.an;
            case m -> eks.ao;
            case n -> eks.ap;
            case o -> eks.aq;
            case p -> eks.ar;
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
   public bnc b(cis $$0, bnb $$1) {
      cqk $$2 = $$0.b($$1);
      if ($$2.a(cqn.rU)) {
         if (!this.dM().B && this.a()) {
            this.a(atz.h);
            this.a(drn.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bnc.a;
         } else {
            return bnc.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(atz $$0) {
      this.dM().a(null, this, aty.vX, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ag.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cfd $$3 = this.a(ca.get(this.s()), 1);
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
      this.b(cpb.a($$0.f("Color")));
   }

   @Override
   protected atx v() {
      return aty.vU;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.vW;
   }

   @Override
   protected atx n_() {
      return aty.vV;
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      this.a(aty.vY, 0.15F, 1.0F);
   }

   public cpb s() {
      return cpb.a(this.an.a(bY) & 15);
   }

   public void b(cpb $$0) {
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

   public static cpb a(axd $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cpb.p;
      } else if ($$1 < 10) {
         return cpb.h;
      } else if ($$1 < 15) {
         return cpb.i;
      } else if ($$1 < 18) {
         return cpb.m;
      } else {
         return $$0.a(500) == 0 ? cpb.g : cpb.a;
      }
   }

   @Nullable
   public cbz b(apf $$0, bor $$1) {
      cbz $$2 = bpc.aI.a((cwz)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cbz)$$1));
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
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cpb a(cbd $$0, cbd $$1) {
      cpb $$2 = ((cbz)$$0).s();
      cpb $$3 = ((cbz)$$1).s();
      cme $$4 = a($$2, $$3);
      return this.dM()
         .r()
         .a(cts.a, $$4, this.dM())
         .map($$1x -> ((cte)$$1x.b()).a($$4, this.dM().H_()))
         .map(cqk::d)
         .filter(cpc.class::isInstance)
         .map(cpc.class::cast)
         .map(cpc::c)
         .orElseGet(() -> this.dM().z.h() ? $$2 : $$3);
   }

   private static cme a(cpb $$0, cpb $$1) {
      cme $$2 = new cno(new clo(null, -1) {
         @Override
         public cqk a(cis $$0, int $$1) {
            return cqk.h;
         }

         @Override
         public boolean a(cis $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cqk(cpc.a($$0)));
      $$2.a(1, new cqk(cpc.a($$1)));
      return $$2;
   }
}
