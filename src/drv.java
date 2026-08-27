import com.mojang.serialization.Codec;

public abstract class drv {
   public static final Codec<drv> a = jb.W.q().dispatch(drv::a, drw::a);

   public static dse a(dfd $$0) {
      return new dse($$0);
   }

   public static dse a(ctc $$0) {
      return new dse($$0.o());
   }

   protected abstract drw<?> a();

   public abstract dfd a(ash var1, gw var2);
}
