import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dbm {
   public static final aku<? extends ke<dbm>> a = aku.a(akv.b("recipe_property_set"));
   public static final aku<dbm> b = a("smithing_base");
   public static final aku<dbm> c = a("smithing_template");
   public static final aku<dbm> d = a("smithing_addition");
   public static final aku<dbm> e = a("furnace_input");
   public static final aku<dbm> f = a("blast_furnace_input");
   public static final aku<dbm> g = a("smoker_input");
   public static final aku<dbm> h = a("campfire_input");
   public static final yn<wa, dbm> i = yl.b(mc.K).a(yl.a()).a($$0 -> new dbm(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final dbm j = new dbm(Set.of());
   private final Set<jr<cwk>> k;

   private dbm(Set<jr<cwk>> $$0) {
      this.k = $$0;
   }

   private static aku<dbm> a(String $$0) {
      return aku.a(a, akv.b($$0));
   }

   public boolean a(cwo $$0) {
      return this.k.contains($$0.i());
   }

   static dbm a(Collection<daz> $$0) {
      Set<jr<cwk>> $$1 = $$0.stream().flatMap(daz::a).collect(Collectors.toUnmodifiableSet());
      return new dbm($$1);
   }
}
