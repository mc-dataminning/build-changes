import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dju extends dby {
   public static final MapCodec<dju> a = b(dju::new);
   private static final wg d = wg.c("container.stonecutter");
   public static final dpt b = dft.aE;
   protected static final est c = dby.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dju> a() {
      return a;
   }

   public dju(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c));
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         return boa.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(auw.ay);
         return boa.b;
      }
   }

   @Nullable
   @Override
   protected boe b(doz $$0, cyx $$1, ib $$2) {
      return new bok(($$2x, $$3, $$4) -> new cop($$2x, $$3, cna.a($$1, $$2)), d);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return c;
   }

   @Override
   protected boolean g_(doz $$0) {
      return true;
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
