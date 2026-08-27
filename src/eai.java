import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eai extends dxm {
   public static final Codec<eai> d = a(eai::new);

   public eai(dxm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dxm.b> a(dxm.a $$0) {
      dbr $$1 = dbr.a($$0.f());
      hx $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dxm.b($$2, (Consumer<dye>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(dye $$0, dxm.a $$1, hx $$2, dbr $$3) {
      List<eah.i> $$4 = Lists.newLinkedList();
      eah.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, dyb $$6) {
      hx.a $$7 = new hx.a();
      int $$8 = $$0.J_();
      dxe $$9 = $$6.b();
      int $$10 = $$9.i();

      for (int $$11 = $$4.h(); $$11 <= $$4.k(); $$11++) {
         for (int $$12 = $$4.j(); $$12 <= $$4.m(); $$12++) {
            $$7.d($$11, $$10, $$12);
            if (!$$0.t($$7) && $$9.b($$7) && $$6.a($$7)) {
               for (int $$13 = $$10 - 1; $$13 > $$8; $$13--) {
                  $$7.q($$13);
                  if (!$$0.t($$7) && !$$0.a_($$7).k()) {
                     break;
                  }

                  $$0.a($$7, cvh.m.o(), 2);
               }
            }
         }
      }
   }

   @Override
   public dxv<?> e() {
      return dxv.p;
   }
}
