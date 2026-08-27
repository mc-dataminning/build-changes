import com.mojang.serialization.Codec;

public abstract class drs {
   public static final Codec<drs> a = jb.W.q().dispatch(drs::a, drt::a);

   public static dsb a(dfa $$0) {
      return new dsb($$0);
   }

   public static dsb a(csm $$0) {
      return new dsb($$0.n());
   }

   protected abstract drt<?> a();

   public abstract dfa a(aru var1, gu var2);
}
