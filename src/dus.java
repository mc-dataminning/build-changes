import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dus {
   private final aqe a;

   public dus(aqe $$0) {
      this.a = $$0;
   }

   public void a(iv<dur> $$0, etf $$1, dur.a $$2) {
      int $$3 = $$0.a().a();
      im $$4 = im.a($$1);
      int $$5 = jo.a($$4.u() - $$3);
      int $$6 = jo.a($$4.v() - $$3);
      int $$7 = jo.a($$4.w() - $$3);
      int $$8 = jo.a($$4.u() + $$3);
      int $$9 = jo.a($$4.v() + $$3);
      int $$10 = jo.a($$4.w() + $$3);
      List<dur.b> $$11 = new ArrayList<>();
      duu.a $$12 = ($$4x, $$5x) -> {
         if ($$4x.c() == dut.a.b) {
            $$11.add(new dur.b($$0, $$1, $$2, $$4x, $$5x));
         } else {
            $$4x.a(this.a, $$0, $$2, $$1);
         }
      };
      boolean $$13 = false;

      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$7; $$15 <= $$10; $$15++) {
            dru $$16 = this.a.l().a($$14, $$15);
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
         afu.a(this.a, $$0, $$1);
      }
   }

   private void a(List<dur.b> $$0) {
      Collections.sort($$0);

      for (dur.b $$1 : $$0) {
         dut $$2 = $$1.d();
         $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
      }
   }
}
