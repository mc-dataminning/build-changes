import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bvk extends bvg<cmi> {
   @Nullable
   private cog c;

   public bvk(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(are $$0, cmi $$1) {
      iz $$2 = $$1.dp();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bwp.a($$0, $$1, $$2);
   }

   protected boolean a(are $$0, cmi $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(are $$0, cmi $$1, long $$2) {
      this.c = null;
      $$1.dS().a($$0.aa(), $$0.Z());
   }

   protected void c(are $$0, cmi $$1, long $$2) {
      azf $$3 = $$1.el();
      if ($$3.a(100) == 0) {
         $$1.gv();
      }

      if ($$3.a(200) == 0 && bwp.a($$0, $$1, $$1.dp())) {
         ctg $$4 = ac.a(ctg.values(), $$3);
         int $$5 = $$3.a(3);
         cun $$6 = this.a($$4, $$5);
         cni $$7 = new cni($$1.dP(), $$1, $$1.du(), $$1.dy(), $$1.dA(), $$6);
         $$1.dP().b($$7);
      }
   }

   private cun a(ctg $$0, int $$1) {
      cun $$2 = new cun(cuq.uu);
      $$2.b(km.T, new cxh((byte)$$1, List.of(new cxg(cxg.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
