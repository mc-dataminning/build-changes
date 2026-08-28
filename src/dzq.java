import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dzq {
   private final arj a;

   public dzq(arj $$0) {
      this.a = $$0;
   }

   public void a(jo<dzp> $$0, eyw $$1, dzp.a $$2) {
      int $$3 = $$0.a().a();
      jf $$4 = jf.a((jy)$$1);
      int $$5 = kh.a($$4.u() - $$3);
      int $$6 = kh.a($$4.v() - $$3);
      int $$7 = kh.a($$4.w() - $$3);
      int $$8 = kh.a($$4.u() + $$3);
      int $$9 = kh.a($$4.v() + $$3);
      int $$10 = kh.a($$4.w() + $$3);
      List<dzp.b> $$11 = new ArrayList<>();
      dzs.a $$12 = ($$4x, $$5x) -> {
         if ($$4x.c() == dzr.a.b) {
            $$11.add(new dzp.b($$0, $$1, $$2, $$4x, $$5x));
         } else {
            $$4x.a(this.a, $$0, $$2, $$1);
         }
      };
      boolean $$13 = false;

      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$7; $$15 <= $$10; $$15++) {
            dwo $$16 = this.a.l().a($$14, $$15);
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
         ago.a(this.a, $$0, $$1);
      }
   }

   private void a(List<dzp.b> $$0) {
      Collections.sort($$0);

      for (dzp.b $$1 : $$0) {
         dzr $$2 = $$1.d();
         $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
      }
   }
}
