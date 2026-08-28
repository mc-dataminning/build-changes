import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class chn extends cgr implements bvr {
   private static final int bY = 40;
   private static final akl<Byte> bZ = akp.a(chn.class, akn.a);
   private static final Map<cuy, Integer> ca = Maps.newEnumMap(Arrays.stream(cuy.values()).collect(Collectors.toMap($$0 -> (cuy)$$0, chn::c)));
   private int cc;
   private cbq cd;

   private static int c(cuy $$0) {
      if ($$0 == cuy.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return axv.a(255, azk.d((float)axv.b($$1) * 0.75F), azk.d((float)axv.c($$1) * 0.75F), azk.d((float)axv.d($$1) * 0.75F));
      }
   }

   public static int a(cuy $$0) {
      return ca.get($$0);
   }

   public chn(bul<? extends chn> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.cd = new cbq(this);
      this.bS.a(0, new cbs(this));
      this.bS.a(1, new ccr(this, 1.25));
      this.bS.a(2, new cbk(this, 1.0));
      this.bS.a(3, new cdg(this, 1.1, $$0 -> $$0.a(axj.af), false));
      this.bS.a(4, new cbx(this, 1.1));
      this.bS.a(5, this.cd);
      this.bS.a(6, new cdl(this, 1.0));
      this.bS.a(7, new ccg(this, com.class, 6.0F));
      this.bS.a(8, new cct(this));
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.af);
   }

   @Override
   protected void ac() {
      this.cc = this.cd.h();
      super.ac();
   }

   @Override
   public void n_() {
      if (this.dX().C) {
         this.cc = Math.max(0, this.cc - 1);
      }

      super.n_();
   }

   public static bwh.a q() {
      return cgr.gz().a(bwi.s, 8.0).a(bwi.v, 0.23F);
   }

   @Override
   protected void a(akp.a $$0) {
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
         return (float) (Math.PI / 5) + 0.21991149F * azk.a($$1 * 28.7F);
      } else {
         return this.cc > 0 ? (float) (Math.PI / 5) : this.dP() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if ($$2.a(cwf.rW)) {
         if (!this.dX().C && this.a()) {
            this.a(awm.h, $$2);
            this.a(eag.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bsd.b;
         } else {
            return bsd.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(awm $$0, cwb $$1) {
      this.dX().a(null, this, awl.wA, $$0, 1.0F, 1.0F);
      this.a(ety.aV, $$1, $$0x -> {
         for (int $$1x = 0; $$1x < $$0x.L(); $$1x++) {
            ckv $$2 = this.a($$0x.c(1), 1.0F);
            if ($$2 != null) {
               $$2.h($$2.dA().b((double)((this.af.i() - this.af.i()) * 0.1F), (double)(this.af.i() * 0.05F), (double)((this.af.i() - this.af.i()) * 0.1F)));
            }
         }
      });
      this.x(true);
   }

   @Override
   public boolean a() {
      return this.bM() && !this.y() && !this.p_();
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Sheared", this.y());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.x($$0.q("Sheared"));
      this.b(cuy.a($$0.f("Color")));
   }

   @Override
   protected awk w() {
      return awl.wx;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.wz;
   }

   @Override
   protected awk o_() {
      return awl.wy;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.wB, 0.15F, 1.0F);
   }

   public cuy t() {
      return cuy.a(this.am.a(bZ) & 15);
   }

   public void b(cuy $$0) {
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

   public static cuy a(azs $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cuy.p;
      } else if ($$1 < 10) {
         return cuy.h;
      } else if ($$1 < 15) {
         return cuy.i;
      } else if ($$1 < 18) {
         return cuy.m;
      } else {
         return $$0.a(500) == 0 ? cuy.g : cuy.a;
      }
   }

   @Nullable
   public chn b(arn $$0, btv $$1) {
      chn $$2 = bul.aJ.a($$0, buk.e);
      if ($$2 != null) {
         $$2.b(this.a(this, (chn)$$1));
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
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cuy a(cgr $$0, cgr $$1) {
      cuy $$2 = ((chn)$$0).t();
      cuy $$3 = ((chn)$$1).t();
      dae $$4 = a($$2, $$3);
      return this.dX()
         .r()
         .a(dav.a, $$4, this.dX())
         .map($$1x -> ((daf)$$1x.b()).a($$4, this.dX().H_()))
         .map(cwb::h)
         .filter(cuz.class::isInstance)
         .map(cuz.class::cast)
         .map(cuz::b)
         .orElseGet(() -> this.dX().A.h() ? $$2 : $$3);
   }

   private static dae a(cuy $$0, cuy $$1) {
      return dae.a(2, 1, List.of(new cwb(cuz.a($$0)), new cwb(cuz.a($$1))));
   }
}
