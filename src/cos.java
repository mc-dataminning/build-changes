import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cos extends cou {
   private static final String a = "instrument";
   private final auo<cor> b;

   public cos(cou.a $$0, auo<cor> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(coz $$0, @Nullable cvn $$1, List<vq> $$2, cqq $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<aix<cor>> $$4 = this.d($$0).flatMap(ij::e);
      if ($$4.isPresent()) {
         we $$5 = vq.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static coz a(cou $$0, ij<cor> $$1) {
      coz $$2 = new coz($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(coz $$0, auo<cor> $$1, awo $$2) {
      Optional<ij<cor>> $$3 = kf.an.a($$1, $$2);
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(coz $$0, ij<cor> $$1) {
      sw $$2 = $$0.x();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      coz $$3 = $$1.b($$2);
      Optional<? extends ij<cor>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         cor $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.go().a(this, $$5.b());
         $$1.b(atu.c.b(this));
         return blv.b($$3);
      } else {
         return blv.d($$3);
      }
   }

   @Override
   public int b(coz $$0) {
      Optional<? extends ij<cor>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((cor)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends ij<cor>> d(coz $$0) {
      sw $$1 = $$0.w();
      if ($$1 != null && $$1.b("instrument", 8)) {
         aiy $$2 = aiy.a($$1.l("instrument"));
         if ($$2 != null) {
            return kf.an.c($$2);
         }
      }

      Iterator<ij<cor>> $$3 = kf.an.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public cqs c(coz $$0) {
      return cqs.i;
   }

   private static void a(cvn $$0, chh $$1, cor $$2) {
      atj $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, atl.c, $$4, 1.0F);
      $$0.a(dpp.B, $$1.dk(), dpp.a.a($$1));
   }
}
