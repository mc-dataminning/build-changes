import com.mojang.serialization.MapCodec;

public class dnz extends diq implements dit {
   public static final MapCodec<dnz> a = b(dnz::new);

   @Override
   public MapCodec<dnz> a() {
      return a;
   }

   protected dnz(dvu.d $$0) {
      super($$0);
   }

   private static boolean b(dvv $$0, dfp $$1, jh $$2) {
      jh $$3 = $$2.d();
      dvv $$4 = $$1.a_($$3);
      int $$5 = erm.a($$0, $$4, jm.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dis.dV.m());
      }
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      dvv $$4 = $$0.a_($$2);
      jh $$5 = $$2.d();
      dxr $$6 = $$0.m().g();
      kd<eei<?, ?>> $$7 = $$0.J_().e(ma.aJ);
      if ($$4.a(dis.ow)) {
         this.a($$7, sc.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dis.on)) {
         this.a($$7, sc.j, $$0, $$6, $$1, $$5);
         this.a($$7, sc.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, sc.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(kd<eei<?, ?>> $$0, ali<eei<?, ?>> $$1, arp $$2, dxr $$3, azu $$4, jh $$5) {
      $$0.a($$1).ifPresent($$4x -> ((eei)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dit.a aq_() {
      return dit.a.a;
   }
}
