import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxn extends bwr implements blx {
   private static final int bT = 40;
   private static final afo<Byte> bU = afr.a(bxn.class, afq.a);
   private static final Map<cjx, crz> bW = ac.a(Maps.newEnumMap(cjx.class), $$0 -> {
      $$0.put(cjx.a, cvc.bA);
      $$0.put(cjx.b, cvc.bB);
      $$0.put(cjx.c, cvc.bC);
      $$0.put(cjx.d, cvc.bD);
      $$0.put(cjx.e, cvc.bE);
      $$0.put(cjx.f, cvc.bF);
      $$0.put(cjx.g, cvc.bG);
      $$0.put(cjx.h, cvc.bH);
      $$0.put(cjx.i, cvc.bI);
      $$0.put(cjx.j, cvc.bJ);
      $$0.put(cjx.k, cvc.bK);
      $$0.put(cjx.l, cvc.bL);
      $$0.put(cjx.m, cvc.bM);
      $$0.put(cjx.n, cvc.bN);
      $$0.put(cjx.o, cvc.bO);
      $$0.put(cjx.p, cvc.bP);
   });
   private static final Map<cjx, float[]> bX = Maps.newEnumMap(Arrays.stream(cjx.values()).collect(Collectors.toMap($$0 -> (cjx)$$0, bxn::c)));
   private int bY;
   private brt bZ;

   private static float[] c(cjx $$0) {
      if ($$0 == cjx.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(cjx $$0) {
      return bX.get($$0);
   }

   public bxn(bku<? extends bxn> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bZ = new brt(this);
      this.bO.a(0, new brv(this));
      this.bO.a(1, new bsu(this, 1.25));
      this.bO.a(2, new brn(this, 1.0));
      this.bO.a(3, new btj(this, 1.1, cok.a(clm.pt), false));
      this.bO.a(4, new bsa(this, 1.1));
      this.bO.a(5, this.bZ);
      this.bO.a(6, new bto(this, 1.0));
      this.bO.a(7, new bsj(this, cdu.class, 6.0F));
      this.bO.a(8, new bsw(this));
   }

   @Override
   protected void Z() {
      this.bY = this.bZ.h();
      super.Z();
   }

   @Override
   public void c_() {
      if (this.dN().B) {
         this.bY = Math.max(0, this.bY - 1);
      }

      super.c_();
   }

   public static bml.a u() {
      return bli.C().a(bmm.l, 8.0).a(bmm.m, 0.23F);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bU, (byte)0);
   }

   @Override
   public agi U() {
      if (this.A()) {
         return this.ai().j();
      } else {
         return switch (this.w()) {
            case a -> eev.S;
            case b -> eev.T;
            case c -> eev.U;
            case d -> eev.V;
            case e -> eev.W;
            case f -> eev.X;
            case g -> eev.Y;
            case h -> eev.Z;
            case i -> eev.aa;
            case j -> eev.ab;
            case k -> eev.ac;
            case l -> eev.ad;
            case m -> eev.ae;
            case n -> eev.af;
            case o -> eev.ag;
            case p -> eev.ah;
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
         return (float) (Math.PI / 5) + 0.21991149F * atm.a($$1 * 28.7F);
      } else {
         return this.bY > 0 ? (float) (Math.PI / 5) : this.dF() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bix b(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      if ($$2.a(clm.rS)) {
         if (!this.dN().B && this.a()) {
            this.a(aqs.h);
            this.a(dls.M, $$0);
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            return bix.a;
         } else {
            return bix.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aqs $$0) {
      this.dN().a(null, this, aqr.vj, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ag.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         can $$3 = this.a(bW.get(this.w()), 1);
         if ($$3 != null) {
            $$3.g($$3.dq().b((double)((this.ag.i() - this.ag.i()) * 0.1F), (double)(this.ag.i() * 0.05F), (double)((this.ag.i() - this.ag.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bx() && !this.A() && !this.n_();
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Sheared", this.A());
      $$0.a("Color", (byte)this.w().a());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(cjx.a($$0.f("Color")));
   }

   @Override
   protected aqq y() {
      return aqr.vg;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.vi;
   }

   @Override
   protected aqq m_() {
      return aqr.vh;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.vk, 0.15F, 1.0F);
   }

   public cjx w() {
      return cjx.a(this.an.b(bU) & 15);
   }

   public void b(cjx $$0) {
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

   public static cjx a(ats $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cjx.p;
      } else if ($$1 < 10) {
         return cjx.h;
      } else if ($$1 < 15) {
         return cjx.i;
      } else if ($$1 < 18) {
         return cjx.m;
      } else {
         return $$0.a(500) == 0 ? cjx.g : cjx.a;
      }
   }

   @Nullable
   public bxn b(ame $$0, bkl $$1) {
      bxn $$2 = bku.aF.a((csa)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (bxn)$$1));
      }

      return $$2;
   }

   @Override
   public void P() {
      super.P();
      this.w(false);
      if (this.n_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private cjx a(bwr $$0, bwr $$1) {
      cjx $$2 = ((bxn)$$0).w();
      cjx $$3 = ((bxn)$$1).w();
      chc $$4 = a($$2, $$3);
      return this.dN()
         .q()
         .a(cot.a, $$4, this.dN())
         .map($$1x -> ((cod)$$1x.b()).a($$4, this.dN().H_()))
         .map(clj::d)
         .filter(cjy.class::isInstance)
         .map(cjy.class::cast)
         .map(cjy::d)
         .orElseGet(() -> this.dN().z.h() ? $$2 : $$3);
   }

   private static chc a(cjx $$0, cjx $$1) {
      chc $$2 = new cim(new cgm(null, -1) {
         @Override
         public clj a(cdu $$0, int $$1) {
            return clj.b;
         }

         @Override
         public boolean a(cdu $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new clj(cjy.a($$0)));
      $$2.a(1, new clj(cjy.a($$1)));
      return $$2;
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return 0.95F * $$1.b;
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
