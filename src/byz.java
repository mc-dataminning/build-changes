import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class byz extends byv<cqo> {
   @Nullable
   private css c;

   public byz(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(arq $$0, cqo $$1) {
      iu $$2 = $$1.dv();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && cae.a($$0, $$1, $$2);
   }

   protected boolean a(arq $$0, cqo $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(arq $$0, cqo $$1, long $$2) {
      this.c = null;
      $$1.ec().a($$0.af(), $$0.ae());
   }

   protected void c(arq $$0, cqo $$1, long $$2) {
      azv $$3 = $$1.dY();
      if ($$3.a(100) == 0) {
         $$1.gv();
      }

      if ($$3.a(200) == 0 && cae.a($$0, $$1, $$1.dv())) {
         cyb $$4 = af.a(cyb.values(), $$3);
         int $$5 = $$3.a(3);
         czd $$6 = this.a($$4, $$5);
         crx.a(new crs($$1.dV(), $$1, $$1.dA(), $$1.dE(), $$1.dG(), $$6), $$0, $$6);
      }
   }

   private czd a(cyb $$0, int $$1) {
      czd $$2 = new czd(czh.vE);
      $$2.b(kj.aj, new dbs((byte)$$1, List.of(new dbr(dbr.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
