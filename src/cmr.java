import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmr extends cmt {
   private static final String a = "instrument";
   private final asw<cmq> b;

   public cmr(cmt.a $$0, asw<cmq> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(cmy $$0, @Nullable ctp $$1, List<vf> $$2, coq $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<ahf<cmq>> $$4 = this.d($$0).flatMap(ih::e);
      if ($$4.isPresent()) {
         vt $$5 = vf.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cmy a(cmt $$0, ih<cmq> $$1) {
      cmy $$2 = new cmy($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(cmy $$0, asw<cmq> $$1, auv $$2) {
      Optional<ih<cmq>> $$3 = kd.an.b($$1).flatMap($$1x -> $$1x.a($$2));
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(cmy $$0, ih<cmq> $$1) {
      sn $$2 = $$0.w();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public bkc<cmy> a(ctp $$0, cfi $$1, bka $$2) {
      cmy $$3 = $$1.b($$2);
      Optional<? extends ih<cmq>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         cmq $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gn().a(this, $$5.b());
         $$1.b(asc.c.b(this));
         return bkc.b($$3);
      } else {
         return bkc.d($$3);
      }
   }

   @Override
   public int b(cmy $$0) {
      Optional<? extends ih<cmq>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((cmq)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends ih<cmq>> d(cmy $$0) {
      sn $$1 = $$0.v();
      if ($$1 != null && $$1.b("instrument", 8)) {
         ahg $$2 = ahg.a($$1.l("instrument"));
         if ($$2 != null) {
            return kd.an.b(ahf.a(ke.D, $$2));
         }
      }

      Iterator<ih<cmq>> $$3 = kd.an.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public cos c(cmy $$0) {
      return cos.i;
   }

   private static void a(ctp $$0, cfi $$1, cmq $$2) {
      arr $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, art.c, $$4, 1.0F);
      $$0.a(dnr.B, $$1.dk(), dnr.a.a($$1));
   }
}
