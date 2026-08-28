import com.mojang.serialization.Codec;
import java.util.List;

public interface dcd<T extends dcj> {
   Codec<dcd<?>> a = ma.r.q().dispatch(dcd::a, dcn::a);
   zt<xg, dcd<?>> b = zr.a(mb.ae).b(dcd::a, dcn::b);

   boolean a(T var1, dhh var2);

   cxo a(T var1, js.a var2);

   default boolean aq_() {
      return false;
   }

   default boolean i() {
      return true;
   }

   default String j() {
      return "";
   }

   dcn<? extends dcd<T>> a();

   dco<? extends dcd<T>> b();

   dcc ap_();

   default List<ddi> g() {
      return List.of();
   }

   dcg h();
}
