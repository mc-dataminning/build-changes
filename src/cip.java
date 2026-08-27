import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cip extends cir {
   private static final String a = "instrument";
   private final apy<cio> b;

   public cip(cir.a $$0, apy<cio> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(ciw $$0, @Nullable cpk $$1, List<te> $$2, ckn $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<aeo<cio>> $$4 = this.d($$0).flatMap(hf::e);
      if ($$4.isPresent()) {
         tr $$5 = te.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static ciw a(cir $$0, hf<cio> $$1) {
      ciw $$2 = new ciw($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(ciw $$0, apy<cio> $$1, art $$2) {
      Optional<hf<cio>> $$3 = jc.am.b($$1).flatMap($$1x -> $$1x.a($$2));
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(ciw $$0, hf<cio> $$1) {
      qs $$2 = $$0.w();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      ciw $$3 = $$1.b($$2);
      Optional<? extends hf<cio>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         cio $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gl().a(this, $$5.b());
         $$1.b(ape.c.b(this));
         return bgp.b($$3);
      } else {
         return bgp.d($$3);
      }
   }

   @Override
   public int b(ciw $$0) {
      Optional<? extends hf<cio>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((cio)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends hf<cio>> d(ciw $$0) {
      qs $$1 = $$0.v();
      if ($$1 != null && $$1.b("instrument", 8)) {
         aep $$2 = aep.a($$1.l("instrument"));
         if ($$2 != null) {
            return jc.am.b(aeo.a(jd.B, $$2));
         }
      }

      Iterator<hf<cio>> $$3 = jc.am.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public ckp c(ciw $$0) {
      return ckp.i;
   }

   private static void a(cpk $$0, cbl $$1, cio $$2) {
      aot $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, aov.c, $$4, 1.0F);
      $$0.a(dji.B, $$1.di(), dji.a.a($$1));
   }
}
