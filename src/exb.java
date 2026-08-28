import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class exb {
   private static final BiMap<all, exa> y = HashBiMap.create();
   public static final Codec<exa> a = all.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((exa)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final exa b = a("empty", $$0 -> {
   });
   public static final exa c = a("chest", $$0 -> $$0.a(exc.f).b(exc.a));
   public static final exa d = a("command", $$0 -> $$0.a(exc.f).b(exc.a));
   public static final exa e = a("selector", $$0 -> $$0.a(exc.f).a(exc.a));
   public static final exa f = a("fishing", $$0 -> $$0.a(exc.f).a(exc.i).b(exc.a));
   public static final exa g = a("entity", $$0 -> $$0.a(exc.a).a(exc.f).a(exc.c).b(exc.d).b(exc.e).b(exc.b));
   public static final exa h = a("equipment", $$0 -> $$0.a(exc.f).a(exc.a));
   public static final exa i = a("archaeology", $$0 -> $$0.a(exc.f).a(exc.a).a(exc.i));
   public static final exa j = a("gift", $$0 -> $$0.a(exc.f).a(exc.a));
   public static final exa k = a("barter", $$0 -> $$0.a(exc.a));
   public static final exa l = a("vault", $$0 -> $$0.a(exc.f).b(exc.a).b(exc.i));
   public static final exa m = a("advancement_reward", $$0 -> $$0.a(exc.a).a(exc.f));
   public static final exa n = a("advancement_entity", $$0 -> $$0.a(exc.a).a(exc.f));
   public static final exa o = a("advancement_location", $$0 -> $$0.a(exc.a).a(exc.f).a(exc.i).a(exc.g));
   public static final exa p = a("block_use", $$0 -> $$0.a(exc.a).a(exc.f).a(exc.g));
   public static final exa q = a("generic", $$0 -> $$0.a(exc.a).a(exc.b).a(exc.c).a(exc.d).a(exc.e).a(exc.f).a(exc.g).a(exc.h).a(exc.i).a(exc.j));
   public static final exa r = a("block", $$0 -> $$0.a(exc.g).a(exc.f).a(exc.i).b(exc.a).b(exc.h).b(exc.j));
   public static final exa s = a("shearing", $$0 -> $$0.a(exc.f).a(exc.a).a(exc.i));
   public static final exa t = a("enchanted_damage", $$0 -> $$0.a(exc.a).a(exc.k).a(exc.f).a(exc.c).b(exc.e).b(exc.d));
   public static final exa u = a("enchanted_item", $$0 -> $$0.a(exc.i).a(exc.k));
   public static final exa v = a("enchanted_location", $$0 -> $$0.a(exc.a).a(exc.k).a(exc.f).a(exc.l));
   public static final exa w = a("enchanted_entity", $$0 -> $$0.a(exc.a).a(exc.k).a(exc.f));
   public static final exa x = a("hit_block", $$0 -> $$0.a(exc.a).a(exc.k).a(exc.f).a(exc.g));

   private static exa a(String $$0, Consumer<exa.a> $$1) {
      exa.a $$2 = new exa.a();
      $$1.accept($$2);
      exa $$3 = $$2.a();
      all $$4 = all.b($$0);
      exa $$5 = (exa)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
