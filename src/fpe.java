import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class fpe {
   private static final fpe a = new fpe(ImmutableList.of());
   private static final Comparator<dzp.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dzp.a<?>> c;

   public fpe a(dzp.a<?> $$0) {
      return new fpe(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public fpe a(fpe $$0) {
      return new fpe(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private fpe(List<dzp.a<?>> $$0) {
      this.c = $$0;
   }

   public static fpe a() {
      return a;
   }

   public static fpe a(dzp.a<?>... $$0) {
      return new fpe(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof fpe && this.c.equals(((fpe)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dzp.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
