import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class fde {
   public static final float a = 200.0F;
   private final List<fde.a> b = new ArrayList<>();

   public fde a(fde.a $$0) {
      this.b.add($$0);
      return this;
   }

   public fde a(fde $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(fdc $$0, float $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(fdc $$0, float $$1) {
      for (fde.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(fdc var1, float var2);
   }
}
