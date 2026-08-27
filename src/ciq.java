import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ciq extends cja {
   private static final tl a = tl.c("painting.random").a(n.h);
   private final biu<? extends byf> b;

   public ciq(biu<? extends byf> $$0, cja.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bgy a(clp $$0) {
      gw $$1 = $$0.a();
      hc $$2 = $$0.k();
      gw $$3 = $$1.a($$2);
      cbu $$4 = $$0.o();
      cjf $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bgy.e;
      } else {
         cpv $$6 = $$0.q();
         byf $$8;
         if (this.b == biu.ar) {
            Optional<byi> $$7 = byi.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bgy.b;
            }

            $$8 = $$7.get();
         } else if (this.b == biu.af) {
            $$8 = new byg($$6, $$3, $$2);
         } else {
            if (this.b != biu.S) {
               return bgy.a($$6.B);
            }

            $$8 = new bye($$6, $$3, $$2);
         }

         qx $$12 = $$5.v();
         if ($$12 != null) {
            biu.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, djt.t, $$8.dj());
               $$6.b($$8);
            }

            $$5.h(1);
            return bgy.a($$6.B);
         } else {
            return bgy.b;
         }
      }
   }

   protected boolean a(cbu $$0, hc $$1, cjf $$2, gw $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cjf $$0, @Nullable cpv $$1, List<tl> $$2, ckw $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == biu.ar) {
         qx $$4 = $$0.v();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            qx $$5 = $$4.p("EntityTag");
            byi.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(tl.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(tl.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(tl.a("painting.dimensions", arx.e(((byj)$$1x.a()).a(), 16), arx.e(((byj)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
