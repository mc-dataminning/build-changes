import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record dx(List<dx.a> b) {
   public static final dx a = new dx(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public dx(sh $$0) {
      this($$0.a(sh.a(ArrayList::new, 8), dx.a::new));
   }

   @Nullable
   public tp a(String $$0) {
      for (dx.a $$1 : this.b) {
         if ($$1.a.equals($$0)) {
            return $$1.b;
         }
      }

      return null;
   }

   public void a(sh $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static dx a(tv<?> $$0, dx.b $$1) {
      List<dx.a> $$2 = $$0.a().stream().map($$1x -> {
         tp $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new dx.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new dx($$2);
   }

   public List<dx.a> a() {
      return this.b;
   }

   public static record a(String a, tp b) {

      public a(sh $$0) {
         this($$0.d(16), tp.a($$0));
      }

      public void a(sh $$0) {
         $$0.a(this.a, 16);
         tp.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      tp sign(String var1);
   }
}
