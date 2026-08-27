import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvg extends buk implements bjq {
   private static final int bT = 40;
   private static final adz<Byte> bU = aec.a(bvg.class, aeb.a);
   private static final Map<chm, cpl> bW = ac.a(Maps.newEnumMap(chm.class), $$0 -> {
      $$0.put(chm.a, csn.bA);
      $$0.put(chm.b, csn.bB);
      $$0.put(chm.c, csn.bC);
      $$0.put(chm.d, csn.bD);
      $$0.put(chm.e, csn.bE);
      $$0.put(chm.f, csn.bF);
      $$0.put(chm.g, csn.bG);
      $$0.put(chm.h, csn.bH);
      $$0.put(chm.i, csn.bI);
      $$0.put(chm.j, csn.bJ);
      $$0.put(chm.k, csn.bK);
      $$0.put(chm.l, csn.bL);
      $$0.put(chm.m, csn.bM);
      $$0.put(chm.n, csn.bN);
      $$0.put(chm.o, csn.bO);
      $$0.put(chm.p, csn.bP);
   });
   private static final Map<chm, float[]> bX = Maps.newEnumMap(Arrays.stream(chm.values()).collect(Collectors.toMap($$0 -> (chm)$$0, bvg::c)));
   private int bY;
   private bpm bZ;

   private static float[] c(chm $$0) {
      if ($$0 == chm.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(chm $$0) {
      return bX.get($$0);
   }

   public bvg(bim<? extends bvg> $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bZ = new bpm(this);
      this.bO.a(0, new bpo(this));
      this.bO.a(1, new bqn(this, 1.25));
      this.bO.a(2, new bpg(this, 1.0));
      this.bO.a(3, new brc(this, 1.1, cly.a(cjb.oI), false));
      this.bO.a(4, new bpt(this, 1.1));
      this.bO.a(5, this.bZ);
      this.bO.a(6, new brh(this, 1.0));
      this.bO.a(7, new bqc(this, cbn.class, 6.0F));
      this.bO.a(8, new bqp(this));
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

   public static bke.a p() {
      return bja.x().a(bkf.a, 8.0).a(bkf.d, 0.23F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, (byte)0);
   }

   @Override
   public aer P() {
      if (this.t()) {
         return this.ag().j();
      } else {
         return switch (this.q()) {
            case a -> ecf.S;
            case b -> ecf.T;
            case c -> ecf.U;
            case d -> ecf.V;
            case e -> ecf.W;
            case f -> ecf.X;
            case g -> ecf.Y;
            case h -> ecf.Z;
            case i -> ecf.aa;
            case j -> ecf.ab;
            case k -> ecf.ac;
            case l -> ecf.ad;
            case m -> ecf.ae;
            case n -> ecf.af;
            case o -> ecf.ag;
            case p -> ecf.ah;
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
         return (float) (Math.PI / 5) + 0.21991149F * arp.a($$1 * 28.7F);
      } else {
         return this.bY > 0 ? (float) (Math.PI / 5) : this.dC() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bgq b(cbn $$0, bgp $$1) {
      ciy $$2 = $$0.b($$1);
      if ($$2.a(cjb.rg)) {
         if (!this.dK().B && this.a()) {
            this.a(aox.h);
            this.a(djk.M, $$0);
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            return bgq.a;
         } else {
            return bgq.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aox $$0) {
      this.dK().a(null, this, aow.uO, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ag.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         byg $$3 = this.a(bW.get(this.q()), 1);
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
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Sheared", this.t());
      $$0.a("Color", (byte)this.q().a());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(chm.a($$0.f("Color")));
   }

   @Override
   protected aov r() {
      return aow.uL;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.uN;
   }

   @Override
   protected aov h_() {
      return aow.uM;
   }

   @Override
   protected void b(gu $$0, dfa $$1) {
      this.a(aow.uP, 0.15F, 1.0F);
   }

   public chm q() {
      return chm.a(this.an.b(bU) & 15);
   }

   public void b(chm $$0) {
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

   public static chm a(aru $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return chm.p;
      } else if ($$1 < 10) {
         return chm.h;
      } else if ($$1 < 15) {
         return chm.i;
      } else if ($$1 < 18) {
         return chm.m;
      } else {
         return $$0.a(500) == 0 ? chm.g : chm.a;
      }
   }

   @Nullable
   public bvg b(akk $$0, bid $$1) {
      bvg $$2 = bim.aF.a((cpm)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (bvg)$$1));
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
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      this.b(a($$0.y_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private chm a(buk $$0, buk $$1) {
      chm $$2 = ((bvg)$$0).q();
      chm $$3 = ((bvg)$$1).q();
      ces $$4 = a($$2, $$3);
      return this.dK()
         .q()
         .a(cme.a, $$4, this.dK())
         .map($$1x -> $$1x.a($$4, this.dK().B_()))
         .map(ciy::d)
         .filter(chn.class::isInstance)
         .map(chn.class::cast)
         .map(chn::d)
         .orElseGet(() -> this.dK().z.h() ? $$2 : $$3);
   }

   private static ces a(chm $$0, chm $$1) {
      ces $$2 = new cgb(new cee(null, -1) {
         @Override
         public ciy a(cbn $$0, int $$1) {
            return ciy.b;
         }

         @Override
         public boolean a(cbn $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new ciy(chn.a($$0)));
      $$2.a(1, new ciy(chn.a($$1)));
      return $$2;
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return 0.95F * $$1.b;
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
