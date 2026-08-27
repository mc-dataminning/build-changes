import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class bta extends bsw<cjy> {
   @Nullable
   private clw c;

   public bta(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(aqe $$0, cjy $$1) {
      im $$2 = $$1.dn();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && buf.a($$0, $$1, $$2);
   }

   protected boolean a(aqe $$0, cjy $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(aqe $$0, cjy $$1, long $$2) {
      this.c = null;
      $$1.dQ().a($$0.Z(), $$0.Y());
   }

   protected void c(aqe $$0, cjy $$1, long $$2) {
      ayd $$3 = $$1.ej();
      if ($$3.a(100) == 0) {
         $$1.gu();
      }

      if ($$3.a(200) == 0 && buf.a($$0, $$1, $$1.dn())) {
         cqw $$4 = ac.a(cqw.values(), $$3);
         int $$5 = $$3.a(3);
         csd $$6 = this.a($$4, $$5);
         cky $$7 = new cky($$1.dN(), $$1, $$1.ds(), $$1.dw(), $$1.dy(), $$6);
         $$1.dN().b($$7);
      }
   }

   private csd a(cqw $$0, int $$1) {
      csd $$2 = new csd(csg.uu);
      $$2.b(jz.K, new cuv((byte)$$1, List.of(new cuu(cuu.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
