import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dli extends dmb {
   public static final MapCodec<dli> a = b(dli::new);
   public static final int b = 3;
   public static final dwj c = dvz.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dli> a() {
      return a;
   }

   public dli(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      $$1.a($$2, this, azk.a($$1.E_(), 60, 120));
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.g() && this.f($$0, $$1, $$2)) {
         jh.a $$4 = new jh.a();

         for (jm $$5 : jm.values()) {
            $$4.a($$2, $$5);
            dvj $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.f($$6, $$1, $$4)) {
               $$1.a($$4, this, azk.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, azk.a($$3, 20, 40));
      }
   }

   private boolean f(dvj $$0, dfb $$1, jh $$2) {
      int $$3 = $$0.c(c);
      if ($$3 < 3) {
         $$1.a($$2, $$0.b(c, Integer.valueOf($$3 + 1)), 2);
         return false;
      } else {
         this.e($$0, $$1, $$2);
         return true;
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      if ($$3.m().a(this) && this.a($$1, $$2, 2)) {
         this.e($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(deg $$0, jh $$1, int $$2) {
      int $$3 = 0;
      jh.a $$4 = new jh.a();

      for (jm $$5 : jm.values()) {
         $$4.a($$1, $$5);
         if ($$0.a_($$4).a(this)) {
            if (++$$3 >= $$2) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c);
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return cwb.k;
   }
}
