import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cuj extends cul {
   private final awu<cui> a;

   public cuj(cul.a $$0, awu<cui> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<wz> $$2, cwm $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<akq<cui>> $$4 = this.i($$0).flatMap(jm::e);
      if ($$4.isPresent()) {
         xn $$5 = wz.c(ad.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cuq a(cul $$0, jm<cui> $$1) {
      cuq $$2 = new cuq($$0);
      $$2.b(kq.P, $$1);
      return $$2;
   }

   public static void a(cuq $$0, awu<cui> $$1, ayw $$2) {
      Optional<jm<cui>> $$3 = lt.ak.a($$1, $$2);
      $$3.ifPresent($$1x -> $$0.b(kq.P, $$1x));
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      cuq $$3 = $$1.b($$2);
      Optional<? extends jm<cui>> $$4 = this.i($$3);
      if ($$4.isPresent()) {
         cui $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gu().a(this, $$5.b());
         $$1.b(avz.c.b(this));
         return bqs.b($$3);
      } else {
         return bqs.d($$3);
      }
   }

   @Override
   public int a(cuq $$0, btn $$1) {
      Optional<jm<cui>> $$2 = this.i($$0);
      return $$2.<Integer>map($$0x -> ((cui)$$0x.a()).b()).orElse(0);
   }

   private Optional<jm<cui>> i(cuq $$0) {
      jm<cui> $$1 = $$0.a(kq.P);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         Iterator<jm<cui>> $$2 = lt.ak.c(this.a).iterator();
         return $$2.hasNext() ? Optional.of($$2.next()) : Optional.empty();
      }
   }

   @Override
   public cwo b(cuq $$0) {
      return cwo.i;
   }

   private static void a(dcw $$0, cmx $$1, cui $$2) {
      avo $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, avq.c, $$4, 1.0F);
      $$0.a(dxz.B, $$1.dn(), dxz.a.a($$1));
   }
}
