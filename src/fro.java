import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class fro implements frp.a {
   private final eqx a;
   private double b = Double.MIN_VALUE;
   private List<eii> c = Collections.emptyList();

   public fro(eqx $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elr $$0, fog $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bis $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dL().d($$6, $$6.cG().g(6.0)));
      }

      elv $$7 = $$1.getBuffer(foo.x());

      for (eii $$8 : this.c) {
         foe.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}
