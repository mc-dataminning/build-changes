import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dcm {
   public static final aly<? extends kd<dcm>> a = aly.a(alz.b("recipe_property_set"));
   public static final aly<dcm> b = a("smithing_base");
   public static final aly<dcm> c = a("smithing_template");
   public static final aly<dcm> d = a("smithing_addition");
   public static final aly<dcm> e = a("furnace_input");
   public static final aly<dcm> f = a("blast_furnace_input");
   public static final aly<dcm> g = a("smoker_input");
   public static final aly<dcm> h = a("campfire_input");
   public static final zt<xg, dcm> i = zr.b(mb.K).a(zr.a()).a($$0 -> new dcm(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final dcm j = new dcm(Set.of());
   private final Set<jq<cxk>> k;

   private dcm(Set<jq<cxk>> $$0) {
      this.k = $$0;
   }

   private static aly<dcm> a(String $$0) {
      return aly.a(a, alz.b($$0));
   }

   public boolean a(cxo $$0) {
      return this.k.contains($$0.i());
   }

   static dcm a(Collection<dbz> $$0) {
      Set<jq<cxk>> $$1 = $$0.stream().flatMap($$0x -> $$0x.a().stream()).collect(Collectors.toUnmodifiableSet());
      return new dcm($$1);
   }
}
