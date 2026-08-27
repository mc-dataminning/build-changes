import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvn extends bur implements bjx {
   private static final int bT = 40;
   private static final aef<Byte> bU = aei.a(bvn.class, aeh.a);
   private static final Map<cht, cpu> bW = ac.a(Maps.newEnumMap(cht.class), $$0 -> {
      $$0.put(cht.a, csw.bA);
      $$0.put(cht.b, csw.bB);
      $$0.put(cht.c, csw.bC);
      $$0.put(cht.d, csw.bD);
      $$0.put(cht.e, csw.bE);
      $$0.put(cht.f, csw.bF);
      $$0.put(cht.g, csw.bG);
      $$0.put(cht.h, csw.bH);
      $$0.put(cht.i, csw.bI);
      $$0.put(cht.j, csw.bJ);
      $$0.put(cht.k, csw.bK);
      $$0.put(cht.l, csw.bL);
      $$0.put(cht.m, csw.bM);
      $$0.put(cht.n, csw.bN);
      $$0.put(cht.o, csw.bO);
      $$0.put(cht.p, csw.bP);
   });
   private static final Map<cht, float[]> bX = Maps.newEnumMap(Arrays.stream(cht.values()).collect(Collectors.toMap($$0 -> (cht)$$0, bvn::c)));
   private int bY;
   private bpt bZ;

   private static float[] c(cht $$0) {
      if ($$0 == cht.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(cht $$0) {
      return bX.get($$0);
   }

   public bvn(biu<? extends bvn> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bZ = new bpt(this);
      this.bO.a(0, new bpv(this));
      this.bO.a(1, new bqu(this, 1.25));
      this.bO.a(2, new bpn(this, 1.0));
      this.bO.a(3, new brj(this, 1.1, cmg.a(cji.oI), false));
      this.bO.a(4, new bqa(this, 1.1));
      this.bO.a(5, this.bZ);
      this.bO.a(6, new bro(this, 1.0));
      this.bO.a(7, new bqj(this, cbu.class, 6.0F));
      this.bO.a(8, new bqw(this));
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

   public static bkl.a s() {
      return bji.A().a(bkm.a, 8.0).a(bkm.d, 0.23F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, (byte)0);
   }

   @Override
   public aex S() {
      if (this.y()) {
         return this.ag().j();
      } else {
         return switch (this.t()) {
            case a -> eco.S;
            case b -> eco.T;
            case c -> eco.U;
            case d -> eco.V;
            case e -> eco.W;
            case f -> eco.X;
            case g -> eco.Y;
            case h -> eco.Z;
            case i -> eco.aa;
            case j -> eco.ab;
            case k -> eco.ac;
            case l -> eco.ad;
            case m -> eco.ae;
            case n -> eco.af;
            case o -> eco.ag;
            case p -> eco.ah;
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
         return (float) (Math.PI / 5) + 0.21991149F * arx.a($$1 * 28.7F);
      } else {
         return this.bY > 0 ? (float) (Math.PI / 5) : this.dD() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      if ($$2.a(cji.rg)) {
         if (!this.dL().B && this.a()) {
            this.a(apf.h);
            this.a(djt.M, $$0);
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            return bgy.a;
         } else {
            return bgy.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(apf $$0) {
      this.dL().a(null, this, ape.uO, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ag.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         byn $$3 = this.a(bW.get(this.t()), 1);
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
      this.b(cht.a($$0.f("Color")));
   }

   @Override
   protected apd w() {
      return ape.uL;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.uN;
   }

   @Override
   protected apd l_() {
      return ape.uM;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(ape.uP, 0.15F, 1.0F);
   }

   public cht t() {
      return cht.a(this.an.b(bU) & 15);
   }

   public void b(cht $$0) {
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

   public static cht a(asc $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cht.p;
      } else if ($$1 < 10) {
         return cht.h;
      } else if ($$1 < 15) {
         return cht.i;
      } else if ($$1 < 18) {
         return cht.m;
      } else {
         return $$0.a(500) == 0 ? cht.g : cht.a;
      }
   }

   @Nullable
   public bvn b(akr $$0, bil $$1) {
      bvn $$2 = biu.aF.a((cpv)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (bvn)$$1));
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
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qy $$4) {
      this.b(a($$0.D_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private cht a(bur $$0, bur $$1) {
      cht $$2 = ((bvn)$$0).t();
      cht $$3 = ((bvn)$$1).t();
      cez $$4 = a($$2, $$3);
      return this.dL()
         .q()
         .a(cmn.a, $$4, this.dL())
         .map($$1x -> ((clz)$$1x.b()).a($$4, this.dL().G_()))
         .map(cjf::d)
         .filter(chu.class::isInstance)
         .map(chu.class::cast)
         .map(chu::d)
         .orElseGet(() -> this.dL().z.h() ? $$2 : $$3);
   }

   private static cez a(cht $$0, cht $$1) {
      cez $$2 = new cgi(new cel(null, -1) {
         @Override
         public cjf a(cbu $$0, int $$1) {
            return cjf.b;
         }

         @Override
         public boolean a(cbu $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cjf(chu.a($$0)));
      $$2.a(1, new cjf(chu.a($$1)));
      return $$2;
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return 0.95F * $$1.b;
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
