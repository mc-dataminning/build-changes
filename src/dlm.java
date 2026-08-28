import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlm extends dmd {
   public static final ebr<jb> a = dqs.e;
   public static final ebk b = ebj.u;

   protected dlm(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jb.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dlm> a();

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bug.a;
   }

   protected abstract void a(djm var1, iv var2, crm var3);

   @Override
   public eat a(ddg $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      return cvf.a($$1.c_($$2));
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dxr> dxs<T> a(djm $$0, dxt<T> $$1, dxt<? extends dxe> $$2) {
      return $$0 instanceof arq $$3 ? a($$1, $$2, ($$1x, $$2x, $$3x, $$4) -> dxe.a($$3, $$2x, $$3x, $$4)) : null;
   }
}
