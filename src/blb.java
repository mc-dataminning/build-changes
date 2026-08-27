import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class blb extends bkx<cbh> {
   @Nullable
   private cdb c;

   public blb(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(akr $$0, cbh $$1) {
      gw $$2 = $$1.dl();
      this.c = $$0.c($$2);
      return this.c != null && this.c.e() && bmf.a($$0, $$1, $$2);
   }

   protected boolean a(akr $$0, cbh $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(akr $$0, cbh $$1, long $$2) {
      this.c = null;
      $$1.dN().a($$0.W(), $$0.V());
   }

   protected void c(akr $$0, cbh $$1, long $$2) {
      asc $$3 = $$1.ef();
      if ($$3.a(100) == 0) {
         $$1.gi();
      }

      if ($$3.a(200) == 0 && bmf.a($$0, $$1, $$1.dl())) {
         cht $$4 = ac.a(cht.values(), $$3);
         int $$5 = $$3.a(3);
         cjf $$6 = this.a($$4, $$5);
         cch $$7 = new cch($$1.dL(), $$1, $$1.dq(), $$1.du(), $$1.dw(), $$6);
         $$1.dL().b($$7);
      }
   }

   private cjf a(cht $$0, int $$1) {
      cjf $$2 = new cjf(cji.tA, 1);
      cjf $$3 = new cjf(cji.tB);
      qx $$4 = $$3.a("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)cij.a.e.a());
      qx $$6 = $$2.a("Fireworks");
      rd $$7 = new rd();
      qx $$8 = $$3.b("Explosion");
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
