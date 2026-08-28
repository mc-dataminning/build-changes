import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diw extends dio {
   public static final MapCodec<diw> e = b(diw::new);

   @Override
   public MapCodec<? extends diw> a() {
      return e;
   }

   public diw(dsa.d $$0) {
      super($$0);
   }

   public static dsb b() {
      return dfa.G.o();
   }

   @Override
   public void a(dbx $$0, cmw $$1, iz $$2, dsb $$3, @Nullable dpg $$4, cuo $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (daa.a(dac.v, $$5) == 0) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dsb $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$1.a(dcg.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dsb $$0, dbx $$1, iz $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
