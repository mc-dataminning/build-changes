import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dmp extends dkg {
   public static final MapCodec<dmp> a = b(dmp::new);
   public static final dzk<jo.a> b = dzc.K;
   public static final dzk<dzg> c = dzc.bD;
   public static final dzd d = dzc.w;

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   protected dmp(dyl.d $$0) {
      super($$0);
      this.l(this.m().b(b, jo.a.b).b(c, dzg.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dwb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      if ($$0.C) {
         return null;
      } else {
         return $$1.c(c) != dzg.a ? a($$2, dvn.k, dwb::a) : null;
      }
   }

   public static boolean a(dhp $$0) {
      return $$0.X();
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if (a($$1)) {
         if ($$0.c(c) != dzg.a) {
            if ($$3.a(16) == 0 && a($$1, $$2)) {
               $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awk.gB, awl.e, 1.0F, 1.0F, false);
            }
         }
      }
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      $$2.a($$3, this, 1);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      dym $$4 = e($$0, $$1, $$2);
      if ($$4 != $$0) {
         $$1.a($$2, $$4, 3);
      }
   }

   private static dym e(dym $$0, dhp $$1, jj $$2) {
      boolean $$3 = b($$0, $$1, $$2);
      boolean $$4 = $$0.c(c) == dzg.a;
      return $$3 && $$4 ? $$0.b(c, a($$1) ? dzg.c : dzg.b) : $$0;
   }

   public static boolean b(dym $$0, dhs $$1, jj $$2) {
      jo.a $$3 = $$0.c(b);

      for (jo $$4 : $$3.g()) {
         dym $$5 = $$1.a_($$2.a($$4));
         if (!$$5.a(awz.w) || $$5.c(b) != $$3) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dhq $$0, jj $$1) {
      for (jo $$2 : jo.values()) {
         jj $$3 = $$1.a($$2);
         dym $$4 = $$0.a_($$3);
         if (!$$4.a(awz.w)) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      return e(this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return drl.b($$0, $$1);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      btm.a($$0, $$1, $$2);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, dhi $$3, BiConsumer<cxy, jj> $$4) {
      if ($$1.c_($$2) instanceof dwb $$5 && $$3 instanceof dif $$6 && $$3.b().a()) {
         $$5.a($$6.k());
         if ($$3.c() instanceof cqi $$7 && $$3.b().a()) {
            this.a($$7, $$0, $$1, $$2);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dym a(dhp $$0, jj $$1, dym $$2, cqi $$3) {
      if ($$0.c_($$1) instanceof dwb $$4) {
         $$4.a($$3.dW().a($$3));
         this.a($$3, $$2, $$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(cqi $$0, dym $$1, dhp $$2, jj $$3) {
      if (!$$0.gk() && !$$0.U_() && $$1.c(d) && $$2 instanceof arn $$4) {
         this.a($$4, $$3, $$2.A.a(20, 24));
      }
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      if ($$0.c(c) == dzg.a) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dwb $$3 ? $$3.d() : 0;
      }
   }
}
