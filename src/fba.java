import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;

public class fba {
   int a;
   final Map<fba.a, fba.b> b = Maps.newTreeMap(Comparator.<fba.a, faw>comparing($$0 -> $$0.a).thenComparing($$0 -> $$0.b));

   public void a(Consumer<fax> $$0) {
      this.a++;
      $$0.accept(new fba.c(0));
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
      final faw a;
      final int b;

      a(faw $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }

   static class b {
      faz<?> a;
      int b;
      boolean c;

      b() {
         this.a = faz.a;
         this.b = -1;
      }

      public fba.b a(int $$0, faz<?> $$1) {
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

   class c implements fax {
      private final int b;

      c(int $$0) {
         this.b = $$0;
      }

      @Override
      public void a(faw $$0, faz<?> $$1) {
         fba.this.b.computeIfAbsent(new fba.a($$0, this.b), $$0x -> new fba.b()).a(fba.this.a, $$1);
      }

      @Override
      public fax a() {
         return fba.this.new c(this.b + 1);
      }
   }
}
