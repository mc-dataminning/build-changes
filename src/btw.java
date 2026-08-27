import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class btw extends bts<cku> {
   @Nullable
   private cms c;

   public btw(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(aqh $$0, cku $$1) {
      in $$2 = $$1.dn();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bvb.a($$0, $$1, $$2);
   }

   protected boolean a(aqh $$0, cku $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(aqh $$0, cku $$1, long $$2) {
      this.c = null;
      $$1.dQ().a($$0.Z(), $$0.Y());
   }

   protected void c(aqh $$0, cku $$1, long $$2) {
      ayg $$3 = $$1.ej();
      if ($$3.a(100) == 0) {
         $$1.gu();
      }

      if ($$3.a(200) == 0 && bvb.a($$0, $$1, $$1.dn())) {
         crs $$4 = ac.a(crs.values(), $$3);
         int $$5 = $$3.a(3);
         csz $$6 = this.a($$4, $$5);
         clu $$7 = new clu($$1.dN(), $$1, $$1.ds(), $$1.dw(), $$1.dy(), $$6);
         $$1.dN().b($$7);
      }
   }

   private csz a(crs $$0, int $$1) {
      csz $$2 = new csz(ctc.uu);
      $$2.b(ka.R, new cvr((byte)$$1, List.of(new cvq(cvq.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
