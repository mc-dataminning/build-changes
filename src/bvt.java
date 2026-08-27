import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvt extends bux implements bkd {
   private static final int bT = 40;
   private static final aef<Byte> bU = aei.a(bvt.class, aeh.a);
   private static final Map<chz, cqa> bW = ac.a(Maps.newEnumMap(chz.class), $$0 -> {
      $$0.put(chz.a, cte.bA);
      $$0.put(chz.b, cte.bB);
      $$0.put(chz.c, cte.bC);
      $$0.put(chz.d, cte.bD);
      $$0.put(chz.e, cte.bE);
      $$0.put(chz.f, cte.bF);
      $$0.put(chz.g, cte.bG);
      $$0.put(chz.h, cte.bH);
      $$0.put(chz.i, cte.bI);
      $$0.put(chz.j, cte.bJ);
      $$0.put(chz.k, cte.bK);
      $$0.put(chz.l, cte.bL);
      $$0.put(chz.m, cte.bM);
      $$0.put(chz.n, cte.bN);
      $$0.put(chz.o, cte.bO);
      $$0.put(chz.p, cte.bP);
   });
   private static final Map<chz, float[]> bX = Maps.newEnumMap(Arrays.stream(chz.values()).collect(Collectors.toMap($$0 -> (chz)$$0, bvt::c)));
   private int bY;
   private bpz bZ;

   private static float[] c(chz $$0) {
      if ($$0 == chz.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(chz $$0) {
      return bX.get($$0);
   }

   public bvt(bja<? extends bvt> $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bZ = new bpz(this);
      this.bO.a(0, new bqb(this));
      this.bO.a(1, new bra(this, 1.25));
      this.bO.a(2, new bpt(this, 1.0));
      this.bO.a(3, new brp(this, 1.1, cmm.a(cjo.oI), false));
      this.bO.a(4, new bqg(this, 1.1));
      this.bO.a(5, this.bZ);
      this.bO.a(6, new bru(this, 1.0));
      this.bO.a(7, new bqp(this, cca.class, 6.0F));
      this.bO.a(8, new brc(this));
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

   public static bkr.a s() {
      return bjo.A().a(bks.l, 8.0).a(bks.m, 0.23F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, (byte)0);
   }

   @Override
   public aez S() {
      if (this.y()) {
         return this.ag().j();
      } else {
         return switch (this.t()) {
            case a -> eci.S;
            case b -> eci.T;
            case c -> eci.U;
            case d -> eci.V;
            case e -> eci.W;
            case f -> eci.X;
            case g -> eci.Y;
            case h -> eci.Z;
            case i -> eci.aa;
            case j -> eci.ab;
            case k -> eci.ac;
            case l -> eci.ad;
            case m -> eci.ae;
            case n -> eci.af;
            case o -> eci.ag;
            case p -> eci.ah;
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
         return (float) (Math.PI / 5) + 0.21991149F * asb.a($$1 * 28.7F);
      } else {
         return this.bY > 0 ? (float) (Math.PI / 5) : this.dD() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bhe b(cca $$0, bhd $$1) {
      cjl $$2 = $$0.b($$1);
      if ($$2.a(cjo.rg)) {
         if (!this.dL().B && this.a()) {
            this.a(aph.h);
            this.a(djn.M, $$0);
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            return bhe.a;
         } else {
            return bhe.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aph $$0) {
      this.dL().a(null, this, apg.uO, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ag.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         byt $$3 = this.a(bW.get(this.t()), 1);
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
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("Sheared", this.y());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(chz.a($$0.f("Color")));
   }

   @Override
   protected apf w() {
      return apg.uL;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.uN;
   }

   @Override
   protected apf l_() {
      return apg.uM;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.uP, 0.15F, 1.0F);
   }

   public chz t() {
      return chz.a(this.an.b(bU) & 15);
   }

   public void b(chz $$0) {
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

   public static chz a(ash $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return chz.p;
      } else if ($$1 < 10) {
         return chz.h;
      } else if ($$1 < 15) {
         return chz.i;
      } else if ($$1 < 18) {
         return chz.m;
      } else {
         return $$0.a(500) == 0 ? chz.g : chz.a;
      }
   }

   @Nullable
   public bvt b(akt $$0, bir $$1) {
      bvt $$2 = bja.aF.a((cqb)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (bvt)$$1));
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
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      this.b(a($$0.D_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private chz a(bux $$0, bux $$1) {
      chz $$2 = ((bvt)$$0).t();
      chz $$3 = ((bvt)$$1).t();
      cff $$4 = a($$2, $$3);
      return this.dL()
         .q()
         .a(cmt.a, $$4, this.dL())
         .map($$1x -> ((cmf)$$1x.b()).a($$4, this.dL().G_()))
         .map(cjl::d)
         .filter(cia.class::isInstance)
         .map(cia.class::cast)
         .map(cia::d)
         .orElseGet(() -> this.dL().z.h() ? $$2 : $$3);
   }

   private static cff a(chz $$0, chz $$1) {
      cff $$2 = new cgo(new cer(null, -1) {
         @Override
         public cjl a(cca $$0, int $$1) {
            return cjl.b;
         }

         @Override
         public boolean a(cca $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cjl(cia.a($$0)));
      $$2.a(1, new cjl(cia.a($$1)));
      return $$2;
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return 0.95F * $$1.b;
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
