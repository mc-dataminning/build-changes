import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class fgv {
   public static final float a = 200.0F;
   private final List<fgv.a> b = new ArrayList<>();

   public fgv a(fgv.a $$0) {
      this.b.add($$0);
      return this;
   }

   public fgv a(fgv $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(fgt $$0, float $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(fgt $$0, float $$1) {
      for (fgv.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(fgt var1, float var2);
   }
}
