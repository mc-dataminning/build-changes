import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bxd extends bwz<coi> {
   @Nullable
   private cqk c;

   public bxd(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(arc $$0, coi $$1) {
      ji $$2 = $$1.dw();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && byi.a($$0, $$1, $$2);
   }

   protected boolean a(arc $$0, coi $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(arc $$0, coi $$1, long $$2) {
      this.c = null;
      $$1.ec().a($$0.ae(), $$0.ad());
   }

   protected void c(arc $$0, coi $$1, long $$2) {
      azh $$3 = $$1.dZ();
      if ($$3.a(100) == 0) {
         $$1.gu();
      }

      if ($$3.a(200) == 0 && byi.a($$0, $$1, $$1.dw())) {
         cvm $$4 = af.a(cvm.values(), $$3);
         int $$5 = $$3.a(3);
         cwp $$6 = this.a($$4, $$5);
         cpq.a(new cpl($$1.dW(), $$1, $$1.dB(), $$1.dF(), $$1.dH(), $$6), $$0, $$6);
      }
   }

   private cwp a(cvm $$0, int $$1) {
      cwp $$2 = new cwp(cwt.vt);
      $$2.b(kv.af, new czf((byte)$$1, List.of(new cze(cze.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
