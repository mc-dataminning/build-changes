import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cui extends cuk {
   private final axf<cuh> a;

   public cui(cuk.a $$0, axf<cuh> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<ale<cuh>> $$4 = this.j($$0).flatMap(ji::e);
      if ($$4.isPresent()) {
         yd $$5 = xp.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cup a(cuk $$0, ji<cuh> $$1) {
      cup $$2 = new cup($$0);
      $$2.b(km.P, $$1);
      return $$2;
   }

   public static void a(cup $$0, axf<cuh> $$1, azh $$2) {
      Optional<ji<cuh>> $$3 = lp.am.a($$1, $$2);
      $$3.ifPresent($$1x -> $$0.b(km.P, $$1x));
   }

   @Override
   public bqv<cup> a(dby $$0, cmx $$1, bqt $$2) {
      cup $$3 = $$1.b($$2);
      Optional<? extends ji<cuh>> $$4 = this.j($$3);
      if ($$4.isPresent()) {
         cuh $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gx().a(this, $$5.b());
         $$1.b(awk.c.b(this));
         return bqv.b($$3);
      } else {
         return bqv.d($$3);
      }
   }

   @Override
   public int b(cup $$0) {
      Optional<ji<cuh>> $$1 = this.j($$0);
      return $$1.<Integer>map($$0x -> ((cuh)$$0x.a()).b()).orElse(0);
   }

   private Optional<ji<cuh>> j(cup $$0) {
      ji<cuh> $$1 = $$0.a(km.P);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         Iterator<ji<cuh>> $$2 = lp.am.c(this.a).iterator();
         return $$2.hasNext() ? Optional.of($$2.next()) : Optional.empty();
      }
   }

   @Override
   public cwk c(cup $$0) {
      return cwk.i;
   }

   private static void a(dby $$0, cmx $$1, cuh $$2) {
      avz $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awb.c, $$4, 1.0F);
      $$0.a(dwv.B, $$1.dn(), dwv.a.a($$1));
   }
}
