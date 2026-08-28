import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cgb extends cff implements bug {
   private static final int bY = 40;
   private static final akk<Byte> bZ = ako.a(cgb.class, akm.a);
   private static final Map<cti, dbx> cb = ac.a(Maps.newEnumMap(cti.class), $$0 -> {
      $$0.put(cti.a, dfb.bA);
      $$0.put(cti.b, dfb.bB);
      $$0.put(cti.c, dfb.bC);
      $$0.put(cti.d, dfb.bD);
      $$0.put(cti.e, dfb.bE);
      $$0.put(cti.f, dfb.bF);
      $$0.put(cti.g, dfb.bG);
      $$0.put(cti.h, dfb.bH);
      $$0.put(cti.i, dfb.bI);
      $$0.put(cti.j, dfb.bJ);
      $$0.put(cti.k, dfb.bK);
      $$0.put(cti.l, dfb.bL);
      $$0.put(cti.m, dfb.bM);
      $$0.put(cti.n, dfb.bN);
      $$0.put(cti.o, dfb.bO);
      $$0.put(cti.p, dfb.bP);
   });
   private static final Map<cti, float[]> cc = Maps.newEnumMap(Arrays.stream(cti.values()).collect(Collectors.toMap($$0 -> (cti)$$0, cgb::c)));
   private int cd;
   private caf ce;

   private static float[] c(cti $$0) {
      if ($$0 == cti.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(cti $$0) {
      return cc.get($$0);
   }

   public cgb(bta<? extends cgb> $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.ce = new caf(this);
      this.bS.a(0, new cah(this));
      this.bS.a(1, new cbg(this, 1.25));
      this.bS.a(2, new bzz(this, 1.0));
      this.bS.a(3, new cbv(this, 1.1, $$0 -> $$0.a(awy.ac), false));
      this.bS.a(4, new cam(this, 1.1));
      this.bS.a(5, this.ce);
      this.bS.a(6, new cca(this, 1.0));
      this.bS.a(7, new cav(this, cmx.class, 6.0F));
      this.bS.a(8, new cbi(this));
   }

   @Override
   public boolean o(cup $$0) {
      return $$0.a(awy.ac);
   }

   @Override
   protected void Z() {
      this.cd = this.ce.h();
      super.Z();
   }

   @Override
   public void n_() {
      if (this.dP().B) {
         this.cd = Math.max(0, this.cd - 1);
      }

      super.n_();
   }

   public static buw.a s() {
      return btr.A().a(bux.q, 8.0).a(bux.r, 0.23F);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
   }

   @Override
   public ale<eqn> T() {
      if (this.y()) {
         return this.ak().k();
      } else {
         return switch (this.u()) {
            case a -> eqe.am;
            case b -> eqe.an;
            case c -> eqe.ao;
            case d -> eqe.ap;
            case e -> eqe.aq;
            case f -> eqe.ar;
            case g -> eqe.as;
            case h -> eqe.at;
            case i -> eqe.au;
            case j -> eqe.av;
            case k -> eqe.aw;
            case l -> eqe.ax;
            case m -> eqe.ay;
            case n -> eqe.az;
            case o -> eqe.aA;
            case p -> eqe.aB;
         };
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.cd = 40;
      } else {
         super.b($$0);
      }
   }

   public float G(float $$0) {
      if (this.cd <= 0) {
         return 0.0F;
      } else if (this.cd >= 4 && this.cd <= 36) {
         return 1.0F;
      } else {
         return this.cd < 4 ? ((float)this.cd - $$0) / 4.0F : -((float)(this.cd - 40) - $$0) / 4.0F;
      }
   }

   public float H(float $$0) {
      if (this.cd > 4 && this.cd <= 36) {
         float $$1 = ((float)(this.cd - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * ayz.a($$1 * 28.7F);
      } else {
         return this.cd > 0 ? (float) (Math.PI / 5) : this.dH() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bqu b(cmx $$0, bqt $$1) {
      cup $$2 = $$0.b($$1);
      if ($$2.a(cus.rV)) {
         if (!this.dP().B && this.a()) {
            this.a(awb.h);
            this.a(dwv.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bqu.a;
         } else {
            return bqu.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(awb $$0) {
      this.dP().a(null, this, awa.wy, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ah.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cjh $$3 = this.a(cb.get(this.u()), 1);
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
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Sheared", this.y());
      $$0.a("Color", (byte)this.u().a());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(cti.a($$0.f("Color")));
   }

   @Override
   protected avz v() {
      return awa.wv;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.wx;
   }

   @Override
   protected avz o_() {
      return awa.ww;
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
      this.a(awa.wz, 0.15F, 1.0F);
   }

   public cti u() {
      return cti.a(this.ao.a(bZ) & 15);
   }

   public void b(cti $$0) {
      byte $$1 = this.ao.a(bZ);
      this.ao.a(bZ, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean y() {
      return (this.ao.a(bZ) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.ao.a(bZ);
      if ($$0) {
         this.ao.a(bZ, (byte)($$1 | 16));
      } else {
         this.ao.a(bZ, (byte)($$1 & -17));
      }
   }

   public static cti a(azh $$0) {
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
   public cgb b(arf $$0, bso $$1) {
      cgb $$2 = bta.aJ.a((dby)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cgb)$$1));
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
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cti a(cff $$0, cff $$1) {
      cti $$2 = ((cgb)$$0).u();
      cti $$3 = ((cgb)$$1).u();
      cqk $$4 = a($$2, $$3);
      return this.dP()
         .r()
         .a(cza.a, $$4, this.dP())
         .map($$1x -> ((cym)$$1x.b()).a($$4, this.dP().H_()))
         .map(cup::g)
         .filter(ctj.class::isInstance)
         .map(ctj.class::cast)
         .map(ctj::c)
         .orElseGet(() -> this.dP().z.h() ? $$2 : $$3);
   }

   private static cqk a(cti $$0, cti $$1) {
      cqk $$2 = new crw(new cpu(null, -1) {
         @Override
         public cup a(cmx $$0, int $$1) {
            return cup.l;
         }

         @Override
         public boolean a(cmx $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cup(ctj.a($$0)));
      $$2.a(1, new cup(ctj.a($$1)));
      return $$2;
   }
}
