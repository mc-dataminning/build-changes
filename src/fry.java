import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class fry {
   public static final float a = 200.0F;
   private final List<fry.a> b = new ArrayList<>();

   public fry a(fry.a $$0) {
      this.b.add($$0);
      return this;
   }

   public fry a(fry $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(frv $$0, foo $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(frv $$0, foo $$1) {
      for (fry.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(frv var1, foo var2);
   }
}
