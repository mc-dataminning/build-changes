import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record fd(List<fd.a> b) {
   public static final fd a = new fd(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public fd(wg $$0) {
      this($$0.a(wg.a(ArrayList::new, 8), fd.a::new));
   }

   public void a(wg $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static fd a(yb<?> $$0, fd.b $$1) {
      List<fd.a> $$2 = $$0.a().stream().map($$1x -> {
         xv $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new fd.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new fd($$2);
   }

   public List<fd.a> a() {
      return this.b;
   }

   public static record a(String a, xv b) {
      public a(wg $$0) {
         this($$0.d(16), xv.a($$0));
      }

      public void a(wg $$0) {
         $$0.a(this.a, 16);
         xv.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      xv sign(String var1);
   }
}
