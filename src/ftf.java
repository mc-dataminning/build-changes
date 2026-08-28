import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public record ftf(List<ech.a<?>> b) {
   public static final ftf a = new ftf(List.of());
   private static final Comparator<ech.a<?>> c = Comparator.comparing($$0 -> $$0.a().f());

   public ftf a(ech.a<?> $$0) {
      return new ftf(ag.a(this.b, $$0));
   }

   public ftf a(ftf $$0) {
      return new ftf(ImmutableList.builder().addAll(this.b).addAll($$0.b).build());
   }

   public static ftf a(ech.a<?>... $$0) {
      return new ftf(List.of($$0));
   }

   public String a() {
      return this.b.stream().sorted(c).map(ech.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.a();
   }
}
