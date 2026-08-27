import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvp extends but implements bjz {
   private static final int bT = 40;
   private static final aeg<Byte> bU = aej.a(bvp.class, aei.a);
   private static final Map<chv, cpw> bW = ac.a(Maps.newEnumMap(chv.class), $$0 -> {
      $$0.put(chv.a, csy.bA);
      $$0.put(chv.b, csy.bB);
      $$0.put(chv.c, csy.bC);
      $$0.put(chv.d, csy.bD);
      $$0.put(chv.e, csy.bE);
      $$0.put(chv.f, csy.bF);
      $$0.put(chv.g, csy.bG);
      $$0.put(chv.h, csy.bH);
      $$0.put(chv.i, csy.bI);
      $$0.put(chv.j, csy.bJ);
      $$0.put(chv.k, csy.bK);
      $$0.put(chv.l, csy.bL);
      $$0.put(chv.m, csy.bM);
      $$0.put(chv.n, csy.bN);
      $$0.put(chv.o, csy.bO);
      $$0.put(chv.p, csy.bP);
   });
   private static final Map<chv, float[]> bX = Maps.newEnumMap(Arrays.stream(chv.values()).collect(Collectors.toMap($$0 -> (chv)$$0, bvp::c)));
   private int bY;
   private bpv bZ;

   private static float[] c(chv $$0) {
      if ($$0 == chv.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(chv $$0) {
      return bX.get($$0);
   }

   public bvp(biw<? extends bvp> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bZ = new bpv(this);
      this.bO.a(0, new bpx(this));
      this.bO.a(1, new bqw(this, 1.25));
      this.bO.a(2, new bpp(this, 1.0));
      this.bO.a(3, new brl(this, 1.1, cmi.a(cjk.oI), false));
      this.bO.a(4, new bqc(this, 1.1));
      this.bO.a(5, this.bZ);
      this.bO.a(6, new brq(this, 1.0));
      this.bO.a(7, new bql(this, cbw.class, 6.0F));
      this.bO.a(8, new bqy(this));
   }

   @Override
   protected void X() {
      this.bY = this.bZ.h();
      super.X();
   }

   @Override
   public void b_() {
      if (this.dL().B) {
         this.bY = Math.max(0, this.bY - 1);
      }

      super.b_();
   }

   public static bkn.a s() {
      return bjk.A().a(bko.a, 8.0).a(bko.d, 0.23F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, (byte)0);
   }

   @Override
   public aey S() {
      if (this.y()) {
         return this.ag().j();
      } else {
         return switch (this.t()) {
            case a -> ecq.S;
            case b -> ecq.T;
            case c -> ecq.U;
            case d -> ecq.V;
            case e -> ecq.W;
            case f -> ecq.X;
            case g -> ecq.Y;
            case h -> ecq.Z;
            case i -> ecq.aa;
            case j -> ecq.ab;
            case k -> ecq.ac;
            case l -> ecq.ad;
            case m -> ecq.ae;
            case n -> ecq.af;
            case o -> ecq.ag;
            case p -> ecq.ah;
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
         return (float) (Math.PI / 5) + 0.21991149F * ary.a($$1 * 28.7F);
      } else {
         return this.bY > 0 ? (float) (Math.PI / 5) : this.dD() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bha b(cbw $$0, bgz $$1) {
      cjh $$2 = $$0.b($$1);
      if ($$2.a(cjk.rg)) {
         if (!this.dL().B && this.a()) {
            this.a(apg.h);
            this.a(djv.M, $$0);
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            return bha.a;
         } else {
            return bha.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(apg $$0) {
      this.dL().a(null, this, apf.uO, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ag.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         byp $$3 = this.a(bW.get(this.t()), 1);
         if ($$3 != null) {
            $$3.f($$3.do().b((double)((this.ag.i() - this.ag.i()) * 0.1F), (double)(this.ag.i() * 0.05F), (double)((this.ag.i() - this.ag.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bv() && !this.y() && !this.m_();
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("Sheared", this.y());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(chv.a($$0.f("Color")));
   }

   @Override
   protected ape w() {
      return apf.uL;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.uN;
   }

   @Override
   protected ape l_() {
      return apf.uM;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.uP, 0.15F, 1.0F);
   }

   public chv t() {
      return chv.a(this.an.b(bU) & 15);
   }

   public void b(chv $$0) {
      byte $$1 = this.an.b(bU);
      this.an.b(bU, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean y() {
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

   public static chv a(ase $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return chv.p;
      } else if ($$1 < 10) {
         return chv.h;
      } else if ($$1 < 15) {
         return chv.i;
      } else if ($$1 < 18) {
         return chv.m;
      } else {
         return $$0.a(500) == 0 ? chv.g : chv.a;
      }
   }

   @Nullable
   public bvp b(aks $$0, bin $$1) {
      bvp $$2 = biw.aF.a((cpx)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (bvp)$$1));
      }

      return $$2;
   }

   @Override
   public void N() {
      super.N();
      this.w(false);
      if (this.m_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      this.b(a($$0.D_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private chv a(but $$0, but $$1) {
      chv $$2 = ((bvp)$$0).t();
      chv $$3 = ((bvp)$$1).t();
      cfb $$4 = a($$2, $$3);
      return this.dL()
         .q()
         .a(cmp.a, $$4, this.dL())
         .map($$1x -> ((cmb)$$1x.b()).a($$4, this.dL().G_()))
         .map(cjh::d)
         .filter(chw.class::isInstance)
         .map(chw.class::cast)
         .map(chw::d)
         .orElseGet(() -> this.dL().z.h() ? $$2 : $$3);
   }

   private static cfb a(chv $$0, chv $$1) {
      cfb $$2 = new cgk(new cen(null, -1) {
         @Override
         public cjh a(cbw $$0, int $$1) {
            return cjh.b;
         }

         @Override
         public boolean a(cbw $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cjh(chw.a($$0)));
      $$2.a(1, new cjh(chw.a($$1)));
      return $$2;
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return 0.95F * $$1.b;
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
