import com.mojang.serialization.Codec;

public abstract class eec {
   public static final Codec<eec> a = le.V.q().dispatch(eec::a, eed::a);

   public static eel a(drb $$0) {
      return new eel($$0);
   }

   public static eel a(ddy $$0) {
      return new eel($$0.n());
   }

   protected abstract eed<?> a();

   public abstract drb a(ayk var1, io var2);
}
