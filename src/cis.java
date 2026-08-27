import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cis extends cjc {
   private static final tn a = tn.c("painting.random").a(n.h);
   private final biw<? extends byh> b;

   public cis(biw<? extends byh> $$0, cjc.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bha a(clr $$0) {
      gw $$1 = $$0.a();
      hc $$2 = $$0.k();
      gw $$3 = $$1.a($$2);
      cbw $$4 = $$0.o();
      cjh $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bha.e;
      } else {
         cpx $$6 = $$0.q();
         byh $$8;
         if (this.b == biw.ar) {
            Optional<byk> $$7 = byk.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bha.b;
            }

            $$8 = $$7.get();
         } else if (this.b == biw.af) {
            $$8 = new byi($$6, $$3, $$2);
         } else {
            if (this.b != biw.S) {
               return bha.a($$6.B);
            }

            $$8 = new byg($$6, $$3, $$2);
         }

         qy $$12 = $$5.v();
         if ($$12 != null) {
            biw.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, djv.t, $$8.dj());
               $$6.b($$8);
            }

            $$5.h(1);
            return bha.a($$6.B);
         } else {
            return bha.b;
         }
      }
   }

   protected boolean a(cbw $$0, hc $$1, cjh $$2, gw $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cjh $$0, @Nullable cpx $$1, List<tn> $$2, cky $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == biw.ar) {
         qy $$4 = $$0.v();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            qy $$5 = $$4.p("EntityTag");
            byk.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(tn.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(tn.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(tn.a("painting.dimensions", ary.e(((byl)$$1x.a()).a(), 16), ary.e(((byl)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
