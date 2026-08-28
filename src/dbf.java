import com.mojang.serialization.Codec;
import java.util.List;

public interface dbf<T extends dbl> {
   Codec<dbf<?>> a = mb.r.q().dispatch(dbf::a, dbp::a);
   yn<wa, dbf<?>> b = yl.a(mc.ae).b(dbf::a, dbp::b);

   boolean a(T var1, dgj var2);

   cwq a(T var1, jt.a var2);

   default boolean ap_() {
      return false;
   }

   default boolean i() {
      return true;
   }

   default String j() {
      return "";
   }

   dbp<? extends dbf<T>> a();

   dbq<? extends dbf<T>> b();

   dbe ao_();

   default List<dck> g() {
      return List.of();
   }

   dbi h();
}
