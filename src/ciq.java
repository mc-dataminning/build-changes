import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ciq extends cis {
   private static final String a = "instrument";
   private final aqa<cip> b;

   public ciq(cis.a $$0, aqa<cip> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(cix $$0, @Nullable cpl $$1, List<tf> $$2, cko $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<aeq<cip>> $$4 = this.d($$0).flatMap(he::e);
      if ($$4.isPresent()) {
         ts $$5 = tf.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cix a(cis $$0, he<cip> $$1) {
      cix $$2 = new cix($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(cix $$0, aqa<cip> $$1, aru $$2) {
      Optional<he<cip>> $$3 = jb.am.b($$1).flatMap($$1x -> $$1x.a($$2));
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(cix $$0, he<cip> $$1) {
      qr $$2 = $$0.w();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public bgr<cix> a(cpl $$0, cbm $$1, bgp $$2) {
      cix $$3 = $$1.b($$2);
      Optional<? extends he<cip>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         cip $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gl().a(this, $$5.b());
         $$1.b(apg.c.b(this));
         return bgr.b($$3);
      } else {
         return bgr.d($$3);
      }
   }

   @Override
   public int b(cix $$0) {
      Optional<? extends he<cip>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((cip)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends he<cip>> d(cix $$0) {
      qr $$1 = $$0.v();
      if ($$1 != null && $$1.b("instrument", 8)) {
         aer $$2 = aer.a($$1.l("instrument"));
         if ($$2 != null) {
            return jb.am.b(aeq.a(jc.B, $$2));
         }
      }

      Iterator<he<cip>> $$3 = jb.am.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public ckq c(cix $$0) {
      return ckq.i;
   }

   private static void a(cpl $$0, cbm $$1, cip $$2) {
      aov $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, aox.c, $$4, 1.0F);
      $$0.a(djj.B, $$1.di(), djj.a.a($$1));
   }
}
