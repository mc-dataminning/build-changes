import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class egv {
   private static final BiMap<agg, egu> p = HashBiMap.create();
   public static final Codec<egu> a = agg.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((egu)p.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         p.inverse()::get
      );
   public static final egu b = a("empty", $$0 -> {
   });
   public static final egu c = a("chest", $$0 -> $$0.a(egw.f).b(egw.a));
   public static final egu d = a("command", $$0 -> $$0.a(egw.f).b(egw.a));
   public static final egu e = a("selector", $$0 -> $$0.a(egw.f).a(egw.a));
   public static final egu f = a("fishing", $$0 -> $$0.a(egw.f).a(egw.i).b(egw.a));
   public static final egu g = a("entity", $$0 -> $$0.a(egw.a).a(egw.f).a(egw.c).b(egw.d).b(egw.e).b(egw.b));
   public static final egu h = a("archaeology", $$0 -> $$0.a(egw.f).b(egw.a));
   public static final egu i = a("gift", $$0 -> $$0.a(egw.f).a(egw.a));
   public static final egu j = a("barter", $$0 -> $$0.a(egw.a));
   public static final egu k = a("advancement_reward", $$0 -> $$0.a(egw.a).a(egw.f));
   public static final egu l = a("advancement_entity", $$0 -> $$0.a(egw.a).a(egw.f));
   public static final egu m = a("advancement_location", $$0 -> $$0.a(egw.a).a(egw.f).a(egw.i).a(egw.g));
   public static final egu n = a("generic", $$0 -> $$0.a(egw.a).a(egw.b).a(egw.c).a(egw.d).a(egw.e).a(egw.f).a(egw.g).a(egw.h).a(egw.i).a(egw.j));
   public static final egu o = a("block", $$0 -> $$0.a(egw.g).a(egw.f).a(egw.i).b(egw.a).b(egw.h).b(egw.j));

   private static egu a(String $$0, Consumer<egu.a> $$1) {
      egu.a $$2 = new egu.a();
      $$1.accept($$2);
      egu $$3 = $$2.a();
      agg $$4 = new agg($$0);
      egu $$5 = (egu)p.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
