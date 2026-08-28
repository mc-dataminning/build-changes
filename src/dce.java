import com.mojang.serialization.Codec;
import java.util.List;

public interface dce<T extends dck> {
   Codec<dce<?>> a = ma.r.q().dispatch(dce::a, dco::a);
   zt<xg, dce<?>> b = zr.a(mb.ae).b(dce::a, dco::b);

   boolean a(T var1, dhi var2);

   cxp a(T var1, js.a var2);

   default boolean aq_() {
      return false;
   }

   default boolean i() {
      return true;
   }

   default String j() {
      return "";
   }

   dco<? extends dce<T>> a();

   dcp<? extends dce<T>> b();

   dcd ap_();

   default List<ddj> g() {
      return List.of();
   }

   dch h();
}
