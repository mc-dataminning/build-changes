import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class csl extends csu {
   private static final wu a = wu.c("painting.random").a(n.h);
   private final brn<? extends chj> b;

   public csl(brn<? extends chj> $$0, csu.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bpm a(cwk $$0) {
      in $$1 = $$0.a();
      is $$2 = $$0.k();
      in $$3 = $$1.a($$2);
      clh $$4 = $$0.o();
      csz $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bpm.e;
      } else {
         dad $$6 = $$0.q();
         chj $$8;
         if (this.b == brn.au) {
            Optional<chm> $$7 = chm.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bpm.b;
            }

            $$8 = $$7.get();
         } else if (this.b == brn.ai) {
            $$8 = new chk($$6, $$3, $$2);
         } else {
            if (this.b != brn.V) {
               return bpm.a($$6.B);
            }

            $$8 = new chi($$6, $$3, $$2);
         }

         cvm $$12 = $$5.a(ka.K, cvm.a);
         if (!$$12.b()) {
            brn.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, dva.t, $$8.dl());
               $$6.b($$8);
            }

            $$5.h(1);
            return bpm.a($$6.B);
         } else {
            return bpm.b;
         }
      }
   }

   protected boolean a(clh $$0, is $$1, csz $$2, in $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(csz $$0, @Nullable dad $$1, List<wu> $$2, cuq $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == brn.au) {
         cvm $$4 = $$0.a(ka.K, cvm.a);
         if (!$$4.b()) {
            $$4.a(chm.e).result().ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(wu.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(wu.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(wu.a("painting.dimensions", axz.e(((chn)$$1x.a()).a(), 16), axz.e(((chn)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
