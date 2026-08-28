import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class euk {
   private static final BiMap<akr, euj> y = HashBiMap.create();
   public static final Codec<euj> a = akr.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((euj)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final euj b = a("empty", $$0 -> {
   });
   public static final euj c = a("chest", $$0 -> $$0.a(eul.f).b(eul.a));
   public static final euj d = a("command", $$0 -> $$0.a(eul.f).b(eul.a));
   public static final euj e = a("selector", $$0 -> $$0.a(eul.f).a(eul.a));
   public static final euj f = a("fishing", $$0 -> $$0.a(eul.f).a(eul.i).b(eul.a));
   public static final euj g = a("entity", $$0 -> $$0.a(eul.a).a(eul.f).a(eul.c).b(eul.d).b(eul.e).b(eul.b));
   public static final euj h = a("equipment", $$0 -> $$0.a(eul.f).a(eul.a));
   public static final euj i = a("archaeology", $$0 -> $$0.a(eul.f).b(eul.a));
   public static final euj j = a("gift", $$0 -> $$0.a(eul.f).a(eul.a));
   public static final euj k = a("barter", $$0 -> $$0.a(eul.a));
   public static final euj l = a("vault", $$0 -> $$0.a(eul.f).b(eul.a));
   public static final euj m = a("advancement_reward", $$0 -> $$0.a(eul.a).a(eul.f));
   public static final euj n = a("advancement_entity", $$0 -> $$0.a(eul.a).a(eul.f));
   public static final euj o = a("advancement_location", $$0 -> $$0.a(eul.a).a(eul.f).a(eul.i).a(eul.g));
   public static final euj p = a("block_use", $$0 -> $$0.a(eul.a).a(eul.f).a(eul.g));
   public static final euj q = a("generic", $$0 -> $$0.a(eul.a).a(eul.b).a(eul.c).a(eul.d).a(eul.e).a(eul.f).a(eul.g).a(eul.h).a(eul.i).a(eul.j));
   public static final euj r = a("block", $$0 -> $$0.a(eul.g).a(eul.f).a(eul.i).b(eul.a).b(eul.h).b(eul.j));
   public static final euj s = a("shearing", $$0 -> $$0.a(eul.f).b(eul.a));
   public static final euj t = a("enchanted_damage", $$0 -> $$0.a(eul.a).a(eul.k).a(eul.f).a(eul.c).b(eul.e).b(eul.d));
   public static final euj u = a("enchanted_item", $$0 -> $$0.a(eul.i).a(eul.k));
   public static final euj v = a("enchanted_location", $$0 -> $$0.a(eul.a).a(eul.k).a(eul.f).a(eul.l));
   public static final euj w = a("enchanted_entity", $$0 -> $$0.a(eul.a).a(eul.k).a(eul.f));
   public static final euj x = a("hit_block", $$0 -> $$0.a(eul.a).a(eul.k).a(eul.f).a(eul.g));

   private static euj a(String $$0, Consumer<euj.a> $$1) {
      euj.a $$2 = new euj.a();
      $$1.accept($$2);
      euj $$3 = $$2.a();
      akr $$4 = akr.b($$0);
      euj $$5 = (euj)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
