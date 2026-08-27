import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class eev {
   private static final BiMap<aeu, eeu> p = HashBiMap.create();
   public static final Codec<eeu> a = aeu.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((eeu)p.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         p.inverse()::get
      );
   public static final eeu b = a("empty", $$0 -> {
   });
   public static final eeu c = a("chest", $$0 -> $$0.a(eew.f).b(eew.a));
   public static final eeu d = a("command", $$0 -> $$0.a(eew.f).b(eew.a));
   public static final eeu e = a("selector", $$0 -> $$0.a(eew.f).a(eew.a));
   public static final eeu f = a("fishing", $$0 -> $$0.a(eew.f).a(eew.i).b(eew.a));
   public static final eeu g = a("entity", $$0 -> $$0.a(eew.a).a(eew.f).a(eew.c).b(eew.d).b(eew.e).b(eew.b));
   public static final eeu h = a("archaeology", $$0 -> $$0.a(eew.f).b(eew.a));
   public static final eeu i = a("gift", $$0 -> $$0.a(eew.f).a(eew.a));
   public static final eeu j = a("barter", $$0 -> $$0.a(eew.a));
   public static final eeu k = a("advancement_reward", $$0 -> $$0.a(eew.a).a(eew.f));
   public static final eeu l = a("advancement_entity", $$0 -> $$0.a(eew.a).a(eew.f));
   public static final eeu m = a("advancement_location", $$0 -> $$0.a(eew.a).a(eew.f).a(eew.i).a(eew.g));
   public static final eeu n = a("generic", $$0 -> $$0.a(eew.a).a(eew.b).a(eew.c).a(eew.d).a(eew.e).a(eew.f).a(eew.g).a(eew.h).a(eew.i).a(eew.j));
   public static final eeu o = a("block", $$0 -> $$0.a(eew.g).a(eew.f).a(eew.i).b(eew.a).b(eew.h).b(eew.j));

   private static eeu a(String $$0, Consumer<eeu.a> $$1) {
      eeu.a $$2 = new eeu.a();
      $$1.accept($$2);
      eeu $$3 = $$2.a();
      aeu $$4 = new aeu($$0);
      eeu $$5 = (eeu)p.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
