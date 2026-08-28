import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class ewr {
   private static final BiMap<alh, ewq> y = HashBiMap.create();
   public static final Codec<ewq> a = alh.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((ewq)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final ewq b = a("empty", $$0 -> {
   });
   public static final ewq c = a("chest", $$0 -> $$0.a(ews.f).b(ews.a));
   public static final ewq d = a("command", $$0 -> $$0.a(ews.f).b(ews.a));
   public static final ewq e = a("selector", $$0 -> $$0.a(ews.f).a(ews.a));
   public static final ewq f = a("fishing", $$0 -> $$0.a(ews.f).a(ews.i).b(ews.a));
   public static final ewq g = a("entity", $$0 -> $$0.a(ews.a).a(ews.f).a(ews.c).b(ews.d).b(ews.e).b(ews.b));
   public static final ewq h = a("equipment", $$0 -> $$0.a(ews.f).a(ews.a));
   public static final ewq i = a("archaeology", $$0 -> $$0.a(ews.f).b(ews.a));
   public static final ewq j = a("gift", $$0 -> $$0.a(ews.f).a(ews.a));
   public static final ewq k = a("barter", $$0 -> $$0.a(ews.a));
   public static final ewq l = a("vault", $$0 -> $$0.a(ews.f).b(ews.a));
   public static final ewq m = a("advancement_reward", $$0 -> $$0.a(ews.a).a(ews.f));
   public static final ewq n = a("advancement_entity", $$0 -> $$0.a(ews.a).a(ews.f));
   public static final ewq o = a("advancement_location", $$0 -> $$0.a(ews.a).a(ews.f).a(ews.i).a(ews.g));
   public static final ewq p = a("block_use", $$0 -> $$0.a(ews.a).a(ews.f).a(ews.g));
   public static final ewq q = a("generic", $$0 -> $$0.a(ews.a).a(ews.b).a(ews.c).a(ews.d).a(ews.e).a(ews.f).a(ews.g).a(ews.h).a(ews.i).a(ews.j));
   public static final ewq r = a("block", $$0 -> $$0.a(ews.g).a(ews.f).a(ews.i).b(ews.a).b(ews.h).b(ews.j));
   public static final ewq s = a("shearing", $$0 -> $$0.a(ews.f).b(ews.a));
   public static final ewq t = a("enchanted_damage", $$0 -> $$0.a(ews.a).a(ews.k).a(ews.f).a(ews.c).b(ews.e).b(ews.d));
   public static final ewq u = a("enchanted_item", $$0 -> $$0.a(ews.i).a(ews.k));
   public static final ewq v = a("enchanted_location", $$0 -> $$0.a(ews.a).a(ews.k).a(ews.f).a(ews.l));
   public static final ewq w = a("enchanted_entity", $$0 -> $$0.a(ews.a).a(ews.k).a(ews.f));
   public static final ewq x = a("hit_block", $$0 -> $$0.a(ews.a).a(ews.k).a(ews.f).a(ews.g));

   private static ewq a(String $$0, Consumer<ewq.a> $$1) {
      ewq.a $$2 = new ewq.a();
      $$1.accept($$2);
      ewq $$3 = $$2.a();
      alh $$4 = alh.b($$0);
      ewq $$5 = (ewq)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
