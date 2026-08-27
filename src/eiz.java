import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class eiz {
   private static final BiMap<ahd, eiy> p = HashBiMap.create();
   public static final Codec<eiy> a = ahd.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((eiy)p.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         p.inverse()::get
      );
   public static final eiy b = a("empty", $$0 -> {
   });
   public static final eiy c = a("chest", $$0 -> $$0.a(eja.f).b(eja.a));
   public static final eiy d = a("command", $$0 -> $$0.a(eja.f).b(eja.a));
   public static final eiy e = a("selector", $$0 -> $$0.a(eja.f).a(eja.a));
   public static final eiy f = a("fishing", $$0 -> $$0.a(eja.f).a(eja.i).b(eja.a));
   public static final eiy g = a("entity", $$0 -> $$0.a(eja.a).a(eja.f).a(eja.c).b(eja.d).b(eja.e).b(eja.b));
   public static final eiy h = a("archaeology", $$0 -> $$0.a(eja.f).b(eja.a));
   public static final eiy i = a("gift", $$0 -> $$0.a(eja.f).a(eja.a));
   public static final eiy j = a("barter", $$0 -> $$0.a(eja.a));
   public static final eiy k = a("advancement_reward", $$0 -> $$0.a(eja.a).a(eja.f));
   public static final eiy l = a("advancement_entity", $$0 -> $$0.a(eja.a).a(eja.f));
   public static final eiy m = a("advancement_location", $$0 -> $$0.a(eja.a).a(eja.f).a(eja.i).a(eja.g));
   public static final eiy n = a("generic", $$0 -> $$0.a(eja.a).a(eja.b).a(eja.c).a(eja.d).a(eja.e).a(eja.f).a(eja.g).a(eja.h).a(eja.i).a(eja.j));
   public static final eiy o = a("block", $$0 -> $$0.a(eja.g).a(eja.f).a(eja.i).b(eja.a).b(eja.h).b(eja.j));

   private static eiy a(String $$0, Consumer<eiy.a> $$1) {
      eiy.a $$2 = new eiy.a();
      $$1.accept($$2);
      eiy $$3 = $$2.a();
      ahd $$4 = new ahd($$0);
      eiy $$5 = (eiy)p.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
