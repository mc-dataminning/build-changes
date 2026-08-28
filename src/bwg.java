import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bwg extends bwc<cnh> {
   @Nullable
   private cpi c;

   public bwg(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(arh $$0, cnh $$1) {
      je $$2 = $$1.ds();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bxl.a($$0, $$1, $$2);
   }

   protected boolean a(arh $$0, cnh $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(arh $$0, cnh $$1, long $$2) {
      this.c = null;
      $$1.dX().a($$0.ab(), $$0.aa());
   }

   protected void c(arh $$0, cnh $$1, long $$2) {
      azl $$3 = $$1.dV();
      if ($$3.a(100) == 0) {
         $$1.gu();
      }

      if ($$3.a(200) == 0 && bxl.a($$0, $$1, $$1.ds())) {
         cuj $$4 = ad.a(cuj.values(), $$3);
         int $$5 = $$3.a(3);
         cvp $$6 = this.a($$4, $$5);
         coo.a(new coi($$1.dS(), $$1, $$1.dx(), $$1.dB(), $$1.dD(), $$6), $$0, $$6);
      }
   }

   private cvp a(cuj $$0, int $$1) {
      cvp $$2 = new cvp(cvt.uw);
      $$2.b(kr.aa, new cyj((byte)$$1, List.of(new cyi(cyi.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
