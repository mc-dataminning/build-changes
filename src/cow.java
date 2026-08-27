import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cow extends coy {
   private static final String a = "instrument";
   private final aup<cov> b;

   public cow(coy.a $$0, aup<cov> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(cpd $$0, @Nullable cvr $$1, List<vq> $$2, cqu $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<aix<cov>> $$4 = this.d($$0).flatMap(ij::e);
      if ($$4.isPresent()) {
         we $$5 = vq.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cpd a(coy $$0, ij<cov> $$1) {
      cpd $$2 = new cpd($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(cpd $$0, aup<cov> $$1, awp $$2) {
      Optional<ij<cov>> $$3 = kf.an.a($$1, $$2);
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(cpd $$0, ij<cov> $$1) {
      sw $$2 = $$0.x();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      cpd $$3 = $$1.b($$2);
      Optional<? extends ij<cov>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         cov $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.go().a(this, $$5.b());
         $$1.b(atv.c.b(this));
         return blx.b($$3);
      } else {
         return blx.d($$3);
      }
   }

   @Override
   public int b(cpd $$0) {
      Optional<? extends ij<cov>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((cov)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends ij<cov>> d(cpd $$0) {
      sw $$1 = $$0.w();
      if ($$1 != null && $$1.b("instrument", 8)) {
         aiy $$2 = aiy.a($$1.l("instrument"));
         if ($$2 != null) {
            return kf.an.c($$2);
         }
      }

      Iterator<ij<cov>> $$3 = kf.an.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public cqw c(cpd $$0) {
      return cqw.i;
   }

   private static void a(cvr $$0, chl $$1, cov $$2) {
      atk $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, atm.c, $$4, 1.0F);
      $$0.a(dpw.B, $$1.dk(), dpw.a.a($$1));
   }
}
