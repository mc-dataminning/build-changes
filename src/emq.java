import com.mojang.serialization.Codec;

public abstract class emq {
   public static final Codec<emq> c = lq.m.r().dispatch("predicate_type", emq::a, emr::codec);

   public abstract boolean a(dsk var1, ayo var2);

   protected abstract emr<?> a();
}
