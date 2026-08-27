import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bve extends bui implements bjo {
   private static final int bT = 40;
   private static final adx<Byte> bU = aea.a(bve.class, adz.a);
   private static final Map<chk, cpj> bW = ac.a(Maps.newEnumMap(chk.class), $$0 -> {
      $$0.put(chk.a, csl.bA);
      $$0.put(chk.b, csl.bB);
      $$0.put(chk.c, csl.bC);
      $$0.put(chk.d, csl.bD);
      $$0.put(chk.e, csl.bE);
      $$0.put(chk.f, csl.bF);
      $$0.put(chk.g, csl.bG);
      $$0.put(chk.h, csl.bH);
      $$0.put(chk.i, csl.bI);
      $$0.put(chk.j, csl.bJ);
      $$0.put(chk.k, csl.bK);
      $$0.put(chk.l, csl.bL);
      $$0.put(chk.m, csl.bM);
      $$0.put(chk.n, csl.bN);
      $$0.put(chk.o, csl.bO);
      $$0.put(chk.p, csl.bP);
   });
   private static final Map<chk, float[]> bX = Maps.newEnumMap(Arrays.stream(chk.values()).collect(Collectors.toMap($$0 -> (chk)$$0, bve::c)));
   private int bY;
   private bpk bZ;

   private static float[] c(chk $$0) {
      if ($$0 == chk.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(chk $$0) {
      return bX.get($$0);
   }

   public bve(bik<? extends bve> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bZ = new bpk(this);
      this.bO.a(0, new bpm(this));
      this.bO.a(1, new bql(this, 1.25));
      this.bO.a(2, new bpe(this, 1.0));
      this.bO.a(3, new bra(this, 1.1, clw.a(ciz.oI), false));
      this.bO.a(4, new bpr(this, 1.1));
      this.bO.a(5, this.bZ);
      this.bO.a(6, new brf(this, 1.0));
      this.bO.a(7, new bqa(this, cbl.class, 6.0F));
      this.bO.a(8, new bqn(this));
   }

   @Override
   protected void V() {
      this.bY = this.bZ.h();
      super.V();
   }

   @Override
   public void b_() {
      if (this.dK().B) {
         this.bY = Math.max(0, this.bY - 1);
      }

      super.b_();
   }

   public static bkc.a p() {
      return biy.x().a(bkd.a, 8.0).a(bkd.d, 0.23F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, (byte)0);
   }

   @Override
   public aep P() {
      if (this.t()) {
         return this.ag().j();
      } else {
         return switch (this.q()) {
            case a -> ecd.S;
            case b -> ecd.T;
            case c -> ecd.U;
            case d -> ecd.V;
            case e -> ecd.W;
            case f -> ecd.X;
            case g -> ecd.Y;
            case h -> ecd.Z;
            case i -> ecd.aa;
            case j -> ecd.ab;
            case k -> ecd.ac;
            case l -> ecd.ad;
            case m -> ecd.ae;
            case n -> ecd.af;
            case o -> ecd.ag;
            case p -> ecd.ah;
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
         return (float) (Math.PI / 5) + 0.21991149F * aro.a($$1 * 28.7F);
      } else {
         return this.bY > 0 ? (float) (Math.PI / 5) : this.dC() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      if ($$2.a(ciz.rg)) {
         if (!this.dK().B && this.a()) {
            this.a(aov.h);
            this.a(dji.M, $$0);
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            return bgo.a;
         } else {
            return bgo.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aov $$0) {
      this.dK().a(null, this, aou.uO, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ag.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         bye $$3 = this.a(bW.get(this.q()), 1);
         if ($$3 != null) {
            $$3.f($$3.dn().b((double)((this.ag.i() - this.ag.i()) * 0.1F), (double)(this.ag.i() * 0.05F), (double)((this.ag.i() - this.ag.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bv() && !this.t() && !this.i_();
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("Sheared", this.t());
      $$0.a("Color", (byte)this.q().a());
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(chk.a($$0.f("Color")));
   }

   @Override
   protected aot r() {
      return aou.uL;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.uN;
   }

   @Override
   protected aot h_() {
      return aou.uM;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.uP, 0.15F, 1.0F);
   }

   public chk q() {
      return chk.a(this.an.b(bU) & 15);
   }

   public void b(chk $$0) {
      byte $$1 = this.an.b(bU);
      this.an.b(bU, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean t() {
      return (this.an.b(bU) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.an.b(bU);
      if ($$0) {
         this.an.b(bU, (byte)($$1 | 16));
      } else {
         this.an.b(bU, (byte)($$1 & -17));
      }
   }

   public static chk a(art $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return chk.p;
      } else if ($$1 < 10) {
         return chk.h;
      } else if ($$1 < 15) {
         return chk.i;
      } else if ($$1 < 18) {
         return chk.m;
      } else {
         return $$0.a(500) == 0 ? chk.g : chk.a;
      }
   }

   @Nullable
   public bve b(aki $$0, bib $$1) {
      bve $$2 = bik.aF.a((cpk)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (bve)$$1));
      }

      return $$2;
   }

   @Override
   public void K() {
      super.K();
      this.w(false);
      if (this.i_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      this.b(a($$0.y_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private chk a(bui $$0, bui $$1) {
      chk $$2 = ((bve)$$0).q();
      chk $$3 = ((bve)$$1).q();
      ceq $$4 = a($$2, $$3);
      return this.dK()
         .q()
         .a(cmc.a, $$4, this.dK())
         .map($$1x -> $$1x.a($$4, this.dK().B_()))
         .map(ciw::d)
         .filter(chl.class::isInstance)
         .map(chl.class::cast)
         .map(chl::d)
         .orElseGet(() -> this.dK().z.h() ? $$2 : $$3);
   }

   private static ceq a(chk $$0, chk $$1) {
      ceq $$2 = new cfz(new cec(null, -1) {
         @Override
         public ciw a(cbl $$0, int $$1) {
            return ciw.b;
         }

         @Override
         public boolean a(cbl $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new ciw(chl.a($$0)));
      $$2.a(1, new ciw(chl.a($$1)));
      return $$2;
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return 0.95F * $$1.b;
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
