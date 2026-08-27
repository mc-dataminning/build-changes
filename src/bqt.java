import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bqt extends bqp<chn> {
   @Nullable
   private cjj c;

   public bqt(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(apa $$0, chn $$1) {
      ib $$2 = $$1.dj();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bry.a($$0, $$1, $$2);
   }

   protected boolean a(apa $$0, chn $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(apa $$0, chn $$1, long $$2) {
      this.c = null;
      $$1.dM().a($$0.Y(), $$0.X());
   }

   protected void c(apa $$0, chn $$1, long $$2) {
      awt $$3 = $$1.ef();
      if ($$3.a(100) == 0) {
         $$1.gq();
      }

      if ($$3.a(200) == 0 && bry.a($$0, $$1, $$1.dj())) {
         cog $$4 = ac.a(cog.values(), $$3);
         int $$5 = $$3.a(3);
         cpq $$6 = this.a($$4, $$5);
         cin $$7 = new cin($$1.dJ(), $$1, $$1.do(), $$1.ds(), $$1.du(), $$6);
         $$1.dJ().b($$7);
      }
   }

   private cpq a(cog $$0, int $$1) {
      cpq $$2 = new cpq(cpt.uq, 1);
      cpq $$3 = new cpq(cpt.ur);
      sy $$4 = $$3.b("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)cov.a.e.a());
      sy $$6 = $$2.b("Fireworks");
      te $$7 = new te();
      sy $$8 = $$3.c("Explosion");
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
