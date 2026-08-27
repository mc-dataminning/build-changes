import com.mojang.serialization.Codec;

public abstract class dyj {
   public static final Codec<dyj> c = jd.r.q().dispatch("predicate_type", dyj::a, dyk::codec);

   public abstract boolean a(gw var1, gw var2, gw var3, arx var4);

   protected abstract dyk<?> a();
}
