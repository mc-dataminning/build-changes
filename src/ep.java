import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record ep(List<ep.a> b) {
   public static final ep a = new ep(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public ep(vs $$0) {
      this($$0.a(vs.a(ArrayList::new, 8), ep.a::new));
   }

   public void a(vs $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static ep a(xo<?> $$0, ep.b $$1) {
      List<ep.a> $$2 = $$0.a().stream().map($$1x -> {
         xi $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new ep.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new ep($$2);
   }

   public List<ep.a> a() {
      return this.b;
   }

   public static record a(String a, xi b) {
      public a(vs $$0) {
         this($$0.d(16), xi.a($$0));
      }

      public void a(vs $$0) {
         $$0.a(this.a, 16);
         xi.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      xi sign(String var1);
   }
}
