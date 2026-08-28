import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public record fru(List<ebw.a<?>> b) {
   public static final fru a = new fru(List.of());
   private static final Comparator<ebw.a<?>> c = Comparator.comparing($$0 -> $$0.a().f());

   public fru a(ebw.a<?> $$0) {
      return new fru(ag.a(this.b, $$0));
   }

   public fru a(fru $$0) {
      return new fru(ImmutableList.builder().addAll(this.b).addAll($$0.b).build());
   }

   public static fru a(ebw.a<?>... $$0) {
      return new fru(List.of($$0));
   }

   public String a() {
      return this.b.stream().sorted(c).map(ebw.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.a();
   }
}
