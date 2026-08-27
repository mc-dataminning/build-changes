import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cij extends cit {
   private static final tf a = tf.c("painting.random").a(n.h);
   private final bim<? extends bxy> b;

   public cij(bim<? extends bxy> $$0, cit.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bgq a(cli $$0) {
      gu $$1 = $$0.a();
      ha $$2 = $$0.k();
      gu $$3 = $$1.a($$2);
      cbn $$4 = $$0.o();
      ciy $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bgq.e;
      } else {
         cpm $$6 = $$0.q();
         bxy $$8;
         if (this.b == bim.ar) {
            Optional<byb> $$7 = byb.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bgq.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bim.af) {
            $$8 = new bxz($$6, $$3, $$2);
         } else {
            if (this.b != bim.S) {
               return bgq.a($$6.B);
            }

            $$8 = new bxx($$6, $$3, $$2);
         }

         qr $$12 = $$5.v();
         if ($$12 != null) {
            bim.a($$6, $$4, $$8, $$12);
         }

         if ($$8.t()) {
            if (!$$6.B) {
               $$8.x();
               $$6.a($$4, djk.t, $$8.di());
               $$6.b($$8);
            }

            $$5.h(1);
            return bgq.a($$6.B);
         } else {
            return bgq.b;
         }
      }
   }

   protected boolean a(cbn $$0, ha $$1, ciy $$2, gu $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(ciy $$0, @Nullable cpm $$1, List<tf> $$2, ckp $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bim.ar) {
         qr $$4 = $$0.v();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            qr $$5 = $$4.p("EntityTag");
            byb.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(tf.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(tf.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(tf.a("painting.dimensions", arp.e(((byc)$$1x.a()).a(), 16), arp.e(((byc)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
