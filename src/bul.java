import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bul extends buh<clj> {
   @Nullable
   private cnh c;

   public bul(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(aqm $$0, clj $$1) {
      io $$2 = $$1.dp();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bvq.a($$0, $$1, $$2);
   }

   protected boolean a(aqm $$0, clj $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(aqm $$0, clj $$1, long $$2) {
      this.c = null;
      $$1.dS().a($$0.Z(), $$0.Y());
   }

   protected void c(aqm $$0, clj $$1, long $$2) {
      ayk $$3 = $$1.el();
      if ($$3.a(100) == 0) {
         $$1.gu();
      }

      if ($$3.a(200) == 0 && bvq.a($$0, $$1, $$1.dp())) {
         csh $$4 = ac.a(csh.values(), $$3);
         int $$5 = $$3.a(3);
         cto $$6 = this.a($$4, $$5);
         cmj $$7 = new cmj($$1.dP(), $$1, $$1.du(), $$1.dy(), $$1.dA(), $$6);
         $$1.dP().b($$7);
      }
   }

   private cto a(csh $$0, int $$1) {
      cto $$2 = new cto(ctr.uu);
      $$2.b(kb.T, new cwi((byte)$$1, List.of(new cwh(cwh.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
