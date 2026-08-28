import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bzr extends bzn<crl> {
   @Nullable
   private ctp c;

   public bzr(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(aru $$0, crl $$1) {
      iw $$2 = $$1.dv();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && caw.a($$0, $$1, $$2);
   }

   protected boolean a(aru $$0, crl $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(aru $$0, crl $$1, long $$2) {
      this.c = null;
      $$1.ec().a($$0.af(), $$0.ae());
   }

   protected void c(aru $$0, crl $$1, long $$2) {
      azz $$3 = $$1.dY();
      if ($$3.a(100) == 0) {
         $$1.gy();
      }

      if ($$3.a(200) == 0 && caw.a($$0, $$1, $$1.dv())) {
         cyy $$4 = ag.a(cyy.values(), $$3);
         int $$5 = $$3.a(3);
         daa $$6 = this.a($$4, $$5);
         csu.a(new csp($$1.dV(), $$1, $$1.dA(), $$1.dE(), $$1.dG(), $$6), $$0, $$6);
      }
   }

   private daa a(cyy $$0, int $$1) {
      daa $$2 = new daa(dae.vE);
      $$2.b(kl.aj, new dcp((byte)$$1, List.of(new dco(dco.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
