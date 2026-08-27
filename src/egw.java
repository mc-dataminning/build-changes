import com.mojang.serialization.Codec;

public abstract class egw {
   public static final Codec<egw> c = ki.o.q().dispatch("predicate_type", egw::a, egx::codec);

   public abstract boolean a(dmz var1, axd var2);

   protected abstract egx<?> a();
}
