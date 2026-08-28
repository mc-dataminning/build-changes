import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class etf {
   private static final BiMap<alf, ete> t = HashBiMap.create();
   public static final Codec<ete> a = alf.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((ete)t.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         t.inverse()::get
      );
   public static final ete b = a("empty", $$0 -> {
   });
   public static final ete c = a("chest", $$0 -> $$0.a(etg.f).b(etg.a));
   public static final ete d = a("command", $$0 -> $$0.a(etg.f).b(etg.a));
   public static final ete e = a("selector", $$0 -> $$0.a(etg.f).a(etg.a));
   public static final ete f = a("fishing", $$0 -> $$0.a(etg.f).a(etg.i).b(etg.a));
   public static final ete g = a("entity", $$0 -> $$0.a(etg.a).a(etg.f).a(etg.c).b(etg.d).b(etg.e).b(etg.b));
   public static final ete h = a("equipment", $$0 -> $$0.a(etg.f).a(etg.a));
   public static final ete i = a("archaeology", $$0 -> $$0.a(etg.f).b(etg.a));
   public static final ete j = a("gift", $$0 -> $$0.a(etg.f).a(etg.a));
   public static final ete k = a("barter", $$0 -> $$0.a(etg.a));
   public static final ete l = a("vault", $$0 -> $$0.a(etg.f).b(etg.a));
   public static final ete m = a("advancement_reward", $$0 -> $$0.a(etg.a).a(etg.f));
   public static final ete n = a("advancement_entity", $$0 -> $$0.a(etg.a).a(etg.f));
   public static final ete o = a("advancement_location", $$0 -> $$0.a(etg.a).a(etg.f).a(etg.i).a(etg.g));
   public static final ete p = a("block_use", $$0 -> $$0.a(etg.a).a(etg.f).a(etg.g));
   public static final ete q = a("generic", $$0 -> $$0.a(etg.a).a(etg.b).a(etg.c).a(etg.d).a(etg.e).a(etg.f).a(etg.g).a(etg.h).a(etg.i).a(etg.j));
   public static final ete r = a("block", $$0 -> $$0.a(etg.g).a(etg.f).a(etg.i).b(etg.a).b(etg.h).b(etg.j));
   public static final ete s = a("shearing", $$0 -> $$0.a(etg.f).b(etg.a));

   private static ete a(String $$0, Consumer<ete.a> $$1) {
      ete.a $$2 = new ete.a();
      $$1.accept($$2);
      ete $$3 = $$2.a();
      alf $$4 = new alf($$0);
      ete $$5 = (ete)t.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
