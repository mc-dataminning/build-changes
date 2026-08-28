import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record eq(List<eq.a> b) {
   public static final eq a = new eq(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public eq(vw $$0) {
      this($$0.a(vw.a(ArrayList::new, 8), eq.a::new));
   }

   public void a(vw $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static eq a(xs<?> $$0, eq.b $$1) {
      List<eq.a> $$2 = $$0.a().stream().map($$1x -> {
         xm $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new eq.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new eq($$2);
   }

   public List<eq.a> a() {
      return this.b;
   }

   public static record a(String a, xm b) {
      public a(vw $$0) {
         this($$0.d(16), xm.a($$0));
      }

      public void a(vw $$0) {
         $$0.a(this.a, 16);
         xm.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      xm sign(String var1);
   }
}
