import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bsh extends brl implements bgr {
   private static final int bT = 40;
   private static final aby<Byte> bU = acb.a(bsh.class, aca.a);
   private static final Map<cen, cml> bW = ac.a(Maps.newEnumMap(cen.class), $$0 -> {
      $$0.put(cen.a, cpo.bA);
      $$0.put(cen.b, cpo.bB);
      $$0.put(cen.c, cpo.bC);
      $$0.put(cen.d, cpo.bD);
      $$0.put(cen.e, cpo.bE);
      $$0.put(cen.f, cpo.bF);
      $$0.put(cen.g, cpo.bG);
      $$0.put(cen.h, cpo.bH);
      $$0.put(cen.i, cpo.bI);
      $$0.put(cen.j, cpo.bJ);
      $$0.put(cen.k, cpo.bK);
      $$0.put(cen.l, cpo.bL);
      $$0.put(cen.m, cpo.bM);
      $$0.put(cen.n, cpo.bN);
      $$0.put(cen.o, cpo.bO);
      $$0.put(cen.p, cpo.bP);
   });
   private static final Map<cen, float[]> bX = Maps.newEnumMap(Arrays.stream(cen.values()).collect(Collectors.toMap($$0 -> (cen)$$0, bsh::c)));
   private int bY;
   private bmn bZ;

   private static float[] c(cen $$0) {
      if ($$0 == cen.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(cen $$0) {
      return bX.get($$0);
   }

   public bsh(bfn<? extends bsh> $$0, cmm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void x() {
      this.bZ = new bmn(this);
      this.bO.a(0, new bmp(this));
      this.bO.a(1, new bno(this, 1.25));
      this.bO.a(2, new bmh(this, 1.0));
      this.bO.a(3, new bod(this, 1.1, ciz.a(cgc.oI), false));
      this.bO.a(4, new bmu(this, 1.1));
      this.bO.a(5, this.bZ);
      this.bO.a(6, new boi(this, 1.0));
      this.bO.a(7, new bnd(this, byo.class, 6.0F));
      this.bO.a(8, new bnq(this));
   }

   @Override
   protected void W() {
      this.bY = this.bZ.h();
      super.W();
   }

   @Override
   public void b_() {
      if (this.dI().B) {
         this.bY = Math.max(0, this.bY - 1);
      }

      super.b_();
   }

   public static bhf.a q() {
      return bgb.y().a(bhg.a, 8.0).a(bhg.d, 0.23F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(bU, (byte)0);
   }

   @Override
   public acq Q() {
      if (this.w()) {
         return this.ae().j();
      } else {
         return switch (this.r()) {
            case a -> dzg.S;
            case b -> dzg.T;
            case c -> dzg.U;
            case d -> dzg.V;
            case e -> dzg.W;
            case f -> dzg.X;
            case g -> dzg.Y;
            case h -> dzg.Z;
            case i -> dzg.aa;
            case j -> dzg.ab;
            case k -> dzg.ac;
            case l -> dzg.ad;
            case m -> dzg.ae;
            case n -> dzg.af;
            case o -> dzg.ag;
            case p -> dzg.ah;
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

   public float D(float $$0) {
      if (this.bY <= 0) {
         return 0.0F;
      } else if (this.bY >= 4 && this.bY <= 36) {
         return 1.0F;
      } else {
         return this.bY < 4 ? ((float)this.bY - $$0) / 4.0F : -((float)(this.bY - 40) - $$0) / 4.0F;
      }
   }

   public float E(float $$0) {
      if (this.bY > 4 && this.bY <= 36) {
         float $$1 = ((float)(this.bY - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * apa.a($$1 * 28.7F);
      } else {
         return this.bY > 0 ? (float) (Math.PI / 5) : this.dA() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bdx b(byo $$0, bdw $$1) {
      cfz $$2 = $$0.b($$1);
      if ($$2.a(cgc.rg)) {
         if (!this.dI().B && this.a()) {
            this.a(ami.h);
            this.a(dgl.N, $$0);
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            return bdx.a;
         } else {
            return bdx.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ami $$0) {
      this.dI().a(null, this, amh.uO, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.af.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         bvh $$3 = this.a(bW.get(this.r()), 1);
         if ($$3 != null) {
            $$3.f($$3.dl().b((double)((this.af.i() - this.af.i()) * 0.1F), (double)(this.af.i() * 0.05F), (double)((this.af.i() - this.af.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bs() && !this.w() && !this.h_();
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Sheared", this.w());
      $$0.a("Color", (byte)this.r().a());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(cen.a($$0.f("Color")));
   }

   @Override
   protected amg s() {
      return amh.uL;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.uN;
   }

   @Override
   protected amg g_() {
      return amh.uM;
   }

   @Override
   protected void b(gu $$0, dcb $$1) {
      this.a(amh.uP, 0.15F, 1.0F);
   }

   public cen r() {
      return cen.a(this.am.b(bU) & 15);
   }

   public void b(cen $$0) {
      byte $$1 = this.am.b(bU);
      this.am.b(bU, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean w() {
      return (this.am.b(bU) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.am.b(bU);
      if ($$0) {
         this.am.b(bU, (byte)($$1 | 16));
      } else {
         this.am.b(bU, (byte)($$1 & -17));
      }
   }

   public static cen a(apf $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cen.p;
      } else if ($$1 < 10) {
         return cen.h;
      } else if ($$1 < 15) {
         return cen.i;
      } else if ($$1 < 18) {
         return cen.m;
      } else {
         return $$0.a(500) == 0 ? cen.g : cen.a;
      }
   }

   @Nullable
   public bsh b(aif $$0, bfe $$1) {
      bsh $$2 = bfn.aF.a((cmm)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (bsh)$$1));
      }

      return $$2;
   }

   @Override
   public void L() {
      super.L();
      this.w(false);
      if (this.h_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      this.b(a($$0.y_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private cen a(brl $$0, brl $$1) {
      cen $$2 = ((bsh)$$0).r();
      cen $$3 = ((bsh)$$1).r();
      cbt $$4 = a($$2, $$3);
      return this.dI()
         .q()
         .a(cjf.a, $$4, this.dI())
         .map($$1x -> $$1x.a($$4, this.dI().B_()))
         .map(cfz::d)
         .filter(ceo.class::isInstance)
         .map(ceo.class::cast)
         .map(ceo::d)
         .orElseGet(() -> this.dI().z.h() ? $$2 : $$3);
   }

   private static cbt a(cen $$0, cen $$1) {
      cbt $$2 = new cdc(new cbf(null, -1) {
         @Override
         public cfz a(byo $$0, int $$1) {
            return cfz.b;
         }

         @Override
         public boolean a(byo $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cfz(ceo.a($$0)));
      $$2.a(1, new cfz(ceo.a($$1)));
      return $$2;
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return 0.95F * $$1.b;
   }
}
