import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ees {
   private static final BiMap<aep, eer> o = HashBiMap.create();
   public static final eer a = a("empty", $$0 -> {
   });
   public static final eer b = a("chest", $$0 -> $$0.a(eet.f).b(eet.a));
   public static final eer c = a("command", $$0 -> $$0.a(eet.f).b(eet.a));
   public static final eer d = a("selector", $$0 -> $$0.a(eet.f).a(eet.a));
   public static final eer e = a("fishing", $$0 -> $$0.a(eet.f).a(eet.i).b(eet.a));
   public static final eer f = a("entity", $$0 -> $$0.a(eet.a).a(eet.f).a(eet.c).b(eet.d).b(eet.e).b(eet.b));
   public static final eer g = a("archaeology", $$0 -> $$0.a(eet.f).b(eet.a));
   public static final eer h = a("gift", $$0 -> $$0.a(eet.f).a(eet.a));
   public static final eer i = a("barter", $$0 -> $$0.a(eet.a));
   public static final eer j = a("advancement_reward", $$0 -> $$0.a(eet.a).a(eet.f));
   public static final eer k = a("advancement_entity", $$0 -> $$0.a(eet.a).a(eet.f));
   public static final eer l = a("advancement_location", $$0 -> $$0.a(eet.a).a(eet.f).a(eet.i).a(eet.g));
   public static final eer m = a("generic", $$0 -> $$0.a(eet.a).a(eet.b).a(eet.c).a(eet.d).a(eet.e).a(eet.f).a(eet.g).a(eet.h).a(eet.i).a(eet.j));
   public static final eer n = a("block", $$0 -> $$0.a(eet.g).a(eet.f).a(eet.i).b(eet.a).b(eet.h).b(eet.j));

   private static eer a(String $$0, Consumer<eer.a> $$1) {
      eer.a $$2 = new eer.a();
      $$1.accept($$2);
      eer $$3 = $$2.a();
      aep $$4 = new aep($$0);
      eer $$5 = (eer)o.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }

   @Nullable
   public static eer a(aep $$0) {
      return (eer)o.get($$0);
   }

   @Nullable
   public static aep a(eer $$0) {
      return (aep)o.inverse().get($$0);
   }
}
