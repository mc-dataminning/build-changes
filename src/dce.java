import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dce {
   public static final akt<? extends ke<dce>> a = akt.a(aku.b("recipe_property_set"));
   public static final akt<dce> b = a("smithing_base");
   public static final akt<dce> c = a("smithing_template");
   public static final akt<dce> d = a("smithing_addition");
   public static final akt<dce> e = a("furnace_input");
   public static final akt<dce> f = a("blast_furnace_input");
   public static final akt<dce> g = a("smoker_input");
   public static final akt<dce> h = a("campfire_input");
   public static final yn<wa, dce> i = cxd.f.a(yl.a()).a($$0 -> new dce(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final dce j = new dce(Set.of());
   private final Set<jr<cxd>> k;

   private dce(Set<jr<cxd>> $$0) {
      this.k = $$0;
   }

   private static akt<dce> a(String $$0) {
      return akt.a(a, aku.b($$0));
   }

   public boolean a(cxh $$0) {
      return this.k.contains($$0.i());
   }

   static dce a(Collection<dbr> $$0) {
      Set<jr<cxd>> $$1 = $$0.stream().flatMap(dbr::a).collect(Collectors.toUnmodifiableSet());
      return new dce($$1);
   }
}
