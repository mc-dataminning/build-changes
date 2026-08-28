import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bwb extends bvx<cnc> {
   @Nullable
   private cpc c;

   public bwb(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(arg $$0, cnc $$1) {
      je $$2 = $$1.ds();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bxg.a($$0, $$1, $$2);
   }

   protected boolean a(arg $$0, cnc $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(arg $$0, cnc $$1, long $$2) {
      this.c = null;
      $$1.dX().a($$0.ab(), $$0.aa());
   }

   protected void c(arg $$0, cnc $$1, long $$2) {
      azk $$3 = $$1.dV();
      if ($$3.a(100) == 0) {
         $$1.gt();
      }

      if ($$3.a(200) == 0 && bxg.a($$0, $$1, $$1.ds())) {
         cue $$4 = ad.a(cue.values(), $$3);
         int $$5 = $$3.a(3);
         cvl $$6 = this.a($$4, $$5);
         coi.a(new cod($$1.dS(), $$1, $$1.dx(), $$1.dB(), $$1.dD(), $$6), $$0, $$6);
      }
   }

   private cvl a(cue $$0, int $$1) {
      cvl $$2 = new cvl(cvo.uw);
      $$2.b(kr.X, new cyf((byte)$$1, List.of(new cye(cye.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
