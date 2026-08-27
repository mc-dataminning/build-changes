import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmk extends cmm {
   private static final String a = "instrument";
   private final asq<cmj> b;

   public cmk(cmm.a $$0, asq<cmj> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(cmr $$0, @Nullable cti $$1, List<vd> $$2, coi $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<ahc<cmj>> $$4 = this.d($$0).flatMap(ih::e);
      if ($$4.isPresent()) {
         vr $$5 = vd.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cmr a(cmm $$0, ih<cmj> $$1) {
      cmr $$2 = new cmr($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(cmr $$0, asq<cmj> $$1, aup $$2) {
      Optional<ih<cmj>> $$3 = kd.an.b($$1).flatMap($$1x -> $$1x.a($$2));
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(cmr $$0, ih<cmj> $$1) {
      sl $$2 = $$0.w();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      cmr $$3 = $$1.b($$2);
      Optional<? extends ih<cmj>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         cmj $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gn().a(this, $$5.b());
         $$1.b(arw.c.b(this));
         return bjw.b($$3);
      } else {
         return bjw.d($$3);
      }
   }

   @Override
   public int b(cmr $$0) {
      Optional<? extends ih<cmj>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((cmj)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends ih<cmj>> d(cmr $$0) {
      sl $$1 = $$0.v();
      if ($$1 != null && $$1.b("instrument", 8)) {
         ahd $$2 = ahd.a($$1.l("instrument"));
         if ($$2 != null) {
            return kd.an.b(ahc.a(ke.D, $$2));
         }
      }

      Iterator<ih<cmj>> $$3 = kd.an.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public cok c(cmr $$0) {
      return cok.i;
   }

   private static void a(cti $$0, cfb $$1, cmj $$2) {
      arl $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, arn.c, $$4, 1.0F);
      $$0.a(dnk.B, $$1.dk(), dnk.a.a($$1));
   }
}
