import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class fkp {
   public static final float a = 200.0F;
   private final List<fkp.a> b = new ArrayList<>();

   public fkp a(fkp.a $$0) {
      this.b.add($$0);
      return this;
   }

   public fkp a(fkp $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(fkm $$0, fiq $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(fkm $$0, fiq $$1) {
      for (fkp.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(fkm var1, fiq var2);
   }
}
