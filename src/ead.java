import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ead extends dxh {
   public static final Codec<ead> d = a(ead::new);

   public ead(dxh.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dxh.b> a(dxh.a $$0) {
      dbm $$1 = dbm.a($$0.f());
      ht $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dxh.b($$2, (Consumer<dxz>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(dxz $$0, dxh.a $$1, ht $$2, dbm $$3) {
      List<eac.i> $$4 = Lists.newLinkedList();
      eac.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(csu $$0, css $$1, djf $$2, ats $$3, dwz $$4, crh $$5, dxw $$6) {
      ht.a $$7 = new ht.a();
      int $$8 = $$0.I_();
      dwz $$9 = $$6.b();
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

                  $$0.a($$7, cvc.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public dxq<?> e() {
      return dxq.p;
   }
}
