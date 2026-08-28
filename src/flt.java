import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class flt {
   public static final float a = 200.0F;
   private final List<flt.a> b = new ArrayList<>();

   public flt a(flt.a $$0) {
      this.b.add($$0);
      return this;
   }

   public flt a(flt $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(flq $$0, fju $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(flq $$0, fju $$1) {
      for (flt.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(flq var1, fju var2);
   }
}
