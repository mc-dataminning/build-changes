import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class fng {
   private static final fng a = new fng(ImmutableList.of());
   private static final Comparator<dxx.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dxx.a<?>> c;

   public fng a(dxx.a<?> $$0) {
      return new fng(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public fng a(fng $$0) {
      return new fng(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private fng(List<dxx.a<?>> $$0) {
      this.c = $$0;
   }

   public static fng a() {
      return a;
   }

   public static fng a(dxx.a<?>... $$0) {
      return new fng(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof fng && this.c.equals(((fng)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dxx.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
