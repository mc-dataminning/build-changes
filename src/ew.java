import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record ew(List<ew.a> b) {
   public static final ew a = new ew(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public ew(wl $$0) {
      this($$0.a(wl.a(ArrayList::new, 8), ew.a::new));
   }

   public void a(wl $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static ew a(yg<?> $$0, ew.b $$1) {
      List<ew.a> $$2 = $$0.a().stream().map($$1x -> {
         ya $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new ew.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new ew($$2);
   }

   public List<ew.a> a() {
      return this.b;
   }

   public static record a(String a, ya b) {
      public a(wl $$0) {
         this($$0.d(16), ya.a($$0));
      }

      public void a(wl $$0) {
         $$0.a(this.a, 16);
         ya.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      ya sign(String var1);
   }
}
