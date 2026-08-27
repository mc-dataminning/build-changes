import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class ejf {
   private static final BiMap<ahg, eje> p = HashBiMap.create();
   public static final Codec<eje> a = ahg.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((eje)p.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         p.inverse()::get
      );
   public static final eje b = a("empty", $$0 -> {
   });
   public static final eje c = a("chest", $$0 -> $$0.a(ejg.f).b(ejg.a));
   public static final eje d = a("command", $$0 -> $$0.a(ejg.f).b(ejg.a));
   public static final eje e = a("selector", $$0 -> $$0.a(ejg.f).a(ejg.a));
   public static final eje f = a("fishing", $$0 -> $$0.a(ejg.f).a(ejg.i).b(ejg.a));
   public static final eje g = a("entity", $$0 -> $$0.a(ejg.a).a(ejg.f).a(ejg.c).b(ejg.d).b(ejg.e).b(ejg.b));
   public static final eje h = a("archaeology", $$0 -> $$0.a(ejg.f).b(ejg.a));
   public static final eje i = a("gift", $$0 -> $$0.a(ejg.f).a(ejg.a));
   public static final eje j = a("barter", $$0 -> $$0.a(ejg.a));
   public static final eje k = a("advancement_reward", $$0 -> $$0.a(ejg.a).a(ejg.f));
   public static final eje l = a("advancement_entity", $$0 -> $$0.a(ejg.a).a(ejg.f));
   public static final eje m = a("advancement_location", $$0 -> $$0.a(ejg.a).a(ejg.f).a(ejg.i).a(ejg.g));
   public static final eje n = a("generic", $$0 -> $$0.a(ejg.a).a(ejg.b).a(ejg.c).a(ejg.d).a(ejg.e).a(ejg.f).a(ejg.g).a(ejg.h).a(ejg.i).a(ejg.j));
   public static final eje o = a("block", $$0 -> $$0.a(ejg.g).a(ejg.f).a(ejg.i).b(ejg.a).b(ejg.h).b(ejg.j));

   private static eje a(String $$0, Consumer<eje.a> $$1) {
      eje.a $$2 = new eje.a();
      $$1.accept($$2);
      eje $$3 = $$2.a();
      ahg $$4 = new ahg($$0);
      eje $$5 = (eje)p.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
