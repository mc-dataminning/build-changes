import com.mojang.serialization.MapCodec;

public class del extends dch {
   public static final MapCodec<del> a = b(del::new);
   protected static final etc b = dfe.c;

   @Override
   public MapCodec<del> a() {
      return a;
   }

   protected del(dph.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dpi $$0) {
      return true;
   }

   @Override
   public dpi a(cux $$0) {
      return !this.n().a((czj)$$0.q(), $$0.a()) ? dch.a(this.n(), dcj.j.n(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$1 == ij.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      dfe.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      dpi $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dfg;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return b;
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}
