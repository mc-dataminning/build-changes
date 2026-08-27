import com.mojang.serialization.Codec;

public abstract class dvg {
   public static final Codec<dvg> c = jb.r.q().dispatch("predicate_type", dvg::a, dvh::codec);

   public abstract boolean a(gu var1, gu var2, gu var3, apf var4);

   protected abstract dvh<?> a();
}
