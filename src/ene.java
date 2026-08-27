import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class ene {
   private static final BiMap<ajh, end> r = HashBiMap.create();
   public static final Codec<end> a = ajh.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((end)r.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         r.inverse()::get
      );
   public static final end b = a("empty", $$0 -> {
   });
   public static final end c = a("chest", $$0 -> $$0.a(enf.f).b(enf.a));
   public static final end d = a("command", $$0 -> $$0.a(enf.f).b(enf.a));
   public static final end e = a("selector", $$0 -> $$0.a(enf.f).a(enf.a));
   public static final end f = a("fishing", $$0 -> $$0.a(enf.f).a(enf.i).b(enf.a));
   public static final end g = a("entity", $$0 -> $$0.a(enf.a).a(enf.f).a(enf.c).b(enf.d).b(enf.e).b(enf.b));
   public static final end h = a("archaeology", $$0 -> $$0.a(enf.f).b(enf.a));
   public static final end i = a("gift", $$0 -> $$0.a(enf.f).a(enf.a));
   public static final end j = a("barter", $$0 -> $$0.a(enf.a));
   public static final end k = a("vault", $$0 -> $$0.a(enf.f).b(enf.a));
   public static final end l = a("advancement_reward", $$0 -> $$0.a(enf.a).a(enf.f));
   public static final end m = a("advancement_entity", $$0 -> $$0.a(enf.a).a(enf.f));
   public static final end n = a("advancement_location", $$0 -> $$0.a(enf.a).a(enf.f).a(enf.i).a(enf.g));
   public static final end o = a("block_use", $$0 -> $$0.a(enf.a).a(enf.f).a(enf.g));
   public static final end p = a("generic", $$0 -> $$0.a(enf.a).a(enf.b).a(enf.c).a(enf.d).a(enf.e).a(enf.f).a(enf.g).a(enf.h).a(enf.i).a(enf.j));
   public static final end q = a("block", $$0 -> $$0.a(enf.g).a(enf.f).a(enf.i).b(enf.a).b(enf.h).b(enf.j));

   private static end a(String $$0, Consumer<end.a> $$1) {
      end.a $$2 = new end.a();
      $$1.accept($$2);
      end $$3 = $$2.a();
      ajh $$4 = new ajh($$0);
      end $$5 = (end)r.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
