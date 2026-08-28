import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dbn {
   public static final aku<? extends ke<dbn>> a = aku.a(akv.b("recipe_property_set"));
   public static final aku<dbn> b = a("smithing_base");
   public static final aku<dbn> c = a("smithing_template");
   public static final aku<dbn> d = a("smithing_addition");
   public static final aku<dbn> e = a("furnace_input");
   public static final aku<dbn> f = a("blast_furnace_input");
   public static final aku<dbn> g = a("smoker_input");
   public static final aku<dbn> h = a("campfire_input");
   public static final yn<wa, dbn> i = yl.b(mc.K).a(yl.a()).a($$0 -> new dbn(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final dbn j = new dbn(Set.of());
   private final Set<jr<cwl>> k;

   private dbn(Set<jr<cwl>> $$0) {
      this.k = $$0;
   }

   private static aku<dbn> a(String $$0) {
      return aku.a(a, akv.b($$0));
   }

   public boolean a(cwp $$0) {
      return this.k.contains($$0.i());
   }

   static dbn a(Collection<dba> $$0) {
      Set<jr<cwl>> $$1 = $$0.stream().flatMap(dba::a).collect(Collectors.toUnmodifiableSet());
      return new dbn($$1);
   }
}
