import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class emi {
   private static final BiMap<ajc, emh> r = HashBiMap.create();
   public static final Codec<emh> a = ajc.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((emh)r.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         r.inverse()::get
      );
   public static final emh b = a("empty", $$0 -> {
   });
   public static final emh c = a("chest", $$0 -> $$0.a(emj.f).b(emj.a));
   public static final emh d = a("command", $$0 -> $$0.a(emj.f).b(emj.a));
   public static final emh e = a("selector", $$0 -> $$0.a(emj.f).a(emj.a));
   public static final emh f = a("fishing", $$0 -> $$0.a(emj.f).a(emj.i).b(emj.a));
   public static final emh g = a("entity", $$0 -> $$0.a(emj.a).a(emj.f).a(emj.c).b(emj.d).b(emj.e).b(emj.b));
   public static final emh h = a("archaeology", $$0 -> $$0.a(emj.f).b(emj.a));
   public static final emh i = a("gift", $$0 -> $$0.a(emj.f).a(emj.a));
   public static final emh j = a("barter", $$0 -> $$0.a(emj.a));
   public static final emh k = a("vault", $$0 -> $$0.a(emj.f).b(emj.a));
   public static final emh l = a("advancement_reward", $$0 -> $$0.a(emj.a).a(emj.f));
   public static final emh m = a("advancement_entity", $$0 -> $$0.a(emj.a).a(emj.f));
   public static final emh n = a("advancement_location", $$0 -> $$0.a(emj.a).a(emj.f).a(emj.i).a(emj.g));
   public static final emh o = a("block_use", $$0 -> $$0.a(emj.a).a(emj.f).a(emj.g));
   public static final emh p = a("generic", $$0 -> $$0.a(emj.a).a(emj.b).a(emj.c).a(emj.d).a(emj.e).a(emj.f).a(emj.g).a(emj.h).a(emj.i).a(emj.j));
   public static final emh q = a("block", $$0 -> $$0.a(emj.g).a(emj.f).a(emj.i).b(emj.a).b(emj.h).b(emj.j));

   private static emh a(String $$0, Consumer<emh.a> $$1) {
      emh.a $$2 = new emh.a();
      $$1.accept($$2);
      emh $$3 = $$2.a();
      ajc $$4 = new ajc($$0);
      emh $$5 = (emh)r.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
