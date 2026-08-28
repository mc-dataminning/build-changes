import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class efi {
   private final arq a;

   public efi(arq $$0) {
      this.a = $$0;
   }

   public void a(je<efh> $$0, feq $$1, efh.a $$2) {
      int $$3 = $$0.a().a();
      iu $$4 = iu.a((jo)$$1);
      int $$5 = jx.a($$4.u() - $$3);
      int $$6 = jx.a($$4.v() - $$3);
      int $$7 = jx.a($$4.w() - $$3);
      int $$8 = jx.a($$4.u() + $$3);
      int $$9 = jx.a($$4.v() + $$3);
      int $$10 = jx.a($$4.w() + $$3);
      List<efh.b> $$11 = new ArrayList<>();
      efk.a $$12 = ($$4x, $$5x) -> {
         if ($$4x.c() == efj.a.b) {
            $$11.add(new efh.b($$0, $$1, $$2, $$4x, $$5x));
         } else {
            $$4x.a(this.a, $$0, $$2, $$1);
         }
      };
      boolean $$13 = false;

      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$7; $$15 <= $$10; $$15++) {
            ece $$16 = this.a.m().a($$14, $$15);
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

   private void a(List<efh.b> $$0) {
      Collections.sort($$0);

      for (efh.b $$1 : $$0) {
         efj $$2 = $$1.d();
         $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
      }
   }
}
