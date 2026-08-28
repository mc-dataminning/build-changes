import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class foe {
   public static final float a = 200.0F;
   private final List<foe.a> b = new ArrayList<>();

   public foe a(foe.a $$0) {
      this.b.add($$0);
      return this;
   }

   public foe a(foe $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(fob $$0, fkx $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(fob $$0, fkx $$1) {
      for (foe.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(fob var1, fkx var2);
   }
}
