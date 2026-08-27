import com.mojang.serialization.MapCodec;

public class dbj extends dcq implements dck {
   public static final MapCodec<dbj> a = b(dbj::new);
   private static final etc b = esz.a(dch.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dch.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<dbj> a() {
      return a;
   }

   protected dbj(dph.d $$0) {
      super($$0);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return b;
   }

   @Override
   protected boolean b(dpi $$0, cym $$1, id $$2) {
      return $$0.a(dcj.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      dox.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
