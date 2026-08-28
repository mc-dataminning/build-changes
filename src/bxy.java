import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bxy extends bxu<cpe> {
   @Nullable
   private crf c;

   public bxy(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(ash $$0, cpe $$1) {
      jh $$2 = $$1.dv();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bzd.a($$0, $$1, $$2);
   }

   protected boolean a(ash $$0, cpe $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(ash $$0, cpe $$1, long $$2) {
      this.c = null;
      $$1.eb().a($$0.ad(), $$0.ac());
   }

   protected void c(ash $$0, cpe $$1, long $$2) {
      bam $$3 = $$1.dY();
      if ($$3.a(100) == 0) {
         $$1.gr();
      }

      if ($$3.a(200) == 0 && bzd.a($$0, $$1, $$1.dv())) {
         cwh $$4 = ae.a(cwh.values(), $$3);
         int $$5 = $$3.a(3);
         cxk $$6 = this.a($$4, $$5);
         cql.a(new cqg($$1.dV(), $$1, $$1.dA(), $$1.dE(), $$1.dG(), $$6), $$0, $$6);
      }
   }

   private cxk a(cwh $$0, int $$1) {
      cxk $$2 = new cxk(cxo.vk);
      $$2.b(ku.af, new daa((byte)$$1, List.of(new czz(czz.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
