import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class ezb {
   private static final BiMap<alp, bbe> y = HashBiMap.create();
   public static final Codec<bbe> a = alp.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((bbe)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final bbe b = a("empty", $$0 -> {
   });
   public static final bbe c = a("chest", $$0 -> $$0.a(ezc.f).b(ezc.a));
   public static final bbe d = a("command", $$0 -> $$0.a(ezc.f).b(ezc.a));
   public static final bbe e = a("selector", $$0 -> $$0.a(ezc.f).a(ezc.a));
   public static final bbe f = a("fishing", $$0 -> $$0.a(ezc.f).a(ezc.i).b(ezc.a));
   public static final bbe g = a("entity", $$0 -> $$0.a(ezc.a).a(ezc.f).a(ezc.c).b(ezc.d).b(ezc.e).b(ezc.b));
   public static final bbe h = a("equipment", $$0 -> $$0.a(ezc.f).a(ezc.a));
   public static final bbe i = a("archaeology", $$0 -> $$0.a(ezc.f).a(ezc.a).a(ezc.i));
   public static final bbe j = a("gift", $$0 -> $$0.a(ezc.f).a(ezc.a));
   public static final bbe k = a("barter", $$0 -> $$0.a(ezc.a));
   public static final bbe l = a("vault", $$0 -> $$0.a(ezc.f).b(ezc.a).b(ezc.i));
   public static final bbe m = a("advancement_reward", $$0 -> $$0.a(ezc.a).a(ezc.f));
   public static final bbe n = a("advancement_entity", $$0 -> $$0.a(ezc.a).a(ezc.f));
   public static final bbe o = a("advancement_location", $$0 -> $$0.a(ezc.a).a(ezc.f).a(ezc.i).a(ezc.g));
   public static final bbe p = a("block_use", $$0 -> $$0.a(ezc.a).a(ezc.f).a(ezc.g));
   public static final bbe q = a("generic", $$0 -> $$0.a(ezc.a).a(ezc.b).a(ezc.c).a(ezc.d).a(ezc.e).a(ezc.f).a(ezc.g).a(ezc.h).a(ezc.i).a(ezc.j));
   public static final bbe r = a("block", $$0 -> $$0.a(ezc.g).a(ezc.f).a(ezc.i).b(ezc.a).b(ezc.h).b(ezc.j));
   public static final bbe s = a("shearing", $$0 -> $$0.a(ezc.f).a(ezc.a).a(ezc.i));
   public static final bbe t = a("enchanted_damage", $$0 -> $$0.a(ezc.a).a(ezc.k).a(ezc.f).a(ezc.c).b(ezc.e).b(ezc.d));
   public static final bbe u = a("enchanted_item", $$0 -> $$0.a(ezc.i).a(ezc.k));
   public static final bbe v = a("enchanted_location", $$0 -> $$0.a(ezc.a).a(ezc.k).a(ezc.f).a(ezc.l));
   public static final bbe w = a("enchanted_entity", $$0 -> $$0.a(ezc.a).a(ezc.k).a(ezc.f));
   public static final bbe x = a("hit_block", $$0 -> $$0.a(ezc.a).a(ezc.k).a(ezc.f).a(ezc.g));

   private static bbe a(String $$0, Consumer<bbe.a> $$1) {
      bbe.a $$2 = new bbe.a();
      $$1.accept($$2);
      bbe $$3 = $$2.a();
      alp $$4 = alp.b($$0);
      bbe $$5 = (bbe)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
