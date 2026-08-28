import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class eal {
   private final arq a;

   public eal(arq $$0) {
      this.a = $$0;
   }

   public void a(jq<eak> $$0, ezr $$1, eak.a $$2) {
      int $$3 = $$0.a().a();
      jh $$4 = jh.a((ka)$$1);
      int $$5 = kj.a($$4.u() - $$3);
      int $$6 = kj.a($$4.v() - $$3);
      int $$7 = kj.a($$4.w() - $$3);
      int $$8 = kj.a($$4.u() + $$3);
      int $$9 = kj.a($$4.v() + $$3);
      int $$10 = kj.a($$4.w() + $$3);
      List<eak.b> $$11 = new ArrayList<>();
      ean.a $$12 = ($$4x, $$5x) -> {
         if ($$4x.c() == eam.a.b) {
            $$11.add(new eak.b($$0, $$1, $$2, $$4x, $$5x));
         } else {
            $$4x.a(this.a, $$0, $$2, $$1);
         }
      };
      boolean $$13 = false;

      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$7; $$15 <= $$10; $$15++) {
            dxj $$16 = this.a.l().a($$14, $$15);
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
         agv.a(this.a, $$0, $$1);
      }
   }

   private void a(List<eak.b> $$0) {
      Collections.sort($$0);

      for (eak.b $$1 : $$0) {
         eam $$2 = $$1.d();
         $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
      }
   }
}
