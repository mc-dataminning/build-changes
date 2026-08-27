import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dna {
   private final amp a;

   public dna(amp $$0) {
      this.a = $$0;
   }

   public void a(dmz $$0, elb $$1, dmz.a $$2) {
      int $$3 = $$0.a();
      hv $$4 = hv.a($$1);
      int $$5 = ix.a($$4.u() - $$3);
      int $$6 = ix.a($$4.v() - $$3);
      int $$7 = ix.a($$4.w() - $$3);
      int $$8 = ix.a($$4.u() + $$3);
      int $$9 = ix.a($$4.v() + $$3);
      int $$10 = ix.a($$4.w() + $$3);
      List<dmz.b> $$11 = new ArrayList<>();
      dnc.a $$12 = ($$4x, $$5x) -> {
         if ($$4x.c() == dnb.a.b) {
            $$11.add(new dmz.b($$0, $$1, $$2, $$4x, $$5x));
         } else {
            $$4x.a(this.a, $$0, $$2, $$1);
         }
      };
      boolean $$13 = false;

      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$7; $$15 <= $$10; $$15++) {
            dkl $$16 = this.a.k().a($$14, $$15);
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
         acv.a(this.a, $$0, $$1);
      }
   }

   private void a(List<dmz.b> $$0) {
      Collections.sort($$0);

      for (dmz.b $$1 : $$0) {
         dnb $$2 = $$1.d();
         $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
      }
   }
}
