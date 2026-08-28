import java.util.Optional;
import java.util.function.Consumer;

public class czm extends czu {
   private static final xa a = xa.c("painting.random").a(o.h);
   private final bxc<? extends cnu> b;

   public czm(bxc<? extends cnu> $$0, czu.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bur a(ddt $$0) {
      iv $$1 = $$0.a();
      jb $$2 = $$0.k();
      iv $$3 = $$1.a($$2);
      crx $$4 = $$0.o();
      czy $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bur.d;
      } else {
         djx $$6 = $$0.q();
         cnu $$8;
         if (this.b == bxc.aL) {
            Optional<cnx> $$7 = cnx.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bur.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bxc.at) {
            $$8 = new cnv($$6, $$3, $$2);
         } else {
            if (this.b != bxc.ag) {
               return bur.a;
            }

            $$8 = new cnt($$6, $$3, $$2);
         }

         bxc.<cnu>a($$6, $$5, $$4).accept($$8);
         if ($$8.g()) {
            if (!$$6.C) {
               $$8.v();
               $$6.a($$4, ege.t, $$8.dt());
               $$6.b($$8);
            }

            $$5.h(1);
            return bur.a;
         } else {
            return bur.c;
         }
      }
   }

   protected boolean a(crx $$0, jb $$1, czy $$2, iv $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(czy $$0, czu.b $$1, ddc $$2, Consumer<xa> $$3, dbn $$4) {
      if (this.b == bxc.aL && $$2.a(kk.aM)) {
         jf<cny> $$5 = $$0.a(kk.aM);
         if ($$5 != null) {
            $$5.a().e().ifPresent($$3);
            $$5.a().f().ifPresent($$3);
            $$3.accept(xa.a("painting.dimensions", $$5.a().b(), $$5.a().c()));
         } else if ($$4.b()) {
            $$3.accept(a);
         }
      }
   }
}
