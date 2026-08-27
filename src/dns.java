import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dns {
   private final and a;

   public dns(and $$0) {
      this.a = $$0;
   }

   public void a(dnr $$0, elt $$1, dnr.a $$2) {
      int $$3 = $$0.a();
      hx $$4 = hx.a($$1);
      int $$5 = iz.a($$4.u() - $$3);
      int $$6 = iz.a($$4.v() - $$3);
      int $$7 = iz.a($$4.w() - $$3);
      int $$8 = iz.a($$4.u() + $$3);
      int $$9 = iz.a($$4.v() + $$3);
      int $$10 = iz.a($$4.w() + $$3);
      List<dnr.b> $$11 = new ArrayList<>();
      dnu.a $$12 = ($$4x, $$5x) -> {
         if ($$4x.c() == dnt.a.b) {
            $$11.add(new dnr.b($$0, $$1, $$2, $$4x, $$5x));
         } else {
            $$4x.a(this.a, $$0, $$2, $$1);
         }
      };
      boolean $$13 = false;

      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$7; $$15 <= $$10; $$15++) {
            dld $$16 = this.a.l().a($$14, $$15);
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
         adi.a(this.a, $$0, $$1);
      }
   }

   private void a(List<dnr.b> $$0) {
      Collections.sort($$0);

      for (dnr.b $$1 : $$0) {
         dnt $$2 = $$1.d();
         $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
      }
   }
}
