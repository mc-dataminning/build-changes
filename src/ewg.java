import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class ewg {
   private static final BiMap<ale, ewf> y = HashBiMap.create();
   public static final Codec<ewf> a = ale.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((ewf)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final ewf b = a("empty", $$0 -> {
   });
   public static final ewf c = a("chest", $$0 -> $$0.a(ewh.f).b(ewh.a));
   public static final ewf d = a("command", $$0 -> $$0.a(ewh.f).b(ewh.a));
   public static final ewf e = a("selector", $$0 -> $$0.a(ewh.f).a(ewh.a));
   public static final ewf f = a("fishing", $$0 -> $$0.a(ewh.f).a(ewh.i).b(ewh.a));
   public static final ewf g = a("entity", $$0 -> $$0.a(ewh.a).a(ewh.f).a(ewh.c).b(ewh.d).b(ewh.e).b(ewh.b));
   public static final ewf h = a("equipment", $$0 -> $$0.a(ewh.f).a(ewh.a));
   public static final ewf i = a("archaeology", $$0 -> $$0.a(ewh.f).b(ewh.a));
   public static final ewf j = a("gift", $$0 -> $$0.a(ewh.f).a(ewh.a));
   public static final ewf k = a("barter", $$0 -> $$0.a(ewh.a));
   public static final ewf l = a("vault", $$0 -> $$0.a(ewh.f).b(ewh.a));
   public static final ewf m = a("advancement_reward", $$0 -> $$0.a(ewh.a).a(ewh.f));
   public static final ewf n = a("advancement_entity", $$0 -> $$0.a(ewh.a).a(ewh.f));
   public static final ewf o = a("advancement_location", $$0 -> $$0.a(ewh.a).a(ewh.f).a(ewh.i).a(ewh.g));
   public static final ewf p = a("block_use", $$0 -> $$0.a(ewh.a).a(ewh.f).a(ewh.g));
   public static final ewf q = a("generic", $$0 -> $$0.a(ewh.a).a(ewh.b).a(ewh.c).a(ewh.d).a(ewh.e).a(ewh.f).a(ewh.g).a(ewh.h).a(ewh.i).a(ewh.j));
   public static final ewf r = a("block", $$0 -> $$0.a(ewh.g).a(ewh.f).a(ewh.i).b(ewh.a).b(ewh.h).b(ewh.j));
   public static final ewf s = a("shearing", $$0 -> $$0.a(ewh.f).b(ewh.a));
   public static final ewf t = a("enchanted_damage", $$0 -> $$0.a(ewh.a).a(ewh.k).a(ewh.f).a(ewh.c).b(ewh.e).b(ewh.d));
   public static final ewf u = a("enchanted_item", $$0 -> $$0.a(ewh.i).a(ewh.k));
   public static final ewf v = a("enchanted_location", $$0 -> $$0.a(ewh.a).a(ewh.k).a(ewh.f).a(ewh.l));
   public static final ewf w = a("enchanted_entity", $$0 -> $$0.a(ewh.a).a(ewh.k).a(ewh.f));
   public static final ewf x = a("hit_block", $$0 -> $$0.a(ewh.a).a(ewh.k).a(ewh.f).a(ewh.g));

   private static ewf a(String $$0, Consumer<ewf.a> $$1) {
      ewf.a $$2 = new ewf.a();
      $$1.accept($$2);
      ewf $$3 = $$2.a();
      ale $$4 = ale.b($$0);
      ewf $$5 = (ewf)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
