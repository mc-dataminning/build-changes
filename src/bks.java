import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bks extends bko<cay> {
   @Nullable
   private ccs c;

   public bks(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(aki $$0, cay $$1) {
      gv $$2 = $$1.dk();
      this.c = $$0.c($$2);
      return this.c != null && this.c.e() && blw.a($$0, $$1, $$2);
   }

   protected boolean a(aki $$0, cay $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(aki $$0, cay $$1, long $$2) {
      this.c = null;
      $$1.dM().a($$0.W(), $$0.V());
   }

   protected void c(aki $$0, cay $$1, long $$2) {
      art $$3 = $$1.ee();
      if ($$3.a(100) == 0) {
         $$1.ge();
      }

      if ($$3.a(200) == 0 && blw.a($$0, $$1, $$1.dk())) {
         chk $$4 = ac.a(chk.values(), $$3);
         int $$5 = $$3.a(3);
         ciw $$6 = this.a($$4, $$5);
         cby $$7 = new cby($$1.dK(), $$1, $$1.dp(), $$1.dt(), $$1.dv(), $$6);
         $$1.dK().b($$7);
      }
   }

   private ciw a(chk $$0, int $$1) {
      ciw $$2 = new ciw(ciz.tA, 1);
      ciw $$3 = new ciw(ciz.tB);
      qs $$4 = $$3.a("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)cia.a.e.a());
      qs $$6 = $$2.a("Fireworks");
      qy $$7 = new qy();
      qs $$8 = $$3.b("Explosion");
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
