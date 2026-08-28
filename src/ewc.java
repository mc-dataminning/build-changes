import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class ewc {
   private static final BiMap<alc, ewb> y = HashBiMap.create();
   public static final Codec<ewb> a = alc.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((ewb)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final ewb b = a("empty", $$0 -> {
   });
   public static final ewb c = a("chest", $$0 -> $$0.a(ewd.f).b(ewd.a));
   public static final ewb d = a("command", $$0 -> $$0.a(ewd.f).b(ewd.a));
   public static final ewb e = a("selector", $$0 -> $$0.a(ewd.f).a(ewd.a));
   public static final ewb f = a("fishing", $$0 -> $$0.a(ewd.f).a(ewd.i).b(ewd.a));
   public static final ewb g = a("entity", $$0 -> $$0.a(ewd.a).a(ewd.f).a(ewd.c).b(ewd.d).b(ewd.e).b(ewd.b));
   public static final ewb h = a("equipment", $$0 -> $$0.a(ewd.f).a(ewd.a));
   public static final ewb i = a("archaeology", $$0 -> $$0.a(ewd.f).b(ewd.a));
   public static final ewb j = a("gift", $$0 -> $$0.a(ewd.f).a(ewd.a));
   public static final ewb k = a("barter", $$0 -> $$0.a(ewd.a));
   public static final ewb l = a("vault", $$0 -> $$0.a(ewd.f).b(ewd.a));
   public static final ewb m = a("advancement_reward", $$0 -> $$0.a(ewd.a).a(ewd.f));
   public static final ewb n = a("advancement_entity", $$0 -> $$0.a(ewd.a).a(ewd.f));
   public static final ewb o = a("advancement_location", $$0 -> $$0.a(ewd.a).a(ewd.f).a(ewd.i).a(ewd.g));
   public static final ewb p = a("block_use", $$0 -> $$0.a(ewd.a).a(ewd.f).a(ewd.g));
   public static final ewb q = a("generic", $$0 -> $$0.a(ewd.a).a(ewd.b).a(ewd.c).a(ewd.d).a(ewd.e).a(ewd.f).a(ewd.g).a(ewd.h).a(ewd.i).a(ewd.j));
   public static final ewb r = a("block", $$0 -> $$0.a(ewd.g).a(ewd.f).a(ewd.i).b(ewd.a).b(ewd.h).b(ewd.j));
   public static final ewb s = a("shearing", $$0 -> $$0.a(ewd.f).b(ewd.a));
   public static final ewb t = a("enchanted_damage", $$0 -> $$0.a(ewd.a).a(ewd.k).a(ewd.f).a(ewd.c).b(ewd.e).b(ewd.d));
   public static final ewb u = a("enchanted_item", $$0 -> $$0.a(ewd.i).a(ewd.k));
   public static final ewb v = a("enchanted_location", $$0 -> $$0.a(ewd.a).a(ewd.k).a(ewd.f).a(ewd.l));
   public static final ewb w = a("enchanted_entity", $$0 -> $$0.a(ewd.a).a(ewd.k).a(ewd.f));
   public static final ewb x = a("hit_block", $$0 -> $$0.a(ewd.a).a(ewd.k).a(ewd.f).a(ewd.g));

   private static ewb a(String $$0, Consumer<ewb.a> $$1) {
      ewb.a $$2 = new ewb.a();
      $$1.accept($$2);
      ewb $$3 = $$2.a();
      alc $$4 = alc.b($$0);
      ewb $$5 = (ewb)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
