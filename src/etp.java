import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class etp {
   private static final BiMap<akk, eto> x = HashBiMap.create();
   public static final Codec<eto> a = akk.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((eto)x.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         x.inverse()::get
      );
   public static final eto b = a("empty", $$0 -> {
   });
   public static final eto c = a("chest", $$0 -> $$0.a(etq.f).b(etq.a));
   public static final eto d = a("command", $$0 -> $$0.a(etq.f).b(etq.a));
   public static final eto e = a("selector", $$0 -> $$0.a(etq.f).a(etq.a));
   public static final eto f = a("fishing", $$0 -> $$0.a(etq.f).a(etq.i).b(etq.a));
   public static final eto g = a("entity", $$0 -> $$0.a(etq.a).a(etq.f).a(etq.c).b(etq.d).b(etq.e).b(etq.b));
   public static final eto h = a("equipment", $$0 -> $$0.a(etq.f).a(etq.a));
   public static final eto i = a("archaeology", $$0 -> $$0.a(etq.f).b(etq.a));
   public static final eto j = a("gift", $$0 -> $$0.a(etq.f).a(etq.a));
   public static final eto k = a("barter", $$0 -> $$0.a(etq.a));
   public static final eto l = a("vault", $$0 -> $$0.a(etq.f).b(etq.a));
   public static final eto m = a("advancement_reward", $$0 -> $$0.a(etq.a).a(etq.f));
   public static final eto n = a("advancement_entity", $$0 -> $$0.a(etq.a).a(etq.f));
   public static final eto o = a("advancement_location", $$0 -> $$0.a(etq.a).a(etq.f).a(etq.i).a(etq.g));
   public static final eto p = a("block_use", $$0 -> $$0.a(etq.a).a(etq.f).a(etq.g));
   public static final eto q = a("generic", $$0 -> $$0.a(etq.a).a(etq.b).a(etq.c).a(etq.d).a(etq.e).a(etq.f).a(etq.g).a(etq.h).a(etq.i).a(etq.j));
   public static final eto r = a("block", $$0 -> $$0.a(etq.g).a(etq.f).a(etq.i).b(etq.a).b(etq.h).b(etq.j));
   public static final eto s = a("shearing", $$0 -> $$0.a(etq.f).b(etq.a));
   public static final eto t = a("enchanted_damage", $$0 -> $$0.a(etq.a).a(etq.k).a(etq.f).a(etq.c).b(etq.e).b(etq.d));
   public static final eto u = a("enchanted_item", $$0 -> $$0.a(etq.i).a(etq.k));
   public static final eto v = a("enchanted_location", $$0 -> $$0.a(etq.a).a(etq.k).a(etq.f).a(etq.l));
   public static final eto w = a("enchanted_entity", $$0 -> $$0.a(etq.a).a(etq.k).a(etq.f));

   private static eto a(String $$0, Consumer<eto.a> $$1) {
      eto.a $$2 = new eto.a();
      $$1.accept($$2);
      eto $$3 = $$2.a();
      akk $$4 = new akk($$0);
      eto $$5 = (eto)x.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
