import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dlz extends djq {
   public static final MapCodec<dlz> a = b(dlz::new);
   public static final dyo<jn.a> b = dyg.K;
   public static final dyo<dyk> c = dyg.bD;
   public static final dyh d = dyg.w;

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   protected dlz(dxp.d $$0) {
      super($$0);
      this.l(this.m().b(b, jn.a.b).b(c, dyk.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dvh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      if ($$0.C) {
         return null;
      } else {
         return $$1.c(c) != dyk.a ? a($$2, duu.k, dvh::a) : null;
      }
   }

   public static boolean a(dgz $$0) {
      return $$0.X();
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if (a($$1)) {
         if ($$0.c(c) != dyk.a) {
            if ($$3.a(16) == 0 && a($$1, $$2)) {
               $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awa.gB, awb.e, 1.0F, 1.0F, false);
            }
         }
      }
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      $$2.a($$3, this, 1);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      dxq $$4 = e($$0, $$1, $$2);
      if ($$4 != $$0) {
         $$1.a($$2, $$4, 3);
      }
   }

   private static dxq e(dxq $$0, dgz $$1, ji $$2) {
      boolean $$3 = b($$0, $$1, $$2);
      boolean $$4 = $$0.c(c) == dyk.a;
      return $$3 && $$4 ? $$0.b(c, a($$1) ? dyk.c : dyk.b) : $$0;
   }

   public static boolean b(dxq $$0, dhc $$1, ji $$2) {
      jn.a $$3 = $$0.c(b);

      for (jn $$4 : $$3.g()) {
         dxq $$5 = $$1.a_($$2.a($$4));
         if (!$$5.a(awp.w) || $$5.c(b) != $$3) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dha $$0, ji $$1) {
      for (jn $$2 : jn.values()) {
         ji $$3 = $$1.a($$2);
         dxq $$4 = $$0.a_($$3);
         if (!$$4.a(awp.w)) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      return e(this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return dqv.b($$0, $$1);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      bsu.a($$0, $$1, $$2);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, dgs $$3, BiConsumer<cxh, ji> $$4) {
      if ($$1.c_($$2) instanceof dvh $$5 && $$3 instanceof dhp $$6 && $$3.b().a()) {
         $$5.a($$6.k());
         if ($$3.c() instanceof cpr $$7 && $$3.b().a()) {
            this.a($$7, $$0, $$1, $$2);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dxq a(dgz $$0, ji $$1, dxq $$2, cpr $$3) {
      if ($$0.c_($$1) instanceof dvh $$4) {
         $$4.a($$3.dV().a($$3));
         this.a($$3, $$2, $$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(cpr $$0, dxq $$1, dgz $$2, ji $$3) {
      if (!$$0.gn() && !$$0.U_() && $$1.c(d) && $$2 instanceof ard $$4) {
         this.a($$4, $$3, $$2.A.a(20, 24));
      }
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      if ($$0.c(c) == dyk.a) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dvh $$3 ? $$3.d() : 0;
      }
   }
}
