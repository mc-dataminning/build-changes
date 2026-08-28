import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djf extends dix {
   public static final MapCodec<djf> e = b(djf::new);

   @Override
   public MapCodec<? extends djf> a() {
      return e;
   }

   public djf(dsj.d $$0) {
      super($$0);
   }

   public static dsk b() {
      return dfj.G.o();
   }

   @Override
   public void a(dcf $$0, cmk $$1, ja $$2, dsk $$3, @Nullable dpp $$4, cuc $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!czn.a($$5, avz.s)) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dsk $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$1.a(dco.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dsk $$0, dcf $$1, ja $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
