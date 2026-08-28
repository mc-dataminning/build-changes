import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class ctv extends ctx {
   private final awm<ctu> a;

   public ctv(ctx.a $$0, awm<ctu> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<akj<ctu>> $$4 = this.i($$0).flatMap(jj::e);
      if ($$4.isPresent()) {
         xi $$5 = wu.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cuc a(ctx $$0, jj<ctu> $$1) {
      cuc $$2 = new cuc($$0);
      $$2.b(kn.P, $$1);
      return $$2;
   }

   public static void a(cuc $$0, awm<ctu> $$1, ayo $$2) {
      Optional<jj<ctu>> $$3 = lq.ak.a($$1, $$2);
      $$3.ifPresent($$1x -> $$0.b(kn.P, $$1x));
   }

   @Override
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      cuc $$3 = $$1.b($$2);
      Optional<? extends jj<ctu>> $$4 = this.i($$3);
      if ($$4.isPresent()) {
         ctu $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gu().a(this, $$5.b());
         $$1.b(avr.c.b(this));
         return bqh.b($$3);
      } else {
         return bqh.d($$3);
      }
   }

   @Override
   public int a(cuc $$0, btb $$1) {
      Optional<jj<ctu>> $$2 = this.i($$0);
      return $$2.<Integer>map($$0x -> ((ctu)$$0x.a()).b()).orElse(0);
   }

   private Optional<jj<ctu>> i(cuc $$0) {
      jj<ctu> $$1 = $$0.a(kn.P);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         Iterator<jj<ctu>> $$2 = lq.ak.c(this.a).iterator();
         return $$2.hasNext() ? Optional.of($$2.next()) : Optional.empty();
      }
   }

   @Override
   public cvx b(cuc $$0) {
      return cvx.i;
   }

   private static void a(dcf $$0, cmk $$1, ctu $$2) {
      avg $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, avi.c, $$4, 1.0F);
      $$0.a(dxg.B, $$1.do(), dxg.a.a($$1));
   }
}
