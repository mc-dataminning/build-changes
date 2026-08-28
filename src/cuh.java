import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cuh extends cuj {
   private final awt<cug> a;

   public cuh(cuj.a $$0, awt<cug> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<akp<cug>> $$4 = this.i($$0).flatMap(jm::e);
      if ($$4.isPresent()) {
         xm $$5 = wy.c(ad.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cuo a(cuj $$0, jm<cug> $$1) {
      cuo $$2 = new cuo($$0);
      $$2.b(kq.P, $$1);
      return $$2;
   }

   public static void a(cuo $$0, awt<cug> $$1, ayv $$2) {
      Optional<jm<cug>> $$3 = lt.ak.a($$1, $$2);
      $$3.ifPresent($$1x -> $$0.b(kq.P, $$1x));
   }

   @Override
   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      cuo $$3 = $$1.b($$2);
      Optional<? extends jm<cug>> $$4 = this.i($$3);
      if ($$4.isPresent()) {
         cug $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gu().a(this, $$5.b());
         $$1.b(avy.c.b(this));
         return bqr.b($$3);
      } else {
         return bqr.d($$3);
      }
   }

   @Override
   public int a(cuo $$0, btl $$1) {
      Optional<jm<cug>> $$2 = this.i($$0);
      return $$2.<Integer>map($$0x -> ((cug)$$0x.a()).b()).orElse(0);
   }

   private Optional<jm<cug>> i(cuo $$0) {
      jm<cug> $$1 = $$0.a(kq.P);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         Iterator<jm<cug>> $$2 = lt.ak.c(this.a).iterator();
         return $$2.hasNext() ? Optional.of($$2.next()) : Optional.empty();
      }
   }

   @Override
   public cwm b(cuo $$0) {
      return cwm.i;
   }

   private static void a(dcu $$0, cmv $$1, cug $$2) {
      avn $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, avp.c, $$4, 1.0F);
      $$0.a(dxw.B, $$1.do(), dxw.a.a($$1));
   }
}
