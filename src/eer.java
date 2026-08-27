import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class eer {
   private static final BiMap<aer, eeq> p = HashBiMap.create();
   public static final Codec<eeq> a = aer.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((eeq)p.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         p.inverse()::get
      );
   public static final eeq b = a("empty", $$0 -> {
   });
   public static final eeq c = a("chest", $$0 -> $$0.a(ees.f).b(ees.a));
   public static final eeq d = a("command", $$0 -> $$0.a(ees.f).b(ees.a));
   public static final eeq e = a("selector", $$0 -> $$0.a(ees.f).a(ees.a));
   public static final eeq f = a("fishing", $$0 -> $$0.a(ees.f).a(ees.i).b(ees.a));
   public static final eeq g = a("entity", $$0 -> $$0.a(ees.a).a(ees.f).a(ees.c).b(ees.d).b(ees.e).b(ees.b));
   public static final eeq h = a("archaeology", $$0 -> $$0.a(ees.f).b(ees.a));
   public static final eeq i = a("gift", $$0 -> $$0.a(ees.f).a(ees.a));
   public static final eeq j = a("barter", $$0 -> $$0.a(ees.a));
   public static final eeq k = a("advancement_reward", $$0 -> $$0.a(ees.a).a(ees.f));
   public static final eeq l = a("advancement_entity", $$0 -> $$0.a(ees.a).a(ees.f));
   public static final eeq m = a("advancement_location", $$0 -> $$0.a(ees.a).a(ees.f).a(ees.i).a(ees.g));
   public static final eeq n = a("generic", $$0 -> $$0.a(ees.a).a(ees.b).a(ees.c).a(ees.d).a(ees.e).a(ees.f).a(ees.g).a(ees.h).a(ees.i).a(ees.j));
   public static final eeq o = a("block", $$0 -> $$0.a(ees.g).a(ees.f).a(ees.i).b(ees.a).b(ees.h).b(ees.j));

   private static eeq a(String $$0, Consumer<eeq.a> $$1) {
      eeq.a $$2 = new eeq.a();
      $$1.accept($$2);
      eeq $$3 = $$2.a();
      aer $$4 = new aer($$0);
      eeq $$5 = (eeq)p.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
