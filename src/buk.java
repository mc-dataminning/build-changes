import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class buk extends bug<cll> {
   @Nullable
   private cnm c;

   public buk(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(aqt $$0, cll $$1) {
      ir $$2 = $$1.du();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bvp.a($$0, $$1, $$2);
   }

   protected boolean a(aqt $$0, cll $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(aqt $$0, cll $$1, long $$2) {
      this.c = null;
      $$1.dZ().a($$0.aa(), $$0.Z());
   }

   protected void c(aqt $$0, cll $$1, long $$2) {
      ayt $$3 = $$1.et();
      if ($$3.a(100) == 0) {
         $$1.gD();
      }

      if ($$3.a(200) == 0 && bvp.a($$0, $$1, $$1.du())) {
         csy $$4 = ad.a(csy.values(), $$3);
         int $$5 = $$3.a(3);
         cuh $$6 = this.a($$4, $$5);
         cmm $$7 = new cmm($$1.dU(), $$1, $$1.dz(), $$1.dD(), $$1.dF(), $$6);
         $$1.dU().b($$7);
      }
   }

   private cuh a(csy $$0, int $$1) {
      cuh $$2 = new cuh(cuk.wf);
      $$2.b(ke.T, new cxk((byte)$$1, List.of(new cxj(cxj.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
