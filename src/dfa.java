import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dfa {
   Codec<dfa> d = mf.ax.q().dispatch(dfa::a, dfa.a::a);
   yw<wj, dfa> e = yu.a(mg.ag).b(dfa::a, dfa.a::b);

   dfg d();

   dfg e();

   dfa.a<? extends dfa> a();

   default boolean a(cum $$0) {
      return this.d().a($$0) && this.e().a($$0);
   }

   public static record a<T extends dfa>(MapCodec<T> a, yw<wj, T> b) {
   }
}
