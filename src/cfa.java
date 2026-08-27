import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cfa extends cee implements btf {
   private static final int bY = 40;
   private static final ajr<Byte> bZ = ajv.a(cfa.class, ajt.a);
   private static final Map<csh, daw> cb = ac.a(Maps.newEnumMap(csh.class), $$0 -> {
      $$0.put(csh.a, dea.bA);
      $$0.put(csh.b, dea.bB);
      $$0.put(csh.c, dea.bC);
      $$0.put(csh.d, dea.bD);
      $$0.put(csh.e, dea.bE);
      $$0.put(csh.f, dea.bF);
      $$0.put(csh.g, dea.bG);
      $$0.put(csh.h, dea.bH);
      $$0.put(csh.i, dea.bI);
      $$0.put(csh.j, dea.bJ);
      $$0.put(csh.k, dea.bK);
      $$0.put(csh.l, dea.bL);
      $$0.put(csh.m, dea.bM);
      $$0.put(csh.n, dea.bN);
      $$0.put(csh.o, dea.bO);
      $$0.put(csh.p, dea.bP);
   });
   private static final Map<csh, float[]> cc = Maps.newEnumMap(Arrays.stream(csh.values()).collect(Collectors.toMap($$0 -> (csh)$$0, cfa::c)));
   private int cd;
   private bze ce;

   private static float[] c(csh $$0) {
      if ($$0 == csh.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(csh $$0) {
      return cc.get($$0);
   }

   public cfa(bsa<? extends cfa> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.ce = new bze(this);
      this.bS.a(0, new bzg(this));
      this.bS.a(1, new caf(this, 1.25));
      this.bS.a(2, new byy(this, 1.0));
      this.bS.a(3, new cau(this, 1.1, $$0 -> $$0.a(awe.ac), false));
      this.bS.a(4, new bzl(this, 1.1));
      this.bS.a(5, this.ce);
      this.bS.a(6, new caz(this, 1.0));
      this.bS.a(7, new bzu(this, clw.class, 6.0F));
      this.bS.a(8, new cah(this));
   }

   @Override
   public boolean o(cto $$0) {
      return $$0.a(awe.ac);
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

   public static btv.a s() {
      return bsq.A().a(btw.q, 8.0).a(btw.r, 0.23F);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
   }

   @Override
   public akl<epk> S() {
      if (this.y()) {
         return this.ak().k();
      } else {
         return switch (this.u()) {
            case a -> epd.ak;
            case b -> epd.al;
            case c -> epd.am;
            case d -> epd.an;
            case e -> epd.ao;
            case f -> epd.ap;
            case g -> epd.aq;
            case h -> epd.ar;
            case i -> epd.as;
            case j -> epd.at;
            case k -> epd.au;
            case l -> epd.av;
            case m -> epd.aw;
            case n -> epd.ax;
            case o -> epd.ay;
            case p -> epd.az;
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
         return (float) (Math.PI / 5) + 0.21991149F * ayd.a($$1 * 28.7F);
      } else {
         return this.cd > 0 ? (float) (Math.PI / 5) : this.dH() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      if ($$2.a(ctr.rV)) {
         if (!this.dP().B && this.a()) {
            this.a(avi.h);
            this.a(dvu.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bpu.a;
         } else {
            return bpu.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(avi $$0) {
      this.dP().a(null, this, avh.wy, $$0, 1.0F, 1.0F);
      this.w(true);
      int $$1 = 1 + this.ah.a(3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         cig $$3 = this.a(cb.get(this.u()), 1);
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
      this.b(csh.a($$0.f("Color")));
   }

   @Override
   protected avg v() {
      return avh.wv;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.wx;
   }

   @Override
   protected avg o_() {
      return avh.ww;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.wz, 0.15F, 1.0F);
   }

   public csh u() {
      return csh.a(this.ao.a(bZ) & 15);
   }

   public void b(csh $$0) {
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

   public static csh a(ayk $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return csh.p;
      } else if ($$1 < 10) {
         return csh.h;
      } else if ($$1 < 15) {
         return csh.i;
      } else if ($$1 < 18) {
         return csh.m;
      } else {
         return $$0.a(500) == 0 ? csh.g : csh.a;
      }
   }

   @Nullable
   public cfa b(aqm $$0, bro $$1) {
      cfa $$2 = bsa.aJ.a((dax)$$0);
      if ($$2 != null) {
         $$2.b(this.a(this, (cfa)$$1));
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
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private csh a(cee $$0, cee $$1) {
      csh $$2 = ((cfa)$$0).u();
      csh $$3 = ((cfa)$$1).u();
      cpj $$4 = a($$2, $$3);
      return this.dP()
         .r()
         .a(cxz.a, $$4, this.dP())
         .map($$1x -> ((cxl)$$1x.b()).a($$4, this.dP().H_()))
         .map(cto::g)
         .filter(csi.class::isInstance)
         .map(csi.class::cast)
         .map(csi::c)
         .orElseGet(() -> this.dP().z.h() ? $$2 : $$3);
   }

   private static cpj a(csh $$0, csh $$1) {
      cpj $$2 = new cqv(new cot(null, -1) {
         @Override
         public cto a(clw $$0, int $$1) {
            return cto.i;
         }

         @Override
         public boolean a(clw $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cto(csi.a($$0)));
      $$2.a(1, new cto(csi.a($$1)));
      return $$2;
   }
}
