import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class fnk {
   private static final fnk a = new fnk(ImmutableList.of());
   private static final Comparator<dya.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dya.a<?>> c;

   public fnk a(dya.a<?> $$0) {
      return new fnk(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public fnk a(fnk $$0) {
      return new fnk(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private fnk(List<dya.a<?>> $$0) {
      this.c = $$0;
   }

   public static fnk a() {
      return a;
   }

   public static fnk a(dya.a<?>... $$0) {
      return new fnk(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof fnk && this.c.equals(((fnk)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dya.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
