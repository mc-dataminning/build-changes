import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ddy {
   public static final alf<? extends jr<ddy>> a = alf.a(alg.b("recipe_property_set"));
   public static final alf<ddy> b = a("smithing_base");
   public static final alf<ddy> c = a("smithing_template");
   public static final alf<ddy> d = a("smithing_addition");
   public static final alf<ddy> e = a("furnace_input");
   public static final alf<ddy> f = a("blast_furnace_input");
   public static final alf<ddy> g = a("smoker_input");
   public static final alf<ddy> h = a("campfire_input");
   public static final yw<wj, ddy> i = cyu.f.a(yu.a()).a($$0 -> new ddy(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final ddy j = new ddy(Set.of());
   private final Set<je<cyu>> k;

   private ddy(Set<je<cyu>> $$0) {
      this.k = $$0;
   }

   private static alf<ddy> a(String $$0) {
      return alf.a(a, alg.b($$0));
   }

   public boolean a(cyy $$0) {
      return this.k.contains($$0.i());
   }

   static ddy a(Collection<ddl> $$0) {
      Set<je<cyu>> $$1 = $$0.stream().flatMap(ddl::a).collect(Collectors.toUnmodifiableSet());
      return new ddy($$1);
   }
}
