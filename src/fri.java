import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class fri implements frj.a {
   private final eqp a;
   private double b = Double.MIN_VALUE;
   private List<eia> c = Collections.emptyList();

   public fri(eqp $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elj $$0, foa $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         biw $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dL().d($$6, $$6.cG().g(6.0)));
      }

      eln $$7 = $$1.getBuffer(foi.x());

      for (eia $$8 : this.c) {
         fny.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}
