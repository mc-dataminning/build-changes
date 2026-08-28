import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cug extends cui {
   private final axe<cuf> a;

   public cug(cui.a $$0, axe<cuf> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<ald<cuf>> $$4 = this.j($$0).flatMap(ji::e);
      if ($$4.isPresent()) {
         yc $$5 = xo.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cun a(cui $$0, ji<cuf> $$1) {
      cun $$2 = new cun($$0);
      $$2.b(km.O, $$1);
      return $$2;
   }

   public static void a(cun $$0, axe<cuf> $$1, azf $$2) {
      Optional<ji<cuf>> $$3 = lp.am.a($$1, $$2);
      $$3.ifPresent($$1x -> $$0.b(km.O, $$1x));
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      cun $$3 = $$1.b($$2);
      Optional<? extends ji<cuf>> $$4 = this.j($$3);
      if ($$4.isPresent()) {
         cuf $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gx().a(this, $$5.b());
         $$1.b(awj.c.b(this));
         return bqt.b($$3);
      } else {
         return bqt.d($$3);
      }
   }

   @Override
   public int b(cun $$0) {
      Optional<ji<cuf>> $$1 = this.j($$0);
      return $$1.<Integer>map($$0x -> ((cuf)$$0x.a()).b()).orElse(0);
   }

   private Optional<ji<cuf>> j(cun $$0) {
      ji<cuf> $$1 = $$0.a(km.O);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         Iterator<ji<cuf>> $$2 = lp.am.c(this.a).iterator();
         return $$2.hasNext() ? Optional.of($$2.next()) : Optional.empty();
      }
   }

   @Override
   public cwi c(cun $$0) {
      return cwi.i;
   }

   private static void a(dbw $$0, cmv $$1, cuf $$2) {
      avy $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awa.c, $$4, 1.0F);
      $$0.a(dwt.B, $$1.dn(), dwt.a.a($$1));
   }
}
