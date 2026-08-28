import com.mojang.serialization.Codec;
import java.util.List;

public interface dbv<T extends dcb> {
   Codec<dbv<?>> a = ma.r.q().dispatch(dbv::a, dcf::a);
   zi<wv, dbv<?>> b = zg.a(mb.ae).b(dbv::a, dcf::b);

   boolean a(T var1, dgz var2);

   cxg a(T var1, js.a var2);

   default boolean aq_() {
      return false;
   }

   default boolean i() {
      return true;
   }

   default String j() {
      return "";
   }

   dcf<? extends dbv<T>> a();

   dcg<? extends dbv<T>> b();

   dbu ap_();

   default List<dda> g() {
      return List.of();
   }

   dby h();
}
