import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class ftp implements ftq.a {
   private final esr a;
   private double b = Double.MIN_VALUE;
   private List<ekb> c = Collections.emptyList();

   public ftp(esr $$0) {
      this.a = $$0;
   }

   @Override
   public void a(enk $$0, fqh $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bki $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dL().d($$6, $$6.cG().g(6.0)));
      }

      eno $$7 = $$1.getBuffer(fqp.w());

      for (ekb $$8 : this.c) {
         fqf.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}
