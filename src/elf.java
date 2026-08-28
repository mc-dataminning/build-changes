import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class elf extends eij {
   public static final MapCodec<elf> d = a(elf::new);

   public elf(eij.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eij.b> a(eij.a $$0) {
      dll $$1 = dll.a($$0.f());
      iz $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eij.b($$2, (Consumer<ejb>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(ejb $$0, eij.a $$1, iz $$2, dll $$3) {
      List<ele.i> $$4 = Lists.newLinkedList();
      ele.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dcs $$0, dcq $$1, dty $$2, azg $$3, eib $$4, dbe $$5, eiy $$6) {
      iz.a $$7 = new iz.a();
      int $$8 = $$0.I_();
      eib $$9 = $$6.b();
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

                  $$0.a($$7, dfa.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public eis<?> e() {
      return eis.p;
   }
}
