import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dya {
   private final aqu a;

   public dya(aqu $$0) {
      this.a = $$0;
   }

   public void a(jm<dxz> $$0, exa $$1, dxz.a $$2) {
      int $$3 = $$0.a().a();
      jd $$4 = jd.a((jw)$$1);
      int $$5 = kf.a($$4.u() - $$3);
      int $$6 = kf.a($$4.v() - $$3);
      int $$7 = kf.a($$4.w() - $$3);
      int $$8 = kf.a($$4.u() + $$3);
      int $$9 = kf.a($$4.v() + $$3);
      int $$10 = kf.a($$4.w() + $$3);
      List<dxz.b> $$11 = new ArrayList<>();
      dyc.a $$12 = ($$4x, $$5x) -> {
         if ($$4x.c() == dyb.a.b) {
            $$11.add(new dxz.b($$0, $$1, $$2, $$4x, $$5x));
         } else {
            $$4x.a(this.a, $$0, $$2, $$1);
         }
      };
      boolean $$13 = false;

      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$7; $$15 <= $$10; $$15++) {
            duy $$16 = this.a.l().a($$14, $$15);
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
         agf.a(this.a, $$0, $$1);
      }
   }

   private void a(List<dxz.b> $$0) {
      Collections.sort($$0);

      for (dxz.b $$1 : $$0) {
         dyb $$2 = $$1.d();
         $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
      }
   }
}
