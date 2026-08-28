import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dek {
   public static final alf<? extends js<dek>> a = alf.a(alg.b("recipe_property_set"));
   public static final alf<dek> b = a("smithing_base");
   public static final alf<dek> c = a("smithing_template");
   public static final alf<dek> d = a("smithing_addition");
   public static final alf<dek> e = a("furnace_input");
   public static final alf<dek> f = a("blast_furnace_input");
   public static final alf<dek> g = a("smoker_input");
   public static final alf<dek> h = a("campfire_input");
   public static final yw<wj, dek> i = czg.f.a(yu.a()).a($$0 -> new dek(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final dek j = new dek(Set.of());
   private final Set<jf<czg>> k;

   private dek(Set<jf<czg>> $$0) {
      this.k = $$0;
   }

   private static alf<dek> a(String $$0) {
      return alf.a(a, alg.b($$0));
   }

   public boolean a(czk $$0) {
      return this.k.contains($$0.i());
   }

   static dek a(Collection<ddx> $$0) {
      Set<jf<czg>> $$1 = $$0.stream().flatMap(ddx::a).collect(Collectors.toUnmodifiableSet());
      return new dek($$1);
   }
}
