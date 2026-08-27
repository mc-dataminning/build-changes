import com.mojang.serialization.MapCodec;

public class czi extends cua implements cud {
   public static final MapCodec<czi> a = b(czi::new);

   @Override
   public MapCodec<czi> a() {
      return a;
   }

   protected czi(dga.d $$0) {
      super($$0);
   }

   private static boolean b(dgb $$0, crc $$1, ht $$2) {
      ht $$3 = $$2.c();
      dgb $$4 = $$1.a_($$3);
      int $$5 = eav.a($$1, $$0, $$2, $$4, $$3, hx.b, $$4.b($$1, $$3));
      return $$5 < $$1.M();
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cuc.dV.o());
      }
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      dgb $$4 = $$0.a_($$2);
      ht $$5 = $$2.c();
      dhy $$6 = $$0.k().g();
      io<dob<?, ?>> $$7 = $$0.H_().d(jz.at);
      if ($$4.a(cuc.ow)) {
         this.a($$7, pq.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(cuc.on)) {
         this.a($$7, pq.j, $$0, $$6, $$1, $$5);
         this.a($$7, pq.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, pq.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(io<dob<?, ?>> $$0, afv<dob<?, ?>> $$1, alq $$2, dhy $$3, ate $$4, ht $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dob)$$4x.a()).a($$2, $$3, $$4, $$5));
   }
}
