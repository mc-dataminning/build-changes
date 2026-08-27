import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class boa extends bnw<ceo> {
   @Nullable
   private cgj c;

   public boa(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(amz $$0, ceo $$1) {
      hx $$2 = $$1.dm();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bpf.a($$0, $$1, $$2);
   }

   protected boolean a(amz $$0, ceo $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(amz $$0, ceo $$1, long $$2) {
      this.c = null;
      $$1.dO().a($$0.Y(), $$0.X());
   }

   protected void c(amz $$0, ceo $$1, long $$2) {
      aup $$3 = $$1.eg();
      if ($$3.a(100) == 0) {
         $$1.gj();
      }

      if ($$3.a(200) == 0 && bpf.a($$0, $$1, $$1.dm())) {
         clf $$4 = ac.a(clf.values(), $$3);
         int $$5 = $$3.a(3);
         cmr $$6 = this.a($$4, $$5);
         cfo $$7 = new cfo($$1.dM(), $$1, $$1.dr(), $$1.dv(), $$1.dx(), $$6);
         $$1.dM().b($$7);
      }
   }

   private cmr a(clf $$0, int $$1) {
      cmr $$2 = new cmr(cmu.un, 1);
      cmr $$3 = new cmr(cmu.uo);
      sl $$4 = $$3.a("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)clv.a.e.a());
      sl $$6 = $$2.a("Fireworks");
      sr $$7 = new sr();
      sl $$8 = $$3.b("Explosion");
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
