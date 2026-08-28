import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bwj extends bwf<cnk> {
   @Nullable
   private cpl c;

   public bwj(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(arj $$0, cnk $$1) {
      jf $$2 = $$1.ds();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bxo.a($$0, $$1, $$2);
   }

   protected boolean a(arj $$0, cnk $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(arj $$0, cnk $$1, long $$2) {
      this.c = null;
      $$1.dY().a($$0.ab(), $$0.aa());
   }

   protected void c(arj $$0, cnk $$1, long $$2) {
      azn $$3 = $$1.dV();
      if ($$3.a(100) == 0) {
         $$1.gt();
      }

      if ($$3.a(200) == 0 && bxo.a($$0, $$1, $$1.ds())) {
         cum $$4 = ad.a(cum.values(), $$3);
         int $$5 = $$3.a(3);
         cvs $$6 = this.a($$4, $$5);
         cor.a(new col($$1.dS(), $$1, $$1.dx(), $$1.dB(), $$1.dD(), $$6), $$0, $$6);
      }
   }

   private cvs a(cum $$0, int $$1) {
      cvs $$2 = new cvs(cvw.uw);
      $$2.b(ks.aa, new cym((byte)$$1, List.of(new cyl(cyl.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
