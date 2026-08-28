import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class efa {
   private final arq a;

   public efa(arq $$0) {
      this.a = $$0;
   }

   public void a(je<eez> $$0, fei $$1, eez.a $$2) {
      int $$3 = $$0.a().a();
      iu $$4 = iu.a((jo)$$1);
      int $$5 = jx.a($$4.u() - $$3);
      int $$6 = jx.a($$4.v() - $$3);
      int $$7 = jx.a($$4.w() - $$3);
      int $$8 = jx.a($$4.u() + $$3);
      int $$9 = jx.a($$4.v() + $$3);
      int $$10 = jx.a($$4.w() + $$3);
      List<eez.b> $$11 = new ArrayList<>();
      efc.a $$12 = ($$4x, $$5x) -> {
         if ($$4x.c() == efb.a.b) {
            $$11.add(new eez.b($$0, $$1, $$2, $$4x, $$5x));
         } else {
            $$4x.a(this.a, $$0, $$2, $$1);
         }
      };
      boolean $$13 = false;

      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$7; $$15 <= $$10; $$15++) {
            ebw $$16 = this.a.m().a($$14, $$15);
            if ($$16 != null) {
               for (int $$17 = $$6; $$17 <= $$9; $$17++) {
                  $$13 |= $$16.a($$17).a($$0, $$1, $$2, $$12);
               }
            }
         }
      }

      if (!$$11.isEmpty()) {
         this.a($$11);
      }

      if ($$13) {
         agm.a(this.a, $$0, $$1);
      }
   }

   private void a(List<eez.b> $$0) {
      Collections.sort($$0);

      for (eez.b $$1 : $$0) {
         efb $$2 = $$1.d();
         $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
      }
   }
}
