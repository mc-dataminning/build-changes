import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class fnc implements fnd.a {
   private final enn a;
   private double b = Double.MIN_VALUE;
   private List<efb> c = Collections.emptyList();

   public fnc(enn $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eij $$0, fjx $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bfj $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dI().c($$6, $$6.cE().g(6.0)));
      }

      ein $$7 = $$1.getBuffer(fkf.x());

      for (efb $$8 : this.c) {
         fjv.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}
