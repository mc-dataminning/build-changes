import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class epw {
   private static final BiMap<ajv, epv> s = HashBiMap.create();
   public static final Codec<epv> a = ajv.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((epv)s.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         s.inverse()::get
      );
   public static final epv b = a("empty", $$0 -> {
   });
   public static final epv c = a("chest", $$0 -> $$0.a(epx.f).b(epx.a));
   public static final epv d = a("command", $$0 -> $$0.a(epx.f).b(epx.a));
   public static final epv e = a("selector", $$0 -> $$0.a(epx.f).a(epx.a));
   public static final epv f = a("fishing", $$0 -> $$0.a(epx.f).a(epx.i).b(epx.a));
   public static final epv g = a("entity", $$0 -> $$0.a(epx.a).a(epx.f).a(epx.c).b(epx.d).b(epx.e).b(epx.b));
   public static final epv h = a("archaeology", $$0 -> $$0.a(epx.f).b(epx.a));
   public static final epv i = a("gift", $$0 -> $$0.a(epx.f).a(epx.a));
   public static final epv j = a("barter", $$0 -> $$0.a(epx.a));
   public static final epv k = a("vault", $$0 -> $$0.a(epx.f).b(epx.a));
   public static final epv l = a("advancement_reward", $$0 -> $$0.a(epx.a).a(epx.f));
   public static final epv m = a("advancement_entity", $$0 -> $$0.a(epx.a).a(epx.f));
   public static final epv n = a("advancement_location", $$0 -> $$0.a(epx.a).a(epx.f).a(epx.i).a(epx.g));
   public static final epv o = a("block_use", $$0 -> $$0.a(epx.a).a(epx.f).a(epx.g));
   public static final epv p = a("generic", $$0 -> $$0.a(epx.a).a(epx.b).a(epx.c).a(epx.d).a(epx.e).a(epx.f).a(epx.g).a(epx.h).a(epx.i).a(epx.j));
   public static final epv q = a("block", $$0 -> $$0.a(epx.g).a(epx.f).a(epx.i).b(epx.a).b(epx.h).b(epx.j));
   public static final epv r = a("shearing", $$0 -> $$0.a(epx.f).b(epx.a));

   private static epv a(String $$0, Consumer<epv.a> $$1) {
      epv.a $$2 = new epv.a();
      $$1.accept($$2);
      epv $$3 = $$2.a();
      ajv $$4 = new ajv($$0);
      epv $$5 = (epv)s.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
