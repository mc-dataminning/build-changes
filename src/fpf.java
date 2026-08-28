import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class fpf {
   public static final float a = 200.0F;
   private final List<fpf.a> b = new ArrayList<>();

   public fpf a(fpf.a $$0) {
      this.b.add($$0);
      return this;
   }

   public fpf a(fpf $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(fpc $$0, flw $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(fpc $$0, flw $$1) {
      for (fpf.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(fpc var1, flw var2);
   }
}
