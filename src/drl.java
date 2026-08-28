import com.mojang.serialization.MapCodec;

public class drl extends dhy {
   public static final MapCodec<drl> a = b(drl::new);

   @Override
   public MapCodec<drl> a() {
      return a;
   }

   public drl(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      ezh $$4 = new ezh(0.25, 0.05F, 0.25);
      if ($$3 instanceof buv $$5 && $$5.b(btg.K)) {
         $$4 = new ezh(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
