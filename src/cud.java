import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cud extends cuf {
   private final axb<cuc> a;

   public cud(cuf.a $$0, axb<cuc> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<ala<cuc>> $$4 = this.j($$0).flatMap(ji::e);
      if ($$4.isPresent()) {
         xz $$5 = xl.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cuk a(cuf $$0, ji<cuc> $$1) {
      cuk $$2 = new cuk($$0);
      $$2.b(km.O, $$1);
      return $$2;
   }

   public static void a(cuk $$0, axb<cuc> $$1, azc $$2) {
      Optional<ji<cuc>> $$3 = lp.am.a($$1, $$2);
      $$3.ifPresent($$1x -> $$0.b(km.O, $$1x));
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      cuk $$3 = $$1.b($$2);
      Optional<? extends ji<cuc>> $$4 = this.j($$3);
      if ($$4.isPresent()) {
         cuc $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gx().a(this, $$5.b());
         $$1.b(awg.c.b(this));
         return bqq.b($$3);
      } else {
         return bqq.d($$3);
      }
   }

   @Override
   public int b(cuk $$0) {
      Optional<ji<cuc>> $$1 = this.j($$0);
      return $$1.<Integer>map($$0x -> ((cuc)$$0x.a()).b()).orElse(0);
   }

   private Optional<ji<cuc>> j(cuk $$0) {
      ji<cuc> $$1 = $$0.a(km.O);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         Iterator<ji<cuc>> $$2 = lp.am.c(this.a).iterator();
         return $$2.hasNext() ? Optional.of($$2.next()) : Optional.empty();
      }
   }

   @Override
   public cwf c(cuk $$0) {
      return cwf.i;
   }

   private static void a(dbt $$0, cms $$1, cuc $$2) {
      avv $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, avx.c, $$4, 1.0F);
      $$0.a(dwq.B, $$1.dn(), dwq.a.a($$1));
   }
}
