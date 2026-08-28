import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class ezc {
   private static final BiMap<alz, ezb> y = HashBiMap.create();
   public static final Codec<ezb> a = alz.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((ezb)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final ezb b = a("empty", $$0 -> {
   });
   public static final ezb c = a("chest", $$0 -> $$0.a(ezd.f).b(ezd.a));
   public static final ezb d = a("command", $$0 -> $$0.a(ezd.f).b(ezd.a));
   public static final ezb e = a("selector", $$0 -> $$0.a(ezd.f).a(ezd.a));
   public static final ezb f = a("fishing", $$0 -> $$0.a(ezd.f).a(ezd.i).b(ezd.a));
   public static final ezb g = a("entity", $$0 -> $$0.a(ezd.a).a(ezd.f).a(ezd.c).b(ezd.d).b(ezd.e).b(ezd.b));
   public static final ezb h = a("equipment", $$0 -> $$0.a(ezd.f).a(ezd.a));
   public static final ezb i = a("archaeology", $$0 -> $$0.a(ezd.f).a(ezd.a).a(ezd.i));
   public static final ezb j = a("gift", $$0 -> $$0.a(ezd.f).a(ezd.a));
   public static final ezb k = a("barter", $$0 -> $$0.a(ezd.a));
   public static final ezb l = a("vault", $$0 -> $$0.a(ezd.f).b(ezd.a).b(ezd.i));
   public static final ezb m = a("advancement_reward", $$0 -> $$0.a(ezd.a).a(ezd.f));
   public static final ezb n = a("advancement_entity", $$0 -> $$0.a(ezd.a).a(ezd.f));
   public static final ezb o = a("advancement_location", $$0 -> $$0.a(ezd.a).a(ezd.f).a(ezd.i).a(ezd.g));
   public static final ezb p = a("block_use", $$0 -> $$0.a(ezd.a).a(ezd.f).a(ezd.g));
   public static final ezb q = a("generic", $$0 -> $$0.a(ezd.a).a(ezd.b).a(ezd.c).a(ezd.d).a(ezd.e).a(ezd.f).a(ezd.g).a(ezd.h).a(ezd.i).a(ezd.j));
   public static final ezb r = a("block", $$0 -> $$0.a(ezd.g).a(ezd.f).a(ezd.i).b(ezd.a).b(ezd.h).b(ezd.j));
   public static final ezb s = a("shearing", $$0 -> $$0.a(ezd.f).a(ezd.a).a(ezd.i));
   public static final ezb t = a("enchanted_damage", $$0 -> $$0.a(ezd.a).a(ezd.k).a(ezd.f).a(ezd.c).b(ezd.e).b(ezd.d));
   public static final ezb u = a("enchanted_item", $$0 -> $$0.a(ezd.i).a(ezd.k));
   public static final ezb v = a("enchanted_location", $$0 -> $$0.a(ezd.a).a(ezd.k).a(ezd.f).a(ezd.l));
   public static final ezb w = a("enchanted_entity", $$0 -> $$0.a(ezd.a).a(ezd.k).a(ezd.f));
   public static final ezb x = a("hit_block", $$0 -> $$0.a(ezd.a).a(ezd.k).a(ezd.f).a(ezd.g));

   private static ezb a(String $$0, Consumer<ezb.a> $$1) {
      ezb.a $$2 = new ezb.a();
      $$1.accept($$2);
      ezb $$3 = $$2.a();
      alz $$4 = alz.b($$0);
      ezb $$5 = (ezb)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
