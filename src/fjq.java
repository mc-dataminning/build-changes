import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class fjq {
   public static final float a = 200.0F;
   private final List<fjq.a> b = new ArrayList<>();

   public fjq a(fjq.a $$0) {
      this.b.add($$0);
      return this;
   }

   public fjq a(fjq $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(fjn $$0, fhr $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(fjn $$0, fhr $$1) {
      for (fjq.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(fjn var1, fhr var2);
   }
}
