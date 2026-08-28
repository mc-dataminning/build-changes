import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bxu extends bxq<cpa> {
   @Nullable
   private crb c;

   public bxu(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(arx $$0, cpa $$1) {
      jh $$2 = $$1.dw();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && byz.a($$0, $$1, $$2);
   }

   protected boolean a(arx $$0, cpa $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(arx $$0, cpa $$1, long $$2) {
      this.c = null;
      $$1.ec().a($$0.ae(), $$0.ad());
   }

   protected void c(arx $$0, cpa $$1, long $$2) {
      bac $$3 = $$1.dZ();
      if ($$3.a(100) == 0) {
         $$1.gt();
      }

      if ($$3.a(200) == 0 && byz.a($$0, $$1, $$1.dw())) {
         cwd $$4 = ae.a(cwd.values(), $$3);
         int $$5 = $$3.a(3);
         cxg $$6 = this.a($$4, $$5);
         cqh.a(new cqc($$1.dW(), $$1, $$1.dB(), $$1.dF(), $$1.dH(), $$6), $$0, $$6);
      }
   }

   private cxg a(cwd $$0, int $$1) {
      cxg $$2 = new cxg(cxk.vt);
      $$2.b(ku.af, new czw((byte)$$1, List.of(new czv(czv.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
