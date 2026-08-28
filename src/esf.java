import com.mojang.serialization.Codec;

public abstract class esf {
   public static final Codec<esf> c = ma.m.q().dispatch("predicate_type", esf::a, esg::codec);

   public abstract boolean a(dxu var1, bam var2);

   protected abstract esg<?> a();
}
