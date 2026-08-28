import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ddb {
   Codec<ddb> d = mb.az.q().dispatch(ddb::a, ddb.a::a);
   yn<wa, ddb> e = yl.a(mc.aF).b(ddb::a, ddb.a::b);

   ddh d();

   ddh e();

   ddb.a<? extends ddb> a();

   default boolean a(csn $$0) {
      return this.d().a($$0) && this.e().a($$0);
   }

   public static record a<T extends ddb>(MapCodec<T> a, yn<wa, T> b) {
   }
}
