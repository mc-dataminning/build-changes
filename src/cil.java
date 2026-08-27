import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cil extends civ {
   private static final ti a = ti.c("painting.random").a(n.h);
   private final bip<? extends bya> b;

   public cil(bip<? extends bya> $$0, civ.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bgt a(clk $$0) {
      gw $$1 = $$0.a();
      hc $$2 = $$0.k();
      gw $$3 = $$1.a($$2);
      cbp $$4 = $$0.o();
      cja $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bgt.e;
      } else {
         cpq $$6 = $$0.q();
         bya $$8;
         if (this.b == bip.ar) {
            Optional<byd> $$7 = byd.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bgt.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bip.af) {
            $$8 = new byb($$6, $$3, $$2);
         } else {
            if (this.b != bip.S) {
               return bgt.a($$6.B);
            }

            $$8 = new bxz($$6, $$3, $$2);
         }

         qu $$12 = $$5.v();
         if ($$12 != null) {
            bip.a($$6, $$4, $$8, $$12);
         }

         if ($$8.t()) {
            if (!$$6.B) {
               $$8.x();
               $$6.a($$4, djo.t, $$8.di());
               $$6.b($$8);
            }

            $$5.h(1);
            return bgt.a($$6.B);
         } else {
            return bgt.b;
         }
      }
   }

   protected boolean a(cbp $$0, hc $$1, cja $$2, gw $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cja $$0, @Nullable cpq $$1, List<ti> $$2, ckr $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bip.ar) {
         qu $$4 = $$0.v();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            qu $$5 = $$4.p("EntityTag");
            byd.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(ti.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(ti.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(ti.a("painting.dimensions", ars.e(((bye)$$1x.a()).a(), 16), ars.e(((bye)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
