import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bvj extends bvf<cmi> {
   @Nullable
   private cog c;

   public bvj(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(aqt $$0, cmi $$1) {
      jd $$2 = $$1.dq();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bwo.a($$0, $$1, $$2);
   }

   protected boolean a(aqt $$0, cmi $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(aqt $$0, cmi $$1, long $$2) {
      this.c = null;
      $$1.dU().a($$0.aa(), $$0.Z());
   }

   protected void c(aqt $$0, cmi $$1, long $$2) {
      ayv $$3 = $$1.dT();
      if ($$3.a(100) == 0) {
         $$1.gr();
      }

      if ($$3.a(200) == 0 && bwo.a($$0, $$1, $$1.dq())) {
         ctg $$4 = ad.a(ctg.values(), $$3);
         int $$5 = $$3.a(3);
         cuo $$6 = this.a($$4, $$5);
         cni $$7 = new cni($$1.dQ(), $$1, $$1.dv(), $$1.dz(), $$1.dB(), $$6);
         $$1.dQ().b($$7);
      }
   }

   private cuo a(ctg $$0, int $$1) {
      cuo $$2 = new cuo(cur.uu);
      $$2.b(kq.V, new cxk((byte)$$1, List.of(new cxj(cxj.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
