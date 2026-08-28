import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cfo extends ces implements btt {
   private static final int ca = 40;
   private static final ajp<Byte> cb = ajt.a(cfo.class, ajr.a);
   private static final Map<csw, dcf> cd = ac.a(Maps.newEnumMap(csw.class), $$0 -> {
      $$0.put(csw.a, dfk.bA);
      $$0.put(csw.b, dfk.bB);
      $$0.put(csw.c, dfk.bC);
      $$0.put(csw.d, dfk.bD);
      $$0.put(csw.e, dfk.bE);
      $$0.put(csw.f, dfk.bF);
      $$0.put(csw.g, dfk.bG);
      $$0.put(csw.h, dfk.bH);
      $$0.put(csw.i, dfk.bI);
      $$0.put(csw.j, dfk.bJ);
      $$0.put(csw.k, dfk.bK);
      $$0.put(csw.l, dfk.bL);
      $$0.put(csw.m, dfk.bM);
      $$0.put(csw.n, dfk.bN);
      $$0.put(csw.o, dfk.bO);
      $$0.put(csw.p, dfk.bP);
   });
   private static final Map<csw, float[]> ce = Maps.newEnumMap(Arrays.stream(csw.values()).collect(Collectors.toMap($$0 -> (csw)$$0, cfo::c)));
   private int cf;
   private bzs cg;

   private static float[] c(csw $$0) {
      if ($$0 == csw.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(csw $$0) {
      return ce.get($$0);
   }

   public cfo(bsn<? extends cfo> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.cg = new bzs(this);
      this.bU.a(0, new bzu(this));
      this.bU.a(1, new cat(this, 1.25));
      this.bU.a(2, new bzm(this, 1.0));
      this.bU.a(3, new cbi(this, 1.1, $$0 -> $$0.a(awf.ac), false));
      this.bU.a(4, new bzz(this, 1.1));
      this.bU.a(5, this.cg);
      this.bU.a(6, new cbn(this, 1.0));
      this.bU.a(7, new cai(this, cml.class, 6.0F));
      this.bU.a(8, new cav(this));
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.ac);
   }

   @Override
   protected void Z() {
      this.cf = this.cg.h();
      super.Z();
   }

   @Override
   public void m_() {
      if (this.dR().B) {
         this.cf = Math.max(0, this.cf - 1);
      }

      super.m_();
   }

   public static buj.a s() {
      return bte.A().a(buk.s, 8.0).a(buk.v, 0.23F);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cb, (byte)0);
   }

   @Override
   public akj<erb> T() {
      if (this.x()) {
         return this.am().k();
      } else {
         return switch (this.t()) {
            case a -> eqs.am;
            case b -> eqs.an;
            case c -> eqs.ao;
            case d -> eqs.ap;
            case e -> eqs.aq;
            case f -> eqs.ar;
            case g -> eqs.as;
            case h -> eqs.at;
            case i -> eqs.au;
            case j -> eqs.av;
            case k -> eqs.aw;
            case l -> eqs.ax;
            case m -> eqs.ay;
            case n -> eqs.az;
            case o -> eqs.aA;
            case p -> eqs.aB;
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
         return this.cf > 0 ? (float) (Math.PI / 5) : this.dJ() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if ($$2.a(cug.rV)) {
         if (!this.dR().B && this.a()) {
            this.a(avi.h);
            this.a(dxh.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bqh.a;
         } else {
            return bqh.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(avi $$0) {
      this.dR().a(null, this, avh.wB, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ah.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         civ $$3 = this.a(cd.get(this.t()), 1);
         if ($$3 != null) {
            $$3.j($$3.du().b((double)((this.ah.i() - this.ah.i()) * 0.1F), (double)(this.ah.i() * 0.05F), (double)((this.ah.i() - this.ah.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bF() && !this.x() && !this.o_();
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Sheared", this.x());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(csw.a($$0.f("Color")));
   }

   @Override
   protected avg v() {
      return avh.wy;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.wA;
   }

   @Override
   protected avg n_() {
      return avh.wz;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.wC, 0.15F, 1.0F);
   }

   public csw t() {
      return csw.a(this.ao.a(cb) & 15);
   }

   public void b(csw $$0) {
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

   public static csw a(ayo $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return csw.p;
      } else if ($$1 < 10) {
         return csw.h;
      } else if ($$1 < 15) {
         return csw.i;
      } else if ($$1 < 18) {
         return csw.m;
      } else {
         return $$0.a(500) == 0 ? csw.g : csw.a;
      }
   }

   @Nullable
   public cfo b(aqm $$0, bsb $$1) {
      cfo $$2 = bsn.aJ.a((dcg)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cfo)$$1));
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
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private csw a(ces $$0, ces $$1) {
      csw $$2 = ((cfo)$$0).t();
      csw $$3 = ((cfo)$$1).t();
      cxz $$4 = a($$2, $$3);
      return this.dR()
         .r()
         .a(cyp.a, $$4, this.dR())
         .map($$1x -> ((cya)$$1x.b()).a($$4, this.dR().H_()))
         .map(cud::g)
         .filter(csx.class::isInstance)
         .map(csx.class::cast)
         .map(csx::c)
         .orElseGet(() -> this.dR().z.h() ? $$2 : $$3);
   }

   private static cxz a(csw $$0, csw $$1) {
      return cxz.a(2, 1, List.of(new cud(csx.a($$0)), new cud(csx.a($$1))));
   }
}
