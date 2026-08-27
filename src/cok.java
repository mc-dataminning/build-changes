import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cok extends cou {
   private static final vq a = vq.c("painting.random").a(n.h);
   private final bnu<? extends cdk> b;

   public cok(bnu<? extends cdk> $$0, cou.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public blu a(cri $$0) {
      hz $$1 = $$0.a();
      ie $$2 = $$0.k();
      hz $$3 = $$1.a($$2);
      chh $$4 = $$0.o();
      coz $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return blu.e;
      } else {
         cvn $$6 = $$0.q();
         cdk $$8;
         if (this.b == bnu.at) {
            Optional<cdn> $$7 = cdn.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return blu.b;
            }

            $$8 = $$7.get();
         } else if (this.b == bnu.ah) {
            $$8 = new cdl($$6, $$3, $$2);
         } else {
            if (this.b != bnu.U) {
               return blu.a($$6.B);
            }

            $$8 = new cdj($$6, $$3, $$2);
         }

         sw $$12 = $$5.w();
         if ($$12 != null) {
            bnu.a($$6, $$4, $$8, $$12);
         }

         if ($$8.A()) {
            if (!$$6.B) {
               $$8.D();
               $$6.a($$4, dpp.t, $$8.dk());
               $$6.b($$8);
            }

            $$5.h(1);
            return blu.a($$6.B);
         } else {
            return blu.b;
         }
      }
   }

   protected boolean a(chh $$0, ie $$1, coz $$2, hz $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(coz $$0, @Nullable cvn $$1, List<vq> $$2, cqq $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.b == bnu.at) {
         sw $$4 = $$0.w();
         if ($$4 != null && $$4.b("EntityTag", 10)) {
            sw $$5 = $$4.p("EntityTag");
            cdn.c($$5).ifPresentOrElse($$1x -> {
               $$1x.e().ifPresent($$1xx -> {
                  $$2.add(vq.c($$1xx.a().b("painting", "title")).a(n.o));
                  $$2.add(vq.c($$1xx.a().b("painting", "author")).a(n.h));
               });
               $$2.add(vq.a("painting.dimensions", awh.e(((cdo)$$1x.a()).a(), 16), awh.e(((cdo)$$1x.a()).b(), 16)));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
