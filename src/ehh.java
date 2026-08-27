import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class ehh {
   private static final BiMap<agi, ehg> p = HashBiMap.create();
   public static final Codec<ehg> a = agi.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((ehg)p.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         p.inverse()::get
      );
   public static final ehg b = a("empty", $$0 -> {
   });
   public static final ehg c = a("chest", $$0 -> $$0.a(ehi.f).b(ehi.a));
   public static final ehg d = a("command", $$0 -> $$0.a(ehi.f).b(ehi.a));
   public static final ehg e = a("selector", $$0 -> $$0.a(ehi.f).a(ehi.a));
   public static final ehg f = a("fishing", $$0 -> $$0.a(ehi.f).a(ehi.i).b(ehi.a));
   public static final ehg g = a("entity", $$0 -> $$0.a(ehi.a).a(ehi.f).a(ehi.c).b(ehi.d).b(ehi.e).b(ehi.b));
   public static final ehg h = a("archaeology", $$0 -> $$0.a(ehi.f).b(ehi.a));
   public static final ehg i = a("gift", $$0 -> $$0.a(ehi.f).a(ehi.a));
   public static final ehg j = a("barter", $$0 -> $$0.a(ehi.a));
   public static final ehg k = a("advancement_reward", $$0 -> $$0.a(ehi.a).a(ehi.f));
   public static final ehg l = a("advancement_entity", $$0 -> $$0.a(ehi.a).a(ehi.f));
   public static final ehg m = a("advancement_location", $$0 -> $$0.a(ehi.a).a(ehi.f).a(ehi.i).a(ehi.g));
   public static final ehg n = a("generic", $$0 -> $$0.a(ehi.a).a(ehi.b).a(ehi.c).a(ehi.d).a(ehi.e).a(ehi.f).a(ehi.g).a(ehi.h).a(ehi.i).a(ehi.j));
   public static final ehg o = a("block", $$0 -> $$0.a(ehi.g).a(ehi.f).a(ehi.i).b(ehi.a).b(ehi.h).b(ehi.j));

   private static ehg a(String $$0, Consumer<ehg.a> $$1) {
      ehg.a $$2 = new ehg.a();
      $$1.accept($$2);
      ehg $$3 = $$2.a();
      agi $$4 = new agi($$0);
      ehg $$5 = (ehg)p.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
