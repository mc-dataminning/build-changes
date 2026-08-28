import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cgd extends cfh implements bui {
   private static final int bY = 40;
   private static final akk<Byte> bZ = ako.a(cgd.class, akm.a);
   private static final Map<ctk, dbz> cb = ac.a(Maps.newEnumMap(ctk.class), $$0 -> {
      $$0.put(ctk.a, dfd.bA);
      $$0.put(ctk.b, dfd.bB);
      $$0.put(ctk.c, dfd.bC);
      $$0.put(ctk.d, dfd.bD);
      $$0.put(ctk.e, dfd.bE);
      $$0.put(ctk.f, dfd.bF);
      $$0.put(ctk.g, dfd.bG);
      $$0.put(ctk.h, dfd.bH);
      $$0.put(ctk.i, dfd.bI);
      $$0.put(ctk.j, dfd.bJ);
      $$0.put(ctk.k, dfd.bK);
      $$0.put(ctk.l, dfd.bL);
      $$0.put(ctk.m, dfd.bM);
      $$0.put(ctk.n, dfd.bN);
      $$0.put(ctk.o, dfd.bO);
      $$0.put(ctk.p, dfd.bP);
   });
   private static final Map<ctk, float[]> cc = Maps.newEnumMap(Arrays.stream(ctk.values()).collect(Collectors.toMap($$0 -> (ctk)$$0, cgd::c)));
   private int cd;
   private cah ce;

   private static float[] c(ctk $$0) {
      if ($$0 == ctk.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(ctk $$0) {
      return cc.get($$0);
   }

   public cgd(btc<? extends cgd> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.ce = new cah(this);
      this.bS.a(0, new caj(this));
      this.bS.a(1, new cbi(this, 1.25));
      this.bS.a(2, new cab(this, 1.0));
      this.bS.a(3, new cbx(this, 1.1, $$0 -> $$0.a(awy.ac), false));
      this.bS.a(4, new cao(this, 1.1));
      this.bS.a(5, this.ce);
      this.bS.a(6, new ccc(this, 1.0));
      this.bS.a(7, new cax(this, cmz.class, 6.0F));
      this.bS.a(8, new cbk(this));
   }

   @Override
   public boolean o(cur $$0) {
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

   public static buy.a s() {
      return btt.A().a(buz.q, 8.0).a(buz.r, 0.23F);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
   }

   @Override
   public ale<eqp> T() {
      if (this.y()) {
         return this.ak().k();
      } else {
         return switch (this.u()) {
            case a -> eqg.am;
            case b -> eqg.an;
            case c -> eqg.ao;
            case d -> eqg.ap;
            case e -> eqg.aq;
            case f -> eqg.ar;
            case g -> eqg.as;
            case h -> eqg.at;
            case i -> eqg.au;
            case j -> eqg.av;
            case k -> eqg.aw;
            case l -> eqg.ax;
            case m -> eqg.ay;
            case n -> eqg.az;
            case o -> eqg.aA;
            case p -> eqg.aB;
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
   public bqw b(cmz $$0, bqv $$1) {
      cur $$2 = $$0.b($$1);
      if ($$2.a(cuu.rV)) {
         if (!this.dP().B && this.a()) {
            this.a(awb.h);
            this.a(dwx.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bqw.a;
         } else {
            return bqw.c;
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
         cjj $$3 = this.a(cb.get(this.u()), 1);
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
      this.b(ctk.a($$0.f("Color")));
   }

   @Override
   protected avz v() {
      return awa.wv;
   }

   @Override
   protected avz d(brp $$0) {
      return awa.wx;
   }

   @Override
   protected avz o_() {
      return awa.ww;
   }

   @Override
   protected void b(iz $$0, dse $$1) {
      this.a(awa.wz, 0.15F, 1.0F);
   }

   public ctk u() {
      return ctk.a(this.ao.a(bZ) & 15);
   }

   public void b(ctk $$0) {
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

   public static ctk a(azh $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return ctk.p;
      } else if ($$1 < 10) {
         return ctk.h;
      } else if ($$1 < 15) {
         return ctk.i;
      } else if ($$1 < 18) {
         return ctk.m;
      } else {
         return $$0.a(500) == 0 ? ctk.g : ctk.a;
      }
   }

   @Nullable
   public cgd b(arf $$0, bsq $$1) {
      cgd $$2 = btc.aJ.a((dca)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cgd)$$1));
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
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private ctk a(cfh $$0, cfh $$1) {
      ctk $$2 = ((cgd)$$0).u();
      ctk $$3 = ((cgd)$$1).u();
      cqm $$4 = a($$2, $$3);
      return this.dP()
         .r()
         .a(czc.a, $$4, this.dP())
         .map($$1x -> ((cyo)$$1x.b()).a($$4, this.dP().H_()))
         .map(cur::g)
         .filter(ctl.class::isInstance)
         .map(ctl.class::cast)
         .map(ctl::c)
         .orElseGet(() -> this.dP().z.h() ? $$2 : $$3);
   }

   private static cqm a(ctk $$0, ctk $$1) {
      cqm $$2 = new cry(new cpw(null, -1) {
         @Override
         public cur a(cmz $$0, int $$1) {
            return cur.l;
         }

         @Override
         public boolean a(cmz $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cur(ctl.a($$0)));
      $$2.a(1, new cur(ctl.a($$1)));
      return $$2;
   }
}
