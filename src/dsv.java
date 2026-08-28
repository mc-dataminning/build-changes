import com.mojang.serialization.MapCodec;

public class dsv extends dne implements dnh {
   public static final MapCodec<dsv> a = b(dsv::new);

   @Override
   public MapCodec<dsv> a() {
      return a;
   }

   protected dsv(ebf.d $$0) {
      super($$0);
   }

   private static boolean b(ebg $$0, dkc $$1, iw $$2) {
      iw $$3 = $$2.d();
      ebg $$4 = $$1.a_($$3);
      int $$5 = exh.a($$0, $$4, jc.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dng.em.m());
      }
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      ebg $$4 = $$0.a_($$2);
      iw $$5 = $$2.d();
      ede $$6 = $$0.m().g();
      jt<ejx<?, ?>> $$7 = $$0.J_().f(mi.aL);
      if ($$4.a(dng.pc)) {
         this.a($$7, rl.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dng.oT)) {
         this.a($$7, rl.j, $$0, $$6, $$1, $$5);
         this.a($$7, rl.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rl.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jt<ejx<?, ?>> $$0, alj<ejx<?, ?>> $$1, aru $$2, ede $$3, azz $$4, iw $$5) {
      $$0.a($$1).ifPresent($$4x -> ((ejx)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dnh.a ar_() {
      return dnh.a.a;
   }
}
