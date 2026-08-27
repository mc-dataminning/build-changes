import com.mojang.serialization.MapCodec;

public class dac extends cut implements cuw {
   public static final MapCodec<dac> a = b(dac::new);

   @Override
   public MapCodec<dac> a() {
      return a;
   }

   protected dac(dgv.d $$0) {
      super($$0);
   }

   private static boolean b(dgw $$0, crv $$1, ht $$2) {
      ht $$3 = $$2.c();
      dgw $$4 = $$1.a_($$3);
      int $$5 = ebx.a($$1, $$0, $$2, $$4, $$3, hx.b, $$4.b($$1, $$3));
      return $$5 < $$1.M();
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cuv.dV.o());
      }
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      dgw $$4 = $$0.a_($$2);
      ht $$5 = $$2.c();
      dit $$6 = $$0.k().g();
      io<dow<?, ?>> $$7 = $$0.H_().d(jz.au);
      if ($$4.a(cuv.ow)) {
         this.a($$7, pw.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(cuv.on)) {
         this.a($$7, pw.j, $$0, $$6, $$1, $$5);
         this.a($$7, pw.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, pw.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(io<dow<?, ?>> $$0, agf<dow<?, ?>> $$1, ama $$2, dit $$3, ato $$4, ht $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dow)$$4x.a()).a($$2, $$3, $$4, $$5));
   }
}
