import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record ek(List<ek.a> b) {
   public static final ek a = new ek(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public ek(vu $$0) {
      this($$0.a(vu.a(ArrayList::new, 8), ek.a::new));
   }

   @Nullable
   public xg a(String $$0) {
      for (ek.a $$1 : this.b) {
         if ($$1.a.equals($$0)) {
            return $$1.b;
         }
      }

      return null;
   }

   public void a(vu $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static ek a(xm<?> $$0, ek.b $$1) {
      List<ek.a> $$2 = $$0.a().stream().map($$1x -> {
         xg $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new ek.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new ek($$2);
   }

   public List<ek.a> a() {
      return this.b;
   }

   public static record a(String a, xg b) {

      public a(vu $$0) {
         this($$0.d(16), xg.a($$0));
      }

      public void a(vu $$0) {
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
