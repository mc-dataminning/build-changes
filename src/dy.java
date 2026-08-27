import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record dy(List<dy.a> b) {
   public static final dy a = new dy(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public dy(so $$0) {
      this($$0.a(so.a(ArrayList::new, 8), dy.a::new));
   }

   @Nullable
   public tx a(String $$0) {
      for (dy.a $$1 : this.b) {
         if ($$1.a.equals($$0)) {
            return $$1.b;
         }
      }

      return null;
   }

   public void a(so $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static dy a(ud<?> $$0, dy.b $$1) {
      List<dy.a> $$2 = $$0.a().stream().map($$1x -> {
         tx $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new dy.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new dy($$2);
   }

   public List<dy.a> a() {
      return this.b;
   }

   public static record a(String a, tx b) {

      public a(so $$0) {
         this($$0.d(16), tx.a($$0));
      }

      public void a(so $$0) {
         $$0.a(this.a, 16);
         tx.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      tx sign(String var1);
   }
}
