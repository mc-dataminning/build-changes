import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class ezd {
   public static final float a = 200.0F;
   private final List<ezd.a> b = new ArrayList<>();

   public ezd a(ezd.a $$0) {
      this.b.add($$0);
      return this;
   }

   public ezd a(ezd $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(ezb $$0, float $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(ezb $$0, float $$1) {
      for (ezd.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(ezb var1, float var2);
   }
}
