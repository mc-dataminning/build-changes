import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drw extends djh {
   public static final MapCodec<drw> c = b(drw::new);

   @Override
   public MapCodec<drw> a() {
      return c;
   }

   protected drw(dxu.d $$0) {
      super($$0);
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dwn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return a($$0, $$2, duz.C);
   }

   @Override
   protected void a(dhi $$0, jh $$1, cpx $$2) {
      dux $$3 = $$0.c_($$1);
      if ($$3 instanceof dwn) {
         $$2.a((btl)$$3);
         $$2.a(axp.at);
      }
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, axf.yJ, axg.e, 1.0F, 1.0F, false);
         }

         $$1.a(ls.af, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
