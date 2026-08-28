import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class emo extends ejr {
   public static final MapCodec<emo> d = a(emo::new);

   public emo(ejr.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ejr.b> a(ejr.a $$0) {
      dmm $$1 = dmm.a($$0.f());
      jd $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ejr.b($$2, (Consumer<ekj>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(ekj $$0, ejr.a $$1, jd $$2, dmm $$3) {
      List<emn.i> $$4 = Lists.newLinkedList();
      emn.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, ekg $$6) {
      jd.a $$7 = new jd.a();
      int $$8 = $$0.I_();
      ejj $$9 = $$6.b();
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

                  $$0.a($$7, dga.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public eka<?> e() {
      return eka.p;
   }
}
