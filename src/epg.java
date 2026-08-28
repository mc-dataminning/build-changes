import com.mojang.serialization.Codec;

public abstract class epg {
   public static final Codec<epg> c = lx.o.q().dispatch("predicate_type", epg::a, eph::codec);

   public abstract boolean a(jg var1, jg var2, jg var3, azr var4);

   protected abstract eph<?> a();
}
