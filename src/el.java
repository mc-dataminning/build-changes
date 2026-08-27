import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record el(List<el.a> b) {
   public static final el a = new el(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public el(vx $$0) {
      this($$0.a(vx.a(ArrayList::new, 8), el.a::new));
   }

   public void a(vx $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static el a(xp<?> $$0, el.b $$1) {
      List<el.a> $$2 = $$0.a().stream().map($$1x -> {
         xj $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new el.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new el($$2);
   }

   public List<el.a> a() {
      return this.b;
   }

   public static record a(String a, xj b) {
      public a(vx $$0) {
         this($$0.d(16), xj.a($$0));
      }

      public void a(vx $$0) {
         $$0.a(this.a, 16);
         xj.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      xj sign(String var1);
   }
}
