import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class fke {
   public static final float a = 200.0F;
   private final List<fke.a> b = new ArrayList<>();

   public fke a(fke.a $$0) {
      this.b.add($$0);
      return this;
   }

   public fke a(fke $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(fkb $$0, fif $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(fkb $$0, fif $$1) {
      for (fke.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(fkb var1, fif var2);
   }
}
