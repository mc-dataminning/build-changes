import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class ejp {
   private static final BiMap<ahh, ejo> p = HashBiMap.create();
   public static final Codec<ejo> a = ahh.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((ejo)p.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         p.inverse()::get
      );
   public static final ejo b = a("empty", $$0 -> {
   });
   public static final ejo c = a("chest", $$0 -> $$0.a(ejq.f).b(ejq.a));
   public static final ejo d = a("command", $$0 -> $$0.a(ejq.f).b(ejq.a));
   public static final ejo e = a("selector", $$0 -> $$0.a(ejq.f).a(ejq.a));
   public static final ejo f = a("fishing", $$0 -> $$0.a(ejq.f).a(ejq.i).b(ejq.a));
   public static final ejo g = a("entity", $$0 -> $$0.a(ejq.a).a(ejq.f).a(ejq.c).b(ejq.d).b(ejq.e).b(ejq.b));
   public static final ejo h = a("archaeology", $$0 -> $$0.a(ejq.f).b(ejq.a));
   public static final ejo i = a("gift", $$0 -> $$0.a(ejq.f).a(ejq.a));
   public static final ejo j = a("barter", $$0 -> $$0.a(ejq.a));
   public static final ejo k = a("advancement_reward", $$0 -> $$0.a(ejq.a).a(ejq.f));
   public static final ejo l = a("advancement_entity", $$0 -> $$0.a(ejq.a).a(ejq.f));
   public static final ejo m = a("advancement_location", $$0 -> $$0.a(ejq.a).a(ejq.f).a(ejq.i).a(ejq.g));
   public static final ejo n = a("generic", $$0 -> $$0.a(ejq.a).a(ejq.b).a(ejq.c).a(ejq.d).a(ejq.e).a(ejq.f).a(ejq.g).a(ejq.h).a(ejq.i).a(ejq.j));
   public static final ejo o = a("block", $$0 -> $$0.a(ejq.g).a(ejq.f).a(ejq.i).b(ejq.a).b(ejq.h).b(ejq.j));

   private static ejo a(String $$0, Consumer<ejo.a> $$1) {
      ejo.a $$2 = new ejo.a();
      $$1.accept($$2);
      ejo $$3 = $$2.a();
      ahh $$4 = new ahh($$0);
      ejo $$5 = (ejo)p.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
