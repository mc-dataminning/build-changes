import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class efs {
   private static final BiMap<afw, efr> p = HashBiMap.create();
   public static final Codec<efr> a = afw.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((efr)p.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         p.inverse()::get
      );
   public static final efr b = a("empty", $$0 -> {
   });
   public static final efr c = a("chest", $$0 -> $$0.a(eft.f).b(eft.a));
   public static final efr d = a("command", $$0 -> $$0.a(eft.f).b(eft.a));
   public static final efr e = a("selector", $$0 -> $$0.a(eft.f).a(eft.a));
   public static final efr f = a("fishing", $$0 -> $$0.a(eft.f).a(eft.i).b(eft.a));
   public static final efr g = a("entity", $$0 -> $$0.a(eft.a).a(eft.f).a(eft.c).b(eft.d).b(eft.e).b(eft.b));
   public static final efr h = a("archaeology", $$0 -> $$0.a(eft.f).b(eft.a));
   public static final efr i = a("gift", $$0 -> $$0.a(eft.f).a(eft.a));
   public static final efr j = a("barter", $$0 -> $$0.a(eft.a));
   public static final efr k = a("advancement_reward", $$0 -> $$0.a(eft.a).a(eft.f));
   public static final efr l = a("advancement_entity", $$0 -> $$0.a(eft.a).a(eft.f));
   public static final efr m = a("advancement_location", $$0 -> $$0.a(eft.a).a(eft.f).a(eft.i).a(eft.g));
   public static final efr n = a("generic", $$0 -> $$0.a(eft.a).a(eft.b).a(eft.c).a(eft.d).a(eft.e).a(eft.f).a(eft.g).a(eft.h).a(eft.i).a(eft.j));
   public static final efr o = a("block", $$0 -> $$0.a(eft.g).a(eft.f).a(eft.i).b(eft.a).b(eft.h).b(eft.j));

   private static efr a(String $$0, Consumer<efr.a> $$1) {
      efr.a $$2 = new efr.a();
      $$1.accept($$2);
      efr $$3 = $$2.a();
      afw $$4 = new afw($$0);
      efr $$5 = (efr)p.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
