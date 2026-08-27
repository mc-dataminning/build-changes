import com.mojang.serialization.MapCodec;

public class dea extends cwd {
   public static final MapCodec<dea> c = b(dea::new);

   @Override
   public MapCodec<dea> a() {
      return c;
   }

   public dea(djg.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : cws.a.o();
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return h($$1.a_($$2.d()));
   }

   public static boolean h(djh $$0) {
      return $$0.a(ash.aS);
   }

   @Override
   protected boolean f(djh $$0) {
      return true;
   }
}
