import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class fdm {
   private static final BiMap<alr, bbl> y = HashBiMap.create();
   public static final Codec<bbl> a = alr.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((bbl)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final bbl b = a("empty", $$0 -> {
   });
   public static final bbl c = a("chest", $$0 -> $$0.a(fdn.f).b(fdn.a));
   public static final bbl d = a("command", $$0 -> $$0.a(fdn.f).b(fdn.a));
   public static final bbl e = a("selector", $$0 -> $$0.a(fdn.f).a(fdn.a));
   public static final bbl f = a("fishing", $$0 -> $$0.a(fdn.f).a(fdn.i).b(fdn.a));
   public static final bbl g = a("entity", $$0 -> $$0.a(fdn.a).a(fdn.f).a(fdn.c).b(fdn.d).b(fdn.e).b(fdn.b));
   public static final bbl h = a("equipment", $$0 -> $$0.a(fdn.f).a(fdn.a));
   public static final bbl i = a("archaeology", $$0 -> $$0.a(fdn.f).a(fdn.a).a(fdn.i));
   public static final bbl j = a("gift", $$0 -> $$0.a(fdn.f).a(fdn.a));
   public static final bbl k = a("barter", $$0 -> $$0.a(fdn.a));
   public static final bbl l = a("vault", $$0 -> $$0.a(fdn.f).b(fdn.a).b(fdn.i));
   public static final bbl m = a("advancement_reward", $$0 -> $$0.a(fdn.a).a(fdn.f));
   public static final bbl n = a("advancement_entity", $$0 -> $$0.a(fdn.a).a(fdn.f));
   public static final bbl o = a("advancement_location", $$0 -> $$0.a(fdn.a).a(fdn.f).a(fdn.i).a(fdn.g));
   public static final bbl p = a("block_use", $$0 -> $$0.a(fdn.a).a(fdn.f).a(fdn.g));
   public static final bbl q = a("generic", $$0 -> $$0.a(fdn.a).a(fdn.b).a(fdn.c).a(fdn.d).a(fdn.e).a(fdn.f).a(fdn.g).a(fdn.h).a(fdn.i).a(fdn.j));
   public static final bbl r = a("block", $$0 -> $$0.a(fdn.g).a(fdn.f).a(fdn.i).b(fdn.a).b(fdn.h).b(fdn.j));
   public static final bbl s = a("shearing", $$0 -> $$0.a(fdn.f).a(fdn.a).a(fdn.i));
   public static final bbl t = a("enchanted_damage", $$0 -> $$0.a(fdn.a).a(fdn.k).a(fdn.f).a(fdn.c).b(fdn.e).b(fdn.d));
   public static final bbl u = a("enchanted_item", $$0 -> $$0.a(fdn.i).a(fdn.k));
   public static final bbl v = a("enchanted_location", $$0 -> $$0.a(fdn.a).a(fdn.k).a(fdn.f).a(fdn.l));
   public static final bbl w = a("enchanted_entity", $$0 -> $$0.a(fdn.a).a(fdn.k).a(fdn.f));
   public static final bbl x = a("hit_block", $$0 -> $$0.a(fdn.a).a(fdn.k).a(fdn.f).a(fdn.g));

   private static bbl a(String $$0, Consumer<bbl.a> $$1) {
      bbl.a $$2 = new bbl.a();
      $$1.accept($$2);
      bbl $$3 = $$2.a();
      alr $$4 = alr.b($$0);
      bbl $$5 = (bbl)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
