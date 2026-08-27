import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record eb(List<eb.a> b) {
   public static final eb a = new eb(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public eb(vg $$0) {
      this($$0.a(vg.a(ArrayList::new, 8), eb.a::new));
   }

   @Nullable
   public ws a(String $$0) {
      for (eb.a $$1 : this.b) {
         if ($$1.a.equals($$0)) {
            return $$1.b;
         }
      }

      return null;
   }

   public void a(vg $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static eb a(wy<?> $$0, eb.b $$1) {
      List<eb.a> $$2 = $$0.a().stream().map($$1x -> {
         ws $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new eb.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new eb($$2);
   }

   public List<eb.a> a() {
      return this.b;
   }

   public static record a(String a, ws b) {

      public a(vg $$0) {
         this($$0.d(16), ws.a($$0));
      }

      public void a(vg $$0) {
         $$0.a(this.a, 16);
         ws.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      ws sign(String var1);
   }
}
