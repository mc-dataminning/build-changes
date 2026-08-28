import com.mojang.serialization.Codec;

public abstract class eui {
   public static final Codec<eui> c = mf.o.q().dispatch("predicate_type", eui::a, euj::codec);

   public abstract boolean a(iu var1, iu var2, iu var3, azv var4);

   protected abstract euj<?> a();
}
