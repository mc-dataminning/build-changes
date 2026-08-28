import java.util.Optional;
import java.util.function.Consumer;

public class czo extends czw {
   private static final xc a = xc.c("painting.random").a(o.h);
   private final bxe<? extends cnw> b;

   public czo(bxe<? extends cnw> $$0, czw.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public but a(ddv $$0) {
      iw $$1 = $$0.a();
      jc $$2 = $$0.k();
      iw $$3 = $$1.a($$2);
      crz $$4 = $$0.o();
      daa $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return but.d;
      } else {
         djz $$6 = $$0.q();
         cnw $$8;
         if (this.b == bxe.aL) {
            Optional<cnz> $$7 = cnz.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return but.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bxe.at) {
            $$8 = new cnx($$6, $$3, $$2);
         } else {
            if (this.b != bxe.ag) {
               return but.a;
            }

            $$8 = new cnv($$6, $$3, $$2);
         }

         bxe.<cnw>a($$6, $$5, $$4).accept($$8);
         if ($$8.g()) {
            if (!$$6.C) {
               $$8.v();
               $$6.a($$4, egg.t, $$8.dt());
               $$6.b($$8);
            }

            $$5.h(1);
            return but.a;
         } else {
            return but.c;
         }
      }
   }

   protected boolean a(crz $$0, jc $$1, daa $$2, iw $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(daa $$0, czw.b $$1, dde $$2, Consumer<xc> $$3, dbp $$4) {
      if (this.b == bxe.aL && $$2.a(kl.aM)) {
         jg<coa> $$5 = $$0.a(kl.aM);
         if ($$5 != null) {
            $$5.a().e().ifPresent($$3);
            $$5.a().f().ifPresent($$3);
            $$3.accept(xc.a("painting.dimensions", $$5.a().b(), $$5.a().c()));
         } else if ($$4.b()) {
            $$3.accept(a);
         }
      }
   }
}
