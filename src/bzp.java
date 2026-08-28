import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bzp extends bzl<crj> {
   @Nullable
   private ctn c;

   public bzp(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(ars $$0, crj $$1) {
      iv $$2 = $$1.dv();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && cau.a($$0, $$1, $$2);
   }

   protected boolean a(ars $$0, crj $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(ars $$0, crj $$1, long $$2) {
      this.c = null;
      $$1.ec().a($$0.af(), $$0.ae());
   }

   protected void c(ars $$0, crj $$1, long $$2) {
      azx $$3 = $$1.dY();
      if ($$3.a(100) == 0) {
         $$1.gy();
      }

      if ($$3.a(200) == 0 && cau.a($$0, $$1, $$1.dv())) {
         cyw $$4 = ag.a(cyw.values(), $$3);
         int $$5 = $$3.a(3);
         czy $$6 = this.a($$4, $$5);
         css.a(new csn($$1.dV(), $$1, $$1.dA(), $$1.dE(), $$1.dG(), $$6), $$0, $$6);
      }
   }

   private czy a(cyw $$0, int $$1) {
      czy $$2 = new czy(dac.vE);
      $$2.b(kk.aj, new dcn((byte)$$1, List.of(new dcm(dcm.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
