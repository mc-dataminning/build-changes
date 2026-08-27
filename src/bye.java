import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bye extends bxi implements bmm {
   private static final int bT = 40;
   private static final afz<Byte> bU = agc.a(bye.class, agb.a);
   private static final Map<ckv, csx> bW = ac.a(Maps.newEnumMap(ckv.class), $$0 -> {
      $$0.put(ckv.a, cwb.bA);
      $$0.put(ckv.b, cwb.bB);
      $$0.put(ckv.c, cwb.bC);
      $$0.put(ckv.d, cwb.bD);
      $$0.put(ckv.e, cwb.bE);
      $$0.put(ckv.f, cwb.bF);
      $$0.put(ckv.g, cwb.bG);
      $$0.put(ckv.h, cwb.bH);
      $$0.put(ckv.i, cwb.bI);
      $$0.put(ckv.j, cwb.bJ);
      $$0.put(ckv.k, cwb.bK);
      $$0.put(ckv.l, cwb.bL);
      $$0.put(ckv.m, cwb.bM);
      $$0.put(ckv.n, cwb.bN);
      $$0.put(ckv.o, cwb.bO);
      $$0.put(ckv.p, cwb.bP);
   });
   private static final Map<ckv, float[]> bX = Maps.newEnumMap(Arrays.stream(ckv.values()).collect(Collectors.toMap($$0 -> (ckv)$$0, bye::c)));
   private int bY;
   private bsj bZ;

   private static float[] c(ckv $$0) {
      if ($$0 == ckv.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(ckv $$0) {
      return bX.get($$0);
   }

   public bye(blj<? extends bye> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bZ = new bsj(this);
      this.bO.a(0, new bsl(this));
      this.bO.a(1, new btk(this, 1.25));
      this.bO.a(2, new bsd(this, 1.0));
      this.bO.a(3, new btz(this, 1.1, cpi.a(cmk.pt), false));
      this.bO.a(4, new bsq(this, 1.1));
      this.bO.a(5, this.bZ);
      this.bO.a(6, new bue(this, 1.0));
      this.bO.a(7, new bsz(this, cer.class, 6.0F));
      this.bO.a(8, new btm(this));
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

   public static bna.a u() {
      return blx.C().a(bnb.l, 8.0).a(bnb.m, 0.23F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bU, (byte)0);
   }

   @Override
   public agt U() {
      if (this.A()) {
         return this.ai().j();
      } else {
         return switch (this.w()) {
            case a -> egc.ac;
            case b -> egc.ad;
            case c -> egc.ae;
            case d -> egc.af;
            case e -> egc.ag;
            case f -> egc.ah;
            case g -> egc.ai;
            case h -> egc.aj;
            case i -> egc.ak;
            case j -> egc.al;
            case k -> egc.am;
            case l -> egc.an;
            case m -> egc.ao;
            case n -> egc.ap;
            case o -> egc.aq;
            case p -> egc.ar;
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
         return (float) (Math.PI / 5) + 0.21991149F * aty.a($$1 * 28.7F);
      } else {
         return this.bY > 0 ? (float) (Math.PI / 5) : this.dE() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      if ($$2.a(cmk.rS)) {
         if (!this.dM().B && this.a()) {
            this.a(ard.h);
            this.a(dmz.M, $$0);
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            return bjl.a;
         } else {
            return bjl.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ard $$0) {
      this.dM().a(null, this, arc.vE, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ag.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cbe $$3 = this.a(bW.get(this.w()), 1);
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
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("Sheared", this.A());
      $$0.a("Color", (byte)this.w().a());
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(ckv.a($$0.f("Color")));
   }

   @Override
   protected arb y() {
      return arc.vB;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.vD;
   }

   @Override
   protected arb n_() {
      return arc.vC;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.vF, 0.15F, 1.0F);
   }

   public ckv w() {
      return ckv.a(this.an.b(bU) & 15);
   }

   public void b(ckv $$0) {
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

   public static ckv a(auf $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return ckv.p;
      } else if ($$1 < 10) {
         return ckv.h;
      } else if ($$1 < 15) {
         return ckv.i;
      } else if ($$1 < 18) {
         return ckv.m;
      } else {
         return $$0.a(500) == 0 ? ckv.g : ckv.a;
      }
   }

   @Nullable
   public bye b(amp $$0, bla $$1) {
      bye $$2 = blj.aG.a((csy)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (bye)$$1));
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
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      this.b(a($$0.F_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private ckv a(bxi $$0, bxi $$1) {
      ckv $$2 = ((bye)$$0).w();
      ckv $$3 = ((bye)$$1).w();
      cia $$4 = a($$2, $$3);
      return this.dM()
         .q()
         .a(cpq.a, $$4, this.dM())
         .map($$1x -> ((cpc)$$1x.b()).a($$4, this.dM().I_()))
         .map(cmh::d)
         .filter(ckw.class::isInstance)
         .map(ckw.class::cast)
         .map(ckw::d)
         .orElseGet(() -> this.dM().z.h() ? $$2 : $$3);
   }

   private static cia a(ckv $$0, ckv $$1) {
      cia $$2 = new cjk(new chk(null, -1) {
         @Override
         public cmh a(cer $$0, int $$1) {
            return cmh.f;
         }

         @Override
         public boolean a(cer $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cmh(ckw.a($$0)));
      $$2.a(1, new cmh(ckw.a($$1)));
      return $$2;
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return 0.95F * $$1.b;
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
