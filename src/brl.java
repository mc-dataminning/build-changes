import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class brl extends brh<cih> {
   @Nullable
   private ckf c;

   public brl(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(apf $$0, cih $$1) {
      ib $$2 = $$1.dm();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bsq.a($$0, $$1, $$2);
   }

   protected boolean a(apf $$0, cih $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(apf $$0, cih $$1, long $$2) {
      this.c = null;
      $$1.dP().a($$0.Y(), $$0.X());
   }

   protected void c(apf $$0, cih $$1, long $$2) {
      axd $$3 = $$1.ei();
      if ($$3.a(100) == 0) {
         $$1.gs();
      }

      if ($$3.a(200) == 0 && bsq.a($$0, $$1, $$1.dm())) {
         cpd $$4 = ac.a(cpd.values(), $$3);
         int $$5 = $$3.a(3);
         cqm $$6 = this.a($$4, $$5);
         cjh $$7 = new cjh($$1.dM(), $$1, $$1.dr(), $$1.dv(), $$1.dx(), $$6);
         $$1.dM().b($$7);
      }
   }

   private cqm a(cpd $$0, int $$1) {
      cqm $$2 = new cqm(cqp.us, 1);
      cqm $$3 = new cqm(cqp.ut);
      ta $$4 = $$3.b("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)cpr.a.e.a());
      ta $$6 = $$2.b("Fireworks");
      tg $$7 = new tg();
      ta $$8 = $$3.c("Explosion");
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
