import com.mojang.serialization.MapCodec;

public class dgj extends dhc {
   public static final MapCodec<dgj> a = b(dgj::new);
   public static final int b = 3;
   public static final drh c = dqx.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dgj> a() {
      return a;
   }

   public dgj(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         in.a $$4 = new in.a();

         for (is $$5 : is.values()) {
            $$4.a($$2, $$5);
            dqh $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, axz.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, axz.a($$3, 20, 40));
      }
   }

   private boolean e(dqh $$0, dad $$1, in $$2) {
      int $$3 = $$0.c(c);
      if ($$3 < 3) {
         $$1.a($$2, $$0.a(c, Integer.valueOf($$3 + 1)), 2);
         return false;
      } else {
         this.d($$0, $$1, $$2);
         return true;
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      if ($$3.n().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(czj $$0, in $$1, int $$2) {
      int $$3 = 0;
      in.a $$4 = new in.a();

      for (is $$5 : is.values()) {
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
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c);
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return csz.i;
   }
}
