import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bun extends buj<cll> {
   @Nullable
   private cnj c;

   public bun(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(aqn $$0, cll $$1) {
      io $$2 = $$1.dp();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bvs.a($$0, $$1, $$2);
   }

   protected boolean a(aqn $$0, cll $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(aqn $$0, cll $$1, long $$2) {
      this.c = null;
      $$1.dS().a($$0.Z(), $$0.Y());
   }

   protected void c(aqn $$0, cll $$1, long $$2) {
      aym $$3 = $$1.el();
      if ($$3.a(100) == 0) {
         $$1.gu();
      }

      if ($$3.a(200) == 0 && bvs.a($$0, $$1, $$1.dp())) {
         csj $$4 = ac.a(csj.values(), $$3);
         int $$5 = $$3.a(3);
         ctq $$6 = this.a($$4, $$5);
         cml $$7 = new cml($$1.dP(), $$1, $$1.du(), $$1.dy(), $$1.dA(), $$6);
         $$1.dP().b($$7);
      }
   }

   private ctq a(csj $$0, int $$1) {
      ctq $$2 = new ctq(ctt.uu);
      $$2.b(kb.T, new cwk((byte)$$1, List.of(new cwj(cwj.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
