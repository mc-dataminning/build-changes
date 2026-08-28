import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cfk extends ceo implements btp {
   private static final int ca = 40;
   private static final ajp<Byte> cb = ajt.a(cfk.class, ajr.a);
   private static final Map<cst, dcc> cd = ac.a(Maps.newEnumMap(cst.class), $$0 -> {
      $$0.put(cst.a, dfh.bA);
      $$0.put(cst.b, dfh.bB);
      $$0.put(cst.c, dfh.bC);
      $$0.put(cst.d, dfh.bD);
      $$0.put(cst.e, dfh.bE);
      $$0.put(cst.f, dfh.bF);
      $$0.put(cst.g, dfh.bG);
      $$0.put(cst.h, dfh.bH);
      $$0.put(cst.i, dfh.bI);
      $$0.put(cst.j, dfh.bJ);
      $$0.put(cst.k, dfh.bK);
      $$0.put(cst.l, dfh.bL);
      $$0.put(cst.m, dfh.bM);
      $$0.put(cst.n, dfh.bN);
      $$0.put(cst.o, dfh.bO);
      $$0.put(cst.p, dfh.bP);
   });
   private static final Map<cst, float[]> ce = Maps.newEnumMap(Arrays.stream(cst.values()).collect(Collectors.toMap($$0 -> (cst)$$0, cfk::c)));
   private int cf;
   private bzo cg;

   private static float[] c(cst $$0) {
      if ($$0 == cst.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(cst $$0) {
      return ce.get($$0);
   }

   public cfk(bsj<? extends cfk> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.cg = new bzo(this);
      this.bU.a(0, new bzq(this));
      this.bU.a(1, new cap(this, 1.25));
      this.bU.a(2, new bzi(this, 1.0));
      this.bU.a(3, new cbe(this, 1.1, $$0 -> $$0.a(awd.ac), false));
      this.bU.a(4, new bzv(this, 1.1));
      this.bU.a(5, this.cg);
      this.bU.a(6, new cbj(this, 1.0));
      this.bU.a(7, new cae(this, cmh.class, 6.0F));
      this.bU.a(8, new car(this));
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.ac);
   }

   @Override
   protected void Z() {
      this.cf = this.cg.h();
      super.Z();
   }

   @Override
   public void n_() {
      if (this.dP().B) {
         this.cf = Math.max(0, this.cf - 1);
      }

      super.n_();
   }

   public static buf.a s() {
      return bta.A().a(bug.s, 8.0).a(bug.v, 0.23F);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cb, (byte)0);
   }

   @Override
   public akj<eqt> T() {
      if (this.y()) {
         return this.ak().k();
      } else {
         return switch (this.u()) {
            case a -> eqk.am;
            case b -> eqk.an;
            case c -> eqk.ao;
            case d -> eqk.ap;
            case e -> eqk.aq;
            case f -> eqk.ar;
            case g -> eqk.as;
            case h -> eqk.at;
            case i -> eqk.au;
            case j -> eqk.av;
            case k -> eqk.aw;
            case l -> eqk.ax;
            case m -> eqk.ay;
            case n -> eqk.az;
            case o -> eqk.aA;
            case p -> eqk.aB;
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
         return (float) (Math.PI / 5) + 0.21991149F * aye.a($$1 * 28.7F);
      } else {
         return this.cf > 0 ? (float) (Math.PI / 5) : this.dH() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      if ($$2.a(cud.rV)) {
         if (!this.dP().B && this.a()) {
            this.a(avg.h);
            this.a(dxa.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bqd.a;
         } else {
            return bqd.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(avg $$0) {
      this.dP().a(null, this, avf.wB, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ah.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cir $$3 = this.a(cd.get(this.u()), 1);
         if ($$3 != null) {
            $$3.h($$3.ds().b((double)((this.ah.i() - this.ah.i()) * 0.1F), (double)(this.ah.i() * 0.05F), (double)((this.ah.i() - this.ah.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bD() && !this.y() && !this.p_();
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Sheared", this.y());
      $$0.a("Color", (byte)this.u().a());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(cst.a($$0.f("Color")));
   }

   @Override
   protected ave v() {
      return avf.wy;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.wA;
   }

   @Override
   protected ave o_() {
      return avf.wz;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.wC, 0.15F, 1.0F);
   }

   public cst u() {
      return cst.a(this.ao.a(cb) & 15);
   }

   public void b(cst $$0) {
      byte $$1 = this.ao.a(cb);
      this.ao.a(cb, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean y() {
      return (this.ao.a(cb) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.ao.a(cb);
      if ($$0) {
         this.ao.a(cb, (byte)($$1 | 16));
      } else {
         this.ao.a(cb, (byte)($$1 & -17));
      }
   }

   public static cst a(aym $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cst.p;
      } else if ($$1 < 10) {
         return cst.h;
      } else if ($$1 < 15) {
         return cst.i;
      } else if ($$1 < 18) {
         return cst.m;
      } else {
         return $$0.a(500) == 0 ? cst.g : cst.a;
      }
   }

   @Nullable
   public cfk b(aqk $$0, brx $$1) {
      cfk $$2 = bsj.aJ.a((dcd)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cfk)$$1));
      }

      return $$2;
   }

   @Override
   public void O() {
      super.O();
      this.w(false);
      if (this.p_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cst a(ceo $$0, ceo $$1) {
      cst $$2 = ((cfk)$$0).u();
      cst $$3 = ((cfk)$$1).u();
      cxw $$4 = a($$2, $$3);
      return this.dP()
         .r()
         .a(cym.a, $$4, this.dP())
         .map($$1x -> ((cxx)$$1x.b()).a($$4, this.dP().H_()))
         .map(cua::g)
         .filter(csu.class::isInstance)
         .map(csu.class::cast)
         .map(csu::c)
         .orElseGet(() -> this.dP().z.h() ? $$2 : $$3);
   }

   private static cxw a(cst $$0, cst $$1) {
      return cxw.a(2, 1, List.of(new cua(csu.a($$0)), new cua(csu.a($$1))));
   }
}
