import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class fuc {
   public static final float a = 200.0F;
   private final List<fuc.a> b = new ArrayList<>();

   public fuc a(fuc.a $$0) {
      this.b.add($$0);
      return this;
   }

   public fuc a(fuc $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(ftz $$0, fqv $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(ftz $$0, fqv $$1) {
      for (fuc.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(ftz var1, fqv var2);
   }
}
