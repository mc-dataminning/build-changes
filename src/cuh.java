import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cuh extends cuj {
   private final axe<cug> a;

   public cuh(cuj.a $$0, axe<cug> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<xo> $$2, cwh $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<ald<cug>> $$4 = this.j($$0).flatMap(ji::e);
      if ($$4.isPresent()) {
         yc $$5 = xo.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cuo a(cuj $$0, ji<cug> $$1) {
      cuo $$2 = new cuo($$0);
      $$2.b(km.P, $$1);
      return $$2;
   }

   public static void a(cuo $$0, axe<cug> $$1, azg $$2) {
      Optional<ji<cug>> $$3 = lp.am.a($$1, $$2);
      $$3.ifPresent($$1x -> $$0.b(km.P, $$1x));
   }

   @Override
   public bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      cuo $$3 = $$1.b($$2);
      Optional<? extends ji<cug>> $$4 = this.j($$3);
      if ($$4.isPresent()) {
         cug $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gx().a(this, $$5.b());
         $$1.b(awj.c.b(this));
         return bqu.b($$3);
      } else {
         return bqu.d($$3);
      }
   }

   @Override
   public int b(cuo $$0) {
      Optional<ji<cug>> $$1 = this.j($$0);
      return $$1.<Integer>map($$0x -> ((cug)$$0x.a()).b()).orElse(0);
   }

   private Optional<ji<cug>> j(cuo $$0) {
      ji<cug> $$1 = $$0.a(km.P);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         Iterator<ji<cug>> $$2 = lp.am.c(this.a).iterator();
         return $$2.hasNext() ? Optional.of($$2.next()) : Optional.empty();
      }
   }

   @Override
   public cwj c(cuo $$0) {
      return cwj.i;
   }

   private static void a(dbx $$0, cmw $$1, cug $$2) {
      avy $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awa.c, $$4, 1.0F);
      $$0.a(dwu.B, $$1.dn(), dwu.a.a($$1));
   }
}
