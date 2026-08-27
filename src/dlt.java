import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dlt {
   private final ame a;

   public dlt(ame $$0) {
      this.a = $$0;
   }

   public void a(dls $$0, eju $$1, dls.a $$2) {
      int $$3 = $$0.a();
      ht $$4 = ht.a($$1);
      int $$5 = iu.a($$4.u() - $$3);
      int $$6 = iu.a($$4.v() - $$3);
      int $$7 = iu.a($$4.w() - $$3);
      int $$8 = iu.a($$4.u() + $$3);
      int $$9 = iu.a($$4.v() + $$3);
      int $$10 = iu.a($$4.w() + $$3);
      List<dls.b> $$11 = new ArrayList<>();
      dlv.a $$12 = ($$4x, $$5x) -> {
         if ($$4x.c() == dlu.a.b) {
            $$11.add(new dls.b($$0, $$1, $$2, $$4x, $$5x));
         } else {
            $$4x.a(this.a, $$0, $$2, $$1);
         }
      };
      boolean $$13 = false;

      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$7; $$15 <= $$10; $$15++) {
            dje $$16 = this.a.k().a($$14, $$15);
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
         ack.a(this.a, $$0, $$1);
      }
   }

   private void a(List<dls.b> $$0) {
      Collections.sort($$0);

      for (dls.b $$1 : $$0) {
         dlu $$2 = $$1.d();
         $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
      }
   }
}
