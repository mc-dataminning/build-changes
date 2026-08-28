import com.mojang.serialization.Codec;
import java.util.List;

public interface dbe<T extends dbk> {
   Codec<dbe<?>> a = mb.r.q().dispatch(dbe::a, dbo::a);
   yn<wa, dbe<?>> b = yl.a(mc.ae).b(dbe::a, dbo::b);

   boolean a(T var1, dgi var2);

   cwp a(T var1, jt.a var2);

   default boolean ap_() {
      return false;
   }

   default boolean i() {
      return true;
   }

   default String j() {
      return "";
   }

   dbo<? extends dbe<T>> a();

   dbp<? extends dbe<T>> b();

   dbd ao_();

   default List<dcj> g() {
      return List.of();
   }

   dbh h();
}
