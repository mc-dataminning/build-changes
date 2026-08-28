import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class frr {
   public static final float a = 200.0F;
   private final List<frr.a> b = new ArrayList<>();

   public frr a(frr.a $$0) {
      this.b.add($$0);
      return this;
   }

   public frr a(frr $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(fro $$0, foh $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(fro $$0, foh $$1) {
      for (frr.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(fro var1, foh var2);
   }
}
