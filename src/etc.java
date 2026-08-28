import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class etc {
   private static final BiMap<ale, etb> t = HashBiMap.create();
   public static final Codec<etb> a = ale.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((etb)t.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         t.inverse()::get
      );
   public static final etb b = a("empty", $$0 -> {
   });
   public static final etb c = a("chest", $$0 -> $$0.a(etd.f).b(etd.a));
   public static final etb d = a("command", $$0 -> $$0.a(etd.f).b(etd.a));
   public static final etb e = a("selector", $$0 -> $$0.a(etd.f).a(etd.a));
   public static final etb f = a("fishing", $$0 -> $$0.a(etd.f).a(etd.i).b(etd.a));
   public static final etb g = a("entity", $$0 -> $$0.a(etd.a).a(etd.f).a(etd.c).b(etd.d).b(etd.e).b(etd.b));
   public static final etb h = a("equipment", $$0 -> $$0.a(etd.f).a(etd.a));
   public static final etb i = a("archaeology", $$0 -> $$0.a(etd.f).b(etd.a));
   public static final etb j = a("gift", $$0 -> $$0.a(etd.f).a(etd.a));
   public static final etb k = a("barter", $$0 -> $$0.a(etd.a));
   public static final etb l = a("vault", $$0 -> $$0.a(etd.f).b(etd.a));
   public static final etb m = a("advancement_reward", $$0 -> $$0.a(etd.a).a(etd.f));
   public static final etb n = a("advancement_entity", $$0 -> $$0.a(etd.a).a(etd.f));
   public static final etb o = a("advancement_location", $$0 -> $$0.a(etd.a).a(etd.f).a(etd.i).a(etd.g));
   public static final etb p = a("block_use", $$0 -> $$0.a(etd.a).a(etd.f).a(etd.g));
   public static final etb q = a("generic", $$0 -> $$0.a(etd.a).a(etd.b).a(etd.c).a(etd.d).a(etd.e).a(etd.f).a(etd.g).a(etd.h).a(etd.i).a(etd.j));
   public static final etb r = a("block", $$0 -> $$0.a(etd.g).a(etd.f).a(etd.i).b(etd.a).b(etd.h).b(etd.j));
   public static final etb s = a("shearing", $$0 -> $$0.a(etd.f).b(etd.a));

   private static etb a(String $$0, Consumer<etb.a> $$1) {
      etb.a $$2 = new etb.a();
      $$1.accept($$2);
      etb $$3 = $$2.a();
      ale $$4 = new ale($$0);
      etb $$5 = (etb)t.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
