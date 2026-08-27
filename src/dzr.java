import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dzr extends dwv {
   public static final Codec<dzr> d = a(dzr::new);

   public dzr(dwv.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dwv.b> a(dwv.a $$0) {
      dbf $$1 = dbf.a($$0.f());
      ht $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dwv.b($$2, (Consumer<dxn>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(dxn $$0, dwv.a $$1, ht $$2, dbf $$3) {
      List<dzq.i> $$4 = Lists.newLinkedList();
      dzq.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, dxk $$6) {
      ht.a $$7 = new ht.a();
      int $$8 = $$0.I_();
      dwn $$9 = $$6.b();
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

                  $$0.a($$7, cuv.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public dxe<?> e() {
      return dxe.p;
   }
}
