import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cfz extends cfd implements bue {
   private static final int bY = 40;
   private static final akj<Byte> bZ = akn.a(cfz.class, akl.a);
   private static final Map<ctg, dbv> cb = ac.a(Maps.newEnumMap(ctg.class), $$0 -> {
      $$0.put(ctg.a, dez.bA);
      $$0.put(ctg.b, dez.bB);
      $$0.put(ctg.c, dez.bC);
      $$0.put(ctg.d, dez.bD);
      $$0.put(ctg.e, dez.bE);
      $$0.put(ctg.f, dez.bF);
      $$0.put(ctg.g, dez.bG);
      $$0.put(ctg.h, dez.bH);
      $$0.put(ctg.i, dez.bI);
      $$0.put(ctg.j, dez.bJ);
      $$0.put(ctg.k, dez.bK);
      $$0.put(ctg.l, dez.bL);
      $$0.put(ctg.m, dez.bM);
      $$0.put(ctg.n, dez.bN);
      $$0.put(ctg.o, dez.bO);
      $$0.put(ctg.p, dez.bP);
   });
   private static final Map<ctg, float[]> cc = Maps.newEnumMap(Arrays.stream(ctg.values()).collect(Collectors.toMap($$0 -> (ctg)$$0, cfz::c)));
   private int cd;
   private cad ce;

   private static float[] c(ctg $$0) {
      if ($$0 == ctg.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(ctg $$0) {
      return cc.get($$0);
   }

   public cfz(bsy<? extends cfz> $$0, dbw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.ce = new cad(this);
      this.bS.a(0, new caf(this));
      this.bS.a(1, new cbe(this, 1.25));
      this.bS.a(2, new bzx(this, 1.0));
      this.bS.a(3, new cbt(this, 1.1, $$0 -> $$0.a(awx.ac), false));
      this.bS.a(4, new cak(this, 1.1));
      this.bS.a(5, this.ce);
      this.bS.a(6, new cby(this, 1.0));
      this.bS.a(7, new cat(this, cmv.class, 6.0F));
      this.bS.a(8, new cbg(this));
   }

   @Override
   public boolean o(cun $$0) {
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

   public static buu.a s() {
      return btp.A().a(buv.q, 8.0).a(buv.r, 0.23F);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
   }

   @Override
   public ald<eql> T() {
      if (this.y()) {
         return this.ak().k();
      } else {
         return switch (this.u()) {
            case a -> eqc.am;
            case b -> eqc.an;
            case c -> eqc.ao;
            case d -> eqc.ap;
            case e -> eqc.aq;
            case f -> eqc.ar;
            case g -> eqc.as;
            case h -> eqc.at;
            case i -> eqc.au;
            case j -> eqc.av;
            case k -> eqc.aw;
            case l -> eqc.ax;
            case m -> eqc.ay;
            case n -> eqc.az;
            case o -> eqc.aA;
            case p -> eqc.aB;
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
         return (float) (Math.PI / 5) + 0.21991149F * ayx.a($$1 * 28.7F);
      } else {
         return this.cd > 0 ? (float) (Math.PI / 5) : this.dH() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bqs b(cmv $$0, bqr $$1) {
      cun $$2 = $$0.b($$1);
      if ($$2.a(cuq.rV)) {
         if (!this.dP().B && this.a()) {
            this.a(awa.h);
            this.a(dwt.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bqs.a;
         } else {
            return bqs.c;
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
         cjf $$3 = this.a(cb.get(this.u()), 1);
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
      this.b(ctg.a($$0.f("Color")));
   }

   @Override
   protected avy v() {
      return avz.wv;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.wx;
   }

   @Override
   protected avy o_() {
      return avz.ww;
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      this.a(avz.wz, 0.15F, 1.0F);
   }

   public ctg u() {
      return ctg.a(this.ao.a(bZ) & 15);
   }

   public void b(ctg $$0) {
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

   public static ctg a(azf $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return ctg.p;
      } else if ($$1 < 10) {
         return ctg.h;
      } else if ($$1 < 15) {
         return ctg.i;
      } else if ($$1 < 18) {
         return ctg.m;
      } else {
         return $$0.a(500) == 0 ? ctg.g : ctg.a;
      }
   }

   @Nullable
   public cfz b(are $$0, bsm $$1) {
      cfz $$2 = bsy.aJ.a((dbw)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cfz)$$1));
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
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private ctg a(cfd $$0, cfd $$1) {
      ctg $$2 = ((cfz)$$0).u();
      ctg $$3 = ((cfz)$$1).u();
      cqi $$4 = a($$2, $$3);
      return this.dP()
         .r()
         .a(cyy.a, $$4, this.dP())
         .map($$1x -> ((cyk)$$1x.b()).a($$4, this.dP().H_()))
         .map(cun::g)
         .filter(cth.class::isInstance)
         .map(cth.class::cast)
         .map(cth::c)
         .orElseGet(() -> this.dP().z.h() ? $$2 : $$3);
   }

   private static cqi a(ctg $$0, ctg $$1) {
      cqi $$2 = new cru(new cps(null, -1) {
         @Override
         public cun a(cmv $$0, int $$1) {
            return cun.l;
         }

         @Override
         public boolean a(cmv $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cun(cth.a($$0)));
      $$2.a(1, new cun(cth.a($$1)));
      return $$2;
   }
}
