import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class fqt implements fqu.a {
   private final eqm a;
   private double b = Double.MIN_VALUE;
   private List<ehx> c = Collections.emptyList();

   public fqt(eqm $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elg $$0, fnl $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bii $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dK().d($$6, $$6.cG().g(6.0)));
      }

      elk $$7 = $$1.getBuffer(fnt.x());

      for (ehx $$8 : this.c) {
         fnj.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}
