import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class eqs {
   private static final BiMap<akf, eqr> s = HashBiMap.create();
   public static final Codec<eqr> a = akf.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((eqr)s.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         s.inverse()::get
      );
   public static final eqr b = a("empty", $$0 -> {
   });
   public static final eqr c = a("chest", $$0 -> $$0.a(eqt.f).b(eqt.a));
   public static final eqr d = a("command", $$0 -> $$0.a(eqt.f).b(eqt.a));
   public static final eqr e = a("selector", $$0 -> $$0.a(eqt.f).a(eqt.a));
   public static final eqr f = a("fishing", $$0 -> $$0.a(eqt.f).a(eqt.i).b(eqt.a));
   public static final eqr g = a("entity", $$0 -> $$0.a(eqt.a).a(eqt.f).a(eqt.c).b(eqt.d).b(eqt.e).b(eqt.b));
   public static final eqr h = a("archaeology", $$0 -> $$0.a(eqt.f).b(eqt.a));
   public static final eqr i = a("gift", $$0 -> $$0.a(eqt.f).a(eqt.a));
   public static final eqr j = a("barter", $$0 -> $$0.a(eqt.a));
   public static final eqr k = a("vault", $$0 -> $$0.a(eqt.f).b(eqt.a));
   public static final eqr l = a("advancement_reward", $$0 -> $$0.a(eqt.a).a(eqt.f));
   public static final eqr m = a("advancement_entity", $$0 -> $$0.a(eqt.a).a(eqt.f));
   public static final eqr n = a("advancement_location", $$0 -> $$0.a(eqt.a).a(eqt.f).a(eqt.i).a(eqt.g));
   public static final eqr o = a("block_use", $$0 -> $$0.a(eqt.a).a(eqt.f).a(eqt.g));
   public static final eqr p = a("generic", $$0 -> $$0.a(eqt.a).a(eqt.b).a(eqt.c).a(eqt.d).a(eqt.e).a(eqt.f).a(eqt.g).a(eqt.h).a(eqt.i).a(eqt.j));
   public static final eqr q = a("block", $$0 -> $$0.a(eqt.g).a(eqt.f).a(eqt.i).b(eqt.a).b(eqt.h).b(eqt.j));
   public static final eqr r = a("shearing", $$0 -> $$0.a(eqt.f).b(eqt.a));

   private static eqr a(String $$0, Consumer<eqr.a> $$1) {
      eqr.a $$2 = new eqr.a();
      $$1.accept($$2);
      eqr $$3 = $$2.a();
      akf $$4 = new akf($$0);
      eqr $$5 = (eqr)s.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
