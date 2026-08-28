import com.mojang.serialization.Codec;

public abstract class enl {
   public static final Codec<enl> c = lt.m.r().dispatch("predicate_type", enl::a, enm::codec);

   public abstract boolean a(dtc var1, ayw var2);

   protected abstract enm<?> a();
}
