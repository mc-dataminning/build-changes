import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class etj {
   private static final BiMap<akk, eti> x = HashBiMap.create();
   public static final Codec<eti> a = akk.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((eti)x.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         x.inverse()::get
      );
   public static final eti b = a("empty", $$0 -> {
   });
   public static final eti c = a("chest", $$0 -> $$0.a(etk.f).b(etk.a));
   public static final eti d = a("command", $$0 -> $$0.a(etk.f).b(etk.a));
   public static final eti e = a("selector", $$0 -> $$0.a(etk.f).a(etk.a));
   public static final eti f = a("fishing", $$0 -> $$0.a(etk.f).a(etk.i).b(etk.a));
   public static final eti g = a("entity", $$0 -> $$0.a(etk.a).a(etk.f).a(etk.c).b(etk.d).b(etk.e).b(etk.b));
   public static final eti h = a("equipment", $$0 -> $$0.a(etk.f).a(etk.a));
   public static final eti i = a("archaeology", $$0 -> $$0.a(etk.f).b(etk.a));
   public static final eti j = a("gift", $$0 -> $$0.a(etk.f).a(etk.a));
   public static final eti k = a("barter", $$0 -> $$0.a(etk.a));
   public static final eti l = a("vault", $$0 -> $$0.a(etk.f).b(etk.a));
   public static final eti m = a("advancement_reward", $$0 -> $$0.a(etk.a).a(etk.f));
   public static final eti n = a("advancement_entity", $$0 -> $$0.a(etk.a).a(etk.f));
   public static final eti o = a("advancement_location", $$0 -> $$0.a(etk.a).a(etk.f).a(etk.i).a(etk.g));
   public static final eti p = a("block_use", $$0 -> $$0.a(etk.a).a(etk.f).a(etk.g));
   public static final eti q = a("generic", $$0 -> $$0.a(etk.a).a(etk.b).a(etk.c).a(etk.d).a(etk.e).a(etk.f).a(etk.g).a(etk.h).a(etk.i).a(etk.j));
   public static final eti r = a("block", $$0 -> $$0.a(etk.g).a(etk.f).a(etk.i).b(etk.a).b(etk.h).b(etk.j));
   public static final eti s = a("shearing", $$0 -> $$0.a(etk.f).b(etk.a));
   public static final eti t = a("enchanted_damage", $$0 -> $$0.a(etk.a).a(etk.k).a(etk.f).a(etk.c).b(etk.e).b(etk.d));
   public static final eti u = a("enchanted_item", $$0 -> $$0.a(etk.i).a(etk.k));
   public static final eti v = a("enchanted_location", $$0 -> $$0.a(etk.a).a(etk.k).a(etk.f).a(etk.l));
   public static final eti w = a("enchanted_entity", $$0 -> $$0.a(etk.a).a(etk.k).a(etk.f));

   private static eti a(String $$0, Consumer<eti.a> $$1) {
      eti.a $$2 = new eti.a();
      $$1.accept($$2);
      eti $$3 = $$2.a();
      akk $$4 = new akk($$0);
      eti $$5 = (eti)x.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
