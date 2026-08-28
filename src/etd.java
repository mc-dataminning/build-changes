import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class etd {
   private static final BiMap<alf, etc> t = HashBiMap.create();
   public static final Codec<etc> a = alf.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((etc)t.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         t.inverse()::get
      );
   public static final etc b = a("empty", $$0 -> {
   });
   public static final etc c = a("chest", $$0 -> $$0.a(ete.f).b(ete.a));
   public static final etc d = a("command", $$0 -> $$0.a(ete.f).b(ete.a));
   public static final etc e = a("selector", $$0 -> $$0.a(ete.f).a(ete.a));
   public static final etc f = a("fishing", $$0 -> $$0.a(ete.f).a(ete.i).b(ete.a));
   public static final etc g = a("entity", $$0 -> $$0.a(ete.a).a(ete.f).a(ete.c).b(ete.d).b(ete.e).b(ete.b));
   public static final etc h = a("equipment", $$0 -> $$0.a(ete.f).a(ete.a));
   public static final etc i = a("archaeology", $$0 -> $$0.a(ete.f).b(ete.a));
   public static final etc j = a("gift", $$0 -> $$0.a(ete.f).a(ete.a));
   public static final etc k = a("barter", $$0 -> $$0.a(ete.a));
   public static final etc l = a("vault", $$0 -> $$0.a(ete.f).b(ete.a));
   public static final etc m = a("advancement_reward", $$0 -> $$0.a(ete.a).a(ete.f));
   public static final etc n = a("advancement_entity", $$0 -> $$0.a(ete.a).a(ete.f));
   public static final etc o = a("advancement_location", $$0 -> $$0.a(ete.a).a(ete.f).a(ete.i).a(ete.g));
   public static final etc p = a("block_use", $$0 -> $$0.a(ete.a).a(ete.f).a(ete.g));
   public static final etc q = a("generic", $$0 -> $$0.a(ete.a).a(ete.b).a(ete.c).a(ete.d).a(ete.e).a(ete.f).a(ete.g).a(ete.h).a(ete.i).a(ete.j));
   public static final etc r = a("block", $$0 -> $$0.a(ete.g).a(ete.f).a(ete.i).b(ete.a).b(ete.h).b(ete.j));
   public static final etc s = a("shearing", $$0 -> $$0.a(ete.f).b(ete.a));

   private static etc a(String $$0, Consumer<etc.a> $$1) {
      etc.a $$2 = new etc.a();
      $$1.accept($$2);
      etc $$3 = $$2.a();
      alf $$4 = new alf($$0);
      etc $$5 = (etc)t.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
