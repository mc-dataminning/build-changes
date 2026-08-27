import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class clh extends clj {
   private static final String a = "instrument";
   private final arz<clg> b;

   public clh(clj.a $$0, arz<clg> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(clo $$0, @Nullable csf $$1, List<uv> $$2, cnf $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<agl<clg>> $$4 = this.d($$0).flatMap(ig::e);
      if ($$4.isPresent()) {
         vj $$5 = uv.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static clo a(clj $$0, ig<clg> $$1) {
      clo $$2 = new clo($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(clo $$0, arz<clg> $$1, atw $$2) {
      Optional<ig<clg>> $$3 = kc.ao.b($$1).flatMap($$1x -> $$1x.a($$2));
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(clo $$0, ig<clg> $$1) {
      sd $$2 = $$0.w();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      clo $$3 = $$1.b($$2);
      Optional<? extends ig<clg>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         clg $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.go().a(this, $$5.b());
         $$1.b(arf.c.b(this));
         return bjc.b($$3);
      } else {
         return bjc.d($$3);
      }
   }

   @Override
   public int b(clo $$0) {
      Optional<? extends ig<clg>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((clg)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends ig<clg>> d(clo $$0) {
      sd $$1 = $$0.v();
      if ($$1 != null && $$1.b("instrument", 8)) {
         agm $$2 = agm.a($$1.l("instrument"));
         if ($$2 != null) {
            return kc.ao.b(agl.a(kd.C, $$2));
         }
      }

      Iterator<ig<clg>> $$3 = kc.ao.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public cnh c(clo $$0) {
      return cnh.i;
   }

   private static void a(csf $$0, cdz $$1, clg $$2) {
      aqu $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, aqw.c, $$4, 1.0F);
      $$0.a(dlx.B, $$1.dl(), dlx.a.a($$1));
   }
}
