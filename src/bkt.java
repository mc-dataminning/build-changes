import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bkt extends bkp<caz> {
   @Nullable
   private cct c;

   public bkt(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(akk $$0, caz $$1) {
      gu $$2 = $$1.dk();
      this.c = $$0.c($$2);
      return this.c != null && this.c.e() && blx.a($$0, $$1, $$2);
   }

   protected boolean a(akk $$0, caz $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(akk $$0, caz $$1, long $$2) {
      this.c = null;
      $$1.dM().a($$0.W(), $$0.V());
   }

   protected void c(akk $$0, caz $$1, long $$2) {
      aru $$3 = $$1.ee();
      if ($$3.a(100) == 0) {
         $$1.gf();
      }

      if ($$3.a(200) == 0 && blx.a($$0, $$1, $$1.dk())) {
         chl $$4 = ac.a(chl.values(), $$3);
         int $$5 = $$3.a(3);
         cix $$6 = this.a($$4, $$5);
         cbz $$7 = new cbz($$1.dK(), $$1, $$1.dp(), $$1.dt(), $$1.dv(), $$6);
         $$1.dK().b($$7);
      }
   }

   private cix a(chl $$0, int $$1) {
      cix $$2 = new cix(cja.tA, 1);
      cix $$3 = new cix(cja.tB);
      qr $$4 = $$3.a("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)cib.a.e.a());
      qr $$6 = $$2.a("Fireworks");
      qx $$7 = new qx();
      qr $$8 = $$3.b("Explosion");
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
