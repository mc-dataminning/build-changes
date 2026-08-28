import com.mojang.serialization.MapCodec;

public class dtf extends dno implements dnr {
   public static final MapCodec<dtf> a = b(dtf::new);

   @Override
   public MapCodec<dtf> a() {
      return a;
   }

   protected dtf(ebp.d $$0) {
      super($$0);
   }

   private static boolean b(ebq $$0, dkm $$1, iw $$2) {
      iw $$3 = $$2.d();
      ebq $$4 = $$1.a_($$3);
      int $$5 = exr.a($$0, $$4, jc.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dnq.em.m());
      }
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      ebq $$4 = $$0.a_($$2);
      iw $$5 = $$2.d();
      edo $$6 = $$0.m().g();
      jt<ekh<?, ?>> $$7 = $$0.J_().f(mi.aL);
      if ($$4.a(dnq.pc)) {
         this.a($$7, rl.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dnq.oT)) {
         this.a($$7, rl.j, $$0, $$6, $$1, $$5);
         this.a($$7, rl.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rl.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jt<ekh<?, ?>> $$0, alq<ekh<?, ?>> $$1, asb $$2, edo $$3, bai $$4, iw $$5) {
      $$0.a($$1).ifPresent($$4x -> ((ekh)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dnr.a as_() {
      return dnr.a.a;
   }
}
