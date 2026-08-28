import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class buz extends buv<cly> {
   @Nullable
   private cnw c;

   public buz(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(aqm $$0, cly $$1) {
      ja $$2 = $$1.dr();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bwe.a($$0, $$1, $$2);
   }

   protected boolean a(aqm $$0, cly $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(aqm $$0, cly $$1, long $$2) {
      this.c = null;
      $$1.dV().a($$0.aa(), $$0.Z());
   }

   protected void c(aqm $$0, cly $$1, long $$2) {
      ayo $$3 = $$1.dU();
      if ($$3.a(100) == 0) {
         $$1.gs();
      }

      if ($$3.a(200) == 0 && bwe.a($$0, $$1, $$1.dr())) {
         csw $$4 = ac.a(csw.values(), $$3);
         int $$5 = $$3.a(3);
         cud $$6 = this.a($$4, $$5);
         cmy $$7 = new cmy($$1.dR(), $$1, $$1.dw(), $$1.dA(), $$1.dC(), $$6);
         $$1.dR().b($$7);
      }
   }

   private cud a(csw $$0, int $$1) {
      cud $$2 = new cud(cug.uu);
      $$2.b(kn.U, new cww((byte)$$1, List.of(new cwv(cwv.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
