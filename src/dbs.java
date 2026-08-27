import com.mojang.serialization.MapCodec;

public class dbs extends cwj implements cwm {
   public static final MapCodec<dbs> a = b(dbs::new);

   @Override
   public MapCodec<dbs> a() {
      return a;
   }

   protected dbs(diz.d $$0) {
      super($$0);
   }

   private static boolean b(dja $$0, ctl $$1, hx $$2) {
      hx $$3 = $$2.c();
      dja $$4 = $$1.a_($$3);
      int $$5 = eeb.a($$1, $$0, $$2, $$4, $$3, ic.b, $$4.b($$1, $$3));
      return $$5 < $$1.O();
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cwl.dV.o());
      }
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      dja $$4 = $$0.a_($$2);
      hx $$5 = $$2.c();
      dkx $$6 = $$0.l().g();
      it<dra<?, ?>> $$7 = $$0.I_().d(ke.aw);
      if ($$4.a(cwl.ow)) {
         this.a($$7, qj.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(cwl.on)) {
         this.a($$7, qj.j, $$0, $$6, $$1, $$5);
         this.a($$7, qj.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, qj.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(it<dra<?, ?>> $$0, ahc<dra<?, ?>> $$1, amz $$2, dkx $$3, aup $$4, hx $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dra)$$4x.a()).a($$2, $$3, $$4, $$5));
   }
}
