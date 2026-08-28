import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cga extends cfe implements buf {
   private static final int bY = 40;
   private static final akj<Byte> bZ = akn.a(cga.class, akl.a);
   private static final Map<cth, dbw> cb = ac.a(Maps.newEnumMap(cth.class), $$0 -> {
      $$0.put(cth.a, dfa.bA);
      $$0.put(cth.b, dfa.bB);
      $$0.put(cth.c, dfa.bC);
      $$0.put(cth.d, dfa.bD);
      $$0.put(cth.e, dfa.bE);
      $$0.put(cth.f, dfa.bF);
      $$0.put(cth.g, dfa.bG);
      $$0.put(cth.h, dfa.bH);
      $$0.put(cth.i, dfa.bI);
      $$0.put(cth.j, dfa.bJ);
      $$0.put(cth.k, dfa.bK);
      $$0.put(cth.l, dfa.bL);
      $$0.put(cth.m, dfa.bM);
      $$0.put(cth.n, dfa.bN);
      $$0.put(cth.o, dfa.bO);
      $$0.put(cth.p, dfa.bP);
   });
   private static final Map<cth, float[]> cc = Maps.newEnumMap(Arrays.stream(cth.values()).collect(Collectors.toMap($$0 -> (cth)$$0, cga::c)));
   private int cd;
   private cae ce;

   private static float[] c(cth $$0) {
      if ($$0 == cth.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(cth $$0) {
      return cc.get($$0);
   }

   public cga(bsz<? extends cga> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.ce = new cae(this);
      this.bS.a(0, new cag(this));
      this.bS.a(1, new cbf(this, 1.25));
      this.bS.a(2, new bzy(this, 1.0));
      this.bS.a(3, new cbu(this, 1.1, $$0 -> $$0.a(awx.ac), false));
      this.bS.a(4, new cal(this, 1.1));
      this.bS.a(5, this.ce);
      this.bS.a(6, new cbz(this, 1.0));
      this.bS.a(7, new cau(this, cmw.class, 6.0F));
      this.bS.a(8, new cbh(this));
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awx.ac);
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

   public static buv.a s() {
      return btq.A().a(buw.q, 8.0).a(buw.r, 0.23F);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
   }

   @Override
   public ald<eqm> T() {
      if (this.y()) {
         return this.ak().k();
      } else {
         return switch (this.u()) {
            case a -> eqd.am;
            case b -> eqd.an;
            case c -> eqd.ao;
            case d -> eqd.ap;
            case e -> eqd.aq;
            case f -> eqd.ar;
            case g -> eqd.as;
            case h -> eqd.at;
            case i -> eqd.au;
            case j -> eqd.av;
            case k -> eqd.aw;
            case l -> eqd.ax;
            case m -> eqd.ay;
            case n -> eqd.az;
            case o -> eqd.aA;
            case p -> eqd.aB;
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
         return (float) (Math.PI / 5) + 0.21991149F * ayy.a($$1 * 28.7F);
      } else {
         return this.cd > 0 ? (float) (Math.PI / 5) : this.dH() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bqt b(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(cur.rV)) {
         if (!this.dP().B && this.a()) {
            this.a(awa.h);
            this.a(dwu.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bqt.a;
         } else {
            return bqt.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(awa $$0) {
      this.dP().a(null, this, avz.wy, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ah.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cjg $$3 = this.a(cb.get(this.u()), 1);
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
      this.b(cth.a($$0.f("Color")));
   }

   @Override
   protected avy v() {
      return avz.wv;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.wx;
   }

   @Override
   protected avy o_() {
      return avz.ww;
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
      this.a(avz.wz, 0.15F, 1.0F);
   }

   public cth u() {
      return cth.a(this.ao.a(bZ) & 15);
   }

   public void b(cth $$0) {
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

   public static cth a(azg $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cth.p;
      } else if ($$1 < 10) {
         return cth.h;
      } else if ($$1 < 15) {
         return cth.i;
      } else if ($$1 < 18) {
         return cth.m;
      } else {
         return $$0.a(500) == 0 ? cth.g : cth.a;
      }
   }

   @Nullable
   public cga b(are $$0, bsn $$1) {
      cga $$2 = bsz.aJ.a((dbx)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cga)$$1));
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
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cth a(cfe $$0, cfe $$1) {
      cth $$2 = ((cga)$$0).u();
      cth $$3 = ((cga)$$1).u();
      cqj $$4 = a($$2, $$3);
      return this.dP()
         .r()
         .a(cyz.a, $$4, this.dP())
         .map($$1x -> ((cyl)$$1x.b()).a($$4, this.dP().H_()))
         .map(cuo::g)
         .filter(cti.class::isInstance)
         .map(cti.class::cast)
         .map(cti::c)
         .orElseGet(() -> this.dP().z.h() ? $$2 : $$3);
   }

   private static cqj a(cth $$0, cth $$1) {
      cqj $$2 = new crv(new cpt(null, -1) {
         @Override
         public cuo a(cmw $$0, int $$1) {
            return cuo.l;
         }

         @Override
         public boolean a(cmw $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cuo(cti.a($$0)));
      $$2.a(1, new cuo(cti.a($$1)));
      return $$2;
   }
}
