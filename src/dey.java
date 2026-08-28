import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dey {
   public static final alh<? extends js<dey>> a = alh.a(ali.b("recipe_property_set"));
   public static final alh<dey> b = a("smithing_base");
   public static final alh<dey> c = a("smithing_template");
   public static final alh<dey> d = a("smithing_addition");
   public static final alh<dey> e = a("furnace_input");
   public static final alh<dey> f = a("blast_furnace_input");
   public static final alh<dey> g = a("smoker_input");
   public static final alh<dey> h = a("campfire_input");
   public static final yy<wl, dey> i = czu.f.a(yw.a()).a($$0 -> new dey(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final dey j = new dey(Set.of());
   private final Set<jf<czu>> k;

   private dey(Set<jf<czu>> $$0) {
      this.k = $$0;
   }

   private static alh<dey> a(String $$0) {
      return alh.a(a, ali.b($$0));
   }

   public boolean a(czy $$0) {
      return this.k.contains($$0.i());
   }

   static dey a(Collection<del> $$0) {
      Set<jf<czu>> $$1 = $$0.stream().flatMap(del::a).collect(Collectors.toUnmodifiableSet());
      return new dey($$1);
   }
}
