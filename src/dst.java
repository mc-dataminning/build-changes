import com.mojang.serialization.MapCodec;

public class dst extends dnc implements dnf {
   public static final MapCodec<dst> a = b(dst::new);

   @Override
   public MapCodec<dst> a() {
      return a;
   }

   protected dst(ebd.d $$0) {
      super($$0);
   }

   private static boolean b(ebe $$0, dka $$1, iv $$2) {
      iv $$3 = $$2.d();
      ebe $$4 = $$1.a_($$3);
      int $$5 = exf.a($$0, $$4, jb.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dne.em.m());
      }
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      ebe $$4 = $$0.a_($$2);
      iv $$5 = $$2.d();
      edc $$6 = $$0.m().g();
      js<ejv<?, ?>> $$7 = $$0.J_().f(mh.aL);
      if ($$4.a(dne.pc)) {
         this.a($$7, rk.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dne.oT)) {
         this.a($$7, rk.j, $$0, $$6, $$1, $$5);
         this.a($$7, rk.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rk.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(js<ejv<?, ?>> $$0, alh<ejv<?, ?>> $$1, ars $$2, edc $$3, azx $$4, iv $$5) {
      $$0.a($$1).ifPresent($$4x -> ((ejv)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dnf.a ar_() {
      return dnf.a.a;
   }
}
