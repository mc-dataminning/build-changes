import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byo extends bxs implements bmw {
   private static final int bT = 40;
   private static final agj<Byte> bU = agm.a(byo.class, agl.a);
   private static final Map<clf, cth> bW = ac.a(Maps.newEnumMap(clf.class), $$0 -> {
      $$0.put(clf.a, cwl.bA);
      $$0.put(clf.b, cwl.bB);
      $$0.put(clf.c, cwl.bC);
      $$0.put(clf.d, cwl.bD);
      $$0.put(clf.e, cwl.bE);
      $$0.put(clf.f, cwl.bF);
      $$0.put(clf.g, cwl.bG);
      $$0.put(clf.h, cwl.bH);
      $$0.put(clf.i, cwl.bI);
      $$0.put(clf.j, cwl.bJ);
      $$0.put(clf.k, cwl.bK);
      $$0.put(clf.l, cwl.bL);
      $$0.put(clf.m, cwl.bM);
      $$0.put(clf.n, cwl.bN);
      $$0.put(clf.o, cwl.bO);
      $$0.put(clf.p, cwl.bP);
   });
   private static final Map<clf, float[]> bX = Maps.newEnumMap(Arrays.stream(clf.values()).collect(Collectors.toMap($$0 -> (clf)$$0, byo::c)));
   private int bY;
   private bst bZ;

   private static float[] c(clf $$0) {
      if ($$0 == clf.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(clf $$0) {
      return bX.get($$0);
   }

   public byo(blt<? extends byo> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bZ = new bst(this);
      this.bO.a(0, new bsv(this));
      this.bO.a(1, new btu(this, 1.25));
      this.bO.a(2, new bsn(this, 1.0));
      this.bO.a(3, new buj(this, 1.1, cps.a(cmu.pt), false));
      this.bO.a(4, new bta(this, 1.1));
      this.bO.a(5, this.bZ);
      this.bO.a(6, new buo(this, 1.0));
      this.bO.a(7, new btj(this, cfb.class, 6.0F));
      this.bO.a(8, new btw(this));
   }

   @Override
   protected void Z() {
      this.bY = this.bZ.h();
      super.Z();
   }

   @Override
   public void d_() {
      if (this.dM().B) {
         this.bY = Math.max(0, this.bY - 1);
      }

      super.d_();
   }

   public static bnk.a u() {
      return bmh.C().a(bnl.l, 8.0).a(bnl.m, 0.23F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bU, (byte)0);
   }

   @Override
   public ahd U() {
      if (this.A()) {
         return this.ai().j();
      } else {
         return switch (this.w()) {
            case a -> egn.ac;
            case b -> egn.ad;
            case c -> egn.ae;
            case d -> egn.af;
            case e -> egn.ag;
            case f -> egn.ah;
            case g -> egn.ai;
            case h -> egn.aj;
            case i -> egn.ak;
            case j -> egn.al;
            case k -> egn.am;
            case l -> egn.an;
            case m -> egn.ao;
            case n -> egn.ap;
            case o -> egn.aq;
            case p -> egn.ar;
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
         return (float) (Math.PI / 5) + 0.21991149F * aui.a($$1 * 28.7F);
      } else {
         return this.bY > 0 ? (float) (Math.PI / 5) : this.dE() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bjv b(cfb $$0, bju $$1) {
      cmr $$2 = $$0.b($$1);
      if ($$2.a(cmu.rS)) {
         if (!this.dM().B && this.a()) {
            this.a(arn.h);
            this.a(dnk.M, $$0);
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            return bjv.a;
         } else {
            return bjv.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(arn $$0) {
      this.dM().a(null, this, arm.vE, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ag.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cbo $$3 = this.a(bW.get(this.w()), 1);
         if ($$3 != null) {
            $$3.g($$3.dp().b((double)((this.ag.i() - this.ag.i()) * 0.1F), (double)(this.ag.i() * 0.05F), (double)((this.ag.i() - this.ag.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bx() && !this.A() && !this.o_();
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("Sheared", this.A());
      $$0.a("Color", (byte)this.w().a());
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(clf.a($$0.f("Color")));
   }

   @Override
   protected arl y() {
      return arm.vB;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.vD;
   }

   @Override
   protected arl n_() {
      return arm.vC;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.vF, 0.15F, 1.0F);
   }

   public clf w() {
      return clf.a(this.an.b(bU) & 15);
   }

   public void b(clf $$0) {
      byte $$1 = this.an.b(bU);
      this.an.b(bU, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean A() {
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

   public static clf a(aup $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return clf.p;
      } else if ($$1 < 10) {
         return clf.h;
      } else if ($$1 < 15) {
         return clf.i;
      } else if ($$1 < 18) {
         return clf.m;
      } else {
         return $$0.a(500) == 0 ? clf.g : clf.a;
      }
   }

   @Nullable
   public byo b(amz $$0, blk $$1) {
      byo $$2 = blt.aG.a((cti)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (byo)$$1));
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
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      this.b(a($$0.F_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private clf a(bxs $$0, bxs $$1) {
      clf $$2 = ((byo)$$0).w();
      clf $$3 = ((byo)$$1).w();
      cik $$4 = a($$2, $$3);
      return this.dM()
         .r()
         .a(cqa.a, $$4, this.dM())
         .map($$1x -> ((cpm)$$1x.b()).a($$4, this.dM().I_()))
         .map(cmr::d)
         .filter(clg.class::isInstance)
         .map(clg.class::cast)
         .map(clg::d)
         .orElseGet(() -> this.dM().z.h() ? $$2 : $$3);
   }

   private static cik a(clf $$0, clf $$1) {
      cik $$2 = new cju(new chu(null, -1) {
         @Override
         public cmr a(cfb $$0, int $$1) {
            return cmr.f;
         }

         @Override
         public boolean a(cfb $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cmr(clg.a($$0)));
      $$2.a(1, new cmr(clg.a($$1)));
      return $$2;
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return 0.95F * $$1.b;
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
