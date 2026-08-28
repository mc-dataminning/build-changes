import com.mojang.serialization.MapCodec;

public class ddw extends dey {
   public static final MapCodec<ddw> a = b(ddw::new);

   @Override
   public MapCodec<? extends ddw> a() {
      return a;
   }

   public ddw(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dbx $$0, dsb $$1, evm $$2, cno $$3) {
      if (!$$0.B) {
         iz $$4 = $$2.a();
         $$0.a(null, $$4, avz.G, awa.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, avz.E, awa.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
