import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class fra {
   private static final fra a = new fra(ImmutableList.of());
   private static final Comparator<ebk.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<ebk.a<?>> c;

   public fra a(ebk.a<?> $$0) {
      return new fra(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public fra a(fra $$0) {
      return new fra(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private fra(List<ebk.a<?>> $$0) {
      this.c = $$0;
   }

   public static fra a() {
      return a;
   }

   public static fra a(ebk.a<?>... $$0) {
      return new fra(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof fra && this.c.equals(((fra)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(ebk.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
