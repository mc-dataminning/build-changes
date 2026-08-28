import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class fqt {
   private static final fqt a = new fqt(ImmutableList.of());
   private static final Comparator<ebc.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<ebc.a<?>> c;

   public fqt a(ebc.a<?> $$0) {
      return new fqt(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public fqt a(fqt $$0) {
      return new fqt(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private fqt(List<ebc.a<?>> $$0) {
      this.c = $$0;
   }

   public static fqt a() {
      return a;
   }

   public static fqt a(ebc.a<?>... $$0) {
      return new fqt(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof fqt && this.c.equals(((fqt)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(ebc.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
