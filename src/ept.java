import com.mojang.serialization.Codec;

public abstract class ept {
   public static final Codec<ept> c = ly.m.q().dispatch("predicate_type", ept::a, epu::codec);

   public abstract boolean a(dvj var1, azs var2);

   protected abstract epu<?> a();
}
