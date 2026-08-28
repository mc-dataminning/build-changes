import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dxh {
   private final aqm a;

   public dxh(aqm $$0) {
      this.a = $$0;
   }

   public void a(jj<dxg> $$0, ewf $$1, dxg.a $$2) {
      int $$3 = $$0.a().a();
      ja $$4 = ja.a($$1);
      int $$5 = kc.a($$4.u() - $$3);
      int $$6 = kc.a($$4.v() - $$3);
      int $$7 = kc.a($$4.w() - $$3);
      int $$8 = kc.a($$4.u() + $$3);
      int $$9 = kc.a($$4.v() + $$3);
      int $$10 = kc.a($$4.w() + $$3);
      List<dxg.b> $$11 = new ArrayList<>();
      dxj.a $$12 = ($$4x, $$5x) -> {
         if ($$4x.c() == dxi.a.b) {
            $$11.add(new dxg.b($$0, $$1, $$2, $$4x, $$5x));
         } else {
            $$4x.a(this.a, $$0, $$2, $$1);
         }
      };
      boolean $$13 = false;

      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$7; $$15 <= $$10; $$15++) {
            dug $$16 = this.a.l().a($$14, $$15);
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
         afy.a(this.a, $$0, $$1);
      }
   }

   private void a(List<dxg.b> $$0) {
      Collections.sort($$0);

      for (dxg.b $$1 : $$0) {
         dxi $$2 = $$1.d();
         $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
      }
   }
}
