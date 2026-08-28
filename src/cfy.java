import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cfy extends cfc implements bud {
   private static final int ca = 40;
   private static final ajv<Byte> cb = ajz.a(cfy.class, ajx.a);
   private static final Map<ctg, dct> cc = ad.a(Maps.newEnumMap(ctg.class), $$0 -> {
      $$0.put(ctg.a, dfy.bA);
      $$0.put(ctg.b, dfy.bB);
      $$0.put(ctg.c, dfy.bC);
      $$0.put(ctg.d, dfy.bD);
      $$0.put(ctg.e, dfy.bE);
      $$0.put(ctg.f, dfy.bF);
      $$0.put(ctg.g, dfy.bG);
      $$0.put(ctg.h, dfy.bH);
      $$0.put(ctg.i, dfy.bI);
      $$0.put(ctg.j, dfy.bJ);
      $$0.put(ctg.k, dfy.bK);
      $$0.put(ctg.l, dfy.bL);
      $$0.put(ctg.m, dfy.bM);
      $$0.put(ctg.n, dfy.bN);
      $$0.put(ctg.o, dfy.bO);
      $$0.put(ctg.p, dfy.bP);
   });
   private static final Map<ctg, Integer> ce = Maps.newEnumMap(Arrays.stream(ctg.values()).collect(Collectors.toMap($$0 -> (ctg)$$0, cfy::c)));
   private int cf;
   private cac cg;

   private static int c(ctg $$0) {
      if ($$0 == ctg.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return axx.b.a(255, ayn.d((float)axx.b.b($$1) * 0.75F), ayn.d((float)axx.b.c($$1) * 0.75F), ayn.d((float)axx.b.d($$1) * 0.75F));
      }
   }

   public static int a(ctg $$0) {
      return ce.get($$0);
   }

   public cfy(bsw<? extends cfy> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.cg = new cac(this);
      this.bU.a(0, new cae(this));
      this.bU.a(1, new cbd(this, 1.25));
      this.bU.a(2, new bzw(this, 1.0));
      this.bU.a(3, new cbs(this, 1.1, $$0 -> $$0.a(awm.ac), false));
      this.bU.a(4, new caj(this, 1.1));
      this.bU.a(5, this.cg);
      this.bU.a(6, new cbx(this, 1.0));
      this.bU.a(7, new cas(this, cmv.class, 6.0F));
      this.bU.a(8, new cbf(this));
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.ac);
   }

   @Override
   protected void Z() {
      this.cf = this.cg.h();
      super.Z();
   }

   @Override
   public void m_() {
      if (this.dQ().B) {
         this.cf = Math.max(0, this.cf - 1);
      }

      super.m_();
   }

   public static but.a s() {
      return btn.A().a(buu.s, 8.0).a(buu.v, 0.23F);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(cb, (byte)0);
   }

   @Override
   public akp<erq> T() {
      if (this.x()) {
         return this.am().k();
      } else {
         return switch (this.t()) {
            case a -> erh.am;
            case b -> erh.an;
            case c -> erh.ao;
            case d -> erh.ap;
            case e -> erh.aq;
            case f -> erh.ar;
            case g -> erh.as;
            case h -> erh.at;
            case i -> erh.au;
            case j -> erh.av;
            case k -> erh.aw;
            case l -> erh.ax;
            case m -> erh.ay;
            case n -> erh.az;
            case o -> erh.aA;
            case p -> erh.aB;
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
         return (float) (Math.PI / 5) + 0.21991149F * ayn.a($$1 * 28.7F);
      } else {
         return this.cf > 0 ? (float) (Math.PI / 5) : this.dI() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(cur.rV)) {
         if (!this.dQ().B && this.a()) {
            this.a(avp.h);
            this.a(dxw.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bqq.a;
         } else {
            return bqq.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(avp $$0) {
      this.dQ().a(null, this, avo.wB, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ah.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cjf $$3 = this.a(cc.get(this.t()), 1);
         if ($$3 != null) {
            $$3.i($$3.dt().b((double)((this.ah.i() - this.ah.i()) * 0.1F), (double)(this.ah.i() * 0.05F), (double)((this.ah.i() - this.ah.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bE() && !this.x() && !this.o_();
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Sheared", this.x());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(ctg.a($$0.f("Color")));
   }

   @Override
   protected avn v() {
      return avo.wy;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.wA;
   }

   @Override
   protected avn n_() {
      return avo.wz;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.wC, 0.15F, 1.0F);
   }

   public ctg t() {
      return ctg.a(this.ao.a(cb) & 15);
   }

   public void b(ctg $$0) {
      byte $$1 = this.ao.a(cb);
      this.ao.a(cb, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean x() {
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

   public static ctg a(ayv $$0) {
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
   public cfy b(aqt $$0, bsk $$1) {
      cfy $$2 = bsw.aJ.a((dcu)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cfy)$$1));
      }

      return $$2;
   }

   @Override
   public void O() {
      super.O();
      this.w(false);
      if (this.o_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private ctg a(cfc $$0, cfc $$1) {
      ctg $$2 = ((cfy)$$0).t();
      ctg $$3 = ((cfy)$$1).t();
      cyn $$4 = a($$2, $$3);
      return this.dQ()
         .r()
         .a(czd.a, $$4, this.dQ())
         .map($$1x -> ((cyo)$$1x.b()).a($$4, this.dQ().H_()))
         .map(cuo::g)
         .filter(cth.class::isInstance)
         .map(cth.class::cast)
         .map(cth::c)
         .orElseGet(() -> this.dQ().z.h() ? $$2 : $$3);
   }

   private static cyn a(ctg $$0, ctg $$1) {
      return cyn.a(2, 1, List.of(new cuo(cth.a($$0)), new cuo(cth.a($$1))));
   }
}
