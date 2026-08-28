import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class byu extends byq<cqe> {
   @Nullable
   private csh c;

   public byu(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(aro $$0, cqe $$1) {
      iu $$2 = $$1.dv();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bzz.a($$0, $$1, $$2);
   }

   protected boolean a(aro $$0, cqe $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(aro $$0, cqe $$1, long $$2) {
      this.c = null;
      $$1.eb().a($$0.af(), $$0.ae());
   }

   protected void c(aro $$0, cqe $$1, long $$2) {
      azt $$3 = $$1.dY();
      if ($$3.a(100) == 0) {
         $$1.gu();
      }

      if ($$3.a(200) == 0 && bzz.a($$0, $$1, $$1.dv())) {
         cxq $$4 = af.a(cxq.values(), $$3);
         int $$5 = $$3.a(3);
         cys $$6 = this.a($$4, $$5);
         crm.a(new crh($$1.dV(), $$1, $$1.dA(), $$1.dE(), $$1.dG(), $$6), $$0, $$6);
      }
   }

   private cys a(cxq $$0, int $$1) {
      cys $$2 = new cys(cyw.vx);
      $$2.b(kj.aj, new dbh((byte)$$1, List.of(new dbg(dbg.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
