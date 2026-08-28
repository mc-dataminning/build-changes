import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class evo {
   private static final BiMap<alb, evn> y = HashBiMap.create();
   public static final Codec<evn> a = alb.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((evn)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final evn b = a("empty", $$0 -> {
   });
   public static final evn c = a("chest", $$0 -> $$0.a(evp.f).b(evp.a));
   public static final evn d = a("command", $$0 -> $$0.a(evp.f).b(evp.a));
   public static final evn e = a("selector", $$0 -> $$0.a(evp.f).a(evp.a));
   public static final evn f = a("fishing", $$0 -> $$0.a(evp.f).a(evp.i).b(evp.a));
   public static final evn g = a("entity", $$0 -> $$0.a(evp.a).a(evp.f).a(evp.c).b(evp.d).b(evp.e).b(evp.b));
   public static final evn h = a("equipment", $$0 -> $$0.a(evp.f).a(evp.a));
   public static final evn i = a("archaeology", $$0 -> $$0.a(evp.f).b(evp.a));
   public static final evn j = a("gift", $$0 -> $$0.a(evp.f).a(evp.a));
   public static final evn k = a("barter", $$0 -> $$0.a(evp.a));
   public static final evn l = a("vault", $$0 -> $$0.a(evp.f).b(evp.a));
   public static final evn m = a("advancement_reward", $$0 -> $$0.a(evp.a).a(evp.f));
   public static final evn n = a("advancement_entity", $$0 -> $$0.a(evp.a).a(evp.f));
   public static final evn o = a("advancement_location", $$0 -> $$0.a(evp.a).a(evp.f).a(evp.i).a(evp.g));
   public static final evn p = a("block_use", $$0 -> $$0.a(evp.a).a(evp.f).a(evp.g));
   public static final evn q = a("generic", $$0 -> $$0.a(evp.a).a(evp.b).a(evp.c).a(evp.d).a(evp.e).a(evp.f).a(evp.g).a(evp.h).a(evp.i).a(evp.j));
   public static final evn r = a("block", $$0 -> $$0.a(evp.g).a(evp.f).a(evp.i).b(evp.a).b(evp.h).b(evp.j));
   public static final evn s = a("shearing", $$0 -> $$0.a(evp.f).b(evp.a));
   public static final evn t = a("enchanted_damage", $$0 -> $$0.a(evp.a).a(evp.k).a(evp.f).a(evp.c).b(evp.e).b(evp.d));
   public static final evn u = a("enchanted_item", $$0 -> $$0.a(evp.i).a(evp.k));
   public static final evn v = a("enchanted_location", $$0 -> $$0.a(evp.a).a(evp.k).a(evp.f).a(evp.l));
   public static final evn w = a("enchanted_entity", $$0 -> $$0.a(evp.a).a(evp.k).a(evp.f));
   public static final evn x = a("hit_block", $$0 -> $$0.a(evp.a).a(evp.k).a(evp.f).a(evp.g));

   private static evn a(String $$0, Consumer<evn.a> $$1) {
      evn.a $$2 = new evn.a();
      $$1.accept($$2);
      evn $$3 = $$2.a();
      alb $$4 = alb.b($$0);
      evn $$5 = (evn)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
