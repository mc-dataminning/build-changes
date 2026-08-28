import com.mojang.serialization.MapCodec;

public class dox extends djk implements djn {
   public static final MapCodec<dox> a = b(dox::new);

   @Override
   public MapCodec<dox> a() {
      return a;
   }

   protected dox(dwu.d $$0) {
      super($$0);
   }

   private static boolean b(dwv $$0, dgj $$1, ji $$2) {
      ji $$3 = $$2.d();
      dwv $$4 = $$1.a_($$3);
      int $$5 = eso.a($$0, $$4, jn.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, djm.ei.m());
      }
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      dwv $$4 = $$0.a_($$2);
      ji $$5 = $$2.d();
      dyr $$6 = $$0.m().g();
      ke<efi<?, ?>> $$7 = $$0.K_().e(mc.aL);
      if ($$4.a(djm.oY)) {
         this.a($$7, rh.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(djm.oP)) {
         this.a($$7, rh.j, $$0, $$6, $$1, $$5);
         this.a($$7, rh.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rh.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(ke<efi<?, ?>> $$0, akt<efi<?, ?>> $$1, arc $$2, dyr $$3, azg $$4, ji $$5) {
      $$0.a($$1).ifPresent($$4x -> ((efi)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public djn.a aq_() {
      return djn.a.a;
   }
}
