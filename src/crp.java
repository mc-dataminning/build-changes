import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class crp extends cry {
   private static final ws a = ws.c("painting.random").a(n.h);
   private final bqr<? extends cgn> b;

   public crp(bqr<? extends cgn> $$0, cry.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boq a(cvn $$0) {
      im $$1 = $$0.a();
      ir $$2 = $$0.k();
      im $$3 = $$1.a($$2);
      ckl $$4 = $$0.o();
      csd $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return boq.e;
      } else {
         czu $$6 = $$0.q();
         cgn $$8;
         if (this.b == bqr.au) {
            Optional<cgq> $$7 = cgq.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return boq.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bqr.ai) {
            $$8 = new cgo($$6, $$3, $$2);
         } else {
            if (this.b != bqr.V) {
               return boq.a($$6.B);
            }

            $$8 = new cgm($$6, $$3, $$2);
         }

         cuq $$12 = $$5.a(jz.D, cuq.a);
         if (!$$12.b()) {
            bqr.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, dur.t, $$8.dl());
               $$6.b($$8);
            }

            $$5.g(1);
            return boq.a($$6.B);
         } else {
            return boq.b;
         }
      }
   }

   protected boolean a(ckl $$0, ir $$1, csd $$2, im $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(csd $$0, @Nullable czu $$1, List<ws> $$2, ctu $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bqr.au) {
         cuq $$4 = $$0.a(jz.D, cuq.a);
         if (!$$4.b()) {
            $$4.a(cgq.e).result().ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(ws.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(ws.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(ws.a("painting.dimensions", axw.e(((cgr)$$1x.a()).a(), 16), axw.e(((cgr)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
