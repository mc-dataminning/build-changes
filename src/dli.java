import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dli extends diz {
   public static final MapCodec<dli> a = b(dli::new);
   public static final dxv<jn.a> b = dxo.L;
   public static final dxp c = dxo.a;
   public static final dxp d = dxo.x;

   @Override
   public MapCodec<dli> a() {
      return a;
   }

   protected dli(dwx.d $$0) {
      super($$0);
      this.l(this.m().b(b, jn.a.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dup($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      if ($$0.C) {
         return null;
      } else {
         return $$1.c(c) ? a($$2, duc.k, dup::a) : null;
      }
   }

   public static boolean a(dgj $$0) {
      return $$0.G_().j() && $$0.W();
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      if (a($$1)) {
         if ($$0.c(c)) {
            if ($$3.a(16) == 0 && a($$1, $$2)) {
               $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awa.gB, awb.e, 1.0F, 1.0F, false);
            }
         }
      }
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      dwy $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      return c($$8, $$1, $$3);
   }

   private static dwy c(dwy $$0, dgm $$1, ji $$2) {
      boolean $$3 = b($$0, $$1, $$2);
      boolean $$4 = !$$0.c(c);
      return $$3 && $$4 ? $$0.b(c, Boolean.valueOf(true)) : $$0;
   }

   public static boolean b(dwy $$0, dgm $$1, ji $$2) {
      jn.a $$3 = $$0.c(b);

      for (jn $$4 : $$3.g()) {
         dwy $$5 = $$1.a_($$2.a($$4));
         if (!$$5.a(awp.w) || $$5.c(b) != $$3) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dgk $$0, ji $$1) {
      for (jn $$2 : jn.values()) {
         ji $$3 = $$1.a($$2);
         dwy $$4 = $$0.a_($$3);
         if (!$$4.a(awp.w)) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      return c(this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return dqe.b($$0, $$1);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if ($$1.c_($$2) instanceof dup $$5) {
         $$5.a(null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, dgb $$3, BiConsumer<cwq, ji> $$4) {
      if ($$1.c_($$2) instanceof dup $$5 && $$3 instanceof dgz $$6 && $$3.b().a()) {
         $$5.a($$6.k());
         if ($$3.c() instanceof coy $$7 && $$3.b().a()) {
            this.a($$7, $$0, $$1, $$2);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dwy a(dgj $$0, ji $$1, dwy $$2, coy $$3) {
      if ($$0.c_($$1) instanceof dup $$4) {
         $$4.a($$3.dW().a($$3));
         this.a($$3, $$2, $$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(coy $$0, dwy $$1, dgj $$2, ji $$3) {
      if (!$$0.b() && !$$0.Z_() && $$1.c(d) && $$2 instanceof ard $$4) {
         this.a($$4, $$3, $$2.A.a(20, 24));
      }
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dup $$3 ? $$3.d() : 0;
      }
   }
}
