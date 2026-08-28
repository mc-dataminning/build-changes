import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class fdc {
   private static final BiMap<alk, bbc> y = HashBiMap.create();
   public static final Codec<bbc> a = alk.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((bbc)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final bbc b = a("empty", $$0 -> {
   });
   public static final bbc c = a("chest", $$0 -> $$0.a(fdd.f).b(fdd.a));
   public static final bbc d = a("command", $$0 -> $$0.a(fdd.f).b(fdd.a));
   public static final bbc e = a("selector", $$0 -> $$0.a(fdd.f).a(fdd.a));
   public static final bbc f = a("fishing", $$0 -> $$0.a(fdd.f).a(fdd.i).b(fdd.a));
   public static final bbc g = a("entity", $$0 -> $$0.a(fdd.a).a(fdd.f).a(fdd.c).b(fdd.d).b(fdd.e).b(fdd.b));
   public static final bbc h = a("equipment", $$0 -> $$0.a(fdd.f).a(fdd.a));
   public static final bbc i = a("archaeology", $$0 -> $$0.a(fdd.f).a(fdd.a).a(fdd.i));
   public static final bbc j = a("gift", $$0 -> $$0.a(fdd.f).a(fdd.a));
   public static final bbc k = a("barter", $$0 -> $$0.a(fdd.a));
   public static final bbc l = a("vault", $$0 -> $$0.a(fdd.f).b(fdd.a).b(fdd.i));
   public static final bbc m = a("advancement_reward", $$0 -> $$0.a(fdd.a).a(fdd.f));
   public static final bbc n = a("advancement_entity", $$0 -> $$0.a(fdd.a).a(fdd.f));
   public static final bbc o = a("advancement_location", $$0 -> $$0.a(fdd.a).a(fdd.f).a(fdd.i).a(fdd.g));
   public static final bbc p = a("block_use", $$0 -> $$0.a(fdd.a).a(fdd.f).a(fdd.g));
   public static final bbc q = a("generic", $$0 -> $$0.a(fdd.a).a(fdd.b).a(fdd.c).a(fdd.d).a(fdd.e).a(fdd.f).a(fdd.g).a(fdd.h).a(fdd.i).a(fdd.j));
   public static final bbc r = a("block", $$0 -> $$0.a(fdd.g).a(fdd.f).a(fdd.i).b(fdd.a).b(fdd.h).b(fdd.j));
   public static final bbc s = a("shearing", $$0 -> $$0.a(fdd.f).a(fdd.a).a(fdd.i));
   public static final bbc t = a("enchanted_damage", $$0 -> $$0.a(fdd.a).a(fdd.k).a(fdd.f).a(fdd.c).b(fdd.e).b(fdd.d));
   public static final bbc u = a("enchanted_item", $$0 -> $$0.a(fdd.i).a(fdd.k));
   public static final bbc v = a("enchanted_location", $$0 -> $$0.a(fdd.a).a(fdd.k).a(fdd.f).a(fdd.l));
   public static final bbc w = a("enchanted_entity", $$0 -> $$0.a(fdd.a).a(fdd.k).a(fdd.f));
   public static final bbc x = a("hit_block", $$0 -> $$0.a(fdd.a).a(fdd.k).a(fdd.f).a(fdd.g));

   private static bbc a(String $$0, Consumer<bbc.a> $$1) {
      bbc.a $$2 = new bbc.a();
      $$1.accept($$2);
      bbc $$3 = $$2.a();
      alk $$4 = alk.b($$0);
      bbc $$5 = (bbc)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
