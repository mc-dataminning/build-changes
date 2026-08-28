import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dcu {
   public static final alc<? extends kf<dcu>> a = alc.a(ald.b("recipe_property_set"));
   public static final alc<dcu> b = a("smithing_base");
   public static final alc<dcu> c = a("smithing_template");
   public static final alc<dcu> d = a("smithing_addition");
   public static final alc<dcu> e = a("furnace_input");
   public static final alc<dcu> f = a("blast_furnace_input");
   public static final alc<dcu> g = a("smoker_input");
   public static final alc<dcu> h = a("campfire_input");
   public static final yt<wg, dcu> i = cxu.f.a(yr.a()).a($$0 -> new dcu(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final dcu j = new dcu(Set.of());
   private final Set<js<cxu>> k;

   private dcu(Set<js<cxu>> $$0) {
      this.k = $$0;
   }

   private static alc<dcu> a(String $$0) {
      return alc.a(a, ald.b($$0));
   }

   public boolean a(cxy $$0) {
      return this.k.contains($$0.i());
   }

   static dcu a(Collection<dch> $$0) {
      Set<js<cxu>> $$1 = $$0.stream().flatMap(dch::a).collect(Collectors.toUnmodifiableSet());
      return new dcu($$1);
   }
}
