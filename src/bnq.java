import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bnq extends bnm<cee> {
   @Nullable
   private cfz c;

   public bnq(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(amp $$0, cee $$1) {
      hv $$2 = $$1.dm();
      this.c = $$0.c($$2);
      return this.c != null && this.c.e() && bov.a($$0, $$1, $$2);
   }

   protected boolean a(amp $$0, cee $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(amp $$0, cee $$1, long $$2) {
      this.c = null;
      $$1.dO().a($$0.X(), $$0.W());
   }

   protected void c(amp $$0, cee $$1, long $$2) {
      auf $$3 = $$1.eg();
      if ($$3.a(100) == 0) {
         $$1.gj();
      }

      if ($$3.a(200) == 0 && bov.a($$0, $$1, $$1.dm())) {
         ckv $$4 = ac.a(ckv.values(), $$3);
         int $$5 = $$3.a(3);
         cmh $$6 = this.a($$4, $$5);
         cfe $$7 = new cfe($$1.dM(), $$1, $$1.dr(), $$1.dv(), $$1.dx(), $$6);
         $$1.dM().b($$7);
      }
   }

   private cmh a(ckv $$0, int $$1) {
      cmh $$2 = new cmh(cmk.un, 1);
      cmh $$3 = new cmh(cmk.uo);
      sj $$4 = $$3.a("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)cll.a.e.a());
      sj $$6 = $$2.a("Fireworks");
      sp $$7 = new sp();
      sj $$8 = $$3.b("Explosion");
      if ($$8 != null) {
         $$7.add($$8);
      }

      $$6.a("Flight", (byte)$$1);
      if (!$$7.isEmpty()) {
         $$6.a("Explosions", $$7);
      }

      return $$2;
   }
}
