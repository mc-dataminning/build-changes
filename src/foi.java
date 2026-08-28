import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class foi {
   public static final float a = 200.0F;
   private final List<foi.a> b = new ArrayList<>();

   public foi a(foi.a $$0) {
      this.b.add($$0);
      return this;
   }

   public foi a(foi $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(fof $$0, fla $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(fof $$0, fla $$1) {
      for (foi.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(fof var1, fla var2);
   }
}
