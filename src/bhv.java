import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bhv extends bhr<byb> {
   @Nullable
   private bzv c;

   public bhv(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(aif $$0, byb $$1) {
      gu $$2 = $$1.di();
      this.c = $$0.c($$2);
      return this.c != null && this.c.e() && biz.a($$0, $$1, $$2);
   }

   protected boolean a(aif $$0, byb $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(aif $$0, byb $$1, long $$2) {
      this.c = null;
      $$1.dK().a($$0.W(), $$0.V());
   }

   protected void c(aif $$0, byb $$1, long $$2) {
      apf $$3 = $$1.ec();
      if ($$3.a(100) == 0) {
         $$1.gd();
      }

      if ($$3.a(200) == 0 && biz.a($$0, $$1, $$1.di())) {
         cen $$4 = ac.a(cen.values(), $$3);
         int $$5 = $$3.a(3);
         cfz $$6 = this.a($$4, $$5);
         bzb $$7 = new bzb($$1.dI(), $$1, $$1.dn(), $$1.dr(), $$1.dt(), $$6);
         $$1.dI().b($$7);
      }
   }

   private cfz a(cen $$0, int $$1) {
      cfz $$2 = new cfz(cgc.tA, 1);
      cfz $$3 = new cfz(cgc.tB);
      qr $$4 = $$3.a("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)cfd.a.e.a());
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
