import com.mojang.serialization.MapCodec;

public abstract class dfd extends dch implements dfc {
   public dfd(dph.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfd> a();

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cgj $$4 = cgj.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cgj $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(dpi $$0) {
      return $$0.i() || $$0.a(ave.aK) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      if ($$3.a(16) == 0) {
         id $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            axp.a($$1, $$2, $$3, new kf(kn.C, $$0));
         }
      }
   }

   public int b(dpi $$0, cym $$1, id $$2) {
      return -16777216;
   }
}
