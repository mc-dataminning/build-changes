import java.util.List;
import java.util.function.Predicate;

public class cji extends clj {
   private static final Predicate<bkv> a = bky.f.and(bkv::bt);
   private final cfs.b b;
   private final boolean c;

   public cji(boolean $$0, cfs.b $$1, clj.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      clo $$3 = $$1.b($$2);
      ejx $$4 = a($$0, $$1, cro.b.c);
      if ($$4.c() == ejx.a.a) {
         return bjc.c($$3);
      } else {
         ejz $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bkv> $$7 = $$0.a($$1, $$1.cH().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            ejz $$8 = $$1.br();

            for (bkv $$9 : $$7) {
               eju $$10 = $$9.cH().g((double)$$9.bE());
               if ($$10.d($$8)) {
                  return bjc.c($$3);
               }
            }
         }

         if ($$4.c() == ejx.a.b) {
            cfs $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dD());
            if (!$$0.a($$11, $$11.cH())) {
               return bjc.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dlx.t, $$4.e());
                  if (!$$1.fU().d) {
                     $$3.h(1);
                  }
               }

               $$1.b(arf.c.b(this));
               return bjc.a($$3, $$0.y_());
            }
         } else {
            return bjc.c($$3);
         }
      }
   }

   private cfs a(csf $$0, ejx $$1, clo $$2, cdz $$3) {
      ejz $$4 = $$1.e();
      cfs $$5 = (cfs)(this.c ? new cft($$0, $$4.c, $$4.d, $$4.e) : new cfs($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof ami $$6) {
         bkz.<cfs>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
