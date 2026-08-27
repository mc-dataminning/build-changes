import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlh extends dcv {
   public static final MapCodec<dlh> c = b(dlh::new);

   @Override
   public MapCodec<dlh> a() {
      return c;
   }

   protected dlh(drc.d $$0) {
      super($$0);
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dpv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return a($$0, $$2, dok.B);
   }

   @Override
   protected void a(daz $$0, io $$1, cly $$2) {
      doi $$3 = $$0.c_($$1);
      if ($$3 instanceof dpv) {
         $$2.a((bqa)$$3);
         $$2.a(avs.at);
      }
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avi.yh, avj.e, 1.0F, 1.0F, false);
         }

         $$1.a(ky.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
