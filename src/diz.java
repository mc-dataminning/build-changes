import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class diz extends djq {
   public static final dyo<jn> a = dod.e;
   public static final dyh b = dyg.u;

   protected diz(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(a, jn.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends diz> a();

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bsy.a;
   }

   protected abstract void a(dgz var1, ji var2, cpr var3);

   @Override
   public dxq a(dax $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      bsu.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      return csw.a($$1.c_($$2));
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dus> dut<T> a(dgz $$0, duu<T> $$1, duu<? extends dug> $$2) {
      return $$0 instanceof ard $$3 ? a($$1, $$2, ($$1x, $$2x, $$3x, $$4) -> dug.a($$3, $$2x, $$3x, $$4)) : null;
   }
}
