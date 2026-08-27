import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class efc extends ecg {
   public static final Codec<efc> d = a(efc::new);

   public efc(ecg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ecg.b> a(ecg.a $$0) {
      dfr $$1 = dfr.a($$0.f());
      ib $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ecg.b($$2, (Consumer<ecy>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(ecy $$0, ecg.a $$1, ib $$2, dfr $$3) {
      List<efb.i> $$4 = Lists.newLinkedList();
      efb.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ecv $$6) {
      ib.a $$7 = new ib.a();
      int $$8 = $$0.J_();
      eby $$9 = $$6.b();
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

                  $$0.a($$7, czh.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public ecp<?> e() {
      return ecp.p;
   }
}
