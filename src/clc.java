import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class clc extends cle {
   private static final String a = "instrument";
   private final arv<clb> b;

   public clc(cle.a $$0, arv<clb> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(clj $$0, @Nullable csa $$1, List<ur> $$2, cna $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<agh<clb>> $$4 = this.d($$0).flatMap(ib::e);
      if ($$4.isPresent()) {
         vf $$5 = ur.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static clj a(cle $$0, ib<clb> $$1) {
      clj $$2 = new clj($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(clj $$0, arv<clb> $$1, ats $$2) {
      Optional<ib<clb>> $$3 = jy.ao.b($$1).flatMap($$1x -> $$1x.a($$2));
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(clj $$0, ib<clb> $$1) {
      rz $$2 = $$0.w();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      clj $$3 = $$1.b($$2);
      Optional<? extends ib<clb>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         clb $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.go().a(this, $$5.b());
         $$1.b(arb.c.b(this));
         return biy.b($$3);
      } else {
         return biy.d($$3);
      }
   }

   @Override
   public int b(clj $$0) {
      Optional<? extends ib<clb>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((clb)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends ib<clb>> d(clj $$0) {
      rz $$1 = $$0.v();
      if ($$1 != null && $$1.b("instrument", 8)) {
         agi $$2 = agi.a($$1.l("instrument"));
         if ($$2 != null) {
            return jy.ao.b(agh.a(jz.C, $$2));
         }
      }

      Iterator<ib<clb>> $$3 = jy.ao.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public cnc c(clj $$0) {
      return cnc.i;
   }

   private static void a(csa $$0, cdu $$1, clb $$2) {
      aqq $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, aqs.c, $$4, 1.0F);
      $$0.a(dls.B, $$1.dl(), dls.a.a($$1));
   }
}
