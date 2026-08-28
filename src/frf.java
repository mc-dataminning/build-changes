import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class frf {
   public static final float a = 200.0F;
   private final List<frf.a> b = new ArrayList<>();

   public frf a(frf.a $$0) {
      this.b.add($$0);
      return this;
   }

   public frf a(frf $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(frc $$0, fnv $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(frc $$0, fnv $$1) {
      for (frf.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(frc var1, fnv var2);
   }
}
