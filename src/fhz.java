import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class fhz {
   public static final float a = 200.0F;
   private final List<fhz.a> b = new ArrayList<>();

   public fhz a(fhz.a $$0) {
      this.b.add($$0);
      return this;
   }

   public fhz a(fhz $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(fhx $$0, fgd $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(fhx $$0, fgd $$1) {
      for (fhz.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(fhx var1, fgd var2);
   }
}
