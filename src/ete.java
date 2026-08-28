import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class ete {
   private static final BiMap<alf, etd> t = HashBiMap.create();
   public static final Codec<etd> a = alf.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((etd)t.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         t.inverse()::get
      );
   public static final etd b = a("empty", $$0 -> {
   });
   public static final etd c = a("chest", $$0 -> $$0.a(etf.f).b(etf.a));
   public static final etd d = a("command", $$0 -> $$0.a(etf.f).b(etf.a));
   public static final etd e = a("selector", $$0 -> $$0.a(etf.f).a(etf.a));
   public static final etd f = a("fishing", $$0 -> $$0.a(etf.f).a(etf.i).b(etf.a));
   public static final etd g = a("entity", $$0 -> $$0.a(etf.a).a(etf.f).a(etf.c).b(etf.d).b(etf.e).b(etf.b));
   public static final etd h = a("equipment", $$0 -> $$0.a(etf.f).a(etf.a));
   public static final etd i = a("archaeology", $$0 -> $$0.a(etf.f).b(etf.a));
   public static final etd j = a("gift", $$0 -> $$0.a(etf.f).a(etf.a));
   public static final etd k = a("barter", $$0 -> $$0.a(etf.a));
   public static final etd l = a("vault", $$0 -> $$0.a(etf.f).b(etf.a));
   public static final etd m = a("advancement_reward", $$0 -> $$0.a(etf.a).a(etf.f));
   public static final etd n = a("advancement_entity", $$0 -> $$0.a(etf.a).a(etf.f));
   public static final etd o = a("advancement_location", $$0 -> $$0.a(etf.a).a(etf.f).a(etf.i).a(etf.g));
   public static final etd p = a("block_use", $$0 -> $$0.a(etf.a).a(etf.f).a(etf.g));
   public static final etd q = a("generic", $$0 -> $$0.a(etf.a).a(etf.b).a(etf.c).a(etf.d).a(etf.e).a(etf.f).a(etf.g).a(etf.h).a(etf.i).a(etf.j));
   public static final etd r = a("block", $$0 -> $$0.a(etf.g).a(etf.f).a(etf.i).b(etf.a).b(etf.h).b(etf.j));
   public static final etd s = a("shearing", $$0 -> $$0.a(etf.f).b(etf.a));

   private static etd a(String $$0, Consumer<etd.a> $$1) {
      etd.a $$2 = new etd.a();
      $$1.accept($$2);
      etd $$3 = $$2.a();
      alf $$4 = new alf($$0);
      etd $$5 = (etd)t.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
