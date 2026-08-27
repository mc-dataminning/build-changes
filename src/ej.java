import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record ej(List<ej.a> b) {
   public static final ej a = new ej(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public ej(vs $$0) {
      this($$0.a(vs.a(ArrayList::new, 8), ej.a::new));
   }

   @Nullable
   public xe a(String $$0) {
      for (ej.a $$1 : this.b) {
         if ($$1.a.equals($$0)) {
            return $$1.b;
         }
      }

      return null;
   }

   public void a(vs $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static ej a(xk<?> $$0, ej.b $$1) {
      List<ej.a> $$2 = $$0.a().stream().map($$1x -> {
         xe $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new ej.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new ej($$2);
   }

   public List<ej.a> a() {
      return this.b;
   }

   public static record a(String a, xe b) {

      public a(vs $$0) {
         this($$0.d(16), xe.a($$0));
      }

      public void a(vs $$0) {
         $$0.a(this.a, 16);
         xe.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      xe sign(String var1);
   }
}
