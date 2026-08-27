import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bsp extends bsl<cjn> {
   @Nullable
   private cll c;

   public bsp(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(apu $$0, cjn $$1) {
      id $$2 = $$1.dm();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && btu.a($$0, $$1, $$2);
   }

   protected boolean a(apu $$0, cjn $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(apu $$0, cjn $$1, long $$2) {
      this.c = null;
      $$1.dP().a($$0.Z(), $$0.Y());
   }

   protected void c(apu $$0, cjn $$1, long $$2) {
      axt $$3 = $$1.ei();
      if ($$3.a(100) == 0) {
         $$1.gs();
      }

      if ($$3.a(200) == 0 && btu.a($$0, $$1, $$1.dm())) {
         cql $$4 = ac.a(cql.values(), $$3);
         int $$5 = $$3.a(3);
         crs $$6 = this.a($$4, $$5);
         ckn $$7 = new ckn($$1.dM(), $$1, $$1.dr(), $$1.dv(), $$1.dx(), $$6);
         $$1.dM().b($$7);
      }
   }

   private crs a(cql $$0, int $$1) {
      crs $$2 = new crs(crv.us);
      $$2.b(jr.K, new cuh((byte)$$1, List.of(new cug(cug.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
