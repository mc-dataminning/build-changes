import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byt extends bxx implements bnb {
   private static final int bT = 40;
   private static final agm<Byte> bU = agp.a(byt.class, ago.a);
   private static final Map<cll, ctn> bW = ac.a(Maps.newEnumMap(cll.class), $$0 -> {
      $$0.put(cll.a, cwr.bA);
      $$0.put(cll.b, cwr.bB);
      $$0.put(cll.c, cwr.bC);
      $$0.put(cll.d, cwr.bD);
      $$0.put(cll.e, cwr.bE);
      $$0.put(cll.f, cwr.bF);
      $$0.put(cll.g, cwr.bG);
      $$0.put(cll.h, cwr.bH);
      $$0.put(cll.i, cwr.bI);
      $$0.put(cll.j, cwr.bJ);
      $$0.put(cll.k, cwr.bK);
      $$0.put(cll.l, cwr.bL);
      $$0.put(cll.m, cwr.bM);
      $$0.put(cll.n, cwr.bN);
      $$0.put(cll.o, cwr.bO);
      $$0.put(cll.p, cwr.bP);
   });
   private static final Map<cll, float[]> bX = Maps.newEnumMap(Arrays.stream(cll.values()).collect(Collectors.toMap($$0 -> (cll)$$0, byt::c)));
   private int bY;
   private bsy bZ;

   private static float[] c(cll $$0) {
      if ($$0 == cll.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(cll $$0) {
      return bX.get($$0);
   }

   public byt(bly<? extends byt> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bZ = new bsy(this);
      this.bO.a(0, new bta(this));
      this.bO.a(1, new btz(this, 1.25));
      this.bO.a(2, new bss(this, 1.0));
      this.bO.a(3, new buo(this, 1.1, cpy.a(cna.pt), false));
      this.bO.a(4, new btf(this, 1.1));
      this.bO.a(5, this.bZ);
      this.bO.a(6, new but(this, 1.0));
      this.bO.a(7, new bto(this, cfh.class, 6.0F));
      this.bO.a(8, new bub(this));
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

   public static bnp.a u() {
      return bmm.C().a(bnq.l, 8.0).a(bnq.m, 0.23F);
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
            case a -> egt.ac;
            case b -> egt.ad;
            case c -> egt.ae;
            case d -> egt.af;
            case e -> egt.ag;
            case f -> egt.ah;
            case g -> egt.ai;
            case h -> egt.aj;
            case i -> egt.ak;
            case j -> egt.al;
            case k -> egt.am;
            case l -> egt.an;
            case m -> egt.ao;
            case n -> egt.ap;
            case o -> egt.aq;
            case p -> egt.ar;
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
         return (float) (Math.PI / 5) + 0.21991149F * aun.a($$1 * 28.7F);
      } else {
         return this.bY > 0 ? (float) (Math.PI / 5) : this.dE() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bka b(cfh $$0, bjz $$1) {
      cmx $$2 = $$0.b($$1);
      if ($$2.a(cna.rS)) {
         if (!this.dM().B && this.a()) {
            this.a(ars.h);
            this.a(dnq.M, $$0);
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            return bka.a;
         } else {
            return bka.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ars $$0) {
      this.dM().a(null, this, arr.vE, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ag.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cbt $$3 = this.a(bW.get(this.w()), 1);
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
      this.b(cll.a($$0.f("Color")));
   }

   @Override
   protected arq y() {
      return arr.vB;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.vD;
   }

   @Override
   protected arq n_() {
      return arr.vC;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(arr.vF, 0.15F, 1.0F);
   }

   public cll w() {
      return cll.a(this.an.b(bU) & 15);
   }

   public void b(cll $$0) {
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

   public static cll a(auu $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cll.p;
      } else if ($$1 < 10) {
         return cll.h;
      } else if ($$1 < 15) {
         return cll.i;
      } else if ($$1 < 18) {
         return cll.m;
      } else {
         return $$0.a(500) == 0 ? cll.g : cll.a;
      }
   }

   @Nullable
   public byt b(and $$0, blp $$1) {
      byt $$2 = bly.aG.a((cto)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (byt)$$1));
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
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      this.b(a($$0.F_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private cll a(bxx $$0, bxx $$1) {
      cll $$2 = ((byt)$$0).w();
      cll $$3 = ((byt)$$1).w();
      ciq $$4 = a($$2, $$3);
      return this.dM()
         .r()
         .a(cqg.a, $$4, this.dM())
         .map($$1x -> ((cps)$$1x.b()).a($$4, this.dM().I_()))
         .map(cmx::d)
         .filter(clm.class::isInstance)
         .map(clm.class::cast)
         .map(clm::d)
         .orElseGet(() -> this.dM().z.h() ? $$2 : $$3);
   }

   private static ciq a(cll $$0, cll $$1) {
      ciq $$2 = new cka(new cia(null, -1) {
         @Override
         public cmx a(cfh $$0, int $$1) {
            return cmx.f;
         }

         @Override
         public boolean a(cfh $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cmx(clm.a($$0)));
      $$2.a(1, new cmx(clm.a($$1)));
      return $$2;
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return 0.95F * $$1.b;
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
