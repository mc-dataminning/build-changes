import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class esy {
   private static final BiMap<alb, esx> t = HashBiMap.create();
   public static final Codec<esx> a = alb.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((esx)t.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         t.inverse()::get
      );
   public static final esx b = a("empty", $$0 -> {
   });
   public static final esx c = a("chest", $$0 -> $$0.a(esz.f).b(esz.a));
   public static final esx d = a("command", $$0 -> $$0.a(esz.f).b(esz.a));
   public static final esx e = a("selector", $$0 -> $$0.a(esz.f).a(esz.a));
   public static final esx f = a("fishing", $$0 -> $$0.a(esz.f).a(esz.i).b(esz.a));
   public static final esx g = a("entity", $$0 -> $$0.a(esz.a).a(esz.f).a(esz.c).b(esz.d).b(esz.e).b(esz.b));
   public static final esx h = a("equipment", $$0 -> $$0.a(esz.f).a(esz.a));
   public static final esx i = a("archaeology", $$0 -> $$0.a(esz.f).b(esz.a));
   public static final esx j = a("gift", $$0 -> $$0.a(esz.f).a(esz.a));
   public static final esx k = a("barter", $$0 -> $$0.a(esz.a));
   public static final esx l = a("vault", $$0 -> $$0.a(esz.f).b(esz.a));
   public static final esx m = a("advancement_reward", $$0 -> $$0.a(esz.a).a(esz.f));
   public static final esx n = a("advancement_entity", $$0 -> $$0.a(esz.a).a(esz.f));
   public static final esx o = a("advancement_location", $$0 -> $$0.a(esz.a).a(esz.f).a(esz.i).a(esz.g));
   public static final esx p = a("block_use", $$0 -> $$0.a(esz.a).a(esz.f).a(esz.g));
   public static final esx q = a("generic", $$0 -> $$0.a(esz.a).a(esz.b).a(esz.c).a(esz.d).a(esz.e).a(esz.f).a(esz.g).a(esz.h).a(esz.i).a(esz.j));
   public static final esx r = a("block", $$0 -> $$0.a(esz.g).a(esz.f).a(esz.i).b(esz.a).b(esz.h).b(esz.j));
   public static final esx s = a("shearing", $$0 -> $$0.a(esz.f).b(esz.a));

   private static esx a(String $$0, Consumer<esx.a> $$1) {
      esx.a $$2 = new esx.a();
      $$1.accept($$2);
      esx $$3 = $$2.a();
      alb $$4 = new alb($$0);
      esx $$5 = (esx)t.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
