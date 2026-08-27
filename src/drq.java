import com.mojang.serialization.Codec;

public abstract class drq {
   public static final Codec<drq> a = jc.W.q().dispatch(drq::a, drr::a);

   public static drz a(dey $$0) {
      return new drz($$0);
   }

   public static drz a(csk $$0) {
      return new drz($$0.n());
   }

   protected abstract drr<?> a();

   public abstract dey a(art var1, gv var2);
}
