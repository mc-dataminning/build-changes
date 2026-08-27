import com.mojang.serialization.MapCodec;

public class cyy extends daa {
   public static final MapCodec<cyy> a = b(cyy::new);

   @Override
   public MapCodec<? extends cyy> a() {
      return a;
   }

   public cyy(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected void a(cwz $$0, dmz $$1, epn $$2, cjk $$3) {
      if (!$$0.B) {
         ib $$4 = $$2.a();
         $$0.a(null, $$4, aty.G, atz.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, aty.E, atz.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
