import com.mojang.serialization.MapCodec;

public class dgc extends ddy {
   public static final MapCodec<dgc> a = b(dgc::new);
   protected static final evd b = dgv.c;

   @Override
   public MapCodec<dgc> a() {
      return a;
   }

   protected dgc(dra.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(drb $$0) {
      return true;
   }

   @Override
   public drb a(cwz $$0) {
      return !this.n().a((dba)$$0.q(), $$0.a()) ? ddy.a(this.n(), dea.j.n(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$1 == it.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      dgv.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      drb $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dgx;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return b;
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
