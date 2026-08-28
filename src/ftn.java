import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class ftn {
   public static final float a = 200.0F;
   private final List<ftn.a> b = new ArrayList<>();

   public ftn a(ftn.a $$0) {
      this.b.add($$0);
      return this;
   }

   public ftn a(ftn $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(ftk $$0, fqg $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(ftk $$0, fqg $$1) {
      for (ftn.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(ftk var1, fqg var2);
   }
}
