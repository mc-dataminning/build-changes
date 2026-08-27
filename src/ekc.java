import com.mojang.serialization.Codec;

public abstract class ekc {
   public static final Codec<ekc> c = ld.q.q().dispatch("predicate_type", ekc::a, ekd::codec);

   public abstract boolean a(in var1, in var2, in var3, ayg var4);

   protected abstract ekd<?> a();
}
