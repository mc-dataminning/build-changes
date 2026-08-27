import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ejl extends egp {
   public static final Codec<ejl> d = a(ejl::new);

   public ejl(egp.c $$0) {
      super($$0);
   }

   @Override
   public Optional<egp.b> a(egp.a $$0) {
      djr $$1 = djr.a($$0.f());
      in $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new egp.b($$2, (Consumer<ehh>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(ehh $$0, egp.a $$1, in $$2, djr $$3) {
      List<ejk.i> $$4 = Lists.newLinkedList();
      ejk.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, ehe $$6) {
      in.a $$7 = new in.a();
      int $$8 = $$0.I_();
      egh $$9 = $$6.b();
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

                  $$0.a($$7, ddg.m.n(), 2);
               }
            }
         }
      }
   }

   @Override
   public egy<?> e() {
      return egy.p;
   }
}
