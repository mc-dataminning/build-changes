import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhw extends dho {
   public static final MapCodec<dhw> e = b(dhw::new);

   @Override
   public MapCodec<? extends dhw> a() {
      return e;
   }

   public dhw(dra.d $$0) {
      super($$0);
   }

   public static drb b() {
      return dea.G.n();
   }

   @Override
   public void a(dax $$0, clw $$1, io $$2, drb $$3, @Nullable dog $$4, cto $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cza.a(czc.v, $$5) == 0) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         drb $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$1.a(dbg.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(drb $$0, dax $$1, io $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
