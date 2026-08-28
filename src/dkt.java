import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkt extends dkl {
   public static final MapCodec<dkt> e = b(dkt::new);

   @Override
   public MapCodec<? extends dkt> a() {
      return e;
   }

   public dkt(dtz.d $$0) {
      super($$0);
   }

   public static dua b() {
      return dgx.G.o();
   }

   @Override
   public void a(dds $$0, cnp $$1, je $$2, dua $$3, @Nullable dre $$4, cvl $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!day.a($$5, awv.s)) {
         if ($$0.B_().i()) {
            $$0.a($$2, false);
            return;
         }

         dua $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$1.a(deb.b, $$2) > 11 - $$0.g()) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dua $$0, dds $$1, je $$2) {
      if ($$1.B_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
