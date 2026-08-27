import com.mojang.serialization.MapCodec;

public abstract class dbx extends dch {
   protected static final int a = 2;
   protected static final etc b = dch.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dbx(dph.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dbx> a();

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return b;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$1 == ij.a && !this.a($$0, $$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return a($$1, $$2.d(), ij.b);
   }
}
