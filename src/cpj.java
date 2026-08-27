import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpj extends cpl {
   private static final String a = "instrument";
   private final aut<cpi> b;

   public cpj(cpl.a $$0, aut<cpi> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(cpq $$0, @Nullable cwe $$1, List<vs> $$2, crh $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<ajb<cpi>> $$4 = this.d($$0).flatMap(il::e);
      if ($$4.isPresent()) {
         wg $$5 = vs.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cpq a(cpl $$0, il<cpi> $$1) {
      cpq $$2 = new cpq($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(cpq $$0, aut<cpi> $$1, awt $$2) {
      Optional<il<cpi>> $$3 = kh.an.a($$1, $$2);
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(cpq $$0, il<cpi> $$1) {
      sy $$2 = $$0.x();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      cpq $$3 = $$1.b($$2);
      Optional<? extends il<cpi>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         cpi $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gq().a(this, $$5.b());
         $$1.b(atz.c.b(this));
         return bmm.b($$3);
      } else {
         return bmm.d($$3);
      }
   }

   @Override
   public int b(cpq $$0) {
      Optional<? extends il<cpi>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((cpi)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends il<cpi>> d(cpq $$0) {
      sy $$1 = $$0.w();
      if ($$1 != null && $$1.b("instrument", 8)) {
         ajc $$2 = ajc.a($$1.l("instrument"));
         if ($$2 != null) {
            return kh.an.c($$2);
         }
      }

      Iterator<il<cpi>> $$3 = kh.an.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public crj c(cpq $$0) {
      return crj.i;
   }

   private static void a(cwe $$0, cia $$1, cpi $$2) {
      ato $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, atq.c, $$4, 1.0F);
      $$0.a(dqr.B, $$1.dh(), dqr.a.a($$1));
   }
}
