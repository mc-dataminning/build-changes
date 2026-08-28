import com.mojang.serialization.Codec;

public abstract class ekb {
   public static final Codec<ekb> a = mb.T.q().dispatch(ekb::a, ekc::a);

   public static ekk a(dwv $$0) {
      return new ekk($$0);
   }

   public static ekk a(djk $$0) {
      return new ekk($$0.m());
   }

   protected abstract ekc<?> a();

   public abstract dwv a(azg var1, ji var2);
}
