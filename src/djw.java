import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class djw {
   private final aks a;

   public djw(aks $$0) {
      this.a = $$0;
   }

   public void a(djv $$0, ehp $$1, djv.a $$2) {
      int $$3 = $$0.a();
      gw $$4 = gw.a($$1);
      int $$5 = hz.a($$4.u() - $$3);
      int $$6 = hz.a($$4.v() - $$3);
      int $$7 = hz.a($$4.w() - $$3);
      int $$8 = hz.a($$4.u() + $$3);
      int $$9 = hz.a($$4.v() + $$3);
      int $$10 = hz.a($$4.w() + $$3);
      List<djv.b> $$11 = new ArrayList<>();
      djy.a $$12 = ($$4x, $$5x) -> {
         if ($$4x.c() == djx.a.b) {
            $$11.add(new djv.b($$0, $$1, $$2, $$4x, $$5x));
         } else {
            $$4x.a(this.a, $$0, $$2, $$1);
         }
      };
      boolean $$13 = false;

      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$7; $$15 <= $$10; $$15++) {
            dhh $$16 = this.a.k().a($$14, $$15);
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
         abd.a(this.a, $$0, $$1);
      }
   }

   private void a(List<djv.b> $$0) {
      Collections.sort($$0);

      for (djv.b $$1 : $$0) {
         djx $$2 = $$1.d();
         $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
      }
   }
}
