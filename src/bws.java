import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bws extends bwo<cnt> {
   @Nullable
   private cpv c;

   public bws(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(arm $$0, cnt $$1) {
      jg $$2 = $$1.dx();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bxx.a($$0, $$1, $$2);
   }

   protected boolean a(arm $$0, cnt $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(arm $$0, cnt $$1, long $$2) {
      this.c = null;
      $$1.ed().a($$0.ab(), $$0.aa());
   }

   protected void c(arm $$0, cnt $$1, long $$2) {
      azr $$3 = $$1.ea();
      if ($$3.a(100) == 0) {
         $$1.gA();
      }

      if ($$3.a(200) == 0 && bxx.a($$0, $$1, $$1.dx())) {
         cuu $$4 = ad.a(cuu.values(), $$3);
         int $$5 = $$3.a(3);
         cvx $$6 = this.a($$4, $$5);
         cpb.a(new cow($$1.dX(), $$1, $$1.dC(), $$1.dG(), $$1.dI(), $$6), $$0, $$6);
      }
   }

   private cvx a(cuu $$0, int $$1) {
      cvx $$2 = new cvx(cwb.uw);
      $$2.b(kt.ae, new cyl((byte)$$1, List.of(new cyk(cyk.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
