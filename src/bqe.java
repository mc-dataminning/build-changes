import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bqe extends bqa<cgy> {
   @Nullable
   private ciu c;

   public bqe(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(aow $$0, cgy $$1) {
      hz $$2 = $$1.dm();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && brj.a($$0, $$1, $$2);
   }

   protected boolean a(aow $$0, cgy $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(aow $$0, cgy $$1, long $$2) {
      this.c = null;
      $$1.dO().a($$0.Y(), $$0.X());
   }

   protected void c(aow $$0, cgy $$1, long $$2) {
      awp $$3 = $$1.eh();
      if ($$3.a(100) == 0) {
         $$1.gl();
      }

      if ($$3.a(200) == 0 && brj.a($$0, $$1, $$1.dm())) {
         cnr $$4 = ac.a(cnr.values(), $$3);
         int $$5 = $$3.a(3);
         cpd $$6 = this.a($$4, $$5);
         chy $$7 = new chy($$1.dM(), $$1, $$1.dr(), $$1.dv(), $$1.dx(), $$6);
         $$1.dM().b($$7);
      }
   }

   private cpd a(cnr $$0, int $$1) {
      cpd $$2 = new cpd(cpg.uq, 1);
      cpd $$3 = new cpd(cpg.ur);
      sw $$4 = $$3.a("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)coh.a.e.a());
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
