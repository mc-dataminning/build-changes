import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bxc extends bwy<cog> {
   @Nullable
   private cqi c;

   public bxc(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(arc $$0, cog $$1) {
      ji $$2 = $$1.dw();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && byh.a($$0, $$1, $$2);
   }

   protected boolean a(arc $$0, cog $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(arc $$0, cog $$1, long $$2) {
      this.c = null;
      $$1.ec().a($$0.ae(), $$0.ad());
   }

   protected void c(arc $$0, cog $$1, long $$2) {
      azg $$3 = $$1.dZ();
      if ($$3.a(100) == 0) {
         $$1.gu();
      }

      if ($$3.a(200) == 0 && byh.a($$0, $$1, $$1.dw())) {
         cvk $$4 = af.a(cvk.values(), $$3);
         int $$5 = $$3.a(3);
         cwn $$6 = this.a($$4, $$5);
         cpo.a(new cpj($$1.dW(), $$1, $$1.dB(), $$1.dF(), $$1.dH(), $$6), $$0, $$6);
      }
   }

   private cwn a(cvk $$0, int $$1) {
      cwn $$2 = new cwn(cwr.vt);
      $$2.b(kv.af, new czd((byte)$$1, List.of(new czc(czc.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
