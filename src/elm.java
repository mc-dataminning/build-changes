import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class elm {
   private static final BiMap<aiy, ell> q = HashBiMap.create();
   public static final Codec<ell> a = aiy.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((ell)q.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         q.inverse()::get
      );
   public static final ell b = a("empty", $$0 -> {
   });
   public static final ell c = a("chest", $$0 -> $$0.a(eln.f).b(eln.a));
   public static final ell d = a("command", $$0 -> $$0.a(eln.f).b(eln.a));
   public static final ell e = a("selector", $$0 -> $$0.a(eln.f).a(eln.a));
   public static final ell f = a("fishing", $$0 -> $$0.a(eln.f).a(eln.i).b(eln.a));
   public static final ell g = a("entity", $$0 -> $$0.a(eln.a).a(eln.f).a(eln.c).b(eln.d).b(eln.e).b(eln.b));
   public static final ell h = a("archaeology", $$0 -> $$0.a(eln.f).b(eln.a));
   public static final ell i = a("gift", $$0 -> $$0.a(eln.f).a(eln.a));
   public static final ell j = a("barter", $$0 -> $$0.a(eln.a));
   public static final ell k = a("advancement_reward", $$0 -> $$0.a(eln.a).a(eln.f));
   public static final ell l = a("advancement_entity", $$0 -> $$0.a(eln.a).a(eln.f));
   public static final ell m = a("advancement_location", $$0 -> $$0.a(eln.a).a(eln.f).a(eln.i).a(eln.g));
   public static final ell n = a("block_use", $$0 -> $$0.a(eln.a).a(eln.f).a(eln.g));
   public static final ell o = a("generic", $$0 -> $$0.a(eln.a).a(eln.b).a(eln.c).a(eln.d).a(eln.e).a(eln.f).a(eln.g).a(eln.h).a(eln.i).a(eln.j));
   public static final ell p = a("block", $$0 -> $$0.a(eln.g).a(eln.f).a(eln.i).b(eln.a).b(eln.h).b(eln.j));

   private static ell a(String $$0, Consumer<ell.a> $$1) {
      ell.a $$2 = new ell.a();
      $$1.accept($$2);
      ell $$3 = $$2.a();
      aiy $$4 = new aiy($$0);
      ell $$5 = (ell)q.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
