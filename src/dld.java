import com.mojang.serialization.MapCodec;

public class dld extends dmf {
   public static final MapCodec<dld> a = b(dld::new);

   @Override
   public MapCodec<? extends dld> a() {
      return a;
   }

   public dld(eag.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dja $$0, eah $$1, fem $$2, crx $$3) {
      if (!$$0.C) {
         iu $$4 = $$2.b();
         $$0.a(null, $$4, awn.E, awo.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
