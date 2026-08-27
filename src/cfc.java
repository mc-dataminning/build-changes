import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cfc extends ceg implements bth {
   private static final int bY = 40;
   private static final ajs<Byte> bZ = ajw.a(cfc.class, aju.a);
   private static final Map<csj, day> cb = ac.a(Maps.newEnumMap(csj.class), $$0 -> {
      $$0.put(csj.a, dec.bA);
      $$0.put(csj.b, dec.bB);
      $$0.put(csj.c, dec.bC);
      $$0.put(csj.d, dec.bD);
      $$0.put(csj.e, dec.bE);
      $$0.put(csj.f, dec.bF);
      $$0.put(csj.g, dec.bG);
      $$0.put(csj.h, dec.bH);
      $$0.put(csj.i, dec.bI);
      $$0.put(csj.j, dec.bJ);
      $$0.put(csj.k, dec.bK);
      $$0.put(csj.l, dec.bL);
      $$0.put(csj.m, dec.bM);
      $$0.put(csj.n, dec.bN);
      $$0.put(csj.o, dec.bO);
      $$0.put(csj.p, dec.bP);
   });
   private static final Map<csj, float[]> cc = Maps.newEnumMap(Arrays.stream(csj.values()).collect(Collectors.toMap($$0 -> (csj)$$0, cfc::c)));
   private int cd;
   private bzg ce;

   private static float[] c(csj $$0) {
      if ($$0 == csj.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(csj $$0) {
      return cc.get($$0);
   }

   public cfc(bsc<? extends cfc> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.ce = new bzg(this);
      this.bS.a(0, new bzi(this));
      this.bS.a(1, new cah(this, 1.25));
      this.bS.a(2, new bza(this, 1.0));
      this.bS.a(3, new caw(this, 1.1, $$0 -> $$0.a(awf.ac), false));
      this.bS.a(4, new bzn(this, 1.1));
      this.bS.a(5, this.ce);
      this.bS.a(6, new cbb(this, 1.0));
      this.bS.a(7, new bzw(this, cly.class, 6.0F));
      this.bS.a(8, new caj(this));
   }

   @Override
   public boolean o(ctq $$0) {
      return $$0.a(awf.ac);
   }

   @Override
   protected void Y() {
      this.cd = this.ce.h();
      super.Y();
   }

   @Override
   public void n_() {
      if (this.dP().B) {
         this.cd = Math.max(0, this.cd - 1);
      }

      super.n_();
   }

   public static btx.a s() {
      return bss.A().a(bty.q, 8.0).a(bty.r, 0.23F);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
   }

   @Override
   public akm<epm> S() {
      if (this.y()) {
         return this.ak().k();
      } else {
         return switch (this.u()) {
            case a -> epf.ak;
            case b -> epf.al;
            case c -> epf.am;
            case d -> epf.an;
            case e -> epf.ao;
            case f -> epf.ap;
            case g -> epf.aq;
            case h -> epf.ar;
            case i -> epf.as;
            case j -> epf.at;
            case k -> epf.au;
            case l -> epf.av;
            case m -> epf.aw;
            case n -> epf.ax;
            case o -> epf.ay;
            case p -> epf.az;
         };
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.cd = 40;
      } else {
         super.b($$0);
      }
   }

   public float G(float $$0) {
      if (this.cd <= 0) {
         return 0.0F;
      } else if (this.cd >= 4 && this.cd <= 36) {
         return 1.0F;
      } else {
         return this.cd < 4 ? ((float)this.cd - $$0) / 4.0F : -((float)(this.cd - 40) - $$0) / 4.0F;
      }
   }

   public float H(float $$0) {
      if (this.cd > 4 && this.cd <= 36) {
         float $$1 = ((float)(this.cd - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * ayf.a($$1 * 28.7F);
      } else {
         return this.cd > 0 ? (float) (Math.PI / 5) : this.dH() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      if ($$2.a(ctt.rV)) {
         if (!this.dP().B && this.a()) {
            this.a(avj.h);
            this.a(dvw.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bpw.a;
         } else {
            return bpw.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(avj $$0) {
      this.dP().a(null, this, avi.wy, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ah.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cii $$3 = this.a(cb.get(this.u()), 1);
         if ($$3 != null) {
            $$3.g($$3.ds().b((double)((this.ah.i() - this.ah.i()) * 0.1F), (double)(this.ah.i() * 0.05F), (double)((this.ah.i() - this.ah.i()) * 0.1F)));
         }
      }
   }

   @Override
   public boolean a() {
      return this.bD() && !this.y() && !this.p_();
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("Sheared", this.y());
      $$0.a("Color", (byte)this.u().a());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(csj.a($$0.f("Color")));
   }

   @Override
   protected avh v() {
      return avi.wv;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.wx;
   }

   @Override
   protected avh o_() {
      return avi.ww;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.wz, 0.15F, 1.0F);
   }

   public csj u() {
      return csj.a(this.ao.a(bZ) & 15);
   }

   public void b(csj $$0) {
      byte $$1 = this.ao.a(bZ);
      this.ao.a(bZ, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean y() {
      return (this.ao.a(bZ) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.ao.a(bZ);
      if ($$0) {
         this.ao.a(bZ, (byte)($$1 | 16));
      } else {
         this.ao.a(bZ, (byte)($$1 & -17));
      }
   }

   public static csj a(aym $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return csj.p;
      } else if ($$1 < 10) {
         return csj.h;
      } else if ($$1 < 15) {
         return csj.i;
      } else if ($$1 < 18) {
         return csj.m;
      } else {
         return $$0.a(500) == 0 ? csj.g : csj.a;
      }
   }

   @Nullable
   public cfc b(aqn $$0, brq $$1) {
      cfc $$2 = bsc.aJ.a((daz)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cfc)$$1));
      }

      return $$2;
   }

   @Override
   public void N() {
      super.N();
      this.w(false);
      if (this.p_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private csj a(ceg $$0, ceg $$1) {
      csj $$2 = ((cfc)$$0).u();
      csj $$3 = ((cfc)$$1).u();
      cpl $$4 = a($$2, $$3);
      return this.dP()
         .r()
         .a(cyb.a, $$4, this.dP())
         .map($$1x -> ((cxn)$$1x.b()).a($$4, this.dP().H_()))
         .map(ctq::g)
         .filter(csk.class::isInstance)
         .map(csk.class::cast)
         .map(csk::c)
         .orElseGet(() -> this.dP().z.h() ? $$2 : $$3);
   }

   private static cpl a(csj $$0, csj $$1) {
      cpl $$2 = new cqx(new cov(null, -1) {
         @Override
         public ctq a(cly $$0, int $$1) {
            return ctq.i;
         }

         @Override
         public boolean a(cly $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new ctq(csk.a($$0)));
      $$2.a(1, new ctq(csk.a($$1)));
      return $$2;
   }
}
