import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dce {
   public static final alo<? extends kd<dce>> a = alo.a(alp.b("recipe_property_set"));
   public static final alo<dce> b = a("smithing_base");
   public static final alo<dce> c = a("smithing_template");
   public static final alo<dce> d = a("smithing_addition");
   public static final alo<dce> e = a("furnace_input");
   public static final alo<dce> f = a("blast_furnace_input");
   public static final alo<dce> g = a("smoker_input");
   public static final alo<dce> h = a("campfire_input");
   public static final zi<wv, dce> i = zg.b(mb.K).a(zg.a()).a($$0 -> new dce(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final dce j = new dce(Set.of());
   private final Set<jq<cxc>> k;

   private dce(Set<jq<cxc>> $$0) {
      this.k = $$0;
   }

   private static alo<dce> a(String $$0) {
      return alo.a(a, alp.b($$0));
   }

   public boolean a(cxg $$0) {
      return this.k.contains($$0.i());
   }

   static dce a(Collection<dbr> $$0) {
      Set<jq<cxc>> $$1 = $$0.stream().flatMap($$0x -> $$0x.a().stream()).collect(Collectors.toUnmodifiableSet());
      return new dce($$1);
   }
}
