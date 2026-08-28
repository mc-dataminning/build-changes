import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlc extends dlv {
   public static final MapCodec<dlc> a = b(dlc::new);
   public static final int b = 3;
   public static final dwd c = dvt.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dlc> a() {
      return a;
   }

   public dlc(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      $$1.a($$2, this, azj.a($$1.E_(), 60, 120));
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.g() && this.f($$0, $$1, $$2)) {
         jg.a $$4 = new jg.a();

         for (jl $$5 : jl.values()) {
            $$4.a($$2, $$5);
            dvd $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.f($$6, $$1, $$4)) {
               $$1.a($$4, this, azj.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, azj.a($$3, 20, 40));
      }
   }

   private boolean f(dvd $$0, dev $$1, jg $$2) {
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
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      if ($$3.m().a(this) && this.a($$1, $$2, 2)) {
         this.e($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dea $$0, jg $$1, int $$2) {
      int $$3 = 0;
      jg.a $$4 = new jg.a();

      for (jl $$5 : jl.values()) {
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
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c);
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return cvx.k;
   }
}
