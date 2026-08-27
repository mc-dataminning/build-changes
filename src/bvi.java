import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvi extends bum implements bjs {
   private static final int bT = 40;
   private static final aec<Byte> bU = aef.a(bvi.class, aee.a);
   private static final Map<cho, cpp> bW = ac.a(Maps.newEnumMap(cho.class), $$0 -> {
      $$0.put(cho.a, csr.bA);
      $$0.put(cho.b, csr.bB);
      $$0.put(cho.c, csr.bC);
      $$0.put(cho.d, csr.bD);
      $$0.put(cho.e, csr.bE);
      $$0.put(cho.f, csr.bF);
      $$0.put(cho.g, csr.bG);
      $$0.put(cho.h, csr.bH);
      $$0.put(cho.i, csr.bI);
      $$0.put(cho.j, csr.bJ);
      $$0.put(cho.k, csr.bK);
      $$0.put(cho.l, csr.bL);
      $$0.put(cho.m, csr.bM);
      $$0.put(cho.n, csr.bN);
      $$0.put(cho.o, csr.bO);
      $$0.put(cho.p, csr.bP);
   });
   private static final Map<cho, float[]> bX = Maps.newEnumMap(Arrays.stream(cho.values()).collect(Collectors.toMap($$0 -> (cho)$$0, bvi::c)));
   private int bY;
   private bpo bZ;

   private static float[] c(cho $$0) {
      if ($$0 == cho.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(cho $$0) {
      return bX.get($$0);
   }

   public bvi(bip<? extends bvi> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bZ = new bpo(this);
      this.bO.a(0, new bpq(this));
      this.bO.a(1, new bqp(this, 1.25));
      this.bO.a(2, new bpi(this, 1.0));
      this.bO.a(3, new bre(this, 1.1, cmb.a(cjd.oI), false));
      this.bO.a(4, new bpv(this, 1.1));
      this.bO.a(5, this.bZ);
      this.bO.a(6, new brj(this, 1.0));
      this.bO.a(7, new bqe(this, cbp.class, 6.0F));
      this.bO.a(8, new bqr(this));
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

   public static bkg.a p() {
      return bjd.x().a(bkh.a, 8.0).a(bkh.d, 0.23F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, (byte)0);
   }

   @Override
   public aeu P() {
      if (this.t()) {
         return this.ag().j();
      } else {
         return switch (this.q()) {
            case a -> ecj.S;
            case b -> ecj.T;
            case c -> ecj.U;
            case d -> ecj.V;
            case e -> ecj.W;
            case f -> ecj.X;
            case g -> ecj.Y;
            case h -> ecj.Z;
            case i -> ecj.aa;
            case j -> ecj.ab;
            case k -> ecj.ac;
            case l -> ecj.ad;
            case m -> ecj.ae;
            case n -> ecj.af;
            case o -> ecj.ag;
            case p -> ecj.ah;
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
         return (float) (Math.PI / 5) + 0.21991149F * ars.a($$1 * 28.7F);
      } else {
         return this.bY > 0 ? (float) (Math.PI / 5) : this.dC() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      if ($$2.a(cjd.rg)) {
         if (!this.dK().B && this.a()) {
            this.a(apa.h);
            this.a(djo.M, $$0);
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            return bgt.a;
         } else {
            return bgt.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(apa $$0) {
      this.dK().a(null, this, aoz.uO, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ag.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         byi $$3 = this.a(bW.get(this.q()), 1);
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
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("Sheared", this.t());
      $$0.a("Color", (byte)this.q().a());
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(cho.a($$0.f("Color")));
   }

   @Override
   protected aoy r() {
      return aoz.uL;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.uN;
   }

   @Override
   protected aoy h_() {
      return aoz.uM;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.uP, 0.15F, 1.0F);
   }

   public cho q() {
      return cho.a(this.an.b(bU) & 15);
   }

   public void b(cho $$0) {
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

   public static cho a(arx $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cho.p;
      } else if ($$1 < 10) {
         return cho.h;
      } else if ($$1 < 15) {
         return cho.i;
      } else if ($$1 < 18) {
         return cho.m;
      } else {
         return $$0.a(500) == 0 ? cho.g : cho.a;
      }
   }

   @Nullable
   public bvi b(akn $$0, big $$1) {
      bvi $$2 = bip.aF.a((cpq)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (bvi)$$1));
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
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      this.b(a($$0.y_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private cho a(bum $$0, bum $$1) {
      cho $$2 = ((bvi)$$0).q();
      cho $$3 = ((bvi)$$1).q();
      ceu $$4 = a($$2, $$3);
      return this.dK()
         .q()
         .a(cmi.a, $$4, this.dK())
         .map($$1x -> ((clu)$$1x.b()).a($$4, this.dK().B_()))
         .map(cja::d)
         .filter(chp.class::isInstance)
         .map(chp.class::cast)
         .map(chp::d)
         .orElseGet(() -> this.dK().z.h() ? $$2 : $$3);
   }

   private static ceu a(cho $$0, cho $$1) {
      ceu $$2 = new cgd(new ceg(null, -1) {
         @Override
         public cja a(cbp $$0, int $$1) {
            return cja.b;
         }

         @Override
         public boolean a(cbp $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cja(chp.a($$0)));
      $$2.a(1, new cja(chp.a($$1)));
      return $$2;
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return 0.95F * $$1.b;
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
