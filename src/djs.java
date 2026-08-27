import com.mojang.serialization.MapCodec;

public class djs extends dch {
   public static final MapCodec<djs> a = b(djs::new);
   protected static final etc b = dch.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   public djs(dph.d $$0) {
      super($$0);
   }

   @Override
   protected etc b(dpi $$0, cym $$1, id $$2, eso $$3) {
      return b;
   }

   @Override
   protected etc b_(dpi $$0, cym $$1, id $$2) {
      return esz.b();
   }

   @Override
   protected etc c(dpi $$0, cym $$1, id $$2, eso $$3) {
      return esz.b();
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      dcn.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$1 == ij.b && $$2.a(dcj.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }

   @Override
   protected float d(dpi $$0, cym $$1, id $$2) {
      return 0.2F;
   }
}
