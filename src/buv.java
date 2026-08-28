import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class buv extends bur<clu> {
   @Nullable
   private cns c;

   public buv(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(aqk $$0, clu $$1) {
      ja $$2 = $$1.dp();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bwa.a($$0, $$1, $$2);
   }

   protected boolean a(aqk $$0, clu $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(aqk $$0, clu $$1, long $$2) {
      this.c = null;
      $$1.dT().a($$0.aa(), $$0.Z());
   }

   protected void c(aqk $$0, clu $$1, long $$2) {
      aym $$3 = $$1.dS();
      if ($$3.a(100) == 0) {
         $$1.gs();
      }

      if ($$3.a(200) == 0 && bwa.a($$0, $$1, $$1.dp())) {
         cst $$4 = ac.a(cst.values(), $$3);
         int $$5 = $$3.a(3);
         cua $$6 = this.a($$4, $$5);
         cmu $$7 = new cmu($$1.dP(), $$1, $$1.du(), $$1.dy(), $$1.dA(), $$6);
         $$1.dP().b($$7);
      }
   }

   private cua a(cst $$0, int $$1) {
      cua $$2 = new cua(cud.uu);
      $$2.b(kn.U, new cwt((byte)$$1, List.of(new cws(cws.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
