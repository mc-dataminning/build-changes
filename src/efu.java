import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class efu {
   private final arq a;

   public efu(arq $$0) {
      this.a = $$0;
   }

   public void a(jf<eft> $$0, ffc $$1, eft.a $$2) {
      int $$3 = $$0.a().a();
      iv $$4 = iv.a((jp)$$1);
      int $$5 = jy.a($$4.u() - $$3);
      int $$6 = jy.a($$4.v() - $$3);
      int $$7 = jy.a($$4.w() - $$3);
      int $$8 = jy.a($$4.u() + $$3);
      int $$9 = jy.a($$4.v() + $$3);
      int $$10 = jy.a($$4.w() + $$3);
      List<eft.b> $$11 = new ArrayList<>();
      efw.a $$12 = ($$4x, $$5x) -> {
         if ($$4x.c() == efv.a.b) {
            $$11.add(new eft.b($$0, $$1, $$2, $$4x, $$5x));
         } else {
            $$4x.a(this.a, $$0, $$2, $$1);
         }
      };
      boolean $$13 = false;

      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$7; $$15 <= $$10; $$15++) {
            ecq $$16 = this.a.m().a($$14, $$15);
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

   private void a(List<eft.b> $$0) {
      Collections.sort($$0);

      for (eft.b $$1 : $$0) {
         efv $$2 = $$1.d();
         $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
      }
   }
}
