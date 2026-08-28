import com.mojang.serialization.Codec;

public abstract class epc {
   public static final Codec<epc> c = lv.m.q().dispatch("predicate_type", epc::a, epd::codec);

   public abstract boolean a(dus var1, azn var2);

   protected abstract epd<?> a();
}
