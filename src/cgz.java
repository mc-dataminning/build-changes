import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cgz extends cgd implements bvd {
   private static final int bY = 40;
   private static final akh<Byte> bZ = akl.a(cgz.class, akj.a);
   private static final Map<cum, Integer> ca = Maps.newEnumMap(Arrays.stream(cum.values()).collect(Collectors.toMap($$0 -> (cum)$$0, cgz::c)));
   private int cc;
   private cbc cd;

   private static int c(cum $$0) {
      if ($$0 == cum.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return axq.a(255, azf.d((float)axq.b($$1) * 0.75F), azf.d((float)axq.c($$1) * 0.75F), azf.d((float)axq.d($$1) * 0.75F));
      }
   }

   public static int a(cum $$0) {
      return ca.get($$0);
   }

   public cgz(bty<? extends cgz> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.cd = new cbc(this);
      this.bS.a(0, new cbe(this));
      this.bS.a(1, new ccd(this, 1.25));
      this.bS.a(2, new caw(this, 1.0));
      this.bS.a(3, new ccs(this, 1.1, $$0 -> $$0.a(axe.ac), false));
      this.bS.a(4, new cbj(this, 1.1));
      this.bS.a(5, this.cd);
      this.bS.a(6, new ccx(this, 1.0));
      this.bS.a(7, new cbs(this, cnx.class, 6.0F));
      this.bS.a(8, new ccf(this));
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.ac);
   }

   @Override
   protected void ac() {
      this.cc = this.cd.h();
      super.ac();
   }

   @Override
   public void n_() {
      if (this.dS().B) {
         this.cc = Math.max(0, this.cc - 1);
      }

      super.n_();
   }

   public static bvt.a q() {
      return cgd.gt().a(bvu.s, 8.0).a(bvu.v, 0.23F);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.cc = 40;
      } else {
         super.b($$0);
      }
   }

   public float J(float $$0) {
      if (this.cc <= 0) {
         return 0.0F;
      } else if (this.cc >= 4 && this.cc <= 36) {
         return 1.0F;
      } else {
         return this.cc < 4 ? ((float)this.cc - $$0) / 4.0F : -((float)(this.cc - 40) - $$0) / 4.0F;
      }
   }

   public float K(float $$0) {
      if (this.cc > 4 && this.cc <= 36) {
         float $$1 = ((float)(this.cc - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * azf.a($$1 * 28.7F);
      } else {
         return this.cc > 0 ? (float) (Math.PI / 5) : this.dK() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if ($$2.a(cvw.rW)) {
         if (!this.dS().B && this.a()) {
            this.a(awh.h);
            this.a(dzp.M, $$0);
            $$2.a(1, $$0, d($$1));
            return brs.b;
         } else {
            return brs.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(awh $$0) {
      this.dS().a(null, this, awg.wC, $$0, 1.0F, 1.0F);
      this.a(eth.aR, $$0x -> {
         for (int $$1 = 0; $$1 < $$0x.K(); $$1++) {
            ckh $$2 = this.a($$0x.c(1), 1.0F);
            if ($$2 != null) {
               $$2.h($$2.dv().b((double)((this.af.i() - this.af.i()) * 0.1F), (double)(this.af.i() * 0.05F), (double)((this.af.i() - this.af.i()) * 0.1F)));
            }
         }
      });
      this.x(true);
   }

   @Override
   public boolean a() {
      return this.bI() && !this.y() && !this.p_();
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("Sheared", this.y());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.x($$0.q("Sheared"));
      this.b(cum.a($$0.f("Color")));
   }

   @Override
   protected awf w() {
      return awg.wz;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.wB;
   }

   @Override
   protected awf o_() {
      return awg.wA;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.wD, 0.15F, 1.0F);
   }

   public cum t() {
      return cum.a(this.am.a(bZ) & 15);
   }

   public void b(cum $$0) {
      byte $$1 = this.am.a(bZ);
      this.am.a(bZ, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean y() {
      return (this.am.a(bZ) & 16) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.am.a(bZ);
      if ($$0) {
         this.am.a(bZ, (byte)($$1 | 16));
      } else {
         this.am.a(bZ, (byte)($$1 & -17));
      }
   }

   public static cum a(azn $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cum.p;
      } else if ($$1 < 10) {
         return cum.h;
      } else if ($$1 < 15) {
         return cum.i;
      } else if ($$1 < 18) {
         return cum.m;
      } else {
         return $$0.a(500) == 0 ? cum.g : cum.a;
      }
   }

   @Nullable
   public cgz b(arj $$0, btk $$1) {
      cgz $$2 = bty.aJ.a($$0, btx.e);
      if ($$2 != null) {
         $$2.b(this.a(this, (cgz)$$1));
      }

      return $$2;
   }

   @Override
   public void S() {
      super.S();
      this.x(false);
      if (this.p_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      this.b(a($$0.D_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cum a(cgd $$0, cgd $$1) {
      cum $$2 = ((cgz)$$0).t();
      cum $$3 = ((cgz)$$1).t();
      czz $$4 = a($$2, $$3);
      return this.dS()
         .r()
         .a(daq.a, $$4, this.dS())
         .map($$1x -> ((daa)$$1x.b()).a($$4, this.dS().G_()))
         .map(cvs::h)
         .filter(cun.class::isInstance)
         .map(cun.class::cast)
         .map(cun::c)
         .orElseGet(() -> this.dS().z.h() ? $$2 : $$3);
   }

   private static czz a(cum $$0, cum $$1) {
      return czz.a(2, 1, List.of(new cvs(cun.a($$0)), new cvs(cun.a($$1))));
   }
}
