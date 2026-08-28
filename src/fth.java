import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public record fth(List<ecj.a<?>> b) {
   public static final fth a = new fth(List.of());
   private static final Comparator<ecj.a<?>> c = Comparator.comparing($$0 -> $$0.a().f());

   public fth a(ecj.a<?> $$0) {
      return new fth(ag.a(this.b, $$0));
   }

   public fth a(fth $$0) {
      return new fth(ImmutableList.builder().addAll(this.b).addAll($$0.b).build());
   }

   public static fth a(ecj.a<?>... $$0) {
      return new fth(List.of($$0));
   }

   public String a() {
      return this.b.stream().sorted(c).map(ecj.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.a();
   }
}
