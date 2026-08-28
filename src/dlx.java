import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlx extends dmo {
   public static final ecc<jb> a = drd.e;
   public static final ebv b = ebu.u;

   protected dlx(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jb.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dlx> a();

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bur.a;
   }

   protected abstract void a(djx var1, iv var2, crx var3);

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      bun.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      return cvq.a($$1.c_($$2));
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dyc> dyd<T> a(djx $$0, dye<T> $$1, dye<? extends dxp> $$2) {
      return $$0 instanceof ars $$3 ? a($$1, $$2, ($$1x, $$2x, $$3x, $$4) -> dxp.a($$3, $$2x, $$3x, $$4)) : null;
   }
}
