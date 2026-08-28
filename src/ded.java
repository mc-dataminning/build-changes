import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ded {
   public static final alf<? extends jr<ded>> a = alf.a(alg.b("recipe_property_set"));
   public static final alf<ded> b = a("smithing_base");
   public static final alf<ded> c = a("smithing_template");
   public static final alf<ded> d = a("smithing_addition");
   public static final alf<ded> e = a("furnace_input");
   public static final alf<ded> f = a("blast_furnace_input");
   public static final alf<ded> g = a("smoker_input");
   public static final alf<ded> h = a("campfire_input");
   public static final yw<wj, ded> i = cyz.f.a(yu.a()).a($$0 -> new ded(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final ded j = new ded(Set.of());
   private final Set<je<cyz>> k;

   private ded(Set<je<cyz>> $$0) {
      this.k = $$0;
   }

   private static alf<ded> a(String $$0) {
      return alf.a(a, alg.b($$0));
   }

   public boolean a(czd $$0) {
      return this.k.contains($$0.i());
   }

   static ded a(Collection<ddq> $$0) {
      Set<je<cyz>> $$1 = $$0.stream().flatMap(ddq::a).collect(Collectors.toUnmodifiableSet());
      return new ded($$1);
   }
}
