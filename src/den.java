import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class den {
   public static final alf<? extends js<den>> a = alf.a(alg.b("recipe_property_set"));
   public static final alf<den> b = a("smithing_base");
   public static final alf<den> c = a("smithing_template");
   public static final alf<den> d = a("smithing_addition");
   public static final alf<den> e = a("furnace_input");
   public static final alf<den> f = a("blast_furnace_input");
   public static final alf<den> g = a("smoker_input");
   public static final alf<den> h = a("campfire_input");
   public static final yw<wj, den> i = czj.f.a(yu.a()).a($$0 -> new den(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final den j = new den(Set.of());
   private final Set<jf<czj>> k;

   private den(Set<jf<czj>> $$0) {
      this.k = $$0;
   }

   private static alf<den> a(String $$0) {
      return alf.a(a, alg.b($$0));
   }

   public boolean a(czn $$0) {
      return this.k.contains($$0.i());
   }

   static den a(Collection<dea> $$0) {
      Set<jf<czj>> $$1 = $$0.stream().flatMap(dea::a).collect(Collectors.toUnmodifiableSet());
      return new den($$1);
   }
}
