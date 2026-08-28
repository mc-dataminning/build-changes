import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record fc(List<fc.a> b) {
   public static final fc a = new fc(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public fc(we $$0) {
      this($$0.a(we.a(ArrayList::new, 8), fc.a::new));
   }

   public void a(we $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static fc a(xz<?> $$0, fc.b $$1) {
      List<fc.a> $$2 = $$0.a().stream().map($$1x -> {
         xt $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new fc.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new fc($$2);
   }

   public List<fc.a> a() {
      return this.b;
   }

   public static record a(String a, xt b) {
      public a(we $$0) {
         this($$0.d(16), xt.a($$0));
      }

      public void a(we $$0) {
         $$0.a(this.a, 16);
         xt.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      xt sign(String var1);
   }
}
