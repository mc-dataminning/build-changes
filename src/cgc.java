import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cgc extends cfg implements buh {
   private static final int bY = 40;
   private static final akk<Byte> bZ = ako.a(cgc.class, akm.a);
   private static final Map<ctj, dby> cb = ac.a(Maps.newEnumMap(ctj.class), $$0 -> {
      $$0.put(ctj.a, dfc.bA);
      $$0.put(ctj.b, dfc.bB);
      $$0.put(ctj.c, dfc.bC);
      $$0.put(ctj.d, dfc.bD);
      $$0.put(ctj.e, dfc.bE);
      $$0.put(ctj.f, dfc.bF);
      $$0.put(ctj.g, dfc.bG);
      $$0.put(ctj.h, dfc.bH);
      $$0.put(ctj.i, dfc.bI);
      $$0.put(ctj.j, dfc.bJ);
      $$0.put(ctj.k, dfc.bK);
      $$0.put(ctj.l, dfc.bL);
      $$0.put(ctj.m, dfc.bM);
      $$0.put(ctj.n, dfc.bN);
      $$0.put(ctj.o, dfc.bO);
      $$0.put(ctj.p, dfc.bP);
   });
   private static final Map<ctj, float[]> cc = Maps.newEnumMap(Arrays.stream(ctj.values()).collect(Collectors.toMap($$0 -> (ctj)$$0, cgc::c)));
   private int cd;
   private cag ce;

   private static float[] c(ctj $$0) {
      if ($$0 == ctj.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(ctj $$0) {
      return cc.get($$0);
   }

   public cgc(btb<? extends cgc> $$0, dbz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.ce = new cag(this);
      this.bS.a(0, new cai(this));
      this.bS.a(1, new cbh(this, 1.25));
      this.bS.a(2, new caa(this, 1.0));
      this.bS.a(3, new cbw(this, 1.1, $$0 -> $$0.a(awy.ac), false));
      this.bS.a(4, new can(this, 1.1));
      this.bS.a(5, this.ce);
      this.bS.a(6, new ccb(this, 1.0));
      this.bS.a(7, new caw(this, cmy.class, 6.0F));
      this.bS.a(8, new cbj(this));
   }

   @Override
   public boolean o(cuq $$0) {
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

   public static bux.a s() {
      return bts.A().a(buy.q, 8.0).a(buy.r, 0.23F);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
   }

   @Override
   public ale<eqo> T() {
      if (this.y()) {
         return this.ak().k();
      } else {
         return switch (this.u()) {
            case a -> eqf.am;
            case b -> eqf.an;
            case c -> eqf.ao;
            case d -> eqf.ap;
            case e -> eqf.aq;
            case f -> eqf.ar;
            case g -> eqf.as;
            case h -> eqf.at;
            case i -> eqf.au;
            case j -> eqf.av;
            case k -> eqf.aw;
            case l -> eqf.ax;
            case m -> eqf.ay;
            case n -> eqf.az;
            case o -> eqf.aA;
            case p -> eqf.aB;
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
   public bqv b(cmy $$0, bqu $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.a(cut.rV)) {
         if (!this.dP().B && this.a()) {
            this.a(awb.h);
            this.a(dww.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bqv.a;
         } else {
            return bqv.c;
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
         cji $$3 = this.a(cb.get(this.u()), 1);
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
      this.b(ctj.a($$0.f("Color")));
   }

   @Override
   protected avz v() {
      return awa.wv;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.wx;
   }

   @Override
   protected avz o_() {
      return awa.ww;
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
      this.a(awa.wz, 0.15F, 1.0F);
   }

   public ctj u() {
      return ctj.a(this.ao.a(bZ) & 15);
   }

   public void b(ctj $$0) {
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

   public static ctj a(azh $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return ctj.p;
      } else if ($$1 < 10) {
         return ctj.h;
      } else if ($$1 < 15) {
         return ctj.i;
      } else if ($$1 < 18) {
         return ctj.m;
      } else {
         return $$0.a(500) == 0 ? ctj.g : ctj.a;
      }
   }

   @Nullable
   public cgc b(arf $$0, bsp $$1) {
      cgc $$2 = btb.aJ.a((dbz)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cgc)$$1));
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
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private ctj a(cfg $$0, cfg $$1) {
      ctj $$2 = ((cgc)$$0).u();
      ctj $$3 = ((cgc)$$1).u();
      cql $$4 = a($$2, $$3);
      return this.dP()
         .r()
         .a(czb.a, $$4, this.dP())
         .map($$1x -> ((cyn)$$1x.b()).a($$4, this.dP().H_()))
         .map(cuq::g)
         .filter(ctk.class::isInstance)
         .map(ctk.class::cast)
         .map(ctk::c)
         .orElseGet(() -> this.dP().z.h() ? $$2 : $$3);
   }

   private static cql a(ctj $$0, ctj $$1) {
      cql $$2 = new crx(new cpv(null, -1) {
         @Override
         public cuq a(cmy $$0, int $$1) {
            return cuq.l;
         }

         @Override
         public boolean a(cmy $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cuq(ctk.a($$0)));
      $$2.a(1, new cuq(ctk.a($$1)));
      return $$2;
   }
}
