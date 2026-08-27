import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class epn {
   private static final BiMap<ajt, epm> s = HashBiMap.create();
   public static final Codec<epm> a = ajt.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((epm)s.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         s.inverse()::get
      );
   public static final epm b = a("empty", $$0 -> {
   });
   public static final epm c = a("chest", $$0 -> $$0.a(epo.f).b(epo.a));
   public static final epm d = a("command", $$0 -> $$0.a(epo.f).b(epo.a));
   public static final epm e = a("selector", $$0 -> $$0.a(epo.f).a(epo.a));
   public static final epm f = a("fishing", $$0 -> $$0.a(epo.f).a(epo.i).b(epo.a));
   public static final epm g = a("entity", $$0 -> $$0.a(epo.a).a(epo.f).a(epo.c).b(epo.d).b(epo.e).b(epo.b));
   public static final epm h = a("archaeology", $$0 -> $$0.a(epo.f).b(epo.a));
   public static final epm i = a("gift", $$0 -> $$0.a(epo.f).a(epo.a));
   public static final epm j = a("barter", $$0 -> $$0.a(epo.a));
   public static final epm k = a("vault", $$0 -> $$0.a(epo.f).b(epo.a));
   public static final epm l = a("advancement_reward", $$0 -> $$0.a(epo.a).a(epo.f));
   public static final epm m = a("advancement_entity", $$0 -> $$0.a(epo.a).a(epo.f));
   public static final epm n = a("advancement_location", $$0 -> $$0.a(epo.a).a(epo.f).a(epo.i).a(epo.g));
   public static final epm o = a("block_use", $$0 -> $$0.a(epo.a).a(epo.f).a(epo.g));
   public static final epm p = a("generic", $$0 -> $$0.a(epo.a).a(epo.b).a(epo.c).a(epo.d).a(epo.e).a(epo.f).a(epo.g).a(epo.h).a(epo.i).a(epo.j));
   public static final epm q = a("block", $$0 -> $$0.a(epo.g).a(epo.f).a(epo.i).b(epo.a).b(epo.h).b(epo.j));
   public static final epm r = a("shearing", $$0 -> $$0.a(epo.f).b(epo.a));

   private static epm a(String $$0, Consumer<epm.a> $$1) {
      epm.a $$2 = new epm.a();
      $$1.accept($$2);
      epm $$3 = $$2.a();
      ajt $$4 = new ajt($$0);
      epm $$5 = (epm)s.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
