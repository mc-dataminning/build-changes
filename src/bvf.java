import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvf extends buj implements bjp {
   private static final int bT = 40;
   private static final adz<Byte> bU = aec.a(bvf.class, aeb.a);
   private static final Map<chl, cpk> bW = ac.a(Maps.newEnumMap(chl.class), $$0 -> {
      $$0.put(chl.a, csm.bA);
      $$0.put(chl.b, csm.bB);
      $$0.put(chl.c, csm.bC);
      $$0.put(chl.d, csm.bD);
      $$0.put(chl.e, csm.bE);
      $$0.put(chl.f, csm.bF);
      $$0.put(chl.g, csm.bG);
      $$0.put(chl.h, csm.bH);
      $$0.put(chl.i, csm.bI);
      $$0.put(chl.j, csm.bJ);
      $$0.put(chl.k, csm.bK);
      $$0.put(chl.l, csm.bL);
      $$0.put(chl.m, csm.bM);
      $$0.put(chl.n, csm.bN);
      $$0.put(chl.o, csm.bO);
      $$0.put(chl.p, csm.bP);
   });
   private static final Map<chl, float[]> bX = Maps.newEnumMap(Arrays.stream(chl.values()).collect(Collectors.toMap($$0 -> (chl)$$0, bvf::c)));
   private int bY;
   private bpl bZ;

   private static float[] c(chl $$0) {
      if ($$0 == chl.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(chl $$0) {
      return bX.get($$0);
   }

   public bvf(bim<? extends bvf> $$0, cpl $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bZ = new bpl(this);
      this.bO.a(0, new bpn(this));
      this.bO.a(1, new bqm(this, 1.25));
      this.bO.a(2, new bpf(this, 1.0));
      this.bO.a(3, new brb(this, 1.1, clx.a(cja.oI), false));
      this.bO.a(4, new bps(this, 1.1));
      this.bO.a(5, this.bZ);
      this.bO.a(6, new brg(this, 1.0));
      this.bO.a(7, new bqb(this, cbm.class, 6.0F));
      this.bO.a(8, new bqo(this));
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

   public static bkd.a p() {
      return bja.x().a(bke.a, 8.0).a(bke.d, 0.23F);
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
            case a -> ece.S;
            case b -> ece.T;
            case c -> ece.U;
            case d -> ece.V;
            case e -> ece.W;
            case f -> ece.X;
            case g -> ece.Y;
            case h -> ece.Z;
            case i -> ece.aa;
            case j -> ece.ab;
            case k -> ece.ac;
            case l -> ece.ad;
            case m -> ece.ae;
            case n -> ece.af;
            case o -> ece.ag;
            case p -> ece.ah;
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
   public bgq b(cbm $$0, bgp $$1) {
      cix $$2 = $$0.b($$1);
      if ($$2.a(cja.rg)) {
         if (!this.dK().B && this.a()) {
            this.a(aox.h);
            this.a(djj.M, $$0);
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
         byf $$3 = this.a(bW.get(this.q()), 1);
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
      this.b(chl.a($$0.f("Color")));
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
   protected void b(gu $$0, dez $$1) {
      this.a(aow.uP, 0.15F, 1.0F);
   }

   public chl q() {
      return chl.a(this.an.b(bU) & 15);
   }

   public void b(chl $$0) {
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

   public static chl a(aru $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return chl.p;
      } else if ($$1 < 10) {
         return chl.h;
      } else if ($$1 < 15) {
         return chl.i;
      } else if ($$1 < 18) {
         return chl.m;
      } else {
         return $$0.a(500) == 0 ? chl.g : chl.a;
      }
   }

   @Nullable
   public bvf b(akk $$0, bid $$1) {
      bvf $$2 = bim.aF.a((cpl)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (bvf)$$1));
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
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      this.b(a($$0.y_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private chl a(buj $$0, buj $$1) {
      chl $$2 = ((bvf)$$0).q();
      chl $$3 = ((bvf)$$1).q();
      cer $$4 = a($$2, $$3);
      return this.dK()
         .q()
         .a(cmd.a, $$4, this.dK())
         .map($$1x -> $$1x.a($$4, this.dK().B_()))
         .map(cix::d)
         .filter(chm.class::isInstance)
         .map(chm.class::cast)
         .map(chm::d)
         .orElseGet(() -> this.dK().z.h() ? $$2 : $$3);
   }

   private static cer a(chl $$0, chl $$1) {
      cer $$2 = new cga(new ced(null, -1) {
         @Override
         public cix a(cbm $$0, int $$1) {
            return cix.b;
         }

         @Override
         public boolean a(cbm $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cix(chm.a($$0)));
      $$2.a(1, new cix(chm.a($$1)));
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
