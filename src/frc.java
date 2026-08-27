import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class frc implements frd.a {
   private final eql a;
   private double b = Double.MIN_VALUE;
   private List<ehw> c = Collections.emptyList();

   public frc(eql $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elf $$0, fnu $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bii $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dK().d($$6, $$6.cG().g(6.0)));
      }

      elj $$7 = $$1.getBuffer(foc.x());

      for (ehw $$8 : this.c) {
         fns.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}
