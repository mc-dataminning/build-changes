import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bsk extends bsg<cjg> {
   @Nullable
   private cle c;

   public bsk(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(aps $$0, cjg $$1) {
      ib $$2 = $$1.dm();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && btp.a($$0, $$1, $$2);
   }

   protected boolean a(aps $$0, cjg $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(aps $$0, cjg $$1, long $$2) {
      this.c = null;
      $$1.dP().a($$0.Z(), $$0.Y());
   }

   protected void c(aps $$0, cjg $$1, long $$2) {
      axr $$3 = $$1.ei();
      if ($$3.a(100) == 0) {
         $$1.gs();
      }

      if ($$3.a(200) == 0 && btp.a($$0, $$1, $$1.dm())) {
         cqc $$4 = ac.a(cqc.values(), $$3);
         int $$5 = $$3.a(3);
         crj $$6 = this.a($$4, $$5);
         ckg $$7 = new ckg($$1.dM(), $$1, $$1.dr(), $$1.dv(), $$1.dx(), $$6);
         $$1.dM().b($$7);
      }
   }

   private crj a(cqc $$0, int $$1) {
      crj $$2 = new crj(crm.us);
      $$2.b(jp.K, new cty((byte)$$1, List.of(new ctx(ctx.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
