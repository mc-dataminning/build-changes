import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class erb {
   private static final BiMap<akh, era> s = HashBiMap.create();
   public static final Codec<era> a = akh.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((era)s.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         s.inverse()::get
      );
   public static final era b = a("empty", $$0 -> {
   });
   public static final era c = a("chest", $$0 -> $$0.a(erc.f).b(erc.a));
   public static final era d = a("command", $$0 -> $$0.a(erc.f).b(erc.a));
   public static final era e = a("selector", $$0 -> $$0.a(erc.f).a(erc.a));
   public static final era f = a("fishing", $$0 -> $$0.a(erc.f).a(erc.i).b(erc.a));
   public static final era g = a("entity", $$0 -> $$0.a(erc.a).a(erc.f).a(erc.c).b(erc.d).b(erc.e).b(erc.b));
   public static final era h = a("archaeology", $$0 -> $$0.a(erc.f).b(erc.a));
   public static final era i = a("gift", $$0 -> $$0.a(erc.f).a(erc.a));
   public static final era j = a("barter", $$0 -> $$0.a(erc.a));
   public static final era k = a("vault", $$0 -> $$0.a(erc.f).b(erc.a));
   public static final era l = a("advancement_reward", $$0 -> $$0.a(erc.a).a(erc.f));
   public static final era m = a("advancement_entity", $$0 -> $$0.a(erc.a).a(erc.f));
   public static final era n = a("advancement_location", $$0 -> $$0.a(erc.a).a(erc.f).a(erc.i).a(erc.g));
   public static final era o = a("block_use", $$0 -> $$0.a(erc.a).a(erc.f).a(erc.g));
   public static final era p = a("generic", $$0 -> $$0.a(erc.a).a(erc.b).a(erc.c).a(erc.d).a(erc.e).a(erc.f).a(erc.g).a(erc.h).a(erc.i).a(erc.j));
   public static final era q = a("block", $$0 -> $$0.a(erc.g).a(erc.f).a(erc.i).b(erc.a).b(erc.h).b(erc.j));
   public static final era r = a("shearing", $$0 -> $$0.a(erc.f).b(erc.a));

   private static era a(String $$0, Consumer<era.a> $$1) {
      era.a $$2 = new era.a();
      $$1.accept($$2);
      era $$3 = $$2.a();
      akh $$4 = new akh($$0);
      era $$5 = (era)s.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
