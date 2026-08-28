import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cuk extends cum {
   private final axf<cuj> a;

   public cuk(cum.a $$0, axf<cuj> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(cur $$0, cum.b $$1, List<xp> $$2, cwk $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<ale<cuj>> $$4 = this.j($$0).flatMap(ji::e);
      if ($$4.isPresent()) {
         yd $$5 = xp.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cur a(cum $$0, ji<cuj> $$1) {
      cur $$2 = new cur($$0);
      $$2.b(km.P, $$1);
      return $$2;
   }

   public static void a(cur $$0, axf<cuj> $$1, azh $$2) {
      Optional<ji<cuj>> $$3 = lp.am.a($$1, $$2);
      $$3.ifPresent($$1x -> $$0.b(km.P, $$1x));
   }

   @Override
   public bqx<cur> a(dca $$0, cmz $$1, bqv $$2) {
      cur $$3 = $$1.b($$2);
      Optional<? extends ji<cuj>> $$4 = this.j($$3);
      if ($$4.isPresent()) {
         cuj $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gx().a(this, $$5.b());
         $$1.b(awk.c.b(this));
         return bqx.b($$3);
      } else {
         return bqx.d($$3);
      }
   }

   @Override
   public int b(cur $$0) {
      Optional<ji<cuj>> $$1 = this.j($$0);
      return $$1.<Integer>map($$0x -> ((cuj)$$0x.a()).b()).orElse(0);
   }

   private Optional<ji<cuj>> j(cur $$0) {
      ji<cuj> $$1 = $$0.a(km.P);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         Iterator<ji<cuj>> $$2 = lp.am.c(this.a).iterator();
         return $$2.hasNext() ? Optional.of($$2.next()) : Optional.empty();
      }
   }

   @Override
   public cwm c(cur $$0) {
      return cwm.i;
   }

   private static void a(dca $$0, cmz $$1, cuj $$2) {
      avz $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awb.c, $$4, 1.0F);
      $$0.a(dwx.B, $$1.dn(), dwx.a.a($$1));
   }
}
