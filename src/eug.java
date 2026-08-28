import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class eug {
   private static final BiMap<akq, euf> y = HashBiMap.create();
   public static final Codec<euf> a = akq.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((euf)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final euf b = a("empty", $$0 -> {
   });
   public static final euf c = a("chest", $$0 -> $$0.a(euh.f).b(euh.a));
   public static final euf d = a("command", $$0 -> $$0.a(euh.f).b(euh.a));
   public static final euf e = a("selector", $$0 -> $$0.a(euh.f).a(euh.a));
   public static final euf f = a("fishing", $$0 -> $$0.a(euh.f).a(euh.i).b(euh.a));
   public static final euf g = a("entity", $$0 -> $$0.a(euh.a).a(euh.f).a(euh.c).b(euh.d).b(euh.e).b(euh.b));
   public static final euf h = a("equipment", $$0 -> $$0.a(euh.f).a(euh.a));
   public static final euf i = a("archaeology", $$0 -> $$0.a(euh.f).b(euh.a));
   public static final euf j = a("gift", $$0 -> $$0.a(euh.f).a(euh.a));
   public static final euf k = a("barter", $$0 -> $$0.a(euh.a));
   public static final euf l = a("vault", $$0 -> $$0.a(euh.f).b(euh.a));
   public static final euf m = a("advancement_reward", $$0 -> $$0.a(euh.a).a(euh.f));
   public static final euf n = a("advancement_entity", $$0 -> $$0.a(euh.a).a(euh.f));
   public static final euf o = a("advancement_location", $$0 -> $$0.a(euh.a).a(euh.f).a(euh.i).a(euh.g));
   public static final euf p = a("block_use", $$0 -> $$0.a(euh.a).a(euh.f).a(euh.g));
   public static final euf q = a("generic", $$0 -> $$0.a(euh.a).a(euh.b).a(euh.c).a(euh.d).a(euh.e).a(euh.f).a(euh.g).a(euh.h).a(euh.i).a(euh.j));
   public static final euf r = a("block", $$0 -> $$0.a(euh.g).a(euh.f).a(euh.i).b(euh.a).b(euh.h).b(euh.j));
   public static final euf s = a("shearing", $$0 -> $$0.a(euh.f).b(euh.a));
   public static final euf t = a("enchanted_damage", $$0 -> $$0.a(euh.a).a(euh.k).a(euh.f).a(euh.c).b(euh.e).b(euh.d));
   public static final euf u = a("enchanted_item", $$0 -> $$0.a(euh.i).a(euh.k));
   public static final euf v = a("enchanted_location", $$0 -> $$0.a(euh.a).a(euh.k).a(euh.f).a(euh.l));
   public static final euf w = a("enchanted_entity", $$0 -> $$0.a(euh.a).a(euh.k).a(euh.f));
   public static final euf x = a("hit_block", $$0 -> $$0.a(euh.a).a(euh.k).a(euh.f).a(euh.g));

   private static euf a(String $$0, Consumer<euf.a> $$1) {
      euf.a $$2 = new euf.a();
      $$1.accept($$2);
      euf $$3 = $$2.a();
      akq $$4 = akq.b($$0);
      euf $$5 = (euf)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
