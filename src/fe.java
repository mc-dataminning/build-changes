import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record fe(List<fe.a> b) {
   public static final fe a = new fe(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public fe(vl $$0) {
      this($$0.a(vl.a(ArrayList::new, 8), fe.a::new));
   }

   public void a(vl $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static fe a(xh<?> $$0, fe.b $$1) {
      List<fe.a> $$2 = $$0.a().stream().map($$1x -> {
         xb $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new fe.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new fe($$2);
   }

   public List<fe.a> a() {
      return this.b;
   }

   public static record a(String a, xb b) {
      public a(vl $$0) {
         this($$0.d(16), xb.a($$0));
      }

      public void a(vl $$0) {
         $$0.a(this.a, 16);
         xb.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      xb sign(String var1);
   }
}
