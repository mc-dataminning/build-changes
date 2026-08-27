import com.mojang.serialization.MapCodec;

public abstract class dbo extends cys implements dbn {
   public dbo(dli.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dbo> a();

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         cdv $$4 = cdv.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cdv $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(dlj $$0) {
      return $$0.i() || $$0.a(aua.aJ) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      if ($$3.a(16) == 0) {
         hz $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            awl.a($$1, $$2, $$3, new jr(jz.B, $$0));
         }
      }
   }

   public int b(dlj $$0, cux $$1, hz $$2) {
      return -16777216;
   }
}
