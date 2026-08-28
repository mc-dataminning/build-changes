import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bvl extends bvh<cmj> {
   @Nullable
   private coh c;

   public bvl(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(are $$0, cmj $$1) {
      iz $$2 = $$1.dp();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bwq.a($$0, $$1, $$2);
   }

   protected boolean a(are $$0, cmj $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(are $$0, cmj $$1, long $$2) {
      this.c = null;
      $$1.dS().a($$0.aa(), $$0.Z());
   }

   protected void c(are $$0, cmj $$1, long $$2) {
      azg $$3 = $$1.el();
      if ($$3.a(100) == 0) {
         $$1.gv();
      }

      if ($$3.a(200) == 0 && bwq.a($$0, $$1, $$1.dp())) {
         cth $$4 = ac.a(cth.values(), $$3);
         int $$5 = $$3.a(3);
         cuo $$6 = this.a($$4, $$5);
         cnj $$7 = new cnj($$1.dP(), $$1, $$1.du(), $$1.dy(), $$1.dA(), $$6);
         $$1.dP().b($$7);
      }
   }

   private cuo a(cth $$0, int $$1) {
      cuo $$2 = new cuo(cur.uu);
      $$2.b(km.U, new cxi((byte)$$1, List.of(new cxh(cxh.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
