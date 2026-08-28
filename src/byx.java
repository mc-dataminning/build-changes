import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class byx extends byt<cqk> {
   @Nullable
   private csn c;

   public byx(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(arq $$0, cqk $$1) {
      iu $$2 = $$1.dv();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && cac.a($$0, $$1, $$2);
   }

   protected boolean a(arq $$0, cqk $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(arq $$0, cqk $$1, long $$2) {
      this.c = null;
      $$1.eb().a($$0.af(), $$0.ae());
   }

   protected void c(arq $$0, cqk $$1, long $$2) {
      azv $$3 = $$1.dY();
      if ($$3.a(100) == 0) {
         $$1.gu();
      }

      if ($$3.a(200) == 0 && cac.a($$0, $$1, $$1.dv())) {
         cxw $$4 = af.a(cxw.values(), $$3);
         int $$5 = $$3.a(3);
         cyy $$6 = this.a($$4, $$5);
         crs.a(new crn($$1.dV(), $$1, $$1.dA(), $$1.dE(), $$1.dG(), $$6), $$0, $$6);
      }
   }

   private cyy a(cxw $$0, int $$1) {
      cyy $$2 = new cyy(czc.vz);
      $$2.b(kj.aj, new dbn((byte)$$1, List.of(new dbm(dbm.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
