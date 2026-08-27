import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class blh extends bld<cbn> {
   @Nullable
   private cdh c;

   public blh(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(akt $$0, cbn $$1) {
      gw $$2 = $$1.dl();
      this.c = $$0.c($$2);
      return this.c != null && this.c.e() && bml.a($$0, $$1, $$2);
   }

   protected boolean a(akt $$0, cbn $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(akt $$0, cbn $$1, long $$2) {
      this.c = null;
      $$1.dN().a($$0.W(), $$0.V());
   }

   protected void c(akt $$0, cbn $$1, long $$2) {
      ash $$3 = $$1.ef();
      if ($$3.a(100) == 0) {
         $$1.gj();
      }

      if ($$3.a(200) == 0 && bml.a($$0, $$1, $$1.dl())) {
         chz $$4 = ac.a(chz.values(), $$3);
         int $$5 = $$3.a(3);
         cjl $$6 = this.a($$4, $$5);
         ccn $$7 = new ccn($$1.dL(), $$1, $$1.dq(), $$1.du(), $$1.dw(), $$6);
         $$1.dL().b($$7);
      }
   }

   private cjl a(chz $$0, int $$1) {
      cjl $$2 = new cjl(cjo.tA, 1);
      cjl $$3 = new cjl(cjo.tB);
      qw $$4 = $$3.a("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)cip.a.e.a());
      qw $$6 = $$2.a("Fireworks");
      rc $$7 = new rc();
      qw $$8 = $$3.b("Explosion");
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
