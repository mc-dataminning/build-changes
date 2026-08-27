import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record ea(List<ea.a> b) {
   public static final ea a = new ea(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public ea(ty $$0) {
      this($$0.a(ty.a(ArrayList::new, 8), ea.a::new));
   }

   @Nullable
   public vh a(String $$0) {
      for (ea.a $$1 : this.b) {
         if ($$1.a.equals($$0)) {
            return $$1.b;
         }
      }

      return null;
   }

   public void a(ty $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static ea a(vn<?> $$0, ea.b $$1) {
      List<ea.a> $$2 = $$0.a().stream().map($$1x -> {
         vh $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new ea.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new ea($$2);
   }

   public List<ea.a> a() {
      return this.b;
   }

   public static record a(String a, vh b) {

      public a(ty $$0) {
         this($$0.d(16), vh.a($$0));
      }

      public void a(ty $$0) {
         $$0.a(this.a, 16);
         vh.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      vh sign(String var1);
   }
}
