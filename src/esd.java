import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class esd extends epg {
   public static final MapCodec<esd> d = a(esd::new);

   public esd(epg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<epg.b> a(epg.a $$0) {
      drm $$1 = drm.a($$0.f());
      jj $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new epg.b($$2, (Consumer<epy>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(epy $$0, epg.a $$1, jj $$2, drm $$3) {
      List<esc.i> $$4 = Lists.newLinkedList();
      esc.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, epv $$6) {
      jj.a $$7 = new jj.a();
      int $$8 = $$0.G_();
      eoy $$9 = $$6.b();
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

                  $$0.a($$7, dkw.m.m(), 2);
               }
            }
         }
      }
   }

   @Override
   public epp<?> e() {
      return epp.p;
   }
}
