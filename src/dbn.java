import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dbn {
   public static final akt<? extends ke<dbn>> a = akt.a(aku.b("recipe_property_set"));
   public static final akt<dbn> b = a("smithing_base");
   public static final akt<dbn> c = a("smithing_template");
   public static final akt<dbn> d = a("smithing_addition");
   public static final akt<dbn> e = a("furnace_input");
   public static final akt<dbn> f = a("blast_furnace_input");
   public static final akt<dbn> g = a("smoker_input");
   public static final akt<dbn> h = a("campfire_input");
   public static final ym<vz, dbn> i = yk.b(mc.K).a(yk.a()).a($$0 -> new dbn(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final dbn j = new dbn(Set.of());
   private final Set<jr<cwl>> k;

   private dbn(Set<jr<cwl>> $$0) {
      this.k = $$0;
   }

   private static akt<dbn> a(String $$0) {
      return akt.a(a, aku.b($$0));
   }

   public boolean a(cwp $$0) {
      return this.k.contains($$0.i());
   }

   static dbn a(Collection<dba> $$0) {
      Set<jr<cwl>> $$1 = $$0.stream().flatMap($$0x -> $$0x.a().stream()).collect(Collectors.toUnmodifiableSet());
      return new dbn($$1);
   }
}
