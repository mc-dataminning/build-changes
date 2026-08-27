import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cit extends civ {
   private static final String a = "instrument";
   private final aqd<cis> b;

   public cit(civ.a $$0, aqd<cis> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(cja $$0, @Nullable cpq $$1, List<ti> $$2, ckr $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<aet<cis>> $$4 = this.d($$0).flatMap(hg::e);
      if ($$4.isPresent()) {
         tv $$5 = ti.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cja a(civ $$0, hg<cis> $$1) {
      cja $$2 = new cja($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(cja $$0, aqd<cis> $$1, arx $$2) {
      Optional<hg<cis>> $$3 = jd.am.b($$1).flatMap($$1x -> $$1x.a($$2));
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(cja $$0, hg<cis> $$1) {
      qu $$2 = $$0.w();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      cja $$3 = $$1.b($$2);
      Optional<? extends hg<cis>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         cis $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gl().a(this, $$5.b());
         $$1.b(apj.c.b(this));
         return bgu.b($$3);
      } else {
         return bgu.d($$3);
      }
   }

   @Override
   public int b(cja $$0) {
      Optional<? extends hg<cis>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((cis)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends hg<cis>> d(cja $$0) {
      qu $$1 = $$0.v();
      if ($$1 != null && $$1.b("instrument", 8)) {
         aeu $$2 = aeu.a($$1.l("instrument"));
         if ($$2 != null) {
            return jd.am.b(aet.a(je.B, $$2));
         }
      }

      Iterator<hg<cis>> $$3 = jd.am.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public ckt c(cja $$0) {
      return ckt.i;
   }

   private static void a(cpq $$0, cbp $$1, cis $$2) {
      aoy $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, apa.c, $$4, 1.0F);
      $$0.a(djo.B, $$1.di(), djo.a.a($$1));
   }
}
