import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class exi {
   private static final BiMap<alj, exh> y = HashBiMap.create();
   public static final Codec<exh> a = alj.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((exh)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final exh b = a("empty", $$0 -> {
   });
   public static final exh c = a("chest", $$0 -> $$0.a(exj.f).b(exj.a));
   public static final exh d = a("command", $$0 -> $$0.a(exj.f).b(exj.a));
   public static final exh e = a("selector", $$0 -> $$0.a(exj.f).a(exj.a));
   public static final exh f = a("fishing", $$0 -> $$0.a(exj.f).a(exj.i).b(exj.a));
   public static final exh g = a("entity", $$0 -> $$0.a(exj.a).a(exj.f).a(exj.c).b(exj.d).b(exj.e).b(exj.b));
   public static final exh h = a("equipment", $$0 -> $$0.a(exj.f).a(exj.a));
   public static final exh i = a("archaeology", $$0 -> $$0.a(exj.f).a(exj.a).a(exj.i));
   public static final exh j = a("gift", $$0 -> $$0.a(exj.f).a(exj.a));
   public static final exh k = a("barter", $$0 -> $$0.a(exj.a));
   public static final exh l = a("vault", $$0 -> $$0.a(exj.f).b(exj.a).b(exj.i));
   public static final exh m = a("advancement_reward", $$0 -> $$0.a(exj.a).a(exj.f));
   public static final exh n = a("advancement_entity", $$0 -> $$0.a(exj.a).a(exj.f));
   public static final exh o = a("advancement_location", $$0 -> $$0.a(exj.a).a(exj.f).a(exj.i).a(exj.g));
   public static final exh p = a("block_use", $$0 -> $$0.a(exj.a).a(exj.f).a(exj.g));
   public static final exh q = a("generic", $$0 -> $$0.a(exj.a).a(exj.b).a(exj.c).a(exj.d).a(exj.e).a(exj.f).a(exj.g).a(exj.h).a(exj.i).a(exj.j));
   public static final exh r = a("block", $$0 -> $$0.a(exj.g).a(exj.f).a(exj.i).b(exj.a).b(exj.h).b(exj.j));
   public static final exh s = a("shearing", $$0 -> $$0.a(exj.f).a(exj.a).a(exj.i));
   public static final exh t = a("enchanted_damage", $$0 -> $$0.a(exj.a).a(exj.k).a(exj.f).a(exj.c).b(exj.e).b(exj.d));
   public static final exh u = a("enchanted_item", $$0 -> $$0.a(exj.i).a(exj.k));
   public static final exh v = a("enchanted_location", $$0 -> $$0.a(exj.a).a(exj.k).a(exj.f).a(exj.l));
   public static final exh w = a("enchanted_entity", $$0 -> $$0.a(exj.a).a(exj.k).a(exj.f));
   public static final exh x = a("hit_block", $$0 -> $$0.a(exj.a).a(exj.k).a(exj.f).a(exj.g));

   private static exh a(String $$0, Consumer<exh.a> $$1) {
      exh.a $$2 = new exh.a();
      $$1.accept($$2);
      exh $$3 = $$2.a();
      alj $$4 = alj.b($$0);
      exh $$5 = (exh)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
