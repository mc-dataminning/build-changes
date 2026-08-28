import com.mojang.serialization.Codec;
import java.util.List;

public interface ddu<T extends dea> {
   Codec<ddu<?>> a = mf.r.q().dispatch(ddu::a, dee::a);
   yw<wj, ddu<?>> b = yu.a(mg.ah).b(ddu::a, dee::b);

   boolean a(T var1, dja var2);

   czd a(T var1, jg.a var2);

   default boolean am_() {
      return false;
   }

   default boolean i() {
      return true;
   }

   default String j() {
      return "";
   }

   dee<? extends ddu<T>> a();

   def<? extends ddu<T>> b();

   ddt al_();

   default List<dfa> g() {
      return List.of();
   }

   ddx h();
}
