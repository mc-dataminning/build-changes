import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record er(List<er.a> b) {
   public static final er a = new er(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public er(vy $$0) {
      this($$0.a(vy.a(ArrayList::new, 8), er.a::new));
   }

   public void a(vy $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static er a(xu<?> $$0, er.b $$1) {
      List<er.a> $$2 = $$0.a().stream().map($$1x -> {
         xo $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new er.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new er($$2);
   }

   public List<er.a> a() {
      return this.b;
   }

   public static record a(String a, xo b) {
      public a(vy $$0) {
         this($$0.d(16), xo.a($$0));
      }

      public void a(vy $$0) {
         $$0.a(this.a, 16);
         xo.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      xo sign(String var1);
   }
}
