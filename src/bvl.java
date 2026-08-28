import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bvl extends bvh<cmk> {
   @Nullable
   private coi c;

   public bvl(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(aqu $$0, cmk $$1) {
      jd $$2 = $$1.dp();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bwq.a($$0, $$1, $$2);
   }

   protected boolean a(aqu $$0, cmk $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(aqu $$0, cmk $$1, long $$2) {
      this.c = null;
      $$1.dU().a($$0.aa(), $$0.Z());
   }

   protected void c(aqu $$0, cmk $$1, long $$2) {
      ayw $$3 = $$1.dS();
      if ($$3.a(100) == 0) {
         $$1.gq();
      }

      if ($$3.a(200) == 0 && bwq.a($$0, $$1, $$1.dp())) {
         cti $$4 = ad.a(cti.values(), $$3);
         int $$5 = $$3.a(3);
         cuq $$6 = this.a($$4, $$5);
         cnk $$7 = new cnk($$1.dP(), $$1, $$1.du(), $$1.dy(), $$1.dA(), $$6);
         $$1.dP().b($$7);
      }
   }

   private cuq a(cti $$0, int $$1) {
      cuq $$2 = new cuq(cut.uu);
      $$2.b(kq.V, new cxm((byte)$$1, List.of(new cxl(cxl.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
