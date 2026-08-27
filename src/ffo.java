import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class ffo {
   public static final float a = 200.0F;
   private final List<ffo.a> b = new ArrayList<>();

   public ffo a(ffo.a $$0) {
      this.b.add($$0);
      return this;
   }

   public ffo a(ffo $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(ffm $$0, float $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(ffm $$0, float $$1) {
      for (ffo.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(ffm var1, float var2);
   }
}
