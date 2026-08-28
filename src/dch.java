import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dch {
   public static final aly<? extends kd<dch>> a = aly.a(alz.b("recipe_property_set"));
   public static final aly<dch> b = a("smithing_base");
   public static final aly<dch> c = a("smithing_template");
   public static final aly<dch> d = a("smithing_addition");
   public static final aly<dch> e = a("furnace_input");
   public static final aly<dch> f = a("blast_furnace_input");
   public static final aly<dch> g = a("smelter_input");
   public static final aly<dch> h = a("campfire_input");
   public static final zt<xg, dch> i = zr.b(mb.K).a(zr.a()).a($$0 -> new dch(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final dch j = new dch(Set.of());
   private final Set<jq<cxg>> k;

   private dch(Set<jq<cxg>> $$0) {
      this.k = $$0;
   }

   private static aly<dch> a(String $$0) {
      return aly.a(a, alz.b($$0));
   }

   public boolean a(cxk $$0) {
      return this.k.contains($$0.i());
   }

   static dch a(Collection<dbv> $$0) {
      Set<jq<cxg>> $$1 = $$0.stream().flatMap($$0x -> $$0x.a().stream()).collect(Collectors.toUnmodifiableSet());
      return new dch($$1);
   }
}
