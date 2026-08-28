import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class chs extends cgw implements bvw {
   private static final int bY = 40;
   private static final ajx<Byte> bZ = akb.a(chs.class, ajz.a);
   private static final Map<cvk, Integer> ca = Maps.newEnumMap(Arrays.stream(cvk.values()).collect(Collectors.toMap($$0 -> (cvk)$$0, chs::c)));
   private int cc;
   private cbv cd;

   private static int c(cvk $$0) {
      if ($$0 == cvk.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return axj.a(255, ayy.d((float)axj.b($$1) * 0.75F), ayy.d((float)axj.c($$1) * 0.75F), ayy.d((float)axj.d($$1) * 0.75F));
      }
   }

   public static int a(cvk $$0) {
      return ca.get($$0);
   }

   public chs(buq<? extends chs> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.cd = new cbv(this);
      this.bS.a(0, new cbx(this));
      this.bS.a(1, new ccw(this, 1.25));
      this.bS.a(2, new cbp(this, 1.0));
      this.bS.a(3, new cdl(this, 1.1, $$0 -> $$0.a(awx.af), false));
      this.bS.a(4, new ccc(this, 1.1));
      this.bS.a(5, this.cd);
      this.bS.a(6, new cdq(this, 1.0));
      this.bS.a(7, new ccl(this, cov.class, 6.0F));
      this.bS.a(8, new ccy(this));
   }

   @Override
   public boolean j(cwn $$0) {
      return $$0.a(awx.af);
   }

   @Override
   protected void a(arc $$0) {
      this.cc = this.cd.h();
      super.a($$0);
   }

   @Override
   public void d_() {
      if (this.dW().C) {
         this.cc = Math.max(0, this.cc - 1);
      }

      super.d_();
   }

   public static bwm.a p() {
      return cgw.gu().a(bwn.s, 8.0).a(bwn.v, 0.23F);
   }

   @Override
   protected void a(akb.a $$0) {
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
         return (float) (Math.PI / 5) + 0.21991149F * ayy.a($$1 * 28.7F);
      } else {
         return this.cc > 0 ? (float) (Math.PI / 5) : this.dO() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      if ($$2.a(cwr.sS)) {
         if (this.dW() instanceof arc $$3 && this.a()) {
            this.a($$3, awa.h, $$2);
            this.a(ebr.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bsi.b;
         }

         return bsi.c;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(arc $$0, awa $$1, cwn $$2) {
      $$0.a(null, this, avz.xb, $$1, 1.0F, 1.0F);
      this.a($$0, evl.aV, $$2, ($$0x, $$1x) -> {
         for (int $$2x = 0; $$2x < $$1x.M(); $$2x++) {
            cla $$3 = this.a($$0x, $$1x.c(1), 1.0F);
            if ($$3 != null) {
               $$3.h($$3.dz().b((double)((this.ae.i() - this.ae.i()) * 0.1F), (double)(this.ae.i() * 0.05F), (double)((this.ae.i() - this.ae.i()) * 0.1F)));
            }
         }
      });
      this.x(true);
   }

   @Override
   public boolean a() {
      return this.bL() && !this.x() && !this.e_();
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Sheared", this.x());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.x($$0.q("Sheared"));
      this.b(cvk.a($$0.f("Color")));
   }

   @Override
   protected avy u() {
      return avz.wY;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.xa;
   }

   @Override
   protected avy o_() {
      return avz.wZ;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.xc, 0.15F, 1.0F);
   }

   public cvk t() {
      return cvk.a(this.al.a(bZ) & 15);
   }

   public void b(cvk $$0) {
      byte $$1 = this.al.a(bZ);
      this.al.a(bZ, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean x() {
      return (this.al.a(bZ) & 16) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.al.a(bZ);
      if ($$0) {
         this.al.a(bZ, (byte)($$1 | 16));
      } else {
         this.al.a(bZ, (byte)($$1 & -17));
      }
   }

   public static cvk a(azg $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cvk.p;
      } else if ($$1 < 10) {
         return cvk.h;
      } else if ($$1 < 15) {
         return cvk.i;
      } else if ($$1 < 18) {
         return cvk.m;
      } else {
         return $$0.a(500) == 0 ? cvk.g : cvk.a;
      }
   }

   @Nullable
   public chs b(arc $$0, bua $$1) {
      chs $$2 = buq.ba.a($$0, bup.e);
      if ($$2 != null) {
         cvk $$3 = this.t();
         cvk $$4 = ((chs)$$1).t();
         $$2.b(cvk.a($$0, $$3, $$4));
      }

      return $$2;
   }

   @Override
   public void P() {
      super.P();
      this.x(false);
      if (this.e_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      this.b(a($$0.H_()));
      return super.a($$0, $$1, $$2, $$3);
   }
}
