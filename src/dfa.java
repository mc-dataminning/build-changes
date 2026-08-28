import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dfa {
   public static final alj<? extends jt<dfa>> a = alj.a(alk.b("recipe_property_set"));
   public static final alj<dfa> b = a("smithing_base");
   public static final alj<dfa> c = a("smithing_template");
   public static final alj<dfa> d = a("smithing_addition");
   public static final alj<dfa> e = a("furnace_input");
   public static final alj<dfa> f = a("blast_furnace_input");
   public static final alj<dfa> g = a("smoker_input");
   public static final alj<dfa> h = a("campfire_input");
   public static final za<wn, dfa> i = czw.f.a(yy.a()).a($$0 -> new dfa(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final dfa j = new dfa(Set.of());
   private final Set<jg<czw>> k;

   private dfa(Set<jg<czw>> $$0) {
      this.k = $$0;
   }

   private static alj<dfa> a(String $$0) {
      return alj.a(a, alk.b($$0));
   }

   public boolean a(daa $$0) {
      return this.k.contains($$0.i());
   }

   static dfa a(Collection<den> $$0) {
      Set<jg<czw>> $$1 = $$0.stream().flatMap(den::a).collect(Collectors.toUnmodifiableSet());
      return new dfa($$1);
   }
}
