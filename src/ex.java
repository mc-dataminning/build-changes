import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record ex(List<ex.a> b) {
   public static final ex a = new ex(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public ex(vr $$0) {
      this($$0.a(vr.a(ArrayList::new, 8), ex.a::new));
   }

   public void a(vr $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static ex a(xm<?> $$0, ex.b $$1) {
      List<ex.a> $$2 = $$0.a().stream().map($$1x -> {
         xg $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new ex.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new ex($$2);
   }

   public List<ex.a> a() {
      return this.b;
   }

   public static record a(String a, xg b) {
      public a(vr $$0) {
         this($$0.d(16), xg.a($$0));
      }

      public void a(vr $$0) {
         $$0.a(this.a, 16);
         xg.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      xg sign(String var1);
   }
}
