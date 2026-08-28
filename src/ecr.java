import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ecr {
   private final ash a;

   public ecr(ash $$0) {
      this.a = $$0;
   }

   public void a(jq<ecq> $$0, fbx $$1, ecq.a $$2) {
      int $$3 = $$0.a().a();
      jh $$4 = jh.a((ka)$$1);
      int $$5 = kj.a($$4.u() - $$3);
      int $$6 = kj.a($$4.v() - $$3);
      int $$7 = kj.a($$4.w() - $$3);
      int $$8 = kj.a($$4.u() + $$3);
      int $$9 = kj.a($$4.v() + $$3);
      int $$10 = kj.a($$4.w() + $$3);
      List<ecq.b> $$11 = new ArrayList<>();
      ect.a $$12 = ($$4x, $$5x) -> {
         if ($$4x.c() == ecs.a.b) {
            $$11.add(new ecq.b($$0, $$1, $$2, $$4x, $$5x));
         } else {
            $$4x.a(this.a, $$0, $$2, $$1);
         }
      };
      boolean $$13 = false;

      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$7; $$15 <= $$10; $$15++) {
            dzp $$16 = this.a.m().a($$14, $$15);
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
         ahj.a(this.a, $$0, $$1);
      }
   }

   private void a(List<ecq.b> $$0) {
      Collections.sort($$0);

      for (ecq.b $$1 : $$0) {
         ecs $$2 = $$1.d();
         $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
      }
   }
}
