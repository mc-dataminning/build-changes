import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class eio {
   private static final BiMap<agt, ein> p = HashBiMap.create();
   public static final Codec<ein> a = agt.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((ein)p.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         p.inverse()::get
      );
   public static final ein b = a("empty", $$0 -> {
   });
   public static final ein c = a("chest", $$0 -> $$0.a(eip.f).b(eip.a));
   public static final ein d = a("command", $$0 -> $$0.a(eip.f).b(eip.a));
   public static final ein e = a("selector", $$0 -> $$0.a(eip.f).a(eip.a));
   public static final ein f = a("fishing", $$0 -> $$0.a(eip.f).a(eip.i).b(eip.a));
   public static final ein g = a("entity", $$0 -> $$0.a(eip.a).a(eip.f).a(eip.c).b(eip.d).b(eip.e).b(eip.b));
   public static final ein h = a("archaeology", $$0 -> $$0.a(eip.f).b(eip.a));
   public static final ein i = a("gift", $$0 -> $$0.a(eip.f).a(eip.a));
   public static final ein j = a("barter", $$0 -> $$0.a(eip.a));
   public static final ein k = a("advancement_reward", $$0 -> $$0.a(eip.a).a(eip.f));
   public static final ein l = a("advancement_entity", $$0 -> $$0.a(eip.a).a(eip.f));
   public static final ein m = a("advancement_location", $$0 -> $$0.a(eip.a).a(eip.f).a(eip.i).a(eip.g));
   public static final ein n = a("generic", $$0 -> $$0.a(eip.a).a(eip.b).a(eip.c).a(eip.d).a(eip.e).a(eip.f).a(eip.g).a(eip.h).a(eip.i).a(eip.j));
   public static final ein o = a("block", $$0 -> $$0.a(eip.g).a(eip.f).a(eip.i).b(eip.a).b(eip.h).b(eip.j));

   private static ein a(String $$0, Consumer<ein.a> $$1) {
      ein.a $$2 = new ein.a();
      $$1.accept($$2);
      ein $$3 = $$2.a();
      agt $$4 = new agt($$0);
      ein $$5 = (ein)p.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
