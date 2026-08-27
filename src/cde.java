import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cde extends cci implements brj {
   private static final int bX = 40;
   private static final aja<Byte> bY = aje.a(cde.class, ajc.a);
   private static final Map<cql, czf> ca = ac.a(Maps.newEnumMap(cql.class), $$0 -> {
      $$0.put(cql.a, dcj.bA);
      $$0.put(cql.b, dcj.bB);
      $$0.put(cql.c, dcj.bC);
      $$0.put(cql.d, dcj.bD);
      $$0.put(cql.e, dcj.bE);
      $$0.put(cql.f, dcj.bF);
      $$0.put(cql.g, dcj.bG);
      $$0.put(cql.h, dcj.bH);
      $$0.put(cql.i, dcj.bI);
      $$0.put(cql.j, dcj.bJ);
      $$0.put(cql.k, dcj.bK);
      $$0.put(cql.l, dcj.bL);
      $$0.put(cql.m, dcj.bM);
      $$0.put(cql.n, dcj.bN);
      $$0.put(cql.o, dcj.bO);
      $$0.put(cql.p, dcj.bP);
   });
   private static final Map<cql, float[]> cb = Maps.newEnumMap(Arrays.stream(cql.values()).collect(Collectors.toMap($$0 -> (cql)$$0, cde::c)));
   private int cc;
   private bxi cd;

   private static float[] c(cql $$0) {
      if ($$0 == cql.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(cql $$0) {
      return cb.get($$0);
   }

   public cde(bqg<? extends cde> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.cd = new bxi(this);
      this.bR.a(0, new bxk(this));
      this.bR.a(1, new byj(this, 1.25));
      this.bR.a(2, new bxc(this, 1.0));
      this.bR.a(3, new byy(this, 1.1, cvp.a(crv.pv), false));
      this.bR.a(4, new bxp(this, 1.1));
      this.bR.a(5, this.cd);
      this.bR.a(6, new bzd(this, 1.0));
      this.bR.a(7, new bxy(this, cka.class, 6.0F));
      this.bR.a(8, new byl(this));
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

   public static brz.a r() {
      return bqv.A().a(bsa.q, 8.0).a(bsa.r, 0.23F);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(bY, (byte)0);
   }

   @Override
   public ajv S() {
      if (this.y()) {
         return this.ai().j();
      } else {
         return switch (this.u()) {
            case a -> eni.ac;
            case b -> eni.ad;
            case c -> eni.ae;
            case d -> eni.af;
            case e -> eni.ag;
            case f -> eni.ah;
            case g -> eni.ai;
            case h -> eni.aj;
            case i -> eni.ak;
            case j -> eni.al;
            case k -> eni.am;
            case l -> eni.an;
            case m -> eni.ao;
            case n -> eni.ap;
            case o -> eni.aq;
            case p -> eni.ar;
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
         return (float) (Math.PI / 5) + 0.21991149F * axm.a($$1 * 28.7F);
      } else {
         return this.cc > 0 ? (float) (Math.PI / 5) : this.dE() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      if ($$2.a(crv.rU)) {
         if (!this.dM().B && this.a()) {
            this.a(aup.h);
            this.a(dub.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bof.a;
         } else {
            return bof.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aup $$0) {
      this.dM().a(null, this, auo.wf, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ag.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cgk $$3 = this.a(ca.get(this.u()), 1);
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
   public void b(to $$0) {
      super.b($$0);
      $$0.a("Sheared", this.y());
      $$0.a("Color", (byte)this.u().a());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(cql.a($$0.f("Color")));
   }

   @Override
   protected aun v() {
      return auo.wc;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.we;
   }

   @Override
   protected aun o_() {
      return auo.wd;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.wg, 0.15F, 1.0F);
   }

   public cql u() {
      return cql.a(this.an.a(bY) & 15);
   }

   public void b(cql $$0) {
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

   public static cql a(axt $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cql.p;
      } else if ($$1 < 10) {
         return cql.h;
      } else if ($$1 < 15) {
         return cql.i;
      } else if ($$1 < 18) {
         return cql.m;
      } else {
         return $$0.a(500) == 0 ? cql.g : cql.a;
      }
   }

   @Nullable
   public cde b(apu $$0, bpu $$1) {
      cde $$2 = bqg.aI.a((czg)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cde)$$1));
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
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cql a(cci $$0, cci $$1) {
      cql $$2 = ((cde)$$0).u();
      cql $$3 = ((cde)$$1).u();
      cnm $$4 = a($$2, $$3);
      return this.dM()
         .r()
         .a(cvx.a, $$4, this.dM())
         .map($$1x -> ((cvj)$$1x.b()).a($$4, this.dM().H_()))
         .map(crs::f)
         .filter(cqm.class::isInstance)
         .map(cqm.class::cast)
         .map(cqm::c)
         .orElseGet(() -> this.dM().z.h() ? $$2 : $$3);
   }

   private static cnm a(cql $$0, cql $$1) {
      cnm $$2 = new coz(new cmw(null, -1) {
         @Override
         public crs a(cka $$0, int $$1) {
            return crs.i;
         }

         @Override
         public boolean a(cka $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new crs(cqm.a($$0)));
      $$2.a(1, new crs(cqm.a($$1)));
      return $$2;
   }
}
