import com.mojang.serialization.MapCodec;

public class deb extends cys implements cyv {
   public static final MapCodec<deb> a = b(deb::new);

   @Override
   public MapCodec<deb> a() {
      return a;
   }

   protected deb(dli.d $$0) {
      super($$0);
   }

   private static boolean b(dlj $$0, cvu $$1, hz $$2) {
      hz $$3 = $$2.c();
      dlj $$4 = $$1.a_($$3);
      int $$5 = egn.a($$1, $$0, $$2, $$4, $$3, ie.b, $$4.b($$1, $$3));
      return $$5 < $$1.O();
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cyu.dV.o());
      }
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      dlj $$4 = $$0.a_($$2);
      hz $$5 = $$2.c();
      dng $$6 = $$0.l().g();
      iv<dtm<?, ?>> $$7 = $$0.I_().d(kg.aw);
      if ($$4.a(cyu.ow)) {
         this.a($$7, qo.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(cyu.on)) {
         this.a($$7, qo.j, $$0, $$6, $$1, $$5);
         this.a($$7, qo.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, qo.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(iv<dtm<?, ?>> $$0, aix<dtm<?, ?>> $$1, aow $$2, dng $$3, awp $$4, hz $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dtm)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public cyv.a av_() {
      return cyv.a.a;
   }
}
