import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bxb extends bwx<coc> {
   @Nullable
   private cqe c;

   public bxb(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(arq $$0, coc $$1) {
      jh $$2 = $$1.dy();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && byg.a($$0, $$1, $$2);
   }

   protected boolean a(arq $$0, coc $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(arq $$0, coc $$1, long $$2) {
      this.c = null;
      $$1.ee().a($$0.ab(), $$0.aa());
   }

   protected void c(arq $$0, coc $$1, long $$2) {
      azv $$3 = $$1.eb();
      if ($$3.a(100) == 0) {
         $$1.gA();
      }

      if ($$3.a(200) == 0 && byg.a($$0, $$1, $$1.dy())) {
         cvc $$4 = ae.a(cvc.values(), $$3);
         int $$5 = $$3.a(3);
         cwf $$6 = this.a($$4, $$5);
         cpk.a(new cpf($$1.dY(), $$1, $$1.dD(), $$1.dH(), $$1.dJ(), $$6), $$0, $$6);
      }
   }

   private cwf a(cvc $$0, int $$1) {
      cwf $$2 = new cwf(cwj.uM);
      $$2.b(ku.af, new cyv((byte)$$1, List.of(new cyu(cyu.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
