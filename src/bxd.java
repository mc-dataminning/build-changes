import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bxd extends bwz<coh> {
   @Nullable
   private cqj c;

   public bxd(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(ard $$0, coh $$1) {
      ji $$2 = $$1.dv();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && byi.a($$0, $$1, $$2);
   }

   protected boolean a(ard $$0, coh $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(ard $$0, coh $$1, long $$2) {
      this.c = null;
      $$1.eb().a($$0.ae(), $$0.ad());
   }

   protected void c(ard $$0, coh $$1, long $$2) {
      azh $$3 = $$1.dY();
      if ($$3.a(100) == 0) {
         $$1.gx();
      }

      if ($$3.a(200) == 0 && byi.a($$0, $$1, $$1.dv())) {
         cvl $$4 = af.a(cvl.values(), $$3);
         int $$5 = $$3.a(3);
         cwo $$6 = this.a($$4, $$5);
         cpp.a(new cpk($$1.dV(), $$1, $$1.dA(), $$1.dE(), $$1.dG(), $$6), $$0, $$6);
      }
   }

   private cwo a(cvl $$0, int $$1) {
      cwo $$2 = new cwo(cws.vt);
      $$2.b(kv.af, new cze((byte)$$1, List.of(new czd(czd.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
