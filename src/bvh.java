import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bvh extends bvd<cmf> {
   @Nullable
   private cod c;

   public bvh(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(arb $$0, cmf $$1) {
      iz $$2 = $$1.dp();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bwm.a($$0, $$1, $$2);
   }

   protected boolean a(arb $$0, cmf $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(arb $$0, cmf $$1, long $$2) {
      this.c = null;
      $$1.dS().a($$0.aa(), $$0.Z());
   }

   protected void c(arb $$0, cmf $$1, long $$2) {
      azc $$3 = $$1.el();
      if ($$3.a(100) == 0) {
         $$1.gv();
      }

      if ($$3.a(200) == 0 && bwm.a($$0, $$1, $$1.dp())) {
         ctd $$4 = ac.a(ctd.values(), $$3);
         int $$5 = $$3.a(3);
         cuk $$6 = this.a($$4, $$5);
         cnf $$7 = new cnf($$1.dP(), $$1, $$1.du(), $$1.dy(), $$1.dA(), $$6);
         $$1.dP().b($$7);
      }
   }

   private cuk a(ctd $$0, int $$1) {
      cuk $$2 = new cuk(cun.uu);
      $$2.b(km.T, new cxe((byte)$$1, List.of(new cxd(cxd.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
