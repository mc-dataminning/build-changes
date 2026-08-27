import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;

public class fdf {
   int a;
   final Map<fdf.a, fdf.b> b = Maps.newTreeMap(Comparator.<fdf.a, fdb>comparing($$0 -> $$0.a).thenComparing($$0 -> $$0.b));

   public void a(Consumer<fdc> $$0) {
      this.a++;
      $$0.accept(new fdf.c(0));
   }

   public String a(boolean $$0) {
      final StringBuilder $$1 = new StringBuilder();
      Consumer<String> $$2 = new Consumer<String>() {
         private boolean c = true;

         public void a(String $$0) {
            if (!this.c) {
               $$1.append(". ");
            }

            this.c = false;
            $$1.append($$0);
         }
      };
      this.b.forEach(($$2x, $$3) -> {
         if ($$3.b == this.a && ($$0 || !$$3.c)) {
            $$3.a.a($$2);
            $$3.c = true;
         }
      });
      return $$1.toString();
   }

   static class a {
      final fdb a;
      final int b;

      a(fdb $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }

   static class b {
      fde<?> a;
      int b;
      boolean c;

      b() {
         this.a = fde.a;
         this.b = -1;
      }

      public fdf.b a(int $$0, fde<?> $$1) {
         if (!this.a.equals($$1)) {
            this.a = $$1;
            this.c = false;
         } else if (this.b + 1 != $$0) {
            this.c = false;
         }

         this.b = $$0;
         return this;
      }
   }

   class c implements fdc {
      private final int b;

      c(int $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fdb $$0, fde<?> $$1) {
         fdf.this.b.computeIfAbsent(new fdf.a($$0, this.b), $$0x -> new fdf.b()).a(fdf.this.a, $$1);
      }

      @Override
      public fdc a() {
         return fdf.this.new c(this.b + 1);
      }
   }
}
