import javax.annotation.Nullable;

public class cwf extends cvy {
   public cwf(dex.d $$0) {
      super($$0);
   }

   public static dey a() {
      return csl.G.n();
   }

   @Override
   public void a(cpk $$0, cbl $$1, gv $$2, dey $$3, @Nullable dck $$4, ciw $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cnf.a(cnh.v, $$5) == 0) {
         if ($$0.x_().i()) {
            $$0.a($$2, false);
            return;
         }

         dey $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, a());
         }
      }
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$1.a(cpt.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dey $$0, cpk $$1, gv $$2) {
      if ($$1.x_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, a());
         $$1.a($$2, a().b(), $$2);
      }
   }
}
