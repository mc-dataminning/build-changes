import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record dz(List<dz.a> b) {
   public static final dz a = new dz(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public dz(ug $$0) {
      this($$0.a(ug.a(ArrayList::new, 8), dz.a::new));
   }

   @Nullable
   public vp a(String $$0) {
      for (dz.a $$1 : this.b) {
         if ($$1.a.equals($$0)) {
            return $$1.b;
         }
      }

      return null;
   }

   public void a(ug $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static dz a(vv<?> $$0, dz.b $$1) {
      List<dz.a> $$2 = $$0.a().stream().map($$1x -> {
         vp $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new dz.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new dz($$2);
   }

   public List<dz.a> a() {
      return this.b;
   }

   public static record a(String a, vp b) {

      public a(ug $$0) {
         this($$0.d(16), vp.a($$0));
      }

      public void a(ug $$0) {
         $$0.a(this.a, 16);
         vp.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      vp sign(String var1);
   }
}
