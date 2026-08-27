import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpw extends cqf {
   private static final vu a = vu.c("painting.random").a(n.h);
   private final bpc<? extends cev> b;

   public cpw(bpc<? extends cev> $$0, cqf.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bnc a(csu $$0) {
      ib $$1 = $$0.a();
      ih $$2 = $$0.k();
      ib $$3 = $$1.a($$2);
      cis $$4 = $$0.o();
      cqk $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bnc.e;
      } else {
         cwz $$6 = $$0.q();
         cev $$8;
         if (this.b == bpc.au) {
            Optional<cey> $$7 = cey.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bnc.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bpc.ai) {
            $$8 = new cew($$6, $$3, $$2);
         } else {
            if (this.b != bpc.V) {
               return bnc.a($$6.B);
            }

            $$8 = new ceu($$6, $$3, $$2);
         }

         ta $$12 = $$5.w();
         if ($$12 != null) {
            bpc.a($$6, $$4, $$8, $$12);
         }

         if ($$8.z()) {
            if (!$$6.B) {
               $$8.C();
               $$6.a($$4, drn.t, $$8.dk());
               $$6.b($$8);
            }

            $$5.h(1);
            return bnc.a($$6.B);
         } else {
            return bnc.b;
         }
      }
   }

   protected boolean a(cis $$0, ih $$1, cqk $$2, ib $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cqk $$0, @Nullable cwz $$1, List<vu> $$2, csb $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bpc.au) {
         ta $$4 = $$0.w();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            ta $$5 = $$4.p("EntityTag");
            cey.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(vu.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(vu.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(vu.a("painting.dimensions", aww.e(((cez)$$1x.a()).a(), 16), aww.e(((cez)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
