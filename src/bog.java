import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bog extends boc<cev> {
   @Nullable
   private cgq c;

   public bog(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(and $$0, cev $$1) {
      hx $$2 = $$1.dm();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bpl.a($$0, $$1, $$2);
   }

   protected boolean a(and $$0, cev $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(and $$0, cev $$1, long $$2) {
      this.c = null;
      $$1.dO().a($$0.Y(), $$0.X());
   }

   protected void c(and $$0, cev $$1, long $$2) {
      auv $$3 = $$1.eg();
      if ($$3.a(100) == 0) {
         $$1.gj();
      }

      if ($$3.a(200) == 0 && bpl.a($$0, $$1, $$1.dm())) {
         clm $$4 = ac.a(clm.values(), $$3);
         int $$5 = $$3.a(3);
         cmy $$6 = this.a($$4, $$5);
         cfv $$7 = new cfv($$1.dM(), $$1, $$1.dr(), $$1.dv(), $$1.dx(), $$6);
         $$1.dM().b($$7);
      }
   }

   private cmy a(clm $$0, int $$1) {
      cmy $$2 = new cmy(cnb.un, 1);
      cmy $$3 = new cmy(cnb.uo);
      sn $$4 = $$3.a("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)cmc.a.e.a());
      sn $$6 = $$2.a("Fireworks");
      st $$7 = new st();
      sn $$8 = $$3.b("Explosion");
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
