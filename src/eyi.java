import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class eyi {
   private static final BiMap<aku, bai> y = HashBiMap.create();
   public static final Codec<bai> a = aku.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((bai)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final bai b = a("empty", $$0 -> {
   });
   public static final bai c = a("chest", $$0 -> $$0.a(eyj.f).b(eyj.a));
   public static final bai d = a("command", $$0 -> $$0.a(eyj.f).b(eyj.a));
   public static final bai e = a("selector", $$0 -> $$0.a(eyj.f).a(eyj.a));
   public static final bai f = a("fishing", $$0 -> $$0.a(eyj.f).a(eyj.i).b(eyj.a));
   public static final bai g = a("entity", $$0 -> $$0.a(eyj.a).a(eyj.f).a(eyj.c).b(eyj.d).b(eyj.e).b(eyj.b));
   public static final bai h = a("equipment", $$0 -> $$0.a(eyj.f).a(eyj.a));
   public static final bai i = a("archaeology", $$0 -> $$0.a(eyj.f).a(eyj.a).a(eyj.i));
   public static final bai j = a("gift", $$0 -> $$0.a(eyj.f).a(eyj.a));
   public static final bai k = a("barter", $$0 -> $$0.a(eyj.a));
   public static final bai l = a("vault", $$0 -> $$0.a(eyj.f).b(eyj.a).b(eyj.i));
   public static final bai m = a("advancement_reward", $$0 -> $$0.a(eyj.a).a(eyj.f));
   public static final bai n = a("advancement_entity", $$0 -> $$0.a(eyj.a).a(eyj.f));
   public static final bai o = a("advancement_location", $$0 -> $$0.a(eyj.a).a(eyj.f).a(eyj.i).a(eyj.g));
   public static final bai p = a("block_use", $$0 -> $$0.a(eyj.a).a(eyj.f).a(eyj.g));
   public static final bai q = a("generic", $$0 -> $$0.a(eyj.a).a(eyj.b).a(eyj.c).a(eyj.d).a(eyj.e).a(eyj.f).a(eyj.g).a(eyj.h).a(eyj.i).a(eyj.j));
   public static final bai r = a("block", $$0 -> $$0.a(eyj.g).a(eyj.f).a(eyj.i).b(eyj.a).b(eyj.h).b(eyj.j));
   public static final bai s = a("shearing", $$0 -> $$0.a(eyj.f).a(eyj.a).a(eyj.i));
   public static final bai t = a("enchanted_damage", $$0 -> $$0.a(eyj.a).a(eyj.k).a(eyj.f).a(eyj.c).b(eyj.e).b(eyj.d));
   public static final bai u = a("enchanted_item", $$0 -> $$0.a(eyj.i).a(eyj.k));
   public static final bai v = a("enchanted_location", $$0 -> $$0.a(eyj.a).a(eyj.k).a(eyj.f).a(eyj.l));
   public static final bai w = a("enchanted_entity", $$0 -> $$0.a(eyj.a).a(eyj.k).a(eyj.f));
   public static final bai x = a("hit_block", $$0 -> $$0.a(eyj.a).a(eyj.k).a(eyj.f).a(eyj.g));

   private static bai a(String $$0, Consumer<bai.a> $$1) {
      bai.a $$2 = new bai.a();
      $$1.accept($$2);
      bai $$3 = $$2.a();
      aku $$4 = aku.b($$0);
      bai $$5 = (bai)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
