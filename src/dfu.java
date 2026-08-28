import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dfu extends dfk {
   public static final MapCodec<dfu> a = b(dfu::new);
   public static final dtw b = dju.aE;
   public static final dua<dtq> c = dts.V;
   public static final dtt d = dts.w;
   private static final ext f = dfy.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final ext g = dfy.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final ext h = dfy.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final ext i = dfy.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final ext j = exq.a(i, h);
   private static final ext k = exq.a(j, dfy.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final ext l = exq.a(j, dfy.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ext m = exq.a(j, dfy.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final ext n = exq.a(j, dfy.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ext o = exq.a(j, dfy.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final ext F = exq.a(j, dfy.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final ext G = exq.a(j, dfy.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dfu> a() {
      return a;
   }

   public dfu(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c).a(c, dtq.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dcw $$0, dtc $$1, eww $$2, cnp $$3) {
      bsr $$4 = $$3.s();
      cmx $$5 = $$4 instanceof cmx ? (cmx)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      return this.a($$1, $$0, $$4, $$3, true) ? bqr.a($$1.B) : bqr.e;
   }

   public boolean a(dcw $$0, dtc $$1, eww $$2, @Nullable cmx $$3, boolean $$4) {
      ji $$5 = $$2.b();
      jd $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(avz.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dtc $$0, ji $$1, double $$2) {
      if ($$1.o() != ji.a.b && !($$2 > 0.8124F)) {
         ji $$3 = $$0.c(b);
         dtq $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(dcw $$0, jd $$1, @Nullable ji $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bsr $$0, dcw $$1, jd $$2, @Nullable ji $$3) {
      dqh $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dqf) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dqf)$$4).a($$3);
         $$1.a(null, $$2, avp.bZ, avq.e, 2.0F, 1.0F);
         $$1.a($$0, dxz.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private ext m(dtc $$0) {
      ji $$1 = $$0.c(b);
      dtq $$2 = $$0.c(c);
      if ($$2 == dtq.a) {
         return $$1 != ji.c && $$1 != ji.d ? g : f;
      } else if ($$2 == dtq.b) {
         return G;
      } else if ($$2 == dtq.d) {
         return $$1 != ji.c && $$1 != ji.d ? l : k;
      } else if ($$1 == ji.c) {
         return o;
      } else if ($$1 == ji.d) {
         return F;
      } else {
         return $$1 == ji.f ? n : m;
      }
   }

   @Override
   protected ext b(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return this.m($$0);
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return this.m($$0);
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      ji $$1 = $$0.k();
      jd $$2 = $$0.a();
      dcw $$3 = $$0.q();
      ji.a $$4 = $$1.o();
      if ($$4 == ji.a.b) {
         dtc $$5 = this.o().a(c, $$1 == ji.a ? dtq.b : dtq.a).a(b, $$0.g());
         if ($$5.a((dcz)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ji.a.a && $$3.a_($$2.h()).d($$3, $$2.h(), ji.f) && $$3.a_($$2.i()).d($$3, $$2.i(), ji.e)
            || $$4 == ji.a.c && $$3.a_($$2.f()).d($$3, $$2.f(), ji.d) && $$3.a_($$2.g()).d($$3, $$2.g(), ji.c);
         dtc $$7 = this.o().a(b, $$1.g()).a(c, $$6 ? dtq.d : dtq.c);
         if ($$7.a((dcz)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).d($$3, $$2.e(), ji.b);
         $$7 = $$7.a(c, $$8 ? dtq.a : dtq.b);
         if ($$7.a((dcz)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dco $$3, BiConsumer<cuq, jd> $$4) {
      if ($$3.n()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      dtq $$6 = $$0.c(c);
      ji $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dtq.d) {
         return dga.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dtq.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dtq.c).a(b, $$1.g());
            }

            if ($$6 == dtq.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dtq.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      ji $$3 = n($$0).g();
      return $$3 == ji.b ? dfy.a($$1, $$2.d(), ji.a) : dis.b($$1, $$2, $$3);
   }

   private static ji n(dtc $$0) {
      switch ((dtq)$$0.c(c)) {
         case a:
            return ji.b;
         case b:
            return ji.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dqf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return a($$2, dqj.E, $$0.B ? dqf::a : dqf::b);
   }

   @Override
   protected boolean a(dtc $$0, epr $$1) {
      return false;
   }

   @Override
   public dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
