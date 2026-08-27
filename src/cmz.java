import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmz extends cnb {
   private static final String a = "instrument";
   private final asx<cmy> b;

   public cmz(cnb.a $$0, asx<cmy> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(cng $$0, @Nullable ctx $$1, List<vg> $$2, coy $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<ahg<cmy>> $$4 = this.d($$0).flatMap(ih::e);
      if ($$4.isPresent()) {
         vu $$5 = vg.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cng a(cnb $$0, ih<cmy> $$1) {
      cng $$2 = new cng($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(cng $$0, asx<cmy> $$1, auw $$2) {
      Optional<ih<cmy>> $$3 = kd.an.b($$1).flatMap($$1x -> $$1x.a($$2));
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(cng $$0, ih<cmy> $$1) {
      so $$2 = $$0.w();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      cng $$3 = $$1.b($$2);
      Optional<? extends ih<cmy>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         cmy $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gn().a(this, $$5.b());
         $$1.b(asd.c.b(this));
         return bkd.b($$3);
      } else {
         return bkd.d($$3);
      }
   }

   @Override
   public int b(cng $$0) {
      Optional<? extends ih<cmy>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((cmy)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends ih<cmy>> d(cng $$0) {
      so $$1 = $$0.v();
      if ($$1 != null && $$1.b("instrument", 8)) {
         ahh $$2 = ahh.a($$1.l("instrument"));
         if ($$2 != null) {
            return kd.an.c($$2);
         }
      }

      Iterator<ih<cmy>> $$3 = kd.an.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public cpa c(cng $$0) {
      return cpa.i;
   }

   private static void a(ctx $$0, cfq $$1, cmy $$2) {
      ars $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, aru.c, $$4, 1.0F);
      $$0.a(dnz.B, $$1.dj(), dnz.a.a($$1));
   }
}
