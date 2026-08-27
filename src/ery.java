import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class ery {
   private static final BiMap<akn, erx> t = HashBiMap.create();
   public static final Codec<erx> a = akn.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((erx)t.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         t.inverse()::get
      );
   public static final erx b = a("empty", $$0 -> {
   });
   public static final erx c = a("chest", $$0 -> $$0.a(erz.f).b(erz.a));
   public static final erx d = a("command", $$0 -> $$0.a(erz.f).b(erz.a));
   public static final erx e = a("selector", $$0 -> $$0.a(erz.f).a(erz.a));
   public static final erx f = a("fishing", $$0 -> $$0.a(erz.f).a(erz.i).b(erz.a));
   public static final erx g = a("entity", $$0 -> $$0.a(erz.a).a(erz.f).a(erz.c).b(erz.d).b(erz.e).b(erz.b));
   public static final erx h = a("equipment", $$0 -> $$0.a(erz.f).a(erz.a));
   public static final erx i = a("archaeology", $$0 -> $$0.a(erz.f).b(erz.a));
   public static final erx j = a("gift", $$0 -> $$0.a(erz.f).a(erz.a));
   public static final erx k = a("barter", $$0 -> $$0.a(erz.a));
   public static final erx l = a("vault", $$0 -> $$0.a(erz.f).b(erz.a));
   public static final erx m = a("advancement_reward", $$0 -> $$0.a(erz.a).a(erz.f));
   public static final erx n = a("advancement_entity", $$0 -> $$0.a(erz.a).a(erz.f));
   public static final erx o = a("advancement_location", $$0 -> $$0.a(erz.a).a(erz.f).a(erz.i).a(erz.g));
   public static final erx p = a("block_use", $$0 -> $$0.a(erz.a).a(erz.f).a(erz.g));
   public static final erx q = a("generic", $$0 -> $$0.a(erz.a).a(erz.b).a(erz.c).a(erz.d).a(erz.e).a(erz.f).a(erz.g).a(erz.h).a(erz.i).a(erz.j));
   public static final erx r = a("block", $$0 -> $$0.a(erz.g).a(erz.f).a(erz.i).b(erz.a).b(erz.h).b(erz.j));
   public static final erx s = a("shearing", $$0 -> $$0.a(erz.f).b(erz.a));

   private static erx a(String $$0, Consumer<erx.a> $$1) {
      erx.a $$2 = new erx.a();
      $$1.accept($$2);
      erx $$3 = $$2.a();
      akn $$4 = new akn($$0);
      erx $$5 = (erx)t.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
