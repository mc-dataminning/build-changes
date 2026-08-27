import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cqf extends cqh {
   private static final String a = "instrument";
   private final avd<cqe> b;

   public cqf(cqh.a $$0, avd<cqe> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(cqm $$0, @Nullable cxb $$1, List<vu> $$2, csd $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<ajg<cqe>> $$4 = this.d($$0).flatMap(il::e);
      if ($$4.isPresent()) {
         wi $$5 = vu.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cqm a(cqh $$0, il<cqe> $$1) {
      cqm $$2 = new cqm($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(cqm $$0, avd<cqe> $$1, axd $$2) {
      Optional<il<cqe>> $$3 = ki.an.a($$1, $$2);
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(cqm $$0, il<cqe> $$1) {
      ta $$2 = $$0.x();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      cqm $$3 = $$1.b($$2);
      Optional<? extends il<cqe>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         cqe $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gu().a(this, $$5.b());
         $$1.b(aui.c.b(this));
         return bne.b($$3);
      } else {
         return bne.d($$3);
      }
   }

   @Override
   public int b(cqm $$0) {
      Optional<? extends il<cqe>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((cqe)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends il<cqe>> d(cqm $$0) {
      ta $$1 = $$0.w();
      if ($$1 != null && $$1.b("instrument", 8)) {
         ajh $$2 = ajh.a($$1.l("instrument"));
         if ($$2 != null) {
            return ki.an.c($$2);
         }
      }

      Iterator<il<cqe>> $$3 = ki.an.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public csf c(cqm $$0) {
      return csf.i;
   }

   private static void a(cxb $$0, ciu $$1, cqe $$2) {
      atx $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, atz.c, $$4, 1.0F);
      $$0.a(drp.B, $$1.dk(), drp.a.a($$1));
   }
}
