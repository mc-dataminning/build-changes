import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public record frp(List<ebr.a<?>> b) {
   public static final frp a = new frp(List.of());
   private static final Comparator<ebr.a<?>> c = Comparator.comparing($$0 -> $$0.a().f());

   public frp a(ebr.a<?> $$0) {
      return new frp(ag.a(this.b, $$0));
   }

   public frp a(frp $$0) {
      return new frp(ImmutableList.builder().addAll(this.b).addAll($$0.b).build());
   }

   public static frp a(ebr.a<?>... $$0) {
      return new frp(List.of($$0));
   }

   public String a() {
      return this.b.stream().sorted(c).map(ebr.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.a();
   }
}
