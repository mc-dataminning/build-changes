import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bkw extends bks<cbc> {
   @Nullable
   private ccw c;

   public bkw(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(akn $$0, cbc $$1) {
      gw $$2 = $$1.dk();
      this.c = $$0.c($$2);
      return this.c != null && this.c.e() && bma.a($$0, $$1, $$2);
   }

   protected boolean a(akn $$0, cbc $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(akn $$0, cbc $$1, long $$2) {
      this.c = null;
      $$1.dM().a($$0.W(), $$0.V());
   }

   protected void c(akn $$0, cbc $$1, long $$2) {
      arx $$3 = $$1.ee();
      if ($$3.a(100) == 0) {
         $$1.gf();
      }

      if ($$3.a(200) == 0 && bma.a($$0, $$1, $$1.dk())) {
         cho $$4 = ac.a(cho.values(), $$3);
         int $$5 = $$3.a(3);
         cja $$6 = this.a($$4, $$5);
         ccc $$7 = new ccc($$1.dK(), $$1, $$1.dp(), $$1.dt(), $$1.dv(), $$6);
         $$1.dK().b($$7);
      }
   }

   private cja a(cho $$0, int $$1) {
      cja $$2 = new cja(cjd.tA, 1);
      cja $$3 = new cja(cjd.tB);
      qu $$4 = $$3.a("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)cie.a.e.a());
      qu $$6 = $$2.a("Fireworks");
      ra $$7 = new ra();
      qu $$8 = $$3.b("Explosion");
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
