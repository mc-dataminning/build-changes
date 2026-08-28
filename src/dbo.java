import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dbo {
   public static final aku<? extends ke<dbo>> a = aku.a(akv.b("recipe_property_set"));
   public static final aku<dbo> b = a("smithing_base");
   public static final aku<dbo> c = a("smithing_template");
   public static final aku<dbo> d = a("smithing_addition");
   public static final aku<dbo> e = a("furnace_input");
   public static final aku<dbo> f = a("blast_furnace_input");
   public static final aku<dbo> g = a("smoker_input");
   public static final aku<dbo> h = a("campfire_input");
   public static final yn<wa, dbo> i = yl.b(mc.K).a(yl.a()).a($$0 -> new dbo(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final dbo j = new dbo(Set.of());
   private final Set<jr<cwm>> k;

   private dbo(Set<jr<cwm>> $$0) {
      this.k = $$0;
   }

   private static aku<dbo> a(String $$0) {
      return aku.a(a, akv.b($$0));
   }

   public boolean a(cwq $$0) {
      return this.k.contains($$0.i());
   }

   static dbo a(Collection<dbb> $$0) {
      Set<jr<cwm>> $$1 = $$0.stream().flatMap(dbb::a).collect(Collectors.toUnmodifiableSet());
      return new dbo($$1);
   }
}
