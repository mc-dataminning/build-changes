import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dfk {
   public static final alq<? extends jt<dfk>> a = alq.a(alr.b("recipe_property_set"));
   public static final alq<dfk> b = a("smithing_base");
   public static final alq<dfk> c = a("smithing_template");
   public static final alq<dfk> d = a("smithing_addition");
   public static final alq<dfk> e = a("furnace_input");
   public static final alq<dfk> f = a("blast_furnace_input");
   public static final alq<dfk> g = a("smoker_input");
   public static final alq<dfk> h = a("campfire_input");
   public static final ze<wp, dfk> i = dag.f.a(zc.a()).a($$0 -> new dfk(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final dfk j = new dfk(Set.of());
   private final Set<jg<dag>> k;

   private dfk(Set<jg<dag>> $$0) {
      this.k = $$0;
   }

   private static alq<dfk> a(String $$0) {
      return alq.a(a, alr.b($$0));
   }

   public boolean a(dak $$0) {
      return this.k.contains($$0.i());
   }

   static dfk a(Collection<dex> $$0) {
      Set<jg<dag>> $$1 = $$0.stream().flatMap(dex::a).collect(Collectors.toUnmodifiableSet());
      return new dfk($$1);
   }
}
