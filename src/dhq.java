import com.mojang.serialization.MapCodec;

public class dhq extends dch implements dck {
   public static final MapCodec<dhq> a = b(dhq::new);

   @Override
   public MapCodec<dhq> a() {
      return a;
   }

   protected dhq(dph.d $$0) {
      super($$0);
   }

   private static boolean b(dpi $$0, czj $$1, id $$2) {
      id $$3 = $$2.c();
      dpi $$4 = $$1.a_($$3);
      int $$5 = eks.a($$1, $$0, $$2, $$4, $$3, ij.b, $$4.b($$1, $$3));
      return $$5 < $$1.P();
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dcj.dV.n());
      }
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      dpi $$4 = $$0.a_($$2);
      id $$5 = $$2.c();
      drf $$6 = $$0.l().g();
      ja<dxr<?, ?>> $$7 = $$0.H_().d(ku.az);
      if ($$4.a(dcj.ow)) {
         this.a($$7, rg.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dcj.on)) {
         this.a($$7, rg.j, $$0, $$6, $$1, $$5);
         this.a($$7, rg.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rg.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(ja<dxr<?, ?>> $$0, aju<dxr<?, ?>> $$1, apu $$2, drf $$3, axt $$4, id $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dxr)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dck.a aq_() {
      return dck.a.a;
   }
}
