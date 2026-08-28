import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class ewx {
   private static final BiMap<ali, eww> y = HashBiMap.create();
   public static final Codec<eww> a = ali.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((eww)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final eww b = a("empty", $$0 -> {
   });
   public static final eww c = a("chest", $$0 -> $$0.a(ewy.f).b(ewy.a));
   public static final eww d = a("command", $$0 -> $$0.a(ewy.f).b(ewy.a));
   public static final eww e = a("selector", $$0 -> $$0.a(ewy.f).a(ewy.a));
   public static final eww f = a("fishing", $$0 -> $$0.a(ewy.f).a(ewy.i).b(ewy.a));
   public static final eww g = a("entity", $$0 -> $$0.a(ewy.a).a(ewy.f).a(ewy.c).b(ewy.d).b(ewy.e).b(ewy.b));
   public static final eww h = a("equipment", $$0 -> $$0.a(ewy.f).a(ewy.a));
   public static final eww i = a("archaeology", $$0 -> $$0.a(ewy.f).a(ewy.a).a(ewy.i));
   public static final eww j = a("gift", $$0 -> $$0.a(ewy.f).a(ewy.a));
   public static final eww k = a("barter", $$0 -> $$0.a(ewy.a));
   public static final eww l = a("vault", $$0 -> $$0.a(ewy.f).b(ewy.a).b(ewy.i));
   public static final eww m = a("advancement_reward", $$0 -> $$0.a(ewy.a).a(ewy.f));
   public static final eww n = a("advancement_entity", $$0 -> $$0.a(ewy.a).a(ewy.f));
   public static final eww o = a("advancement_location", $$0 -> $$0.a(ewy.a).a(ewy.f).a(ewy.i).a(ewy.g));
   public static final eww p = a("block_use", $$0 -> $$0.a(ewy.a).a(ewy.f).a(ewy.g));
   public static final eww q = a("generic", $$0 -> $$0.a(ewy.a).a(ewy.b).a(ewy.c).a(ewy.d).a(ewy.e).a(ewy.f).a(ewy.g).a(ewy.h).a(ewy.i).a(ewy.j));
   public static final eww r = a("block", $$0 -> $$0.a(ewy.g).a(ewy.f).a(ewy.i).b(ewy.a).b(ewy.h).b(ewy.j));
   public static final eww s = a("shearing", $$0 -> $$0.a(ewy.f).a(ewy.a).a(ewy.i));
   public static final eww t = a("enchanted_damage", $$0 -> $$0.a(ewy.a).a(ewy.k).a(ewy.f).a(ewy.c).b(ewy.e).b(ewy.d));
   public static final eww u = a("enchanted_item", $$0 -> $$0.a(ewy.i).a(ewy.k));
   public static final eww v = a("enchanted_location", $$0 -> $$0.a(ewy.a).a(ewy.k).a(ewy.f).a(ewy.l));
   public static final eww w = a("enchanted_entity", $$0 -> $$0.a(ewy.a).a(ewy.k).a(ewy.f));
   public static final eww x = a("hit_block", $$0 -> $$0.a(ewy.a).a(ewy.k).a(ewy.f).a(ewy.g));

   private static eww a(String $$0, Consumer<eww.a> $$1) {
      eww.a $$2 = new eww.a();
      $$1.accept($$2);
      eww $$3 = $$2.a();
      ali $$4 = ali.b($$0);
      eww $$5 = (eww)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
