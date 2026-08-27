import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cap extends bzt implements bow {
   private static final int bT = 40;
   private static final aie<Byte> bU = aih.a(cap.class, aig.a);
   private static final Map<cnn, cvm> bW = ac.a(Maps.newEnumMap(cnn.class), $$0 -> {
      $$0.put(cnn.a, cyq.bA);
      $$0.put(cnn.b, cyq.bB);
      $$0.put(cnn.c, cyq.bC);
      $$0.put(cnn.d, cyq.bD);
      $$0.put(cnn.e, cyq.bE);
      $$0.put(cnn.f, cyq.bF);
      $$0.put(cnn.g, cyq.bG);
      $$0.put(cnn.h, cyq.bH);
      $$0.put(cnn.i, cyq.bI);
      $$0.put(cnn.j, cyq.bJ);
      $$0.put(cnn.k, cyq.bK);
      $$0.put(cnn.l, cyq.bL);
      $$0.put(cnn.m, cyq.bM);
      $$0.put(cnn.n, cyq.bN);
      $$0.put(cnn.o, cyq.bO);
      $$0.put(cnn.p, cyq.bP);
   });
   private static final Map<cnn, float[]> bX = Maps.newEnumMap(Arrays.stream(cnn.values()).collect(Collectors.toMap($$0 -> (cnn)$$0, cap::c)));
   private int bY;
   private but bZ;

   private static float[] c(cnn $$0) {
      if ($$0 == cnn.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(cnn $$0) {
      return bX.get($$0);
   }

   public cap(bnu<? extends cap> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bZ = new but(this);
      this.bO.a(0, new buv(this));
      this.bO.a(1, new bvu(this, 1.25));
      this.bO.a(2, new bun(this, 1.0));
      this.bO.a(3, new bwj(this, 1.1, cry.a(cpc.pv), false));
      this.bO.a(4, new bva(this, 1.1));
      this.bO.a(5, this.bZ);
      this.bO.a(6, new bwo(this, 1.0));
      this.bO.a(7, new bvj(this, chh.class, 6.0F));
      this.bO.a(8, new bvw(this));
   }

   @Override
   protected void aa() {
      this.bY = this.bZ.h();
      super.aa();
   }

   @Override
   public void d_() {
      if (this.dM().B) {
         this.bY = Math.max(0, this.bY - 1);
      }

      super.d_();
   }

   public static bpk.a u() {
      return boi.C().a(bpl.n, 8.0).a(bpl.o, 0.23F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bU, (byte)0);
   }

   @Override
   public aiy U() {
      if (this.A()) {
         return this.ai().j();
      } else {
         return switch (this.w()) {
            case a -> eit.ac;
            case b -> eit.ad;
            case c -> eit.ae;
            case d -> eit.af;
            case e -> eit.ag;
            case f -> eit.ah;
            case g -> eit.ai;
            case h -> eit.aj;
            case i -> eit.ak;
            case j -> eit.al;
            case k -> eit.am;
            case l -> eit.an;
            case m -> eit.ao;
            case n -> eit.ap;
            case o -> eit.aq;
            case p -> eit.ar;
         };
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.bY = 40;
      } else {
         super.b($$0);
      }
   }

   public float E(float $$0) {
      if (this.bY <= 0) {
         return 0.0F;
      } else if (this.bY >= 4 && this.bY <= 36) {
         return 1.0F;
      } else {
         return this.bY < 4 ? ((float)this.bY - $$0) / 4.0F : -((float)(this.bY - 40) - $$0) / 4.0F;
      }
   }

   public float F(float $$0) {
      if (this.bY > 4 && this.bY <= 36) {
         float $$1 = ((float)(this.bY - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * awh.a($$1 * 28.7F);
      } else {
         return this.bY > 0 ? (float) (Math.PI / 5) : this.dE() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      if ($$2.a(cpc.rU)) {
         if (!this.dM().B && this.a()) {
            this.a(atl.h);
            this.a(dpp.M, $$0);
            $$2.a(1, $$0, d($$1));
            return blu.a;
         } else {
            return blu.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(atl $$0) {
      this.dM().a(null, this, atk.vT, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.af.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cds $$3 = this.a(bW.get(this.w()), 1);
         if ($$3 != null) {
            $$3.g($$3.dp().b((double)((this.af.i() - this.af.i()) * 0.1F), (double)(this.af.i() * 0.05F), (double)((this.af.i() - this.af.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bx() && !this.A() && !this.o_();
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Sheared", this.A());
      $$0.a("Color", (byte)this.w().a());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(cnn.a($$0.f("Color")));
   }

   @Override
   protected atj y() {
      return atk.vQ;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.vS;
   }

   @Override
   protected atj n_() {
      return atk.vR;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.vU, 0.15F, 1.0F);
   }

   public cnn w() {
      return cnn.a(this.am.b(bU) & 15);
   }

   public void b(cnn $$0) {
      byte $$1 = this.am.b(bU);
      this.am.b(bU, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean A() {
      return (this.am.b(bU) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.am.b(bU);
      if ($$0) {
         this.am.b(bU, (byte)($$1 | 16));
      } else {
         this.am.b(bU, (byte)($$1 & -17));
      }
   }

   public static cnn a(awo $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cnn.p;
      } else if ($$1 < 10) {
         return cnn.h;
      } else if ($$1 < 15) {
         return cnn.i;
      } else if ($$1 < 18) {
         return cnn.m;
      } else {
         return $$0.a(500) == 0 ? cnn.g : cnn.a;
      }
   }

   @Nullable
   public cap b(aov $$0, bnj $$1) {
      cap $$2 = bnu.aH.a((cvn)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cap)$$1));
      }

      return $$2;
   }

   @Override
   public void P() {
      super.P();
      this.w(false);
      if (this.o_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      this.b(a($$0.F_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private cnn a(bzt $$0, bzt $$1) {
      cnn $$2 = ((cap)$$0).w();
      cnn $$3 = ((cap)$$1).w();
      ckr $$4 = a($$2, $$3);
      return this.dM()
         .r()
         .a(csg.a, $$4, this.dM())
         .map($$1x -> ((crs)$$1x.b()).a($$4, this.dM().I_()))
         .map(coz::d)
         .filter(cno.class::isInstance)
         .map(cno.class::cast)
         .map(cno::d)
         .orElseGet(() -> this.dM().z.h() ? $$2 : $$3);
   }

   private static ckr a(cnn $$0, cnn $$1) {
      ckr $$2 = new cmb(new ckb(null, -1) {
         @Override
         public coz a(chh $$0, int $$1) {
            return coz.h;
         }

         @Override
         public boolean a(chh $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new coz(cno.a($$0)));
      $$2.a(1, new coz(cno.a($$1)));
      return $$2;
   }
}
