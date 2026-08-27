import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record eo(List<eo.a> b) {
   public static final eo a = new eo(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public eo(we $$0) {
      this($$0.a(we.a(ArrayList::new, 8), eo.a::new));
   }

   @Nullable
   public xq a(String $$0) {
      for (eo.a $$1 : this.b) {
         if ($$1.a.equals($$0)) {
            return $$1.b;
         }
      }

      return null;
   }

   public void a(we $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static eo a(xw<?> $$0, eo.b $$1) {
      List<eo.a> $$2 = $$0.a().stream().map($$1x -> {
         xq $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new eo.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new eo($$2);
   }

   public List<eo.a> a() {
      return this.b;
   }

   public static record a(String a, xq b) {

      public a(we $$0) {
         this($$0.d(16), xq.a($$0));
      }

      public void a(we $$0) {
         $$0.a(this.a, 16);
         xq.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      xq sign(String var1);
   }
}
