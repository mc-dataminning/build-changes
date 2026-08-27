import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class euf {
   private static final BiMap<akt, eue> s = HashBiMap.create();
   public static final Codec<eue> a = akt.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((eue)s.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         s.inverse()::get
      );
   public static final eue b = a("empty", $$0 -> {
   });
   public static final eue c = a("chest", $$0 -> $$0.a(eug.f).b(eug.a));
   public static final eue d = a("command", $$0 -> $$0.a(eug.f).b(eug.a));
   public static final eue e = a("selector", $$0 -> $$0.a(eug.f).a(eug.a));
   public static final eue f = a("fishing", $$0 -> $$0.a(eug.f).a(eug.i).b(eug.a));
   public static final eue g = a("entity", $$0 -> $$0.a(eug.a).a(eug.f).a(eug.c).b(eug.d).b(eug.e).b(eug.b));
   public static final eue h = a("archaeology", $$0 -> $$0.a(eug.f).b(eug.a));
   public static final eue i = a("gift", $$0 -> $$0.a(eug.f).a(eug.a));
   public static final eue j = a("barter", $$0 -> $$0.a(eug.a));
   public static final eue k = a("vault", $$0 -> $$0.a(eug.f).b(eug.a));
   public static final eue l = a("advancement_reward", $$0 -> $$0.a(eug.a).a(eug.f));
   public static final eue m = a("advancement_entity", $$0 -> $$0.a(eug.a).a(eug.f));
   public static final eue n = a("advancement_location", $$0 -> $$0.a(eug.a).a(eug.f).a(eug.i).a(eug.g));
   public static final eue o = a("block_use", $$0 -> $$0.a(eug.a).a(eug.f).a(eug.g));
   public static final eue p = a("generic", $$0 -> $$0.a(eug.a).a(eug.b).a(eug.c).a(eug.d).a(eug.e).a(eug.f).a(eug.g).a(eug.h).a(eug.i).a(eug.j));
   public static final eue q = a("block", $$0 -> $$0.a(eug.g).a(eug.f).a(eug.i).b(eug.a).b(eug.h).b(eug.j));
   public static final eue r = a("shearing", $$0 -> $$0.a(eug.f).b(eug.a));

   private static eue a(String $$0, Consumer<eue.a> $$1) {
      eue.a $$2 = new eue.a();
      $$1.accept($$2);
      eue $$3 = $$2.a();
      akt $$4 = new akt($$0);
      eue $$5 = (eue)s.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
