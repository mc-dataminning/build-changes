import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class fej {
   public static final float a = 200.0F;
   private final List<fej.a> b = new ArrayList<>();

   public fej a(fej.a $$0) {
      this.b.add($$0);
      return this;
   }

   public fej a(fej $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(feh $$0, float $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(feh $$0, float $$1) {
      for (fej.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(feh var1, float var2);
   }
}
