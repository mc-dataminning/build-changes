import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cgw extends cga implements bva {
   private static final int bY = 40;
   private static final akg<Byte> bZ = akk.a(cgw.class, aki.a);
   private static final Map<cuj, Integer> ca = Maps.newEnumMap(Arrays.stream(cuj.values()).collect(Collectors.toMap($$0 -> (cuj)$$0, cgw::c)));
   private int cc;
   private caz cd;

   private static int c(cuj $$0) {
      if ($$0 == cuj.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return axo.a(255, azd.d((float)axo.b($$1) * 0.75F), azd.d((float)axo.c($$1) * 0.75F), azd.d((float)axo.d($$1) * 0.75F));
      }
   }

   public static int a(cuj $$0) {
      return ca.get($$0);
   }

   public cgw(btv<? extends cgw> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.cd = new caz(this);
      this.bS.a(0, new cbb(this));
      this.bS.a(1, new cca(this, 1.25));
      this.bS.a(2, new cat(this, 1.0));
      this.bS.a(3, new ccp(this, 1.1, $$0 -> $$0.a(axc.ac), false));
      this.bS.a(4, new cbg(this, 1.1));
      this.bS.a(5, this.cd);
      this.bS.a(6, new ccu(this, 1.0));
      this.bS.a(7, new cbp(this, cnu.class, 6.0F));
      this.bS.a(8, new ccc(this));
   }

   @Override
   public boolean n(cvp $$0) {
      return $$0.a(axc.ac);
   }

   @Override
   protected void ad() {
      this.cc = this.cd.h();
      super.ad();
   }

   @Override
   public void m_() {
      if (this.dS().B) {
         this.cc = Math.max(0, this.cc - 1);
      }

      super.m_();
   }

   public static bvq.a q() {
      return cga.gu().a(bvr.s, 8.0).a(bvr.v, 0.23F);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
   }

   @Override
   public alb<etm> X() {
      return this.y() ? this.ao().k() : etd.am.get(this.t());
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
         return (float) (Math.PI / 5) + 0.21991149F * azd.a($$1 * 28.7F);
      } else {
         return this.cc > 0 ? (float) (Math.PI / 5) : this.dK() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      if ($$2.a(cvt.rW)) {
         if (!this.dS().B && this.a()) {
            this.a(awf.h);
            this.a(dzl.M, $$0);
            $$2.a(1, $$0, d($$1));
            return brp.b;
         } else {
            return brp.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(awf $$0) {
      this.dS().a(null, this, awe.wC, $$0, 1.0F, 1.0F);
      this.x(true);
      this.a(etd.an.get(this.t()), $$0x -> {
         for (int $$1 = 0; $$1 < $$0x.J(); $$1++) {
            cke $$2 = this.a($$0x.c(1), 1.0F);
            if ($$2 != null) {
               $$2.h($$2.dv().b((double)((this.af.i() - this.af.i()) * 0.1F), (double)(this.af.i() * 0.05F), (double)((this.af.i() - this.af.i()) * 0.1F)));
            }
         }
      });
   }

   @Override
   public boolean a() {
      return this.bI() && !this.y() && !this.o_();
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Sheared", this.y());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.x($$0.q("Sheared"));
      this.b(cuj.a($$0.f("Color")));
   }

   @Override
   protected awd w() {
      return awe.wz;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.wB;
   }

   @Override
   protected awd n_() {
      return awe.wA;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.wD, 0.15F, 1.0F);
   }

   public cuj t() {
      return cuj.a(this.am.a(bZ) & 15);
   }

   public void b(cuj $$0) {
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

   public static cuj a(azl $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cuj.p;
      } else if ($$1 < 10) {
         return cuj.h;
      } else if ($$1 < 15) {
         return cuj.i;
      } else if ($$1 < 18) {
         return cuj.m;
      } else {
         return $$0.a(500) == 0 ? cuj.g : cuj.a;
      }
   }

   @Nullable
   public cgw b(arh $$0, bth $$1) {
      cgw $$2 = btv.aJ.a($$0, btu.e);
      if ($$2 != null) {
         $$2.b(this.a(this, (cgw)$$1));
      }

      return $$2;
   }

   @Override
   public void S() {
      super.S();
      this.x(false);
      if (this.o_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      this.b(a($$0.C_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cuj a(cga $$0, cga $$1) {
      cuj $$2 = ((cgw)$$0).t();
      cuj $$3 = ((cgw)$$1).t();
      czw $$4 = a($$2, $$3);
      return this.dS()
         .r()
         .a(dan.a, $$4, this.dS())
         .map($$1x -> ((czx)$$1x.b()).a($$4, this.dS().F_()))
         .map(cvp::h)
         .filter(cuk.class::isInstance)
         .map(cuk.class::cast)
         .map(cuk::c)
         .orElseGet(() -> this.dS().z.h() ? $$2 : $$3);
   }

   private static czw a(cuj $$0, cuj $$1) {
      return czw.a(2, 1, List.of(new cvp(cuk.a($$0)), new cvp(cuk.a($$1))));
   }
}
