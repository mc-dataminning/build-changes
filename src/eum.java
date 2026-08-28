import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class eum {
   private static final BiMap<akr, eul> y = HashBiMap.create();
   public static final Codec<eul> a = akr.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((eul)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final eul b = a("empty", $$0 -> {
   });
   public static final eul c = a("chest", $$0 -> $$0.a(eun.f).b(eun.a));
   public static final eul d = a("command", $$0 -> $$0.a(eun.f).b(eun.a));
   public static final eul e = a("selector", $$0 -> $$0.a(eun.f).a(eun.a));
   public static final eul f = a("fishing", $$0 -> $$0.a(eun.f).a(eun.i).b(eun.a));
   public static final eul g = a("entity", $$0 -> $$0.a(eun.a).a(eun.f).a(eun.c).b(eun.d).b(eun.e).b(eun.b));
   public static final eul h = a("equipment", $$0 -> $$0.a(eun.f).a(eun.a));
   public static final eul i = a("archaeology", $$0 -> $$0.a(eun.f).b(eun.a));
   public static final eul j = a("gift", $$0 -> $$0.a(eun.f).a(eun.a));
   public static final eul k = a("barter", $$0 -> $$0.a(eun.a));
   public static final eul l = a("vault", $$0 -> $$0.a(eun.f).b(eun.a));
   public static final eul m = a("advancement_reward", $$0 -> $$0.a(eun.a).a(eun.f));
   public static final eul n = a("advancement_entity", $$0 -> $$0.a(eun.a).a(eun.f));
   public static final eul o = a("advancement_location", $$0 -> $$0.a(eun.a).a(eun.f).a(eun.i).a(eun.g));
   public static final eul p = a("block_use", $$0 -> $$0.a(eun.a).a(eun.f).a(eun.g));
   public static final eul q = a("generic", $$0 -> $$0.a(eun.a).a(eun.b).a(eun.c).a(eun.d).a(eun.e).a(eun.f).a(eun.g).a(eun.h).a(eun.i).a(eun.j));
   public static final eul r = a("block", $$0 -> $$0.a(eun.g).a(eun.f).a(eun.i).b(eun.a).b(eun.h).b(eun.j));
   public static final eul s = a("shearing", $$0 -> $$0.a(eun.f).b(eun.a));
   public static final eul t = a("enchanted_damage", $$0 -> $$0.a(eun.a).a(eun.k).a(eun.f).a(eun.c).b(eun.e).b(eun.d));
   public static final eul u = a("enchanted_item", $$0 -> $$0.a(eun.i).a(eun.k));
   public static final eul v = a("enchanted_location", $$0 -> $$0.a(eun.a).a(eun.k).a(eun.f).a(eun.l));
   public static final eul w = a("enchanted_entity", $$0 -> $$0.a(eun.a).a(eun.k).a(eun.f));
   public static final eul x = a("hit_block", $$0 -> $$0.a(eun.a).a(eun.k).a(eun.f).a(eun.g));

   private static eul a(String $$0, Consumer<eul.a> $$1) {
      eul.a $$2 = new eul.a();
      $$1.accept($$2);
      eul $$3 = $$2.a();
      akr $$4 = akr.b($$0);
      eul $$5 = (eul)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
