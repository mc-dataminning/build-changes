import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class ccz extends ccd implements bre {
   private static final int bX = 40;
   private static final aiy<Byte> bY = ajc.a(ccz.class, aja.a);
   private static final Map<cqc, cyw> ca = ac.a(Maps.newEnumMap(cqc.class), $$0 -> {
      $$0.put(cqc.a, dca.bA);
      $$0.put(cqc.b, dca.bB);
      $$0.put(cqc.c, dca.bC);
      $$0.put(cqc.d, dca.bD);
      $$0.put(cqc.e, dca.bE);
      $$0.put(cqc.f, dca.bF);
      $$0.put(cqc.g, dca.bG);
      $$0.put(cqc.h, dca.bH);
      $$0.put(cqc.i, dca.bI);
      $$0.put(cqc.j, dca.bJ);
      $$0.put(cqc.k, dca.bK);
      $$0.put(cqc.l, dca.bL);
      $$0.put(cqc.m, dca.bM);
      $$0.put(cqc.n, dca.bN);
      $$0.put(cqc.o, dca.bO);
      $$0.put(cqc.p, dca.bP);
   });
   private static final Map<cqc, float[]> cb = Maps.newEnumMap(Arrays.stream(cqc.values()).collect(Collectors.toMap($$0 -> (cqc)$$0, ccz::c)));
   private int cc;
   private bxd cd;

   private static float[] c(cqc $$0) {
      if ($$0 == cqc.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(cqc $$0) {
      return cb.get($$0);
   }

   public ccz(bqb<? extends ccz> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.cd = new bxd(this);
      this.bR.a(0, new bxf(this));
      this.bR.a(1, new bye(this, 1.25));
      this.bR.a(2, new bwx(this, 1.0));
      this.bR.a(3, new byt(this, 1.1, cvg.a(crm.pv), false));
      this.bR.a(4, new bxk(this, 1.1));
      this.bR.a(5, this.cd);
      this.bR.a(6, new byy(this, 1.0));
      this.bR.a(7, new bxt(this, cjt.class, 6.0F));
      this.bR.a(8, new byg(this));
   }

   @Override
   protected void Y() {
      this.cc = this.cd.h();
      super.Y();
   }

   @Override
   public void n_() {
      if (this.dM().B) {
         this.cc = Math.max(0, this.cc - 1);
      }

      super.n_();
   }

   public static bru.a r() {
      return bqq.A().a(brv.q, 8.0).a(brv.r, 0.23F);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(bY, (byte)0);
   }

   @Override
   public ajt S() {
      if (this.y()) {
         return this.ai().j();
      } else {
         return switch (this.u()) {
            case a -> emz.ac;
            case b -> emz.ad;
            case c -> emz.ae;
            case d -> emz.af;
            case e -> emz.ag;
            case f -> emz.ah;
            case g -> emz.ai;
            case h -> emz.aj;
            case i -> emz.ak;
            case j -> emz.al;
            case k -> emz.am;
            case l -> emz.an;
            case m -> emz.ao;
            case n -> emz.ap;
            case o -> emz.aq;
            case p -> emz.ar;
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
         return (float) (Math.PI / 5) + 0.21991149F * axk.a($$1 * 28.7F);
      } else {
         return this.cc > 0 ? (float) (Math.PI / 5) : this.dE() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if ($$2.a(crm.rU)) {
         if (!this.dM().B && this.a()) {
            this.a(aun.h);
            this.a(dts.M, $$0);
            $$2.a(1, $$0, d($$1));
            return boa.a;
         } else {
            return boa.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aun $$0) {
      this.dM().a(null, this, aum.wf, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ag.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cgd $$3 = this.a(ca.get(this.u()), 1);
         if ($$3 != null) {
            $$3.g($$3.dp().b((double)((this.ag.i() - this.ag.i()) * 0.1F), (double)(this.ag.i() * 0.05F), (double)((this.ag.i() - this.ag.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bA() && !this.y() && !this.p_();
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("Sheared", this.y());
      $$0.a("Color", (byte)this.u().a());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(cqc.a($$0.f("Color")));
   }

   @Override
   protected aul v() {
      return aum.wc;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.we;
   }

   @Override
   protected aul o_() {
      return aum.wd;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.wg, 0.15F, 1.0F);
   }

   public cqc u() {
      return cqc.a(this.an.a(bY) & 15);
   }

   public void b(cqc $$0) {
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

   public static cqc a(axr $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cqc.p;
      } else if ($$1 < 10) {
         return cqc.h;
      } else if ($$1 < 15) {
         return cqc.i;
      } else if ($$1 < 18) {
         return cqc.m;
      } else {
         return $$0.a(500) == 0 ? cqc.g : cqc.a;
      }
   }

   @Nullable
   public ccz b(aps $$0, bpp $$1) {
      ccz $$2 = bqb.aI.a((cyx)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (ccz)$$1));
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
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cqc a(ccd $$0, ccd $$1) {
      cqc $$2 = ((ccz)$$0).u();
      cqc $$3 = ((ccz)$$1).u();
      cnf $$4 = a($$2, $$3);
      return this.dM()
         .r()
         .a(cvo.a, $$4, this.dM())
         .map($$1x -> ((cva)$$1x.b()).a($$4, this.dM().H_()))
         .map(crj::f)
         .filter(cqd.class::isInstance)
         .map(cqd.class::cast)
         .map(cqd::c)
         .orElseGet(() -> this.dM().z.h() ? $$2 : $$3);
   }

   private static cnf a(cqc $$0, cqc $$1) {
      cnf $$2 = new coq(new cmp(null, -1) {
         @Override
         public crj a(cjt $$0, int $$1) {
            return crj.i;
         }

         @Override
         public boolean a(cjt $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new crj(cqd.a($$0)));
      $$2.a(1, new crj(cqd.a($$1)));
      return $$2;
   }
}
