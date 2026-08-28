import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record fa(List<fa.a> b) {
   public static final fa a = new fa(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public fa(vv $$0) {
      this($$0.a(vv.a(ArrayList::new, 8), fa.a::new));
   }

   public void a(vv $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static fa a(xq<?> $$0, fa.b $$1) {
      List<fa.a> $$2 = $$0.a().stream().map($$1x -> {
         xk $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new fa.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new fa($$2);
   }

   public List<fa.a> a() {
      return this.b;
   }

   public static record a(String a, xk b) {
      public a(vv $$0) {
         this($$0.d(16), xk.a($$0));
      }

      public void a(vv $$0) {
         $$0.a(this.a, 16);
         xk.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      xk sign(String var1);
   }
}
