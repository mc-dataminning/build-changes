import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;

public class fho {
   int a;
   final Map<fho.a, fho.b> b = Maps.newTreeMap(Comparator.<fho.a, fhk>comparing($$0 -> $$0.a).thenComparing($$0 -> $$0.b));

   public void a(Consumer<fhl> $$0) {
      this.a++;
      $$0.accept(new fho.c(0));
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
      final fhk a;
      final int b;

      a(fhk $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }

   static class b {
      fhn<?> a;
      int b;
      boolean c;

      b() {
         this.a = fhn.a;
         this.b = -1;
      }

      public fho.b a(int $$0, fhn<?> $$1) {
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

   class c implements fhl {
      private final int b;

      c(int $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fhk $$0, fhn<?> $$1) {
         fho.this.b.computeIfAbsent(new fho.a($$0, this.b), $$0x -> new fho.b()).a(fho.this.a, $$1);
      }

      @Override
      public fhl a() {
         return fho.this.new c(this.b + 1);
      }
   }
}
