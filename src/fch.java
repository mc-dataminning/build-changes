import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class fch {
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
   public static final bay c = a("chest", $$0 -> $$0.a(fci.f).b(fci.a));
   public static final bay d = a("command", $$0 -> $$0.a(fci.f).b(fci.a));
   public static final bay e = a("selector", $$0 -> $$0.a(fci.f).a(fci.a));
   public static final bay f = a("fishing", $$0 -> $$0.a(fci.f).a(fci.i).b(fci.a));
   public static final bay g = a("entity", $$0 -> $$0.a(fci.a).a(fci.f).a(fci.c).b(fci.d).b(fci.e).b(fci.b));
   public static final bay h = a("equipment", $$0 -> $$0.a(fci.f).a(fci.a));
   public static final bay i = a("archaeology", $$0 -> $$0.a(fci.f).a(fci.a).a(fci.i));
   public static final bay j = a("gift", $$0 -> $$0.a(fci.f).a(fci.a));
   public static final bay k = a("barter", $$0 -> $$0.a(fci.a));
   public static final bay l = a("vault", $$0 -> $$0.a(fci.f).b(fci.a).b(fci.i));
   public static final bay m = a("advancement_reward", $$0 -> $$0.a(fci.a).a(fci.f));
   public static final bay n = a("advancement_entity", $$0 -> $$0.a(fci.a).a(fci.f));
   public static final bay o = a("advancement_location", $$0 -> $$0.a(fci.a).a(fci.f).a(fci.i).a(fci.g));
   public static final bay p = a("block_use", $$0 -> $$0.a(fci.a).a(fci.f).a(fci.g));
   public static final bay q = a("generic", $$0 -> $$0.a(fci.a).a(fci.b).a(fci.c).a(fci.d).a(fci.e).a(fci.f).a(fci.g).a(fci.h).a(fci.i).a(fci.j));
   public static final bay r = a("block", $$0 -> $$0.a(fci.g).a(fci.f).a(fci.i).b(fci.a).b(fci.h).b(fci.j));
   public static final bay s = a("shearing", $$0 -> $$0.a(fci.f).a(fci.a).a(fci.i));
   public static final bay t = a("enchanted_damage", $$0 -> $$0.a(fci.a).a(fci.k).a(fci.f).a(fci.c).b(fci.e).b(fci.d));
   public static final bay u = a("enchanted_item", $$0 -> $$0.a(fci.i).a(fci.k));
   public static final bay v = a("enchanted_location", $$0 -> $$0.a(fci.a).a(fci.k).a(fci.f).a(fci.l));
   public static final bay w = a("enchanted_entity", $$0 -> $$0.a(fci.a).a(fci.k).a(fci.f));
   public static final bay x = a("hit_block", $$0 -> $$0.a(fci.a).a(fci.k).a(fci.f).a(fci.g));

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
