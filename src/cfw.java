import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cfw extends cfa implements bub {
   private static final int bY = 40;
   private static final akg<Byte> bZ = akk.a(cfw.class, aki.a);
   private static final Map<ctd, dbs> cb = ac.a(Maps.newEnumMap(ctd.class), $$0 -> {
      $$0.put(ctd.a, dew.bA);
      $$0.put(ctd.b, dew.bB);
      $$0.put(ctd.c, dew.bC);
      $$0.put(ctd.d, dew.bD);
      $$0.put(ctd.e, dew.bE);
      $$0.put(ctd.f, dew.bF);
      $$0.put(ctd.g, dew.bG);
      $$0.put(ctd.h, dew.bH);
      $$0.put(ctd.i, dew.bI);
      $$0.put(ctd.j, dew.bJ);
      $$0.put(ctd.k, dew.bK);
      $$0.put(ctd.l, dew.bL);
      $$0.put(ctd.m, dew.bM);
      $$0.put(ctd.n, dew.bN);
      $$0.put(ctd.o, dew.bO);
      $$0.put(ctd.p, dew.bP);
   });
   private static final Map<ctd, float[]> cc = Maps.newEnumMap(Arrays.stream(ctd.values()).collect(Collectors.toMap($$0 -> (ctd)$$0, cfw::c)));
   private int cd;
   private caa ce;

   private static float[] c(ctd $$0) {
      if ($$0 == ctd.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(ctd $$0) {
      return cc.get($$0);
   }

   public cfw(bsv<? extends cfw> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.ce = new caa(this);
      this.bS.a(0, new cac(this));
      this.bS.a(1, new cbb(this, 1.25));
      this.bS.a(2, new bzu(this, 1.0));
      this.bS.a(3, new cbq(this, 1.1, $$0 -> $$0.a(awu.ac), false));
      this.bS.a(4, new cah(this, 1.1));
      this.bS.a(5, this.ce);
      this.bS.a(6, new cbv(this, 1.0));
      this.bS.a(7, new caq(this, cms.class, 6.0F));
      this.bS.a(8, new cbd(this));
   }

   @Override
   public boolean o(cuk $$0) {
      return $$0.a(awu.ac);
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

   public static bur.a s() {
      return btm.A().a(bus.q, 8.0).a(bus.r, 0.23F);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
   }

   @Override
   public ala<eqi> T() {
      if (this.y()) {
         return this.ak().k();
      } else {
         return switch (this.u()) {
            case a -> epz.am;
            case b -> epz.an;
            case c -> epz.ao;
            case d -> epz.ap;
            case e -> epz.aq;
            case f -> epz.ar;
            case g -> epz.as;
            case h -> epz.at;
            case i -> epz.au;
            case j -> epz.av;
            case k -> epz.aw;
            case l -> epz.ax;
            case m -> epz.ay;
            case n -> epz.az;
            case o -> epz.aA;
            case p -> epz.aB;
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
         return (float) (Math.PI / 5) + 0.21991149F * ayu.a($$1 * 28.7F);
      } else {
         return this.cd > 0 ? (float) (Math.PI / 5) : this.dH() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bqp b(cms $$0, bqo $$1) {
      cuk $$2 = $$0.b($$1);
      if ($$2.a(cun.rV)) {
         if (!this.dP().B && this.a()) {
            this.a(avx.h);
            this.a(dwq.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bqp.a;
         } else {
            return bqp.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(avx $$0) {
      this.dP().a(null, this, avw.wy, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ah.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cjc $$3 = this.a(cb.get(this.u()), 1);
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
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Sheared", this.y());
      $$0.a("Color", (byte)this.u().a());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(ctd.a($$0.f("Color")));
   }

   @Override
   protected avv v() {
      return avw.wv;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.wx;
   }

   @Override
   protected avv o_() {
      return avw.ww;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.wz, 0.15F, 1.0F);
   }

   public ctd u() {
      return ctd.a(this.ao.a(bZ) & 15);
   }

   public void b(ctd $$0) {
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

   public static ctd a(azc $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return ctd.p;
      } else if ($$1 < 10) {
         return ctd.h;
      } else if ($$1 < 15) {
         return ctd.i;
      } else if ($$1 < 18) {
         return ctd.m;
      } else {
         return $$0.a(500) == 0 ? ctd.g : ctd.a;
      }
   }

   @Nullable
   public cfw b(arb $$0, bsj $$1) {
      cfw $$2 = bsv.aJ.a((dbt)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cfw)$$1));
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
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private ctd a(cfa $$0, cfa $$1) {
      ctd $$2 = ((cfw)$$0).u();
      ctd $$3 = ((cfw)$$1).u();
      cqf $$4 = a($$2, $$3);
      return this.dP()
         .r()
         .a(cyv.a, $$4, this.dP())
         .map($$1x -> ((cyh)$$1x.b()).a($$4, this.dP().H_()))
         .map(cuk::g)
         .filter(cte.class::isInstance)
         .map(cte.class::cast)
         .map(cte::c)
         .orElseGet(() -> this.dP().z.h() ? $$2 : $$3);
   }

   private static cqf a(ctd $$0, ctd $$1) {
      cqf $$2 = new crr(new cpp(null, -1) {
         @Override
         public cuk a(cms $$0, int $$1) {
            return cuk.l;
         }

         @Override
         public boolean a(cms $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cuk(cte.a($$0)));
      $$2.a(1, new cuk(cte.a($$1)));
      return $$2;
   }
}
