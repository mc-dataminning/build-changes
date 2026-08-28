import com.mojang.serialization.Codec;
import java.util.List;

public interface dfb<T extends dfh> {
   Codec<dfb<?>> a = mh.r.q().dispatch(dfb::a, dfl::a);
   Codec<alq<dfb<?>>> b = alq.a(mi.bv);
   ze<wp, dfb<?>> c = zc.a(mi.ah).b(dfb::a, dfl::b);

   boolean a(T var1, dkj var2);

   dak a(T var1, ji.a var2);

   default boolean am_() {
      return false;
   }

   default boolean i() {
      return true;
   }

   default String j() {
      return "";
   }

   dfl<? extends dfb<T>> a();

   dfm<? extends dfb<T>> b();

   dfa al_();

   default List<dgh> g() {
      return List.of();
   }

   dfe h();
}
