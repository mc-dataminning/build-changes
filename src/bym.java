import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bym extends byi<cpu> {
   @Nullable
   private crv c;

   public bym(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(arn $$0, cpu $$1) {
      jj $$2 = $$1.dv();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bzr.a($$0, $$1, $$2);
   }

   protected boolean a(arn $$0, cpu $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(arn $$0, cpu $$1, long $$2) {
      this.c = null;
      $$1.eb().a($$0.af(), $$0.ae());
   }

   protected void c(arn $$0, cpu $$1, long $$2) {
      azs $$3 = $$1.dY();
      if ($$3.a(100) == 0) {
         $$1.gu();
      }

      if ($$3.a(200) == 0 && bzr.a($$0, $$1, $$1.dv())) {
         cwv $$4 = af.a(cwv.values(), $$3);
         int $$5 = $$3.a(3);
         cxy $$6 = this.a($$4, $$5);
         crb.a(new cqw($$1.dV(), $$1, $$1.dA(), $$1.dE(), $$1.dG(), $$6), $$0, $$6);
      }
   }

   private cxy a(cwv $$0, int $$1) {
      cxy $$2 = new cxy(cyc.vx);
      $$2.b(kx.ah, new dal((byte)$$1, List.of(new dak(dak.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
