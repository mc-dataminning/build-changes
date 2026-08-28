import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class fog {
   public static final float a = 200.0F;
   private final List<fog.a> b = new ArrayList<>();

   public fog a(fog.a $$0) {
      this.b.add($$0);
      return this;
   }

   public fog a(fog $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(fod $$0, fkz $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(fod $$0, fkz $$1) {
      for (fog.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(fod var1, fkz var2);
   }
}
