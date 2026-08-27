import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cja extends cjc {
   private static final String a = "instrument";
   private final aqj<ciz> b;

   public cja(cjc.a $$0, aqj<ciz> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(cjh $$0, @Nullable cpx $$1, List<tn> $$2, cky $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<aex<ciz>> $$4 = this.d($$0).flatMap(hg::e);
      if ($$4.isPresent()) {
         ua $$5 = tn.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cjh a(cjc $$0, hg<ciz> $$1) {
      cjh $$2 = new cjh($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(cjh $$0, aqj<ciz> $$1, ase $$2) {
      Optional<hg<ciz>> $$3 = jd.am.b($$1).flatMap($$1x -> $$1x.a($$2));
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(cjh $$0, hg<ciz> $$1) {
      qy $$2 = $$0.w();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      cjh $$3 = $$1.b($$2);
      Optional<? extends hg<ciz>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         ciz $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gm().a(this, $$5.b());
         $$1.b(app.c.b(this));
         return bhb.b($$3);
      } else {
         return bhb.d($$3);
      }
   }

   @Override
   public int b(cjh $$0) {
      Optional<? extends hg<ciz>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((ciz)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends hg<ciz>> d(cjh $$0) {
      qy $$1 = $$0.v();
      if ($$1 != null && $$1.b("instrument", 8)) {
         aey $$2 = aey.a($$1.l("instrument"));
         if ($$2 != null) {
            return jd.am.b(aex.a(je.B, $$2));
         }
      }

      Iterator<hg<ciz>> $$3 = jd.am.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public cla c(cjh $$0) {
      return cla.i;
   }

   private static void a(cpx $$0, cbw $$1, ciz $$2) {
      ape $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, apg.c, $$4, 1.0F);
      $$0.a(djv.B, $$1.dj(), djv.a.a($$1));
   }
}
