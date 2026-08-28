import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class fog {
   private static final fog a = new fog(ImmutableList.of());
   private static final Comparator<dyt.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dyt.a<?>> c;

   public fog a(dyt.a<?> $$0) {
      return new fog(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public fog a(fog $$0) {
      return new fog(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private fog(List<dyt.a<?>> $$0) {
      this.c = $$0;
   }

   public static fog a() {
      return a;
   }

   public static fog a(dyt.a<?>... $$0) {
      return new fog(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof fog && this.c.equals(((fog)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dyt.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
