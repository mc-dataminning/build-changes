import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ejc extends egg {
   public static final Codec<ejc> d = a(ejc::new);

   public ejc(egg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<egg.b> a(egg.a $$0) {
      dji $$1 = dji.a($$0.f());
      im $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new egg.b($$2, (Consumer<egy>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(egy $$0, egg.a $$1, im $$2, dji $$3) {
      List<ejb.i> $$4 = Lists.newLinkedList();
      ejb.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, egv $$6) {
      im.a $$7 = new im.a();
      int $$8 = $$0.I_();
      efy $$9 = $$6.b();
      int $$10 = $$9.i();

      for (int $$11 = $$4.h(); $$11 <= $$4.k(); $$11++) {
         for (int $$12 = $$4.j(); $$12 <= $$4.m(); $$12++) {
            $$7.d($$11, $$10, $$12);
            if (!$$0.u($$7) && $$9.b($$7) && $$6.a($$7)) {
               for (int $$13 = $$10 - 1; $$13 > $$8; $$13--) {
                  $$7.q($$13);
                  if (!$$0.u($$7) && !$$0.a_($$7).k()) {
                     break;
                  }

                  $$0.a($$7, dcx.m.n(), 2);
               }
            }
         }
      }
   }

   @Override
   public egp<?> e() {
      return egp.p;
   }
}
