import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bze extends bza<cqy> {
   @Nullable
   private ctc c;

   public bze(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(arq $$0, cqy $$1) {
      iv $$2 = $$1.du();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && caj.a($$0, $$1, $$2);
   }

   protected boolean a(arq $$0, cqy $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(arq $$0, cqy $$1, long $$2) {
      this.c = null;
      $$1.eb().a($$0.af(), $$0.ae());
   }

   protected void c(arq $$0, cqy $$1, long $$2) {
      azv $$3 = $$1.dX();
      if ($$3.a(100) == 0) {
         $$1.gx();
      }

      if ($$3.a(200) == 0 && caj.a($$0, $$1, $$1.du())) {
         cyl $$4 = ag.a(cyl.values(), $$3);
         int $$5 = $$3.a(3);
         czn $$6 = this.a($$4, $$5);
         csh.a(new csc($$1.dU(), $$1, $$1.dz(), $$1.dD(), $$1.dF(), $$6), $$0, $$6);
      }
   }

   private czn a(cyl $$0, int $$1) {
      czn $$2 = new czn(czr.vE);
      $$2.b(kk.aj, new dcc((byte)$$1, List.of(new dcb(dcb.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
