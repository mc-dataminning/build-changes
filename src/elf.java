import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class elf {
   private static final BiMap<aiy, ele> q = HashBiMap.create();
   public static final Codec<ele> a = aiy.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((ele)q.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         q.inverse()::get
      );
   public static final ele b = a("empty", $$0 -> {
   });
   public static final ele c = a("chest", $$0 -> $$0.a(elg.f).b(elg.a));
   public static final ele d = a("command", $$0 -> $$0.a(elg.f).b(elg.a));
   public static final ele e = a("selector", $$0 -> $$0.a(elg.f).a(elg.a));
   public static final ele f = a("fishing", $$0 -> $$0.a(elg.f).a(elg.i).b(elg.a));
   public static final ele g = a("entity", $$0 -> $$0.a(elg.a).a(elg.f).a(elg.c).b(elg.d).b(elg.e).b(elg.b));
   public static final ele h = a("archaeology", $$0 -> $$0.a(elg.f).b(elg.a));
   public static final ele i = a("gift", $$0 -> $$0.a(elg.f).a(elg.a));
   public static final ele j = a("barter", $$0 -> $$0.a(elg.a));
   public static final ele k = a("advancement_reward", $$0 -> $$0.a(elg.a).a(elg.f));
   public static final ele l = a("advancement_entity", $$0 -> $$0.a(elg.a).a(elg.f));
   public static final ele m = a("advancement_location", $$0 -> $$0.a(elg.a).a(elg.f).a(elg.i).a(elg.g));
   public static final ele n = a("block_use", $$0 -> $$0.a(elg.a).a(elg.f).a(elg.g));
   public static final ele o = a("generic", $$0 -> $$0.a(elg.a).a(elg.b).a(elg.c).a(elg.d).a(elg.e).a(elg.f).a(elg.g).a(elg.h).a(elg.i).a(elg.j));
   public static final ele p = a("block", $$0 -> $$0.a(elg.g).a(elg.f).a(elg.i).b(elg.a).b(elg.h).b(elg.j));

   private static ele a(String $$0, Consumer<ele.a> $$1) {
      ele.a $$2 = new ele.a();
      $$1.accept($$2);
      ele $$3 = $$2.a();
      aiy $$4 = new aiy($$0);
      ele $$5 = (ele)q.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
