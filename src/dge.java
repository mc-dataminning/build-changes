import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dge extends dfx {
   public static final MapCodec<dge> e = b(dge::new);

   @Override
   public MapCodec<? extends dge> a() {
      return e;
   }

   public dge(dph.d $$0) {
      super($$0);
   }

   public static dpi b() {
      return dcj.G.n();
   }

   @Override
   public void a(czg $$0, cka $$1, id $$2, dpi $$3, @Nullable dmo $$4, crs $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cxa.a(cxc.v, $$5) == 0) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dpi $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$1.a(czp.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dpi $$0, czg $$1, id $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
