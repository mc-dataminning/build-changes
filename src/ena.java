import com.mojang.serialization.Codec;

public abstract class ena {
   public static final Codec<ena> c = lt.o.r().dispatch("predicate_type", ena::a, enb::codec);

   public abstract boolean a(jd var1, jd var2, jd var3, ayv var4);

   protected abstract enb<?> a();
}
