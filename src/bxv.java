import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bxv extends bxr<cpd> {
   @Nullable
   private cre c;

   public bxv(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(ard $$0, cpd $$1) {
      ji $$2 = $$1.du();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bza.a($$0, $$1, $$2);
   }

   protected boolean a(ard $$0, cpd $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(ard $$0, cpd $$1, long $$2) {
      this.c = null;
      $$1.ea().a($$0.af(), $$0.ae());
   }

   protected void c(ard $$0, cpd $$1, long $$2) {
      azh $$3 = $$1.dX();
      if ($$3.a(100) == 0) {
         $$1.gw();
      }

      if ($$3.a(200) == 0 && bza.a($$0, $$1, $$1.du())) {
         cwe $$4 = af.a(cwe.values(), $$3);
         int $$5 = $$3.a(3);
         cxh $$6 = this.a($$4, $$5);
         cqk.a(new cqf($$1.dU(), $$1, $$1.dz(), $$1.dD(), $$1.dF(), $$6), $$0, $$6);
      }
   }

   private cxh a(cwe $$0, int $$1) {
      cxh $$2 = new cxh(cxl.vv);
      $$2.b(kv.ah, new czv((byte)$$1, List.of(new czu(czu.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
