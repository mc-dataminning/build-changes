import com.mojang.serialization.Codec;

public abstract class epq {
   public static final Codec<epq> c = lz.o.q().dispatch("predicate_type", epq::a, epr::codec);

   public abstract boolean a(jh var1, jh var2, jh var3, azv var4);

   protected abstract epr<?> a();
}
