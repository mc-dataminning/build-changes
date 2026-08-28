import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dcn {
   public static final aly<? extends kd<dcn>> a = aly.a(alz.b("recipe_property_set"));
   public static final aly<dcn> b = a("smithing_base");
   public static final aly<dcn> c = a("smithing_template");
   public static final aly<dcn> d = a("smithing_addition");
   public static final aly<dcn> e = a("furnace_input");
   public static final aly<dcn> f = a("blast_furnace_input");
   public static final aly<dcn> g = a("smoker_input");
   public static final aly<dcn> h = a("campfire_input");
   public static final zt<xg, dcn> i = zr.b(mb.K).a(zr.a()).a($$0 -> new dcn(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final dcn j = new dcn(Set.of());
   private final Set<jq<cxl>> k;

   private dcn(Set<jq<cxl>> $$0) {
      this.k = $$0;
   }

   private static aly<dcn> a(String $$0) {
      return aly.a(a, alz.b($$0));
   }

   public boolean a(cxp $$0) {
      return this.k.contains($$0.i());
   }

   static dcn a(Collection<dca> $$0) {
      Set<jq<cxl>> $$1 = $$0.stream().flatMap($$0x -> $$0x.a().stream()).collect(Collectors.toUnmodifiableSet());
      return new dcn($$1);
   }
}
