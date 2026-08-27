import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cir extends cit {
   private static final String a = "instrument";
   private final aqa<ciq> b;

   public cir(cit.a $$0, aqa<ciq> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(ciy $$0, @Nullable cpm $$1, List<tf> $$2, ckp $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<aeq<ciq>> $$4 = this.d($$0).flatMap(he::e);
      if ($$4.isPresent()) {
         ts $$5 = tf.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static ciy a(cit $$0, he<ciq> $$1) {
      ciy $$2 = new ciy($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(ciy $$0, aqa<ciq> $$1, aru $$2) {
      Optional<he<ciq>> $$3 = jb.am.b($$1).flatMap($$1x -> $$1x.a($$2));
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(ciy $$0, he<ciq> $$1) {
      qr $$2 = $$0.w();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public bgr<ciy> a(cpm $$0, cbn $$1, bgp $$2) {
      ciy $$3 = $$1.b($$2);
      Optional<? extends he<ciq>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         ciq $$5 = $$4.get().a();
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
   public int b(ciy $$0) {
      Optional<? extends he<ciq>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((ciq)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends he<ciq>> d(ciy $$0) {
      qr $$1 = $$0.v();
      if ($$1 != null && $$1.b("instrument", 8)) {
         aer $$2 = aer.a($$1.l("instrument"));
         if ($$2 != null) {
            return jb.am.b(aeq.a(jc.B, $$2));
         }
      }

      Iterator<he<ciq>> $$3 = jb.am.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public ckr c(ciy $$0) {
      return ckr.i;
   }

   private static void a(cpm $$0, cbn $$1, ciq $$2) {
      aov $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, aox.c, $$4, 1.0F);
      $$0.a(djk.B, $$1.di(), djk.a.a($$1));
   }
}
