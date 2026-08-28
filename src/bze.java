import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bze extends bza<cqv> {
   @Nullable
   private csz c;

   public bze(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(arq $$0, cqv $$1) {
      iv $$2 = $$1.du();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && caj.a($$0, $$1, $$2);
   }

   protected boolean a(arq $$0, cqv $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(arq $$0, cqv $$1, long $$2) {
      this.c = null;
      $$1.eb().a($$0.af(), $$0.ae());
   }

   protected void c(arq $$0, cqv $$1, long $$2) {
      azv $$3 = $$1.dX();
      if ($$3.a(100) == 0) {
         $$1.gx();
      }

      if ($$3.a(200) == 0 && caj.a($$0, $$1, $$1.du())) {
         cyi $$4 = ag.a(cyi.values(), $$3);
         int $$5 = $$3.a(3);
         czk $$6 = this.a($$4, $$5);
         cse.a(new crz($$1.dU(), $$1, $$1.dz(), $$1.dD(), $$1.dF(), $$6), $$0, $$6);
      }
   }

   private czk a(cyi $$0, int $$1) {
      czk $$2 = new czk(czo.vE);
      $$2.b(kk.aj, new dbz((byte)$$1, List.of(new dby(dby.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
