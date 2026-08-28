import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dly extends djp {
   public static final MapCodec<dly> a = b(dly::new);
   public static final dyl<jm.a> b = dye.L;
   public static final dyf c = dye.a;
   public static final dyf d = dye.x;

   @Override
   public MapCodec<dly> a() {
      return a;
   }

   protected dly(dxn.d $$0) {
      super($$0);
      this.l(this.m().b(b, jm.a.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dvf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      if ($$0.C) {
         return null;
      } else {
         return $$1.c(c) ? a($$2, dus.k, dvf::a) : null;
      }
   }

   public static boolean a(dgz $$0) {
      return $$0.G_().j() && $$0.W();
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      if (a($$1)) {
         if ($$0.c(c)) {
            if ($$3.a(16) == 0 && a($$1, $$2)) {
               $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awv.gB, aww.e, 1.0F, 1.0F, false);
            }
         }
      }
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      dxo $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      return c($$8, $$1, $$3);
   }

   private static dxo c(dxo $$0, dhc $$1, jh $$2) {
      boolean $$3 = b($$0, $$1, $$2);
      boolean $$4 = !$$0.c(c);
      return $$3 && $$4 ? $$0.b(c, Boolean.valueOf(true)) : $$0;
   }

   public static boolean b(dxo $$0, dhc $$1, jh $$2) {
      jm.a $$3 = $$0.c(b);

      for (jm $$4 : $$3.g()) {
         dxo $$5 = $$1.a_($$2.a($$4));
         if (!$$5.a(axk.w) || $$5.c(b) != $$3) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dha $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         jh $$3 = $$1.a($$2);
         dxo $$4 = $$0.a_($$3);
         if (!$$4.a(axk.w)) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      return c(this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return dqu.b($$0, $$1);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if ($$1.c_($$2) instanceof dvf $$5) {
         $$5.a(null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, dgr $$3, BiConsumer<cxg, jh> $$4) {
      if ($$1.c_($$2) instanceof dvf $$5 && $$3 instanceof dhp $$6) {
         $$5.a($$6.k());
         if ($$3.c() instanceof cpo && $$3.b().a()) {
            this.e($$0, $$1, $$2);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dxo a(dgz $$0, jh $$1, dxo $$2, cpo $$3) {
      if ($$0.c_($$1) instanceof dvf $$4) {
         $$4.a($$3.dX().a($$3));
         this.e($$2, $$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void e(dxo $$0, dgz $$1, jh $$2) {
      if ($$0.c(d) && $$1 instanceof arx $$3) {
         this.a($$3, $$2, $$1.A.a(20, 24));
      }
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dvf $$3 ? $$3.d() : 0;
      }
   }
}
