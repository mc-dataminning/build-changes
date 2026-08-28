import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;

public class foa {
   int a;
   final Map<foa.a, foa.b> b = Maps.newTreeMap(Comparator.<foa.a, fnw>comparing($$0 -> $$0.a).thenComparing($$0 -> $$0.b));

   public void a(Consumer<fnx> $$0) {
      this.a++;
      $$0.accept(new foa.c(0));
   }

   public String a(boolean $$0) {
      final StringBuilder $$1 = new StringBuilder();
      Consumer<String> $$2 = new Consumer<String>() {
         private boolean b = true;

         public void a(String $$0) {
            if (!this.b) {
               $$1.append(". ");
            }

            this.b = false;
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
      final fnw a;
      final int b;

      a(fnw $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }

   static class b {
      fnz<?> a;
      int b;
      boolean c;

      b() {
         this.a = fnz.a;
         this.b = -1;
      }

      public foa.b a(int $$0, fnz<?> $$1) {
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

   class c implements fnx {
      private final int b;

      c(final int $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fnw $$0, fnz<?> $$1) {
         foa.this.b.computeIfAbsent(new foa.a($$0, this.b), $$0x -> new foa.b()).a(foa.this.a, $$1);
      }

      @Override
      public fnx a() {
         return foa.this.new c(this.b + 1);
      }
   }
}
