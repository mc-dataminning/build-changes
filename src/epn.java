import com.mojang.serialization.Codec;

public abstract class epn {
   public static final Codec<epn> c = lx.m.q().dispatch("predicate_type", epn::a, epo::codec);

   public abstract boolean a(dvd var1, azr var2);

   protected abstract epo<?> a();
}
