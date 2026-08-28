import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class fda {
   private static final BiMap<ali, bba> y = HashBiMap.create();
   public static final Codec<bba> a = ali.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((bba)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final bba b = a("empty", $$0 -> {
   });
   public static final bba c = a("chest", $$0 -> $$0.a(fdb.f).b(fdb.a));
   public static final bba d = a("command", $$0 -> $$0.a(fdb.f).b(fdb.a));
   public static final bba e = a("selector", $$0 -> $$0.a(fdb.f).a(fdb.a));
   public static final bba f = a("fishing", $$0 -> $$0.a(fdb.f).a(fdb.i).b(fdb.a));
   public static final bba g = a("entity", $$0 -> $$0.a(fdb.a).a(fdb.f).a(fdb.c).b(fdb.d).b(fdb.e).b(fdb.b));
   public static final bba h = a("equipment", $$0 -> $$0.a(fdb.f).a(fdb.a));
   public static final bba i = a("archaeology", $$0 -> $$0.a(fdb.f).a(fdb.a).a(fdb.i));
   public static final bba j = a("gift", $$0 -> $$0.a(fdb.f).a(fdb.a));
   public static final bba k = a("barter", $$0 -> $$0.a(fdb.a));
   public static final bba l = a("vault", $$0 -> $$0.a(fdb.f).b(fdb.a).b(fdb.i));
   public static final bba m = a("advancement_reward", $$0 -> $$0.a(fdb.a).a(fdb.f));
   public static final bba n = a("advancement_entity", $$0 -> $$0.a(fdb.a).a(fdb.f));
   public static final bba o = a("advancement_location", $$0 -> $$0.a(fdb.a).a(fdb.f).a(fdb.i).a(fdb.g));
   public static final bba p = a("block_use", $$0 -> $$0.a(fdb.a).a(fdb.f).a(fdb.g));
   public static final bba q = a("generic", $$0 -> $$0.a(fdb.a).a(fdb.b).a(fdb.c).a(fdb.d).a(fdb.e).a(fdb.f).a(fdb.g).a(fdb.h).a(fdb.i).a(fdb.j));
   public static final bba r = a("block", $$0 -> $$0.a(fdb.g).a(fdb.f).a(fdb.i).b(fdb.a).b(fdb.h).b(fdb.j));
   public static final bba s = a("shearing", $$0 -> $$0.a(fdb.f).a(fdb.a).a(fdb.i));
   public static final bba t = a("enchanted_damage", $$0 -> $$0.a(fdb.a).a(fdb.k).a(fdb.f).a(fdb.c).b(fdb.e).b(fdb.d));
   public static final bba u = a("enchanted_item", $$0 -> $$0.a(fdb.i).a(fdb.k));
   public static final bba v = a("enchanted_location", $$0 -> $$0.a(fdb.a).a(fdb.k).a(fdb.f).a(fdb.l));
   public static final bba w = a("enchanted_entity", $$0 -> $$0.a(fdb.a).a(fdb.k).a(fdb.f));
   public static final bba x = a("hit_block", $$0 -> $$0.a(fdb.a).a(fdb.k).a(fdb.f).a(fdb.g));

   private static bba a(String $$0, Consumer<bba.a> $$1) {
      bba.a $$2 = new bba.a();
      $$1.accept($$2);
      bba $$3 = $$2.a();
      ali $$4 = ali.b($$0);
      bba $$5 = (bba)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
