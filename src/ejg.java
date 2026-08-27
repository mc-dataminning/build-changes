import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class ejg {
   private static final BiMap<ahg, ejf> p = HashBiMap.create();
   public static final Codec<ejf> a = ahg.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((ejf)p.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         p.inverse()::get
      );
   public static final ejf b = a("empty", $$0 -> {
   });
   public static final ejf c = a("chest", $$0 -> $$0.a(ejh.f).b(ejh.a));
   public static final ejf d = a("command", $$0 -> $$0.a(ejh.f).b(ejh.a));
   public static final ejf e = a("selector", $$0 -> $$0.a(ejh.f).a(ejh.a));
   public static final ejf f = a("fishing", $$0 -> $$0.a(ejh.f).a(ejh.i).b(ejh.a));
   public static final ejf g = a("entity", $$0 -> $$0.a(ejh.a).a(ejh.f).a(ejh.c).b(ejh.d).b(ejh.e).b(ejh.b));
   public static final ejf h = a("archaeology", $$0 -> $$0.a(ejh.f).b(ejh.a));
   public static final ejf i = a("gift", $$0 -> $$0.a(ejh.f).a(ejh.a));
   public static final ejf j = a("barter", $$0 -> $$0.a(ejh.a));
   public static final ejf k = a("advancement_reward", $$0 -> $$0.a(ejh.a).a(ejh.f));
   public static final ejf l = a("advancement_entity", $$0 -> $$0.a(ejh.a).a(ejh.f));
   public static final ejf m = a("advancement_location", $$0 -> $$0.a(ejh.a).a(ejh.f).a(ejh.i).a(ejh.g));
   public static final ejf n = a("generic", $$0 -> $$0.a(ejh.a).a(ejh.b).a(ejh.c).a(ejh.d).a(ejh.e).a(ejh.f).a(ejh.g).a(ejh.h).a(ejh.i).a(ejh.j));
   public static final ejf o = a("block", $$0 -> $$0.a(ejh.g).a(ejh.f).a(ejh.i).b(ejh.a).b(ejh.h).b(ejh.j));

   private static ejf a(String $$0, Consumer<ejf.a> $$1) {
      ejf.a $$2 = new ejf.a();
      $$1.accept($$2);
      ejf $$3 = $$2.a();
      ahg $$4 = new ahg($$0);
      ejf $$5 = (ejf)p.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
