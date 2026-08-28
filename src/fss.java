import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public record fss(List<ect.a<?>> b) {
   public static final fss a = new fss(List.of());
   private static final Comparator<ect.a<?>> c = Comparator.comparing($$0 -> $$0.a().f());

   public fss a(ect.a<?> $$0) {
      return new fss(ag.a(this.b, $$0));
   }

   public fss a(fss $$0) {
      return new fss(ImmutableList.builder().addAll(this.b).addAll($$0.b).build());
   }

   public static fss a(ect.a<?>... $$0) {
      return new fss(List.of($$0));
   }

   public String a() {
      return this.b.stream().sorted(c).map(ect.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.a();
   }
}
