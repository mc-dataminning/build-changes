import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class fkx {
   public static final float a = 200.0F;
   private final List<fkx.a> b = new ArrayList<>();

   public fkx a(fkx.a $$0) {
      this.b.add($$0);
      return this;
   }

   public fkx a(fkx $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(fku $$0, fiy $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(fku $$0, fiy $$1) {
      for (fkx.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(fku var1, fiy var2);
   }
}
