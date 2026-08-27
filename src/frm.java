import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class frm implements frn.a {
   private final eqv a;
   private double b = Double.MIN_VALUE;
   private List<eig> c = Collections.emptyList();

   public frm(eqv $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elp $$0, foe $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         biq $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dL().d($$6, $$6.cH().g(6.0)));
      }

      elt $$7 = $$1.getBuffer(fom.x());

      for (eig $$8 : this.c) {
         foc.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}
