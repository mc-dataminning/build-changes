import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgt extends dgl {
   public static final MapCodec<dgt> e = b(dgt::new);

   @Override
   public MapCodec<? extends dgt> a() {
      return e;
   }

   public dgt(dpx.d $$0) {
      super($$0);
   }

   public static dpy b() {
      return dcx.G.n();
   }

   @Override
   public void a(czu $$0, ckl $$1, im $$2, dpy $$3, @Nullable dnd $$4, csd $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cxo.a(cxq.v, $$5) == 0) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dpy $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$1.a(dad.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dpy $$0, czu $$1, im $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
