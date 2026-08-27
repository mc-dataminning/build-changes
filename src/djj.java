import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class djj {
   private final aki a;

   public djj(aki $$0) {
      this.a = $$0;
   }

   public void a(dji $$0, ehf $$1, dji.a $$2) {
      int $$3 = $$0.a();
      gv $$4 = gv.a($$1);
      int $$5 = hy.a($$4.u() - $$3);
      int $$6 = hy.a($$4.v() - $$3);
      int $$7 = hy.a($$4.w() - $$3);
      int $$8 = hy.a($$4.u() + $$3);
      int $$9 = hy.a($$4.v() + $$3);
      int $$10 = hy.a($$4.w() + $$3);
      List<dji.b> $$11 = new ArrayList<>();
      djl.a $$12 = ($$4x, $$5x) -> {
         if ($$4x.c() == djk.a.b) {
            $$11.add(new dji.b($$0, $$1, $$2, $$4x, $$5x));
         } else {
            $$4x.a(this.a, $$0, $$2, $$1);
         }
      };
      boolean $$13 = false;

      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$7; $$15 <= $$10; $$15++) {
            dgu $$16 = this.a.k().a($$14, $$15);
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
         aau.a(this.a, $$0, $$1);
      }
   }

   private void a(List<dji.b> $$0) {
      Collections.sort($$0);

      for (dji.b $$1 : $$0) {
         djk $$2 = $$1.d();
         $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
      }
   }
}
