import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class eeq {
   private static final BiMap<aer, eep> p = HashBiMap.create();
   public static final Codec<eep> a = aer.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((eep)p.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         p.inverse()::get
      );
   public static final eep b = a("empty", $$0 -> {
   });
   public static final eep c = a("chest", $$0 -> $$0.a(eer.f).b(eer.a));
   public static final eep d = a("command", $$0 -> $$0.a(eer.f).b(eer.a));
   public static final eep e = a("selector", $$0 -> $$0.a(eer.f).a(eer.a));
   public static final eep f = a("fishing", $$0 -> $$0.a(eer.f).a(eer.i).b(eer.a));
   public static final eep g = a("entity", $$0 -> $$0.a(eer.a).a(eer.f).a(eer.c).b(eer.d).b(eer.e).b(eer.b));
   public static final eep h = a("archaeology", $$0 -> $$0.a(eer.f).b(eer.a));
   public static final eep i = a("gift", $$0 -> $$0.a(eer.f).a(eer.a));
   public static final eep j = a("barter", $$0 -> $$0.a(eer.a));
   public static final eep k = a("advancement_reward", $$0 -> $$0.a(eer.a).a(eer.f));
   public static final eep l = a("advancement_entity", $$0 -> $$0.a(eer.a).a(eer.f));
   public static final eep m = a("advancement_location", $$0 -> $$0.a(eer.a).a(eer.f).a(eer.i).a(eer.g));
   public static final eep n = a("generic", $$0 -> $$0.a(eer.a).a(eer.b).a(eer.c).a(eer.d).a(eer.e).a(eer.f).a(eer.g).a(eer.h).a(eer.i).a(eer.j));
   public static final eep o = a("block", $$0 -> $$0.a(eer.g).a(eer.f).a(eer.i).b(eer.a).b(eer.h).b(eer.j));

   private static eep a(String $$0, Consumer<eep.a> $$1) {
      eep.a $$2 = new eep.a();
      $$1.accept($$2);
      eep $$3 = $$2.a();
      aer $$4 = new aer($$0);
      eep $$5 = (eep)p.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
