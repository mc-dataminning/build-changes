import com.mojang.serialization.Codec;
import java.util.List;

public interface dbv<T extends dcb> {
   Codec<dbv<?>> a = mb.r.q().dispatch(dbv::a, dcf::a);
   yn<wa, dbv<?>> b = yl.a(mc.ae).b(dbv::a, dcf::b);

   boolean a(T var1, dgz var2);

   cxh a(T var1, jt.a var2);

   default boolean ap_() {
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

   dbu ao_();

   default List<ddb> g() {
      return List.of();
   }

   dby h();
}
