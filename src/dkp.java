import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dkp extends dlg {
   public static final eam<ja> a = dpt.e;
   public static final eaf b = eae.u;

   protected dkp(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(a, ja.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dkp> a();

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bty.a;
   }

   protected abstract void a(dip var1, iu var2, cqs var3);

   @Override
   public dzo a(dcl $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      btu.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      return cuk.a($$1.c_($$2));
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dwn> dwo<T> a(dip $$0, dwp<T> $$1, dwp<? extends dwa> $$2) {
      return $$0 instanceof aro $$3 ? a($$1, $$2, ($$1x, $$2x, $$3x, $$4) -> dwa.a($$3, $$2x, $$3x, $$4)) : null;
   }
}
