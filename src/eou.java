import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eou extends elx {
   public static final MapCodec<eou> d = a(eou::new);

   public eou(elx.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elx.b> a(elx.a $$0) {
      dor $$1 = dor.a($$0.f());
      jh $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new elx.b($$2, (Consumer<emp>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(emp $$0, elx.a $$1, jh $$2, dor $$3) {
      List<eot.i> $$4 = Lists.newLinkedList();
      eot.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, emm $$6) {
      jh.a $$7 = new jh.a();
      int $$8 = $$0.I_();
      elp $$9 = $$6.b();
      int $$10 = $$9.i();

      for (int $$11 = $$4.h(); $$11 <= $$4.k(); $$11++) {
         for (int $$12 = $$4.j(); $$12 <= $$4.m(); $$12++) {
            $$7.d($$11, $$10, $$12);
            if (!$$0.u($$7) && $$9.b($$7) && $$6.a($$7)) {
               for (int $$13 = $$10 - 1; $$13 > $$8; $$13--) {
                  $$7.q($$13);
                  if (!$$0.u($$7) && !$$0.a_($$7).n()) {
                     break;
                  }

                  $$0.a($$7, dig.m.m(), 2);
               }
            }
         }
      }
   }

   @Override
   public emg<?> e() {
      return emg.p;
   }
}
