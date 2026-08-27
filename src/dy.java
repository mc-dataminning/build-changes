import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record dy(List<dy.a> b) {
   public static final dy a = new dy(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public dy(ue $$0) {
      this($$0.a(ue.a(ArrayList::new, 8), dy.a::new));
   }

   @Nullable
   public vn a(String $$0) {
      for (dy.a $$1 : this.b) {
         if ($$1.a.equals($$0)) {
            return $$1.b;
         }
      }

      return null;
   }

   public void a(ue $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static dy a(vt<?> $$0, dy.b $$1) {
      List<dy.a> $$2 = $$0.a().stream().map($$1x -> {
         vn $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new dy.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new dy($$2);
   }

   public List<dy.a> a() {
      return this.b;
   }

   public static record a(String a, vn b) {

      public a(ue $$0) {
         this($$0.d(16), vn.a($$0));
      }

      public void a(ue $$0) {
         $$0.a(this.a, 16);
         vn.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      vn sign(String var1);
   }
}
