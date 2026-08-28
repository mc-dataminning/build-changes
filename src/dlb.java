import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlb extends djn {
   public static final MapCodec<dlb> a = b(dlb::new);
   public static final dxp b = dxo.B;
   public static final dxp c = dxo.v;

   @Override
   protected MapCodec<? extends dlb> a() {
      return a;
   }

   public dlb(dwx.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof ard $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
      if ($$1 instanceof ard $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dwy $$0, ard $$1, ji $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dwy $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awa.fI : awa.fJ, awb.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
