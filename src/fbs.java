import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class fbs {
   private static final BiMap<alg, bay> y = HashBiMap.create();
   public static final Codec<bay> a = alg.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((bay)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final bay b = a("empty", $$0 -> {
   });
   public static final bay c = a("chest", $$0 -> $$0.a(fbt.f).b(fbt.a));
   public static final bay d = a("command", $$0 -> $$0.a(fbt.f).b(fbt.a));
   public static final bay e = a("selector", $$0 -> $$0.a(fbt.f).a(fbt.a));
   public static final bay f = a("fishing", $$0 -> $$0.a(fbt.f).a(fbt.i).b(fbt.a));
   public static final bay g = a("entity", $$0 -> $$0.a(fbt.a).a(fbt.f).a(fbt.c).b(fbt.d).b(fbt.e).b(fbt.b));
   public static final bay h = a("equipment", $$0 -> $$0.a(fbt.f).a(fbt.a));
   public static final bay i = a("archaeology", $$0 -> $$0.a(fbt.f).a(fbt.a).a(fbt.i));
   public static final bay j = a("gift", $$0 -> $$0.a(fbt.f).a(fbt.a));
   public static final bay k = a("barter", $$0 -> $$0.a(fbt.a));
   public static final bay l = a("vault", $$0 -> $$0.a(fbt.f).b(fbt.a).b(fbt.i));
   public static final bay m = a("advancement_reward", $$0 -> $$0.a(fbt.a).a(fbt.f));
   public static final bay n = a("advancement_entity", $$0 -> $$0.a(fbt.a).a(fbt.f));
   public static final bay o = a("advancement_location", $$0 -> $$0.a(fbt.a).a(fbt.f).a(fbt.i).a(fbt.g));
   public static final bay p = a("block_use", $$0 -> $$0.a(fbt.a).a(fbt.f).a(fbt.g));
   public static final bay q = a("generic", $$0 -> $$0.a(fbt.a).a(fbt.b).a(fbt.c).a(fbt.d).a(fbt.e).a(fbt.f).a(fbt.g).a(fbt.h).a(fbt.i).a(fbt.j));
   public static final bay r = a("block", $$0 -> $$0.a(fbt.g).a(fbt.f).a(fbt.i).b(fbt.a).b(fbt.h).b(fbt.j));
   public static final bay s = a("shearing", $$0 -> $$0.a(fbt.f).a(fbt.a).a(fbt.i));
   public static final bay t = a("enchanted_damage", $$0 -> $$0.a(fbt.a).a(fbt.k).a(fbt.f).a(fbt.c).b(fbt.e).b(fbt.d));
   public static final bay u = a("enchanted_item", $$0 -> $$0.a(fbt.i).a(fbt.k));
   public static final bay v = a("enchanted_location", $$0 -> $$0.a(fbt.a).a(fbt.k).a(fbt.f).a(fbt.l));
   public static final bay w = a("enchanted_entity", $$0 -> $$0.a(fbt.a).a(fbt.k).a(fbt.f));
   public static final bay x = a("hit_block", $$0 -> $$0.a(fbt.a).a(fbt.k).a(fbt.f).a(fbt.g));

   private static bay a(String $$0, Consumer<bay.a> $$1) {
      bay.a $$2 = new bay.a();
      $$1.accept($$2);
      bay $$3 = $$2.a();
      alg $$4 = alg.b($$0);
      bay $$5 = (bay)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
