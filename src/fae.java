import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class fae {
   private static final BiMap<ald, bau> y = HashBiMap.create();
   public static final Codec<bau> a = ald.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((bau)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final bau b = a("empty", $$0 -> {
   });
   public static final bau c = a("chest", $$0 -> $$0.a(faf.f).b(faf.a));
   public static final bau d = a("command", $$0 -> $$0.a(faf.f).b(faf.a));
   public static final bau e = a("selector", $$0 -> $$0.a(faf.f).a(faf.a));
   public static final bau f = a("fishing", $$0 -> $$0.a(faf.f).a(faf.i).b(faf.a));
   public static final bau g = a("entity", $$0 -> $$0.a(faf.a).a(faf.f).a(faf.c).b(faf.d).b(faf.e).b(faf.b));
   public static final bau h = a("equipment", $$0 -> $$0.a(faf.f).a(faf.a));
   public static final bau i = a("archaeology", $$0 -> $$0.a(faf.f).a(faf.a).a(faf.i));
   public static final bau j = a("gift", $$0 -> $$0.a(faf.f).a(faf.a));
   public static final bau k = a("barter", $$0 -> $$0.a(faf.a));
   public static final bau l = a("vault", $$0 -> $$0.a(faf.f).b(faf.a).b(faf.i));
   public static final bau m = a("advancement_reward", $$0 -> $$0.a(faf.a).a(faf.f));
   public static final bau n = a("advancement_entity", $$0 -> $$0.a(faf.a).a(faf.f));
   public static final bau o = a("advancement_location", $$0 -> $$0.a(faf.a).a(faf.f).a(faf.i).a(faf.g));
   public static final bau p = a("block_use", $$0 -> $$0.a(faf.a).a(faf.f).a(faf.g));
   public static final bau q = a("generic", $$0 -> $$0.a(faf.a).a(faf.b).a(faf.c).a(faf.d).a(faf.e).a(faf.f).a(faf.g).a(faf.h).a(faf.i).a(faf.j));
   public static final bau r = a("block", $$0 -> $$0.a(faf.g).a(faf.f).a(faf.i).b(faf.a).b(faf.h).b(faf.j));
   public static final bau s = a("shearing", $$0 -> $$0.a(faf.f).a(faf.a).a(faf.i));
   public static final bau t = a("enchanted_damage", $$0 -> $$0.a(faf.a).a(faf.k).a(faf.f).a(faf.c).b(faf.e).b(faf.d));
   public static final bau u = a("enchanted_item", $$0 -> $$0.a(faf.i).a(faf.k));
   public static final bau v = a("enchanted_location", $$0 -> $$0.a(faf.a).a(faf.k).a(faf.f).a(faf.l));
   public static final bau w = a("enchanted_entity", $$0 -> $$0.a(faf.a).a(faf.k).a(faf.f));
   public static final bau x = a("hit_block", $$0 -> $$0.a(faf.a).a(faf.k).a(faf.f).a(faf.g));

   private static bau a(String $$0, Consumer<bau.a> $$1) {
      bau.a $$2 = new bau.a();
      $$1.accept($$2);
      bau $$3 = $$2.a();
      ald $$4 = ald.b($$0);
      bau $$5 = (bau)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
