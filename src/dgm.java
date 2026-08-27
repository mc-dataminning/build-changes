import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dgm {
   private final aif a;

   public dgm(aif $$0) {
      this.a = $$0;
   }

   public void a(dgl $$0, eei $$1, dgl.a $$2) {
      int $$3 = $$0.b();
      gu $$4 = gu.a($$1);
      int $$5 = hx.a($$4.u() - $$3);
      int $$6 = hx.a($$4.v() - $$3);
      int $$7 = hx.a($$4.w() - $$3);
      int $$8 = hx.a($$4.u() + $$3);
      int $$9 = hx.a($$4.v() + $$3);
      int $$10 = hx.a($$4.w() + $$3);
      List<dgl.b> $$11 = new ArrayList<>();
      dgo.a $$12 = ($$4x, $$5x) -> {
         if ($$4x.c() == dgn.a.b) {
            $$11.add(new dgl.b($$0, $$1, $$2, $$4x, $$5x));
         } else {
            $$4x.a(this.a, $$0, $$2, $$1);
         }
      };
      boolean $$13 = false;

      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$7; $$15 <= $$10; $$15++) {
            ddx $$16 = this.a.k().a($$14, $$15);
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
         za.a(this.a, $$0, $$1);
      }
   }

   private void a(List<dgl.b> $$0) {
      Collections.sort($$0);

      for (dgl.b $$1 : $$0) {
         dgn $$2 = $$1.d();
         $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
      }
   }
}
