import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record fb(List<fb.a> b) {
   public static final fb a = new fb(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public fb(wb $$0) {
      this($$0.a(wb.a(ArrayList::new, 8), fb.a::new));
   }

   public void a(wb $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static fb a(xw<?> $$0, fb.b $$1) {
      List<fb.a> $$2 = $$0.a().stream().map($$1x -> {
         xq $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new fb.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new fb($$2);
   }

   public List<fb.a> a() {
      return this.b;
   }

   public static record a(String a, xq b) {
      public a(wb $$0) {
         this($$0.d(16), xq.a($$0));
      }

      public void a(wb $$0) {
         $$0.a(this.a, 16);
         xq.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      xq sign(String var1);
   }
}
