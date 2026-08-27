import com.mojang.serialization.MapCodec;

public class ddx extends cyo implements cyr {
   public static final MapCodec<ddx> a = b(ddx::new);

   @Override
   public MapCodec<ddx> a() {
      return a;
   }

   protected ddx(dle.d $$0) {
      super($$0);
   }

   private static boolean b(dlf $$0, cvq $$1, hz $$2) {
      hz $$3 = $$2.c();
      dlf $$4 = $$1.a_($$3);
      int $$5 = egg.a($$1, $$0, $$2, $$4, $$3, ie.b, $$4.b($$1, $$3));
      return $$5 < $$1.O();
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cyq.dV.o());
      }
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      dlf $$4 = $$0.a_($$2);
      hz $$5 = $$2.c();
      dnc $$6 = $$0.l().g();
      iv<dtf<?, ?>> $$7 = $$0.I_().d(kg.aw);
      if ($$4.a(cyq.ow)) {
         this.a($$7, qo.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(cyq.on)) {
         this.a($$7, qo.j, $$0, $$6, $$1, $$5);
         this.a($$7, qo.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, qo.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(iv<dtf<?, ?>> $$0, aix<dtf<?, ?>> $$1, aov $$2, dnc $$3, awo $$4, hz $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dtf)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public cyr.a av_() {
      return cyr.a.a;
   }
}
