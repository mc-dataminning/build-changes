import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class buy extends buu<clx> {
   @Nullable
   private cnv c;

   public buy(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(aqm $$0, clx $$1) {
      ja $$2 = $$1.dq();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bwd.a($$0, $$1, $$2);
   }

   protected boolean a(aqm $$0, clx $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(aqm $$0, clx $$1, long $$2) {
      this.c = null;
      $$1.dU().a($$0.aa(), $$0.Z());
   }

   protected void c(aqm $$0, clx $$1, long $$2) {
      ayo $$3 = $$1.dT();
      if ($$3.a(100) == 0) {
         $$1.gt();
      }

      if ($$3.a(200) == 0 && bwd.a($$0, $$1, $$1.dq())) {
         csv $$4 = ac.a(csv.values(), $$3);
         int $$5 = $$3.a(3);
         cuc $$6 = this.a($$4, $$5);
         cmx $$7 = new cmx($$1.dQ(), $$1, $$1.dv(), $$1.dz(), $$1.dB(), $$6);
         $$1.dQ().b($$7);
      }
   }

   private cuc a(csv $$0, int $$1) {
      cuc $$2 = new cuc(cuf.uu);
      $$2.b(kn.U, new cwv((byte)$$1, List.of(new cwu(cwu.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
