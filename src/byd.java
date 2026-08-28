import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class byd extends bxz<cpj> {
   @Nullable
   private crk c;

   public byd(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(ash $$0, cpj $$1) {
      jh $$2 = $$1.dw();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bzi.a($$0, $$1, $$2);
   }

   protected boolean a(ash $$0, cpj $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(ash $$0, cpj $$1, long $$2) {
      this.c = null;
      $$1.ec().a($$0.ad(), $$0.ac());
   }

   protected void c(ash $$0, cpj $$1, long $$2) {
      bam $$3 = $$1.dZ();
      if ($$3.a(100) == 0) {
         $$1.gt();
      }

      if ($$3.a(200) == 0 && bzi.a($$0, $$1, $$1.dw())) {
         cwm $$4 = ae.a(cwm.values(), $$3);
         int $$5 = $$3.a(3);
         cxp $$6 = this.a($$4, $$5);
         cqq.a(new cql($$1.dW(), $$1, $$1.dB(), $$1.dF(), $$1.dH(), $$6), $$0, $$6);
      }
   }

   private cxp a(cwm $$0, int $$1) {
      cxp $$2 = new cxp(cxt.vk);
      $$2.b(ku.af, new daf((byte)$$1, List.of(new dae(dae.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
