import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class eng {
   private static final BiMap<ajh, enf> r = HashBiMap.create();
   public static final Codec<enf> a = ajh.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((enf)r.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         r.inverse()::get
      );
   public static final enf b = a("empty", $$0 -> {
   });
   public static final enf c = a("chest", $$0 -> $$0.a(enh.f).b(enh.a));
   public static final enf d = a("command", $$0 -> $$0.a(enh.f).b(enh.a));
   public static final enf e = a("selector", $$0 -> $$0.a(enh.f).a(enh.a));
   public static final enf f = a("fishing", $$0 -> $$0.a(enh.f).a(enh.i).b(enh.a));
   public static final enf g = a("entity", $$0 -> $$0.a(enh.a).a(enh.f).a(enh.c).b(enh.d).b(enh.e).b(enh.b));
   public static final enf h = a("archaeology", $$0 -> $$0.a(enh.f).b(enh.a));
   public static final enf i = a("gift", $$0 -> $$0.a(enh.f).a(enh.a));
   public static final enf j = a("barter", $$0 -> $$0.a(enh.a));
   public static final enf k = a("vault", $$0 -> $$0.a(enh.f).b(enh.a));
   public static final enf l = a("advancement_reward", $$0 -> $$0.a(enh.a).a(enh.f));
   public static final enf m = a("advancement_entity", $$0 -> $$0.a(enh.a).a(enh.f));
   public static final enf n = a("advancement_location", $$0 -> $$0.a(enh.a).a(enh.f).a(enh.i).a(enh.g));
   public static final enf o = a("block_use", $$0 -> $$0.a(enh.a).a(enh.f).a(enh.g));
   public static final enf p = a("generic", $$0 -> $$0.a(enh.a).a(enh.b).a(enh.c).a(enh.d).a(enh.e).a(enh.f).a(enh.g).a(enh.h).a(enh.i).a(enh.j));
   public static final enf q = a("block", $$0 -> $$0.a(enh.g).a(enh.f).a(enh.i).b(enh.a).b(enh.h).b(enh.j));

   private static enf a(String $$0, Consumer<enf.a> $$1) {
      enf.a $$2 = new enf.a();
      $$1.accept($$2);
      enf $$3 = $$2.a();
      ajh $$4 = new ajh($$0);
      enf $$5 = (enf)r.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
