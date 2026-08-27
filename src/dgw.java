import com.mojang.serialization.MapCodec;

public abstract class dgw extends dea implements dgv {
   public dgw(drc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dgw> a();

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cih $$4 = cih.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cih $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(drd $$0) {
      return $$0.i() || $$0.a(avx.aK) || $$0.k() || $$0.r();
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      if ($$3.a(16) == 0) {
         io $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            ayi.a($$1, $$2, $$3, new kp(ky.C, $$0));
         }
      }
   }

   public int b(drd $$0, daf $$1, io $$2) {
      return -16777216;
   }
}
