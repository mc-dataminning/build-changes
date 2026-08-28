import com.mojang.serialization.Codec;

public abstract class esg {
   public static final Codec<esg> c = ma.m.q().dispatch("predicate_type", esg::a, esh::codec);

   public abstract boolean a(dxv var1, bam var2);

   protected abstract esh<?> a();
}
