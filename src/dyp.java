import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dyp extends dwa {
   public static final Codec<dyp> d = a(dyp::new);

   public dyp(dwa.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dwa.b> a(dwa.a $$0) {
      dal $$1 = dal.a($$0.f());
      ht $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dwa.b($$2, (Consumer<dws>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(dws $$0, dwa.a $$1, ht $$2, dal $$3) {
      List<dyo.i> $$4 = Lists.newLinkedList();
      dyo.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, dwp $$6) {
      ht.a $$7 = new ht.a();
      int $$8 = $$0.I_();
      dvs $$9 = $$6.b();
      int $$10 = $$9.h();

      for (int $$11 = $$4.g(); $$11 <= $$4.j(); $$11++) {
         for (int $$12 = $$4.i(); $$12 <= $$4.l(); $$12++) {
            $$7.d($$11, $$10, $$12);
            if (!$$0.t($$7) && $$9.b($$7) && $$6.a($$7)) {
               for (int $$13 = $$10 - 1; $$13 > $$8; $$13--) {
                  $$7.q($$13);
                  if (!$$0.t($$7) && !$$0.a_($$7).k()) {
                     break;
                  }

                  $$0.a($$7, cuc.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public dwj<?> e() {
      return dwj.p;
   }
}
