import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class css extends csu {
   private final awg<csr> a;

   public css(csu.a $$0, awg<csr> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(csz $$0, @Nullable dad $$1, List<wu> $$2, cuq $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<akg<csr>> $$4 = this.j($$0).flatMap(iw::e);
      if ($$4.isPresent()) {
         xi $$5 = wu.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static csz a(csu $$0, iw<csr> $$1) {
      csz $$2 = new csz($$0);
      $$2.b(ka.N, $$1);
      return $$2;
   }

   public static void a(csz $$0, awg<csr> $$1, ayg $$2) {
      Optional<iw<csr>> $$3 = ld.am.a($$1, $$2);
      $$3.ifPresent($$1x -> $$0.b(ka.N, $$1x));
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      csz $$3 = $$1.b($$2);
      iw<csr> $$4 = $$3.a(ka.N);
      if ($$4 != null) {
         csr $$5 = $$4.a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gv().a(this, $$5.b());
         $$1.b(avm.c.b(this));
         return bpn.b($$3);
      } else {
         return bpn.d($$3);
      }
   }

   @Override
   public int b(csz $$0) {
      Optional<iw<csr>> $$1 = this.j($$0);
      return $$1.<Integer>map($$0x -> ((csr)$$0x.a()).b()).orElse(0);
   }

   private Optional<iw<csr>> j(csz $$0) {
      iw<csr> $$1 = $$0.a(ka.N);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         Iterator<iw<csr>> $$2 = ld.am.c(this.a).iterator();
         return $$2.hasNext() ? Optional.of($$2.next()) : Optional.empty();
      }
   }

   @Override
   public cus c(csz $$0) {
      return cus.i;
   }

   private static void a(dad $$0, clh $$1, csr $$2) {
      avb $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, avd.c, $$4, 1.0F);
      $$0.a(dva.B, $$1.dl(), dva.a.a($$1));
   }
}
