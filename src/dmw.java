import com.mojang.serialization.MapCodec;

public class dmw extends dhm implements dhp {
   public static final MapCodec<dmw> a = b(dmw::new);

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   protected dmw(dur.d $$0) {
      super($$0);
   }

   private static boolean b(dus $$0, dem $$1, jf $$2) {
      jf $$3 = $$2.d();
      dus $$4 = $$1.a_($$3);
      int $$5 = eqk.a($$0, $$4, jk.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dho.dV.n());
      }
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      dus $$4 = $$0.a_($$2);
      jf $$5 = $$2.d();
      dwp $$6 = $$0.l().g();
      kb<edg<?, ?>> $$7 = $$0.G_().e(lw.aK);
      if ($$4.a(dho.ow)) {
         this.a($$7, rx.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dho.on)) {
         this.a($$7, rx.j, $$0, $$6, $$1, $$5);
         this.a($$7, rx.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rx.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(kb<edg<?, ?>> $$0, ald<edg<?, ?>> $$1, arj $$2, dwp $$3, azn $$4, jf $$5) {
      $$0.a($$1).ifPresent($$4x -> ((edg)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dhp.a as_() {
      return dhp.a.a;
   }
}
