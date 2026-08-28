import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class div extends din {
   public static final MapCodec<div> e = b(div::new);

   @Override
   public MapCodec<? extends div> a() {
      return e;
   }

   public div(drz.d $$0) {
      super($$0);
   }

   public static dsa b() {
      return dez.G.o();
   }

   @Override
   public void a(dbw $$0, cmv $$1, iz $$2, dsa $$3, @Nullable dpf $$4, cun $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (czz.a(dab.v, $$5) == 0) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dsa $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      if ($$1.a(dcf.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dsa $$0, dbw $$1, iz $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
