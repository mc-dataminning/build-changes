import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class byc extends bxy<cpi> {
   @Nullable
   private crj c;

   public byc(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(ash $$0, cpi $$1) {
      jh $$2 = $$1.dv();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bzh.a($$0, $$1, $$2);
   }

   protected boolean a(ash $$0, cpi $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(ash $$0, cpi $$1, long $$2) {
      this.c = null;
      $$1.eb().a($$0.ad(), $$0.ac());
   }

   protected void c(ash $$0, cpi $$1, long $$2) {
      bam $$3 = $$1.dY();
      if ($$3.a(100) == 0) {
         $$1.gr();
      }

      if ($$3.a(200) == 0 && bzh.a($$0, $$1, $$1.dv())) {
         cwl $$4 = ae.a(cwl.values(), $$3);
         int $$5 = $$3.a(3);
         cxo $$6 = this.a($$4, $$5);
         cqp.a(new cqk($$1.dV(), $$1, $$1.dA(), $$1.dE(), $$1.dG(), $$6), $$0, $$6);
      }
   }

   private cxo a(cwl $$0, int $$1) {
      cxo $$2 = new cxo(cxs.vk);
      $$2.b(ku.af, new dae((byte)$$1, List.of(new dad(dad.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
