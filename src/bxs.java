import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxs extends bww implements bmc {
   private static final int bT = 40;
   private static final afs<Byte> bU = afv.a(bxs.class, afu.a);
   private static final Map<ckc, cse> bW = ac.a(Maps.newEnumMap(ckc.class), $$0 -> {
      $$0.put(ckc.a, cvh.bA);
      $$0.put(ckc.b, cvh.bB);
      $$0.put(ckc.c, cvh.bC);
      $$0.put(ckc.d, cvh.bD);
      $$0.put(ckc.e, cvh.bE);
      $$0.put(ckc.f, cvh.bF);
      $$0.put(ckc.g, cvh.bG);
      $$0.put(ckc.h, cvh.bH);
      $$0.put(ckc.i, cvh.bI);
      $$0.put(ckc.j, cvh.bJ);
      $$0.put(ckc.k, cvh.bK);
      $$0.put(ckc.l, cvh.bL);
      $$0.put(ckc.m, cvh.bM);
      $$0.put(ckc.n, cvh.bN);
      $$0.put(ckc.o, cvh.bO);
      $$0.put(ckc.p, cvh.bP);
   });
   private static final Map<ckc, float[]> bX = Maps.newEnumMap(Arrays.stream(ckc.values()).collect(Collectors.toMap($$0 -> (ckc)$$0, bxs::c)));
   private int bY;
   private bry bZ;

   private static float[] c(ckc $$0) {
      if ($$0 == ckc.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(ckc $$0) {
      return bX.get($$0);
   }

   public bxs(bkz<? extends bxs> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bZ = new bry(this);
      this.bO.a(0, new bsa(this));
      this.bO.a(1, new bsz(this, 1.25));
      this.bO.a(2, new brs(this, 1.0));
      this.bO.a(3, new bto(this, 1.1, coq.a(clr.pt), false));
      this.bO.a(4, new bsf(this, 1.1));
      this.bO.a(5, this.bZ);
      this.bO.a(6, new btt(this, 1.0));
      this.bO.a(7, new bso(this, cdz.class, 6.0F));
      this.bO.a(8, new btb(this));
   }

   @Override
   protected void Z() {
      this.bY = this.bZ.h();
      super.Z();
   }

   @Override
   public void d_() {
      if (this.dN().B) {
         this.bY = Math.max(0, this.bY - 1);
      }

      super.d_();
   }

   public static bmq.a u() {
      return bln.C().a(bmr.l, 8.0).a(bmr.m, 0.23F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bU, (byte)0);
   }

   @Override
   public agm U() {
      if (this.A()) {
         return this.ai().j();
      } else {
         return switch (this.w()) {
            case a -> efa.S;
            case b -> efa.T;
            case c -> efa.U;
            case d -> efa.V;
            case e -> efa.W;
            case f -> efa.X;
            case g -> efa.Y;
            case h -> efa.Z;
            case i -> efa.aa;
            case j -> efa.ab;
            case k -> efa.ac;
            case l -> efa.ad;
            case m -> efa.ae;
            case n -> efa.af;
            case o -> efa.ag;
            case p -> efa.ah;
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
         return (float) (Math.PI / 5) + 0.21991149F * atq.a($$1 * 28.7F);
      } else {
         return this.bY > 0 ? (float) (Math.PI / 5) : this.dF() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      if ($$2.a(clr.rS)) {
         if (!this.dN().B && this.a()) {
            this.a(aqw.h);
            this.a(dlx.M, $$0);
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            return bjb.a;
         } else {
            return bjb.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aqw $$0) {
      this.dN().a(null, this, aqv.vj, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ag.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cas $$3 = this.a(bW.get(this.w()), 1);
         if ($$3 != null) {
            $$3.g($$3.dq().b((double)((this.ag.i() - this.ag.i()) * 0.1F), (double)(this.ag.i() * 0.05F), (double)((this.ag.i() - this.ag.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bx() && !this.A() && !this.o_();
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("Sheared", this.A());
      $$0.a("Color", (byte)this.w().a());
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(ckc.a($$0.f("Color")));
   }

   @Override
   protected aqu y() {
      return aqv.vg;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.vi;
   }

   @Override
   protected aqu n_() {
      return aqv.vh;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.vk, 0.15F, 1.0F);
   }

   public ckc w() {
      return ckc.a(this.an.b(bU) & 15);
   }

   public void b(ckc $$0) {
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

   public static ckc a(atw $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return ckc.p;
      } else if ($$1 < 10) {
         return ckc.h;
      } else if ($$1 < 15) {
         return ckc.i;
      } else if ($$1 < 18) {
         return ckc.m;
      } else {
         return $$0.a(500) == 0 ? ckc.g : ckc.a;
      }
   }

   @Nullable
   public bxs b(ami $$0, bkq $$1) {
      bxs $$2 = bkz.aF.a((csf)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (bxs)$$1));
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
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      this.b(a($$0.F_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private ckc a(bww $$0, bww $$1) {
      ckc $$2 = ((bxs)$$0).w();
      ckc $$3 = ((bxs)$$1).w();
      chh $$4 = a($$2, $$3);
      return this.dN()
         .q()
         .a(coy.a, $$4, this.dN())
         .map($$1x -> ((coi)$$1x.b()).a($$4, this.dN().I_()))
         .map(clo::d)
         .filter(ckd.class::isInstance)
         .map(ckd.class::cast)
         .map(ckd::d)
         .orElseGet(() -> this.dN().z.h() ? $$2 : $$3);
   }

   private static chh a(ckc $$0, ckc $$1) {
      chh $$2 = new cir(new cgr(null, -1) {
         @Override
         public clo a(cdz $$0, int $$1) {
            return clo.b;
         }

         @Override
         public boolean a(cdz $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new clo(ckd.a($$0)));
      $$2.a(1, new clo(ckd.a($$1)));
      return $$2;
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return 0.95F * $$1.b;
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
