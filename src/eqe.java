import com.mojang.serialization.Codec;

public abstract class eqe {
   public static final Codec<eqe> c = lz.m.q().dispatch("predicate_type", eqe::a, eqf::codec);

   public abstract boolean a(dvv var1, azu var2);

   protected abstract eqf<?> a();
}
