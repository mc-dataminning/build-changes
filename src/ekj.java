import com.mojang.serialization.Codec;

public abstract class ekj {
   public static final Codec<ekj> c = ld.o.q().dispatch("predicate_type", ekj::a, ekk::codec);

   public abstract boolean a(dqh var1, ayg var2);

   protected abstract ekk<?> a();
}
