import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cfn extends cer implements bts {
   private static final int ca = 40;
   private static final ajp<Byte> cb = ajt.a(cfn.class, ajr.a);
   private static final Map<csv, dce> cd = ac.a(Maps.newEnumMap(csv.class), $$0 -> {
      $$0.put(csv.a, dfj.bA);
      $$0.put(csv.b, dfj.bB);
      $$0.put(csv.c, dfj.bC);
      $$0.put(csv.d, dfj.bD);
      $$0.put(csv.e, dfj.bE);
      $$0.put(csv.f, dfj.bF);
      $$0.put(csv.g, dfj.bG);
      $$0.put(csv.h, dfj.bH);
      $$0.put(csv.i, dfj.bI);
      $$0.put(csv.j, dfj.bJ);
      $$0.put(csv.k, dfj.bK);
      $$0.put(csv.l, dfj.bL);
      $$0.put(csv.m, dfj.bM);
      $$0.put(csv.n, dfj.bN);
      $$0.put(csv.o, dfj.bO);
      $$0.put(csv.p, dfj.bP);
   });
   private static final Map<csv, float[]> ce = Maps.newEnumMap(Arrays.stream(csv.values()).collect(Collectors.toMap($$0 -> (csv)$$0, cfn::c)));
   private int cf;
   private bzr cg;

   private static float[] c(csv $$0) {
      if ($$0 == csv.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(csv $$0) {
      return ce.get($$0);
   }

   public cfn(bsm<? extends cfn> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.cg = new bzr(this);
      this.bU.a(0, new bzt(this));
      this.bU.a(1, new cas(this, 1.25));
      this.bU.a(2, new bzl(this, 1.0));
      this.bU.a(3, new cbh(this, 1.1, $$0 -> $$0.a(awf.ac), false));
      this.bU.a(4, new bzy(this, 1.1));
      this.bU.a(5, this.cg);
      this.bU.a(6, new cbm(this, 1.0));
      this.bU.a(7, new cah(this, cmk.class, 6.0F));
      this.bU.a(8, new cau(this));
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.ac);
   }

   @Override
   protected void Z() {
      this.cf = this.cg.h();
      super.Z();
   }

   @Override
   public void n_() {
      if (this.dQ().B) {
         this.cf = Math.max(0, this.cf - 1);
      }

      super.n_();
   }

   public static bui.a s() {
      return btd.A().a(buj.s, 8.0).a(buj.v, 0.23F);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cb, (byte)0);
   }

   @Override
   public akj<eqz> T() {
      if (this.y()) {
         return this.al().k();
      } else {
         return switch (this.u()) {
            case a -> eqq.am;
            case b -> eqq.an;
            case c -> eqq.ao;
            case d -> eqq.ap;
            case e -> eqq.aq;
            case f -> eqq.ar;
            case g -> eqq.as;
            case h -> eqq.at;
            case i -> eqq.au;
            case j -> eqq.av;
            case k -> eqq.aw;
            case l -> eqq.ax;
            case m -> eqq.ay;
            case n -> eqq.az;
            case o -> eqq.aA;
            case p -> eqq.aB;
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
         return (float) (Math.PI / 5) + 0.21991149F * ayg.a($$1 * 28.7F);
      } else {
         return this.cf > 0 ? (float) (Math.PI / 5) : this.dI() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if ($$2.a(cuf.rV)) {
         if (!this.dQ().B && this.a()) {
            this.a(avi.h);
            this.a(dxg.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bqg.a;
         } else {
            return bqg.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(avi $$0) {
      this.dQ().a(null, this, avh.wB, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ah.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ciu $$3 = this.a(cd.get(this.u()), 1);
         if ($$3 != null) {
            $$3.i($$3.dt().b((double)((this.ah.i() - this.ah.i()) * 0.1F), (double)(this.ah.i() * 0.05F), (double)((this.ah.i() - this.ah.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bE() && !this.y() && !this.p_();
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
      this.b(csv.a($$0.f("Color")));
   }

   @Override
   protected avg v() {
      return avh.wy;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.wA;
   }

   @Override
   protected avg o_() {
      return avh.wz;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.wC, 0.15F, 1.0F);
   }

   public csv u() {
      return csv.a(this.ao.a(cb) & 15);
   }

   public void b(csv $$0) {
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

   public static csv a(ayo $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return csv.p;
      } else if ($$1 < 10) {
         return csv.h;
      } else if ($$1 < 15) {
         return csv.i;
      } else if ($$1 < 18) {
         return csv.m;
      } else {
         return $$0.a(500) == 0 ? csv.g : csv.a;
      }
   }

   @Nullable
   public cfn b(aqm $$0, bsa $$1) {
      cfn $$2 = bsm.aJ.a((dcf)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cfn)$$1));
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
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private csv a(cer $$0, cer $$1) {
      csv $$2 = ((cfn)$$0).u();
      csv $$3 = ((cfn)$$1).u();
      cxy $$4 = a($$2, $$3);
      return this.dQ()
         .r()
         .a(cyo.a, $$4, this.dQ())
         .map($$1x -> ((cxz)$$1x.b()).a($$4, this.dQ().H_()))
         .map(cuc::g)
         .filter(csw.class::isInstance)
         .map(csw.class::cast)
         .map(csw::c)
         .orElseGet(() -> this.dQ().z.h() ? $$2 : $$3);
   }

   private static cxy a(csv $$0, csv $$1) {
      return cxy.a(2, 1, List.of(new cuc(csw.a($$0)), new cuc(csw.a($$1))));
   }
}
