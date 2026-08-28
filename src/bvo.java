import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bvo extends bvk<cmm> {
   @Nullable
   private cok c;

   public bvo(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(arf $$0, cmm $$1) {
      iz $$2 = $$1.dp();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bwt.a($$0, $$1, $$2);
   }

   protected boolean a(arf $$0, cmm $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(arf $$0, cmm $$1, long $$2) {
      this.c = null;
      $$1.dS().a($$0.aa(), $$0.Z());
   }

   protected void c(arf $$0, cmm $$1, long $$2) {
      azh $$3 = $$1.el();
      if ($$3.a(100) == 0) {
         $$1.gv();
      }

      if ($$3.a(200) == 0 && bwt.a($$0, $$1, $$1.dp())) {
         ctk $$4 = ac.a(ctk.values(), $$3);
         int $$5 = $$3.a(3);
         cur $$6 = this.a($$4, $$5);
         cnm $$7 = new cnm($$1.dP(), $$1, $$1.du(), $$1.dy(), $$1.dA(), $$6);
         $$1.dP().b($$7);
      }
   }

   private cur a(ctk $$0, int $$1) {
      cur $$2 = new cur(cuu.uu);
      $$2.b(km.U, new cxl((byte)$$1, List.of(new cxk(cxk.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
