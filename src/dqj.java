import com.mojang.serialization.MapCodec;

public class dqj extends dgv {
   public static final MapCodec<dqj> a = b(dqj::new);

   @Override
   public MapCodec<dqj> a() {
      return a;
   }

   public dqj(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      eye $$4 = new eye(0.25, 0.05F, 0.25);
      if ($$3 instanceof buf $$5 && $$5.b(bss.K)) {
         $$4 = new eye(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
