import java.util.Optional;

public class cym extends cyo {
   public cym(cyo.a $$0) {
      super($$0);
   }

   public static cys a(cyo $$0, je<cyl> $$1) {
      cys $$2 = new cys($$0);
      $$2.b(kj.ab, new dbi($$1));
      return $$2;
   }

   @Override
   public bty a(dip $$0, cqs $$1, btx $$2) {
      cys $$3 = $$1.b($$2);
      Optional<? extends je<cyl>> $$4 = this.a($$3, $$1.dX());
      if ($$4.isPresent()) {
         cyl $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gE().a($$3, azk.d($$5.b() * 20.0F));
         $$1.b(awv.c.b(this));
         return bty.c;
      } else {
         return bty.d;
      }
   }

   @Override
   public int a(cys $$0, bwz $$1) {
      Optional<je<cyl>> $$2 = this.a($$0, $$1.dX());
      return $$2.<Integer>map($$0x -> azk.d(((cyl)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<je<cyl>> a(cys $$0, jg.a $$1) {
      dbi $$2 = $$0.a(kj.ab);
      return $$2 != null ? $$2.a($$1) : Optional.empty();
   }

   @Override
   public cyu b(cys $$0) {
      return cyu.i;
   }

   private static void a(dip $$0, cqs $$1, cyl $$2) {
      awk $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awm.c, $$4, 1.0F);
      $$0.a(eeo.B, $$1.dt(), eeo.a.a($$1));
   }
}
