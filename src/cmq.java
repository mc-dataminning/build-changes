import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmq extends cms {
   private static final String a = "instrument";
   private final asv<cmp> b;

   public cmq(cms.a $$0, asv<cmp> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(cmx $$0, @Nullable cto $$1, List<vf> $$2, cop $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<ahf<cmp>> $$4 = this.d($$0).flatMap(ih::e);
      if ($$4.isPresent()) {
         vt $$5 = vf.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cmx a(cms $$0, ih<cmp> $$1) {
      cmx $$2 = new cmx($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(cmx $$0, asv<cmp> $$1, auu $$2) {
      Optional<ih<cmp>> $$3 = kd.an.b($$1).flatMap($$1x -> $$1x.a($$2));
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(cmx $$0, ih<cmp> $$1) {
      sn $$2 = $$0.w();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public bkb<cmx> a(cto $$0, cfh $$1, bjz $$2) {
      cmx $$3 = $$1.b($$2);
      Optional<? extends ih<cmp>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         cmp $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gn().a(this, $$5.b());
         $$1.b(asb.c.b(this));
         return bkb.b($$3);
      } else {
         return bkb.d($$3);
      }
   }

   @Override
   public int b(cmx $$0) {
      Optional<? extends ih<cmp>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((cmp)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends ih<cmp>> d(cmx $$0) {
      sn $$1 = $$0.v();
      if ($$1 != null && $$1.b("instrument", 8)) {
         ahg $$2 = ahg.a($$1.l("instrument"));
         if ($$2 != null) {
            return kd.an.b(ahf.a(ke.D, $$2));
         }
      }

      Iterator<ih<cmp>> $$3 = kd.an.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public cor c(cmx $$0) {
      return cor.i;
   }

   private static void a(cto $$0, cfh $$1, cmp $$2) {
      arq $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, ars.c, $$4, 1.0F);
      $$0.a(dnq.B, $$1.dk(), dnq.a.a($$1));
   }
}
