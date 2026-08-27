import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cre extends crn {
   private static final wi a = wi.c("painting.random").a(n.h);
   private final bqg<? extends cgc> b;

   public cre(bqg<? extends cgc> $$0, crn.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bof a(cuz $$0) {
      id $$1 = $$0.a();
      ij $$2 = $$0.k();
      id $$3 = $$1.a($$2);
      cka $$4 = $$0.o();
      crs $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bof.e;
      } else {
         czg $$6 = $$0.q();
         cgc $$8;
         if (this.b == bqg.au) {
            Optional<cgf> $$7 = cgf.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bof.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bqg.ai) {
            $$8 = new cgd($$6, $$3, $$2);
         } else {
            if (this.b != bqg.V) {
               return bof.a($$6.B);
            }

            $$8 = new cgb($$6, $$3, $$2);
         }

         cuc $$12 = $$5.a(jr.D, cuc.a);
         if (!$$12.b()) {
            bqg.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, dub.t, $$8.dk());
               $$6.b($$8);
            }

            $$5.g(1);
            return bof.a($$6.B);
         } else {
            return bof.b;
         }
      }
   }

   protected boolean a(cka $$0, ij $$1, crs $$2, id $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(crs $$0, @Nullable czg $$1, List<wi> $$2, cti $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bqg.au) {
         cuc $$4 = $$0.a(jr.D, cuc.a);
         if (!$$4.b()) {
            $$4.a(cgf.e).result().ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(wi.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(wi.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(wi.a("painting.dimensions", axm.e(((cgg)$$1x.a()).a(), 16), axm.e(((cgg)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
