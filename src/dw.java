import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record dw(List<dw.a> b) {
   public static final dw a = new dw(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public dw(si $$0) {
      this($$0.a(si.a(ArrayList::new, 8), dw.a::new));
   }

   @Nullable
   public tq a(String $$0) {
      for (dw.a $$1 : this.b) {
         if ($$1.a.equals($$0)) {
            return $$1.b;
         }
      }

      return null;
   }

   public void a(si $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static dw a(tw<?> $$0, dw.b $$1) {
      List<dw.a> $$2 = $$0.a().stream().map($$1x -> {
         tq $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new dw.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new dw($$2);
   }

   public List<dw.a> a() {
      return this.b;
   }

   public static record a(String a, tq b) {

      public a(si $$0) {
         this($$0.d(16), tq.a($$0));
      }

      public void a(si $$0) {
         $$0.a(this.a, 16);
         tq.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      tq sign(String var1);
   }
}
