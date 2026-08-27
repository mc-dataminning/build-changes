import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class ehm {
   private static final BiMap<agm, ehl> p = HashBiMap.create();
   public static final Codec<ehl> a = agm.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((ehl)p.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         p.inverse()::get
      );
   public static final ehl b = a("empty", $$0 -> {
   });
   public static final ehl c = a("chest", $$0 -> $$0.a(ehn.f).b(ehn.a));
   public static final ehl d = a("command", $$0 -> $$0.a(ehn.f).b(ehn.a));
   public static final ehl e = a("selector", $$0 -> $$0.a(ehn.f).a(ehn.a));
   public static final ehl f = a("fishing", $$0 -> $$0.a(ehn.f).a(ehn.i).b(ehn.a));
   public static final ehl g = a("entity", $$0 -> $$0.a(ehn.a).a(ehn.f).a(ehn.c).b(ehn.d).b(ehn.e).b(ehn.b));
   public static final ehl h = a("archaeology", $$0 -> $$0.a(ehn.f).b(ehn.a));
   public static final ehl i = a("gift", $$0 -> $$0.a(ehn.f).a(ehn.a));
   public static final ehl j = a("barter", $$0 -> $$0.a(ehn.a));
   public static final ehl k = a("advancement_reward", $$0 -> $$0.a(ehn.a).a(ehn.f));
   public static final ehl l = a("advancement_entity", $$0 -> $$0.a(ehn.a).a(ehn.f));
   public static final ehl m = a("advancement_location", $$0 -> $$0.a(ehn.a).a(ehn.f).a(ehn.i).a(ehn.g));
   public static final ehl n = a("generic", $$0 -> $$0.a(ehn.a).a(ehn.b).a(ehn.c).a(ehn.d).a(ehn.e).a(ehn.f).a(ehn.g).a(ehn.h).a(ehn.i).a(ehn.j));
   public static final ehl o = a("block", $$0 -> $$0.a(ehn.g).a(ehn.f).a(ehn.i).b(ehn.a).b(ehn.h).b(ehn.j));

   private static ehl a(String $$0, Consumer<ehl.a> $$1) {
      ehl.a $$2 = new ehl.a();
      $$1.accept($$2);
      ehl $$3 = $$2.a();
      agm $$4 = new agm($$0);
      ehl $$5 = (ehl)p.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
