import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class frh implements fri.a {
   private final eqq a;
   private double b = Double.MIN_VALUE;
   private List<eib> c = Collections.emptyList();

   public frh(eqq $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elk $$0, fnz $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bil $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dK().d($$6, $$6.cG().g(6.0)));
      }

      elo $$7 = $$1.getBuffer(foh.x());

      for (eib $$8 : this.c) {
         fnx.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}
