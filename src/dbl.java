import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dbl {
   public static final akt<? extends ke<dbl>> a = akt.a(aku.b("recipe_property_set"));
   public static final akt<dbl> b = a("smithing_base");
   public static final akt<dbl> c = a("smithing_template");
   public static final akt<dbl> d = a("smithing_addition");
   public static final akt<dbl> e = a("furnace_input");
   public static final akt<dbl> f = a("blast_furnace_input");
   public static final akt<dbl> g = a("smoker_input");
   public static final akt<dbl> h = a("campfire_input");
   public static final ym<vz, dbl> i = yk.b(mc.K).a(yk.a()).a($$0 -> new dbl(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final dbl j = new dbl(Set.of());
   private final Set<jr<cwj>> k;

   private dbl(Set<jr<cwj>> $$0) {
      this.k = $$0;
   }

   private static akt<dbl> a(String $$0) {
      return akt.a(a, aku.b($$0));
   }

   public boolean a(cwn $$0) {
      return this.k.contains($$0.i());
   }

   static dbl a(Collection<day> $$0) {
      Set<jr<cwj>> $$1 = $$0.stream().flatMap(day::a).collect(Collectors.toUnmodifiableSet());
      return new dbl($$1);
   }
}
