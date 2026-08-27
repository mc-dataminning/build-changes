import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bqa extends bpw<cgu> {
   @Nullable
   private ciq c;

   public bqa(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(aov $$0, cgu $$1) {
      hz $$2 = $$1.dm();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && brf.a($$0, $$1, $$2);
   }

   protected boolean a(aov $$0, cgu $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(aov $$0, cgu $$1, long $$2) {
      this.c = null;
      $$1.dO().a($$0.Y(), $$0.X());
   }

   protected void c(aov $$0, cgu $$1, long $$2) {
      awo $$3 = $$1.eh();
      if ($$3.a(100) == 0) {
         $$1.gl();
      }

      if ($$3.a(200) == 0 && brf.a($$0, $$1, $$1.dm())) {
         cnn $$4 = ac.a(cnn.values(), $$3);
         int $$5 = $$3.a(3);
         coz $$6 = this.a($$4, $$5);
         chu $$7 = new chu($$1.dM(), $$1, $$1.dr(), $$1.dv(), $$1.dx(), $$6);
         $$1.dM().b($$7);
      }
   }

   private coz a(cnn $$0, int $$1) {
      coz $$2 = new coz(cpc.uq, 1);
      coz $$3 = new coz(cpc.ur);
      sw $$4 = $$3.a("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)cod.a.e.a());
      sw $$6 = $$2.a("Fireworks");
      tc $$7 = new tc();
      sw $$8 = $$3.b("Explosion");
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
