import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ciy extends cja {
   private static final String a = "instrument";
   private final aqh<cix> b;

   public ciy(cja.a $$0, aqh<cix> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(cjf $$0, @Nullable cpv $$1, List<tl> $$2, ckw $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<aev<cix>> $$4 = this.d($$0).flatMap(he::e);
      if ($$4.isPresent()) {
         ty $$5 = tl.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cjf a(cja $$0, he<cix> $$1) {
      cjf $$2 = new cjf($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(cjf $$0, aqh<cix> $$1, asc $$2) {
      Optional<he<cix>> $$3 = jb.am.b($$1).flatMap($$1x -> $$1x.a($$2));
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(cjf $$0, he<cix> $$1) {
      qw $$2 = $$0.w();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      cjf $$3 = $$1.b($$2);
      Optional<? extends he<cix>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         cix $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gm().a(this, $$5.b());
         $$1.b(apn.c.b(this));
         return bgz.b($$3);
      } else {
         return bgz.d($$3);
      }
   }

   @Override
   public int b(cjf $$0) {
      Optional<? extends he<cix>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((cix)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends he<cix>> d(cjf $$0) {
      qw $$1 = $$0.v();
      if ($$1 != null && $$1.b("instrument", 8)) {
         aew $$2 = aew.a($$1.l("instrument"));
         if ($$2 != null) {
            return jb.am.b(aev.a(jc.B, $$2));
         }
      }

      Iterator<he<cix>> $$3 = jb.am.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public cky c(cjf $$0) {
      return cky.i;
   }

   private static void a(cpv $$0, cbu $$1, cix $$2) {
      apc $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, ape.c, $$4, 1.0F);
      $$0.a(djt.B, $$1.dj(), djt.a.a($$1));
   }
}
