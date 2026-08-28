import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dod extends dfq {
   public static final MapCodec<dod> c = b(dod::new);

   @Override
   public MapCodec<dod> a() {
      return c;
   }

   protected dod(dtz.d $$0) {
      super($$0);
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new dst($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return a($$0, $$2, drg.B);
   }

   @Override
   protected void a(dds $$0, je $$1, cnp $$2) {
      dre $$3 = $$0.c_($$1);
      if ($$3 instanceof dst) {
         $$2.a((brm)$$3);
         $$2.a(awn.at);
      }
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awd.yq, awe.e, 1.0F, 1.0F, false);
         }

         $$1.a(ln.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
