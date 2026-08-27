import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record ec(List<ec.a> b) {
   public static final ec a = new ec(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public ec(vi $$0) {
      this($$0.a(vi.a(ArrayList::new, 8), ec.a::new));
   }

   @Nullable
   public wu a(String $$0) {
      for (ec.a $$1 : this.b) {
         if ($$1.a.equals($$0)) {
            return $$1.b;
         }
      }

      return null;
   }

   public void a(vi $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static ec a(xa<?> $$0, ec.b $$1) {
      List<ec.a> $$2 = $$0.a().stream().map($$1x -> {
         wu $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new ec.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new ec($$2);
   }

   public List<ec.a> a() {
      return this.b;
   }

   public static record a(String a, wu b) {

      public a(vi $$0) {
         this($$0.d(16), wu.a($$0));
      }

      public void a(vi $$0) {
         $$0.a(this.a, 16);
         wu.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      wu sign(String var1);
   }
}
