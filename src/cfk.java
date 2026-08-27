import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cfk extends cfu {
   private static final sw a = sw.c("painting.random").a(n.h);
   private final bfn<? extends buz> b;

   public cfk(bfn<? extends buz> $$0, cfu.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bdx a(cij $$0) {
      gu $$1 = $$0.a();
      ha $$2 = $$0.k();
      gu $$3 = $$1.a($$2);
      byo $$4 = $$0.o();
      cfz $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bdx.e;
      } else {
         cmm $$6 = $$0.q();
         buz $$8;
         if (this.b == bfn.ar) {
            Optional<bvc> $$7 = bvc.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bdx.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bfn.af) {
            $$8 = new bva($$6, $$3, $$2);
         } else {
            if (this.b != bfn.S) {
               return bdx.a($$6.B);
            }

            $$8 = new buy($$6, $$3, $$2);
         }

         qr $$12 = $$5.v();
         if ($$12 != null) {
            bfn.a($$6, $$4, $$8, $$12);
         }

         if ($$8.t()) {
            if (!$$6.B) {
               $$8.x();
               $$6.a($$4, dgl.t, $$8.dg());
               $$6.b($$8);
            }

            $$5.h(1);
            return bdx.a($$6.B);
         } else {
            return bdx.b;
         }
      }
   }

   protected boolean a(byo $$0, ha $$1, cfz $$2, gu $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bfn.ar) {
         qr $$4 = $$0.v();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            qr $$5 = $$4.p("EntityTag");
            bvc.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(sw.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(sw.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(sw.a("painting.dimensions", apa.e(((bvd)$$1x.a()).a(), 16), apa.e(((bvd)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
