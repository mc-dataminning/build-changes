import com.mojang.serialization.Codec;
import java.util.List;

public interface dbz<T extends dce> {
   Codec<dbz<?>> a = ma.r.q().dispatch(dbz::a, dci::a);
   zt<xg, dbz<?>> b = zr.a(mb.ae).b(dbz::a, dci::b);

   boolean a(T var1, dha var2);

   cxk a(T var1, js.a var2);

   default boolean aq_() {
      return false;
   }

   default boolean i() {
      return true;
   }

   default String j() {
      return "";
   }

   dci<? extends dbz<T>> a();

   dcj<? extends dbz<T>> b();

   dby ap_();

   default List<ddc> g() {
      return List.of();
   }

   dbi h();
}
