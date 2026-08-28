import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class fnv {
   public static final float a = 200.0F;
   private final List<fnv.a> b = new ArrayList<>();

   public fnv a(fnv.a $$0) {
      this.b.add($$0);
      return this;
   }

   public fnv a(fnv $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(fns $$0, flw $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(fns $$0, flw $$1) {
      for (fnv.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(fns var1, flw var2);
   }
}
