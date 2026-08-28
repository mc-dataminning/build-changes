import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class eab {
   private final arm a;

   public eab(arm $$0) {
      this.a = $$0;
   }

   public void a(jp<eaa> $$0, ezh $$1, eaa.a $$2) {
      int $$3 = $$0.a().a();
      jg $$4 = jg.a((jz)$$1);
      int $$5 = ki.a($$4.u() - $$3);
      int $$6 = ki.a($$4.v() - $$3);
      int $$7 = ki.a($$4.w() - $$3);
      int $$8 = ki.a($$4.u() + $$3);
      int $$9 = ki.a($$4.v() + $$3);
      int $$10 = ki.a($$4.w() + $$3);
      List<eaa.b> $$11 = new ArrayList<>();
      ead.a $$12 = ($$4x, $$5x) -> {
         if ($$4x.c() == eac.a.b) {
            $$11.add(new eaa.b($$0, $$1, $$2, $$4x, $$5x));
         } else {
            $$4x.a(this.a, $$0, $$2, $$1);
         }
      };
      boolean $$13 = false;

      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$7; $$15 <= $$10; $$15++) {
            dwz $$16 = this.a.l().a($$14, $$15);
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
         agr.a(this.a, $$0, $$1);
      }
   }

   private void a(List<eaa.b> $$0) {
      Collections.sort($$0);

      for (eaa.b $$1 : $$0) {
         eac $$2 = $$1.d();
         $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
      }
   }
}
