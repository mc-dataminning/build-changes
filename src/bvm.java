import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bvm extends bvi<cmk> {
   @Nullable
   private coi c;

   public bvm(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(arf $$0, cmk $$1) {
      iz $$2 = $$1.dp();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bwr.a($$0, $$1, $$2);
   }

   protected boolean a(arf $$0, cmk $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(arf $$0, cmk $$1, long $$2) {
      this.c = null;
      $$1.dS().a($$0.aa(), $$0.Z());
   }

   protected void c(arf $$0, cmk $$1, long $$2) {
      azh $$3 = $$1.el();
      if ($$3.a(100) == 0) {
         $$1.gv();
      }

      if ($$3.a(200) == 0 && bwr.a($$0, $$1, $$1.dp())) {
         cti $$4 = ac.a(cti.values(), $$3);
         int $$5 = $$3.a(3);
         cup $$6 = this.a($$4, $$5);
         cnk $$7 = new cnk($$1.dP(), $$1, $$1.du(), $$1.dy(), $$1.dA(), $$6);
         $$1.dP().b($$7);
      }
   }

   private cup a(cti $$0, int $$1) {
      cup $$2 = new cup(cus.uu);
      $$2.b(km.U, new cxj((byte)$$1, List.of(new cxi(cxi.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
