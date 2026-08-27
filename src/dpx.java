import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dpx {
   private final aow a;

   public dpx(aow $$0) {
      this.a = $$0;
   }

   public void a(ij<dpw> $$0, enz $$1, dpw.a $$2) {
      int $$3 = $$0.a().a();
      hz $$4 = hz.a($$1);
      int $$5 = jb.a($$4.u() - $$3);
      int $$6 = jb.a($$4.v() - $$3);
      int $$7 = jb.a($$4.w() - $$3);
      int $$8 = jb.a($$4.u() + $$3);
      int $$9 = jb.a($$4.v() + $$3);
      int $$10 = jb.a($$4.w() + $$3);
      List<dpw.b> $$11 = new ArrayList<>();
      dpz.a $$12 = ($$4x, $$5x) -> {
         if ($$4x.c() == dpy.a.b) {
            $$11.add(new dpw.b($$0, $$1, $$2, $$4x, $$5x));
         } else {
            $$4x.a(this.a, $$0, $$2, $$1);
         }
      };
      boolean $$13 = false;

      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$7; $$15 <= $$10; $$15++) {
            dnf $$16 = this.a.l().a($$14, $$15);
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
         aep.a(this.a, $$0, $$1);
      }
   }

   private void a(List<dpw.b> $$0) {
      Collections.sort($$0);

      for (dpw.b $$1 : $$0) {
         dpy $$2 = $$1.d();
         $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
      }
   }
}
