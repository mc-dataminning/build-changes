import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cqd extends cqf {
   private static final String a = "instrument";
   private final avd<cqc> b;

   public cqd(cqf.a $$0, avd<cqc> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(cqk $$0, @Nullable cwz $$1, List<vu> $$2, csb $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<ajg<cqc>> $$4 = this.d($$0).flatMap(il::e);
      if ($$4.isPresent()) {
         wi $$5 = vu.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cqk a(cqf $$0, il<cqc> $$1) {
      cqk $$2 = new cqk($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(cqk $$0, avd<cqc> $$1, axd $$2) {
      Optional<il<cqc>> $$3 = ki.an.a($$1, $$2);
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(cqk $$0, il<cqc> $$1) {
      ta $$2 = $$0.x();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      cqk $$3 = $$1.b($$2);
      Optional<? extends il<cqc>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         cqc $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gu().a(this, $$5.b());
         $$1.b(aui.c.b(this));
         return bnd.b($$3);
      } else {
         return bnd.d($$3);
      }
   }

   @Override
   public int b(cqk $$0) {
      Optional<? extends il<cqc>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((cqc)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends il<cqc>> d(cqk $$0) {
      ta $$1 = $$0.w();
      if ($$1 != null && $$1.b("instrument", 8)) {
         ajh $$2 = ajh.a($$1.l("instrument"));
         if ($$2 != null) {
            return ki.an.c($$2);
         }
      }

      Iterator<il<cqc>> $$3 = ki.an.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public csd c(cqk $$0) {
      return csd.i;
   }

   private static void a(cwz $$0, cis $$1, cqc $$2) {
      atx $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, atz.c, $$4, 1.0F);
      $$0.a(drn.B, $$1.dk(), drn.a.a($$1));
   }
}
