import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ecq {
   private final ard a;

   public ecq(ard $$0) {
      this.a = $$0;
   }

   public void a(jr<ecp> $$0, fbx $$1, ecp.a $$2) {
      int $$3 = $$0.a().a();
      ji $$4 = ji.a((kb)$$1);
      int $$5 = kk.a($$4.u() - $$3);
      int $$6 = kk.a($$4.v() - $$3);
      int $$7 = kk.a($$4.w() - $$3);
      int $$8 = kk.a($$4.u() + $$3);
      int $$9 = kk.a($$4.v() + $$3);
      int $$10 = kk.a($$4.w() + $$3);
      List<ecp.b> $$11 = new ArrayList<>();
      ecs.a $$12 = ($$4x, $$5x) -> {
         if ($$4x.c() == ecr.a.b) {
            $$11.add(new ecp.b($$0, $$1, $$2, $$4x, $$5x));
         } else {
            $$4x.a(this.a, $$0, $$2, $$1);
         }
      };
      boolean $$13 = false;

      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$7; $$15 <= $$10; $$15++) {
            dzm $$16 = this.a.m().a($$14, $$15);
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
         agc.a(this.a, $$0, $$1);
      }
   }

   private void a(List<ecp.b> $$0) {
      Collections.sort($$0);

      for (ecp.b $$1 : $$0) {
         ecr $$2 = $$1.d();
         $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
      }
   }
}
