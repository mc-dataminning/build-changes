import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class fnt {
   public static final float a = 200.0F;
   private final List<fnt.a> b = new ArrayList<>();

   public fnt a(fnt.a $$0) {
      this.b.add($$0);
      return this;
   }

   public fnt a(fnt $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(fnq $$0, flu $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(fnq $$0, flu $$1) {
      for (fnt.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(fnq var1, flu var2);
   }
}
