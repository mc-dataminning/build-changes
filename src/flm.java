import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class flm {
   public static final float a = 200.0F;
   private final List<flm.a> b = new ArrayList<>();

   public flm a(flm.a $$0) {
      this.b.add($$0);
      return this;
   }

   public flm a(flm $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(flj $$0, fjn $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(flj $$0, fjn $$1) {
      for (flm.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(flj var1, fjn var2);
   }
}
