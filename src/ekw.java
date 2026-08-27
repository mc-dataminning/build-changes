import com.mojang.serialization.Codec;

public abstract class ekw {
   public static final Codec<ekw> c = le.q.q().dispatch("predicate_type", ekw::a, ekx::codec);

   public abstract boolean a(io var1, io var2, io var3, ayk var4);

   protected abstract ekx<?> a();
}
