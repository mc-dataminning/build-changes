import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byu extends bxy implements bnc {
   private static final int bT = 40;
   private static final agm<Byte> bU = agp.a(byu.class, ago.a);
   private static final Map<clm, cto> bW = ac.a(Maps.newEnumMap(clm.class), $$0 -> {
      $$0.put(clm.a, cws.bA);
      $$0.put(clm.b, cws.bB);
      $$0.put(clm.c, cws.bC);
      $$0.put(clm.d, cws.bD);
      $$0.put(clm.e, cws.bE);
      $$0.put(clm.f, cws.bF);
      $$0.put(clm.g, cws.bG);
      $$0.put(clm.h, cws.bH);
      $$0.put(clm.i, cws.bI);
      $$0.put(clm.j, cws.bJ);
      $$0.put(clm.k, cws.bK);
      $$0.put(clm.l, cws.bL);
      $$0.put(clm.m, cws.bM);
      $$0.put(clm.n, cws.bN);
      $$0.put(clm.o, cws.bO);
      $$0.put(clm.p, cws.bP);
   });
   private static final Map<clm, float[]> bX = Maps.newEnumMap(Arrays.stream(clm.values()).collect(Collectors.toMap($$0 -> (clm)$$0, byu::c)));
   private int bY;
   private bsz bZ;

   private static float[] c(clm $$0) {
      if ($$0 == clm.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(clm $$0) {
      return bX.get($$0);
   }

   public byu(blz<? extends byu> $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bZ = new bsz(this);
      this.bO.a(0, new btb(this));
      this.bO.a(1, new bua(this, 1.25));
      this.bO.a(2, new bst(this, 1.0));
      this.bO.a(3, new bup(this, 1.1, cpz.a(cnb.pt), false));
      this.bO.a(4, new btg(this, 1.1));
      this.bO.a(5, this.bZ);
      this.bO.a(6, new buu(this, 1.0));
      this.bO.a(7, new btp(this, cfi.class, 6.0F));
      this.bO.a(8, new buc(this));
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

   public static bnq.a u() {
      return bmn.C().a(bnr.l, 8.0).a(bnr.m, 0.23F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bU, (byte)0);
   }

   @Override
   public ahg U() {
      if (this.A()) {
         return this.ai().j();
      } else {
         return switch (this.w()) {
            case a -> egu.ac;
            case b -> egu.ad;
            case c -> egu.ae;
            case d -> egu.af;
            case e -> egu.ag;
            case f -> egu.ah;
            case g -> egu.ai;
            case h -> egu.aj;
            case i -> egu.ak;
            case j -> egu.al;
            case k -> egu.am;
            case l -> egu.an;
            case m -> egu.ao;
            case n -> egu.ap;
            case o -> egu.aq;
            case p -> egu.ar;
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
         return (float) (Math.PI / 5) + 0.21991149F * auo.a($$1 * 28.7F);
      } else {
         return this.bY > 0 ? (float) (Math.PI / 5) : this.dE() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bkb b(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      if ($$2.a(cnb.rS)) {
         if (!this.dM().B && this.a()) {
            this.a(art.h);
            this.a(dnr.M, $$0);
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            return bkb.a;
         } else {
            return bkb.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(art $$0) {
      this.dM().a(null, this, ars.vE, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ag.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cbu $$3 = this.a(bW.get(this.w()), 1);
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
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("Sheared", this.A());
      $$0.a("Color", (byte)this.w().a());
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(clm.a($$0.f("Color")));
   }

   @Override
   protected arr y() {
      return ars.vB;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.vD;
   }

   @Override
   protected arr n_() {
      return ars.vC;
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.vF, 0.15F, 1.0F);
   }

   public clm w() {
      return clm.a(this.an.b(bU) & 15);
   }

   public void b(clm $$0) {
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

   public static clm a(auv $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return clm.p;
      } else if ($$1 < 10) {
         return clm.h;
      } else if ($$1 < 15) {
         return clm.i;
      } else if ($$1 < 18) {
         return clm.m;
      } else {
         return $$0.a(500) == 0 ? clm.g : clm.a;
      }
   }

   @Nullable
   public byu b(and $$0, blq $$1) {
      byu $$2 = blz.aG.a((ctp)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (byu)$$1));
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
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      this.b(a($$0.F_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private clm a(bxy $$0, bxy $$1) {
      clm $$2 = ((byu)$$0).w();
      clm $$3 = ((byu)$$1).w();
      cir $$4 = a($$2, $$3);
      return this.dM()
         .r()
         .a(cqh.a, $$4, this.dM())
         .map($$1x -> ((cpt)$$1x.b()).a($$4, this.dM().I_()))
         .map(cmy::d)
         .filter(cln.class::isInstance)
         .map(cln.class::cast)
         .map(cln::d)
         .orElseGet(() -> this.dM().z.h() ? $$2 : $$3);
   }

   private static cir a(clm $$0, clm $$1) {
      cir $$2 = new ckb(new cib(null, -1) {
         @Override
         public cmy a(cfi $$0, int $$1) {
            return cmy.f;
         }

         @Override
         public boolean a(cfi $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cmy(cln.a($$0)));
      $$2.a(1, new cmy(cln.a($$1)));
      return $$2;
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return 0.95F * $$1.b;
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
