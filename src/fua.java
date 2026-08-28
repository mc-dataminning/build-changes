import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class fua {
   public static final float a = 200.0F;
   private final List<fua.a> b = new ArrayList<>();

   public fua a(fua.a $$0) {
      this.b.add($$0);
      return this;
   }

   public fua a(fua $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(ftx $$0, fqt $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(ftx $$0, fqt $$1) {
      for (fua.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(ftx var1, fqt var2);
   }
}
