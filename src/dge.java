import com.mojang.serialization.MapCodec;

public class dge extends dea {
   public static final MapCodec<dge> a = b(dge::new);
   protected static final evf b = dgx.c;

   @Override
   public MapCodec<dge> a() {
      return a;
   }

   protected dge(drc.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(drd $$0) {
      return true;
   }

   @Override
   public drd a(cxb $$0) {
      return !this.n().a((dbc)$$0.q(), $$0.a()) ? dea.a(this.n(), dec.j.n(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$1 == it.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      dgx.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      drd $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dgz;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return b;
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
