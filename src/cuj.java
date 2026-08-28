import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cuj extends cul {
   private final axf<cui> a;

   public cuj(cul.a $$0, axf<cui> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<xp> $$2, cwj $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<ale<cui>> $$4 = this.j($$0).flatMap(ji::e);
      if ($$4.isPresent()) {
         yd $$5 = xp.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cuq a(cul $$0, ji<cui> $$1) {
      cuq $$2 = new cuq($$0);
      $$2.b(km.P, $$1);
      return $$2;
   }

   public static void a(cuq $$0, axf<cui> $$1, azh $$2) {
      Optional<ji<cui>> $$3 = lp.am.a($$1, $$2);
      $$3.ifPresent($$1x -> $$0.b(km.P, $$1x));
   }

   @Override
   public bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      cuq $$3 = $$1.b($$2);
      Optional<? extends ji<cui>> $$4 = this.j($$3);
      if ($$4.isPresent()) {
         cui $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gx().a(this, $$5.b());
         $$1.b(awk.c.b(this));
         return bqw.b($$3);
      } else {
         return bqw.d($$3);
      }
   }

   @Override
   public int b(cuq $$0) {
      Optional<ji<cui>> $$1 = this.j($$0);
      return $$1.<Integer>map($$0x -> ((cui)$$0x.a()).b()).orElse(0);
   }

   private Optional<ji<cui>> j(cuq $$0) {
      ji<cui> $$1 = $$0.a(km.P);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         Iterator<ji<cui>> $$2 = lp.am.c(this.a).iterator();
         return $$2.hasNext() ? Optional.of($$2.next()) : Optional.empty();
      }
   }

   @Override
   public cwl c(cuq $$0) {
      return cwl.i;
   }

   private static void a(dbz $$0, cmy $$1, cui $$2) {
      avz $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awb.c, $$4, 1.0F);
      $$0.a(dww.B, $$1.dn(), dww.a.a($$1));
   }
}
