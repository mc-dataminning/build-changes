import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class fno {
   public static final float a = 200.0F;
   private final List<fno.a> b = new ArrayList<>();

   public fno a(fno.a $$0) {
      this.b.add($$0);
      return this;
   }

   public fno a(fno $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(fnl $$0, flp $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(fnl $$0, flp $$1) {
      for (fno.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(fnl var1, flp var2);
   }
}
