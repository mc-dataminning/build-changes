import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bof extends bob<ceu> {
   @Nullable
   private cgp c;

   public bof(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(and $$0, ceu $$1) {
      hx $$2 = $$1.dm();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bpk.a($$0, $$1, $$2);
   }

   protected boolean a(and $$0, ceu $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(and $$0, ceu $$1, long $$2) {
      this.c = null;
      $$1.dO().a($$0.Y(), $$0.X());
   }

   protected void c(and $$0, ceu $$1, long $$2) {
      auu $$3 = $$1.eg();
      if ($$3.a(100) == 0) {
         $$1.gj();
      }

      if ($$3.a(200) == 0 && bpk.a($$0, $$1, $$1.dm())) {
         cll $$4 = ac.a(cll.values(), $$3);
         int $$5 = $$3.a(3);
         cmx $$6 = this.a($$4, $$5);
         cfu $$7 = new cfu($$1.dM(), $$1, $$1.dr(), $$1.dv(), $$1.dx(), $$6);
         $$1.dM().b($$7);
      }
   }

   private cmx a(cll $$0, int $$1) {
      cmx $$2 = new cmx(cna.un, 1);
      cmx $$3 = new cmx(cna.uo);
      sn $$4 = $$3.a("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)cmb.a.e.a());
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
