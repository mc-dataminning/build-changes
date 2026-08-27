import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class efc {
   private static final BiMap<aey, efb> p = HashBiMap.create();
   public static final Codec<efb> a = aey.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((efb)p.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         p.inverse()::get
      );
   public static final efb b = a("empty", $$0 -> {
   });
   public static final efb c = a("chest", $$0 -> $$0.a(efd.f).b(efd.a));
   public static final efb d = a("command", $$0 -> $$0.a(efd.f).b(efd.a));
   public static final efb e = a("selector", $$0 -> $$0.a(efd.f).a(efd.a));
   public static final efb f = a("fishing", $$0 -> $$0.a(efd.f).a(efd.i).b(efd.a));
   public static final efb g = a("entity", $$0 -> $$0.a(efd.a).a(efd.f).a(efd.c).b(efd.d).b(efd.e).b(efd.b));
   public static final efb h = a("archaeology", $$0 -> $$0.a(efd.f).b(efd.a));
   public static final efb i = a("gift", $$0 -> $$0.a(efd.f).a(efd.a));
   public static final efb j = a("barter", $$0 -> $$0.a(efd.a));
   public static final efb k = a("advancement_reward", $$0 -> $$0.a(efd.a).a(efd.f));
   public static final efb l = a("advancement_entity", $$0 -> $$0.a(efd.a).a(efd.f));
   public static final efb m = a("advancement_location", $$0 -> $$0.a(efd.a).a(efd.f).a(efd.i).a(efd.g));
   public static final efb n = a("generic", $$0 -> $$0.a(efd.a).a(efd.b).a(efd.c).a(efd.d).a(efd.e).a(efd.f).a(efd.g).a(efd.h).a(efd.i).a(efd.j));
   public static final efb o = a("block", $$0 -> $$0.a(efd.g).a(efd.f).a(efd.i).b(efd.a).b(efd.h).b(efd.j));

   private static efb a(String $$0, Consumer<efb.a> $$1) {
      efb.a $$2 = new efb.a();
      $$1.accept($$2);
      efb $$3 = $$2.a();
      aey $$4 = new aey($$0);
      efb $$5 = (efb)p.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
