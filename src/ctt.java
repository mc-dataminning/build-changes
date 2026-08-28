import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class ctt extends ctv {
   private final awk<cts> a;

   public ctt(ctv.a $$0, awk<cts> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<akj<cts>> $$4 = this.i($$0).flatMap(jj::e);
      if ($$4.isPresent()) {
         xi $$5 = wu.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cua a(ctv $$0, jj<cts> $$1) {
      cua $$2 = new cua($$0);
      $$2.b(kn.P, $$1);
      return $$2;
   }

   public static void a(cua $$0, awk<cts> $$1, aym $$2) {
      Optional<jj<cts>> $$3 = lq.ak.a($$1, $$2);
      $$3.ifPresent($$1x -> $$0.b(kn.P, $$1x));
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      cua $$3 = $$1.b($$2);
      Optional<? extends jj<cts>> $$4 = this.i($$3);
      if ($$4.isPresent()) {
         cts $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gt().a(this, $$5.b());
         $$1.b(avp.c.b(this));
         return bqe.b($$3);
      } else {
         return bqe.d($$3);
      }
   }

   @Override
   public int a(cua $$0, bsy $$1) {
      Optional<jj<cts>> $$2 = this.i($$0);
      return $$2.<Integer>map($$0x -> ((cts)$$0x.a()).b()).orElse(0);
   }

   private Optional<jj<cts>> i(cua $$0) {
      jj<cts> $$1 = $$0.a(kn.P);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         Iterator<jj<cts>> $$2 = lq.ak.c(this.a).iterator();
         return $$2.hasNext() ? Optional.of($$2.next()) : Optional.empty();
      }
   }

   @Override
   public cvv b(cua $$0) {
      return cvv.i;
   }

   private static void a(dcd $$0, cmh $$1, cts $$2) {
      ave $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, avg.c, $$4, 1.0F);
      $$0.a(dxa.B, $$1.dn(), dxa.a.a($$1));
   }
}
