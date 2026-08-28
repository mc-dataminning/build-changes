import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dix extends dip {
   public static final MapCodec<dix> e = b(dix::new);

   @Override
   public MapCodec<? extends dix> a() {
      return e;
   }

   public dix(dsb.d $$0) {
      super($$0);
   }

   public static dsc b() {
      return dfb.G.o();
   }

   @Override
   public void a(dby $$0, cmx $$1, iz $$2, dsc $$3, @Nullable dph $$4, cup $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (dab.a(dad.v, $$5) == 0) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dsc $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.a(dch.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dsc $$0, dby $$1, iz $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
