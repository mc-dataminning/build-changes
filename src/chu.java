import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class chu extends cgy implements bvy {
   private static final int bY = 40;
   private static final akm<Byte> bZ = akq.a(chu.class, ako.a);
   private static final Map<cvj, Integer> ca = Maps.newEnumMap(Arrays.stream(cvj.values()).collect(Collectors.toMap($$0 -> (cvj)$$0, chu::c)));
   private int cc;
   private cbx cd;

   private static int c(cvj $$0) {
      if ($$0 == cvj.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return axx.a(255, azm.d((float)axx.b($$1) * 0.75F), azm.d((float)axx.c($$1) * 0.75F), azm.d((float)axx.d($$1) * 0.75F));
      }
   }

   public static int a(cvj $$0) {
      return ca.get($$0);
   }

   public chu(bus<? extends chu> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.cd = new cbx(this);
      this.bS.a(0, new cbz(this));
      this.bS.a(1, new ccy(this, 1.25));
      this.bS.a(2, new cbr(this, 1.0));
      this.bS.a(3, new cdn(this, 1.1, $$0 -> $$0.a(axl.ag), false));
      this.bS.a(4, new cce(this, 1.1));
      this.bS.a(5, this.cd);
      this.bS.a(6, new cds(this, 1.0));
      this.bS.a(7, new ccn(this, cou.class, 6.0F));
      this.bS.a(8, new cda(this));
   }

   @Override
   public boolean j(cwm $$0) {
      return $$0.a(axl.ag);
   }

   @Override
   protected void a(arp $$0) {
      this.cc = this.cd.h();
      super.a($$0);
   }

   @Override
   public void d_() {
      if (this.dV().C) {
         this.cc = Math.max(0, this.cc - 1);
      }

      super.d_();
   }

   public static bwo.a n() {
      return cgy.gr().a(bwp.s, 8.0).a(bwp.v, 0.23F);
   }

   @Override
   protected void a(akq.a $$0) {
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
         return (float) (Math.PI / 5) + 0.21991149F * azm.a($$1 * 28.7F);
      } else {
         return this.cc > 0 ? (float) (Math.PI / 5) : this.dN() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if ($$2.a(cwq.sm)) {
         if (this.dV() instanceof arp $$3 && this.a()) {
            this.a($$3, awo.h, $$2);
            this.a(ear.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bsk.b;
         }

         return bsk.c;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(arp $$0, awo $$1, cwm $$2) {
      $$0.a(null, this, awn.wA, $$1, 1.0F, 1.0F);
      this.a($$0, euj.aV, $$2, ($$0x, $$1x) -> {
         for (int $$2x = 0; $$2x < $$1x.L(); $$2x++) {
            clc $$3 = this.a($$0x, $$1x.c(1), 1.0F);
            if ($$3 != null) {
               $$3.h($$3.dy().b((double)((this.ae.i() - this.ae.i()) * 0.1F), (double)(this.ae.i() * 0.05F), (double)((this.ae.i() - this.ae.i()) * 0.1F)));
            }
         }
      });
      this.x(true);
   }

   @Override
   public boolean a() {
      return this.bL() && !this.v() && !this.e_();
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("Sheared", this.v());
      $$0.a("Color", (byte)this.q().a());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.x($$0.q("Sheared"));
      this.b(cvj.a($$0.f("Color")));
   }

   @Override
   protected awm t() {
      return awn.wx;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.wz;
   }

   @Override
   protected awm n_() {
      return awn.wy;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.wB, 0.15F, 1.0F);
   }

   public cvj q() {
      return cvj.a(this.al.a(bZ) & 15);
   }

   public void b(cvj $$0) {
      byte $$1 = this.al.a(bZ);
      this.al.a(bZ, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean v() {
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

   public static cvj a(azu $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cvj.p;
      } else if ($$1 < 10) {
         return cvj.h;
      } else if ($$1 < 15) {
         return cvj.i;
      } else if ($$1 < 18) {
         return cvj.m;
      } else {
         return $$0.a(500) == 0 ? cvj.g : cvj.a;
      }
   }

   @Nullable
   public chu b(arp $$0, buc $$1) {
      chu $$2 = bus.aX.a($$0, bur.e);
      if ($$2 != null) {
         $$2.b(this.a(this, (chu)$$1));
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
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      this.b(a($$0.G_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cvj a(cgy $$0, cgy $$1) {
      cvj $$2 = ((chu)$$0).q();
      cvj $$3 = ((chu)$$1).q();
      dap $$4 = a($$2, $$3);
      return this.dV()
         .s()
         .a(dbg.a, $$4, this.dV())
         .map($$1x -> ((daq)$$1x.b()).a($$4, this.dV().J_()))
         .map(cwm::h)
         .filter(cvk.class::isInstance)
         .map(cvk.class::cast)
         .map(cvk::b)
         .orElseGet(() -> this.dV().A.h() ? $$2 : $$3);
   }

   private static dap a(cvj $$0, cvj $$1) {
      return dap.a(2, 1, List.of(new cwm(cvk.a($$0)), new cwm(cvk.a($$1))));
   }
}
