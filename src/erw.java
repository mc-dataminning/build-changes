import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class erw {
   private static final BiMap<akm, erv> t = HashBiMap.create();
   public static final Codec<erv> a = akm.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((erv)t.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         t.inverse()::get
      );
   public static final erv b = a("empty", $$0 -> {
   });
   public static final erv c = a("chest", $$0 -> $$0.a(erx.f).b(erx.a));
   public static final erv d = a("command", $$0 -> $$0.a(erx.f).b(erx.a));
   public static final erv e = a("selector", $$0 -> $$0.a(erx.f).a(erx.a));
   public static final erv f = a("fishing", $$0 -> $$0.a(erx.f).a(erx.i).b(erx.a));
   public static final erv g = a("entity", $$0 -> $$0.a(erx.a).a(erx.f).a(erx.c).b(erx.d).b(erx.e).b(erx.b));
   public static final erv h = a("equipment", $$0 -> $$0.a(erx.f).a(erx.a));
   public static final erv i = a("archaeology", $$0 -> $$0.a(erx.f).b(erx.a));
   public static final erv j = a("gift", $$0 -> $$0.a(erx.f).a(erx.a));
   public static final erv k = a("barter", $$0 -> $$0.a(erx.a));
   public static final erv l = a("vault", $$0 -> $$0.a(erx.f).b(erx.a));
   public static final erv m = a("advancement_reward", $$0 -> $$0.a(erx.a).a(erx.f));
   public static final erv n = a("advancement_entity", $$0 -> $$0.a(erx.a).a(erx.f));
   public static final erv o = a("advancement_location", $$0 -> $$0.a(erx.a).a(erx.f).a(erx.i).a(erx.g));
   public static final erv p = a("block_use", $$0 -> $$0.a(erx.a).a(erx.f).a(erx.g));
   public static final erv q = a("generic", $$0 -> $$0.a(erx.a).a(erx.b).a(erx.c).a(erx.d).a(erx.e).a(erx.f).a(erx.g).a(erx.h).a(erx.i).a(erx.j));
   public static final erv r = a("block", $$0 -> $$0.a(erx.g).a(erx.f).a(erx.i).b(erx.a).b(erx.h).b(erx.j));
   public static final erv s = a("shearing", $$0 -> $$0.a(erx.f).b(erx.a));

   private static erv a(String $$0, Consumer<erv.a> $$1) {
      erv.a $$2 = new erv.a();
      $$1.accept($$2);
      erv $$3 = $$2.a();
      akm $$4 = new akm($$0);
      erv $$5 = (erv)t.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
