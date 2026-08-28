import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bwx extends bwt<cny> {
   @Nullable
   private cqa c;

   public bwx(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(arn $$0, cny $$1) {
      jh $$2 = $$1.dx();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && byc.a($$0, $$1, $$2);
   }

   protected boolean a(arn $$0, cny $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(arn $$0, cny $$1, long $$2) {
      this.c = null;
      $$1.ed().a($$0.ab(), $$0.aa());
   }

   protected void c(arn $$0, cny $$1, long $$2) {
      azs $$3 = $$1.ea();
      if ($$3.a(100) == 0) {
         $$1.gz();
      }

      if ($$3.a(200) == 0 && byc.a($$0, $$1, $$1.dx())) {
         cuy $$4 = ae.a(cuy.values(), $$3);
         int $$5 = $$3.a(3);
         cwb $$6 = this.a($$4, $$5);
         cpg.a(new cpb($$1.dX(), $$1, $$1.dC(), $$1.dG(), $$1.dI(), $$6), $$0, $$6);
      }
   }

   private cwb a(cuy $$0, int $$1) {
      cwb $$2 = new cwb(cwf.uw);
      $$2.b(ku.af, new cyr((byte)$$1, List.of(new cyq(cyq.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
