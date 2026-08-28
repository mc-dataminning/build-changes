import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dds {
   public static final ald<? extends jr<dds>> a = ald.a(ale.b("recipe_property_set"));
   public static final ald<dds> b = a("smithing_base");
   public static final ald<dds> c = a("smithing_template");
   public static final ald<dds> d = a("smithing_addition");
   public static final ald<dds> e = a("furnace_input");
   public static final ald<dds> f = a("blast_furnace_input");
   public static final ald<dds> g = a("smoker_input");
   public static final ald<dds> h = a("campfire_input");
   public static final yu<wh, dds> i = cyo.f.a(ys.a()).a($$0 -> new dds(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final dds j = new dds(Set.of());
   private final Set<je<cyo>> k;

   private dds(Set<je<cyo>> $$0) {
      this.k = $$0;
   }

   private static ald<dds> a(String $$0) {
      return ald.a(a, ale.b($$0));
   }

   public boolean a(cys $$0) {
      return this.k.contains($$0.i());
   }

   static dds a(Collection<ddf> $$0) {
      Set<je<cyo>> $$1 = $$0.stream().flatMap(ddf::a).collect(Collectors.toUnmodifiableSet());
      return new dds($$1);
   }
}
