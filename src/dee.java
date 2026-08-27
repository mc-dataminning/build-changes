import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dee extends cvt {
   public static final MapCodec<dee> c = b(dee::new);

   @Override
   public MapCodec<dee> a() {
      return c;
   }

   protected dee(djo.d $$0) {
      super($$0);
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dip($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return a($$0, $$2, dhf.B);
   }

   @Override
   protected void a(ctx $$0, hx $$1, cfq $$2) {
      dhd $$3 = $$0.c_($$1);
      if ($$3 instanceof dip) {
         $$2.a((bkg)$$3);
         $$2.a(asd.at);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, art.xC, aru.e, 1.0F, 1.0F, false);
         }

         $$1.a(jx.ab, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
