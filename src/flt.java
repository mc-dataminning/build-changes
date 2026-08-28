import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;

public class flt {
   int a;
   final Map<flt.a, flt.b> b = Maps.newTreeMap(Comparator.<flt.a, flp>comparing($$0 -> $$0.a).thenComparing($$0 -> $$0.b));

   public void a(Consumer<flq> $$0) {
      this.a++;
      $$0.accept(new flt.c(0));
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
      final flp a;
      final int b;

      a(flp $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }

   static class b {
      fls<?> a;
      int b;
      boolean c;

      b() {
         this.a = fls.a;
         this.b = -1;
      }

      public flt.b a(int $$0, fls<?> $$1) {
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

   class c implements flq {
      private final int b;

      c(final int $$0) {
         this.b = $$0;
      }

      @Override
      public void a(flp $$0, fls<?> $$1) {
         flt.this.b.computeIfAbsent(new flt.a($$0, this.b), $$0x -> new flt.b()).a(flt.this.a, $$1);
      }

      @Override
      public flq a() {
         return flt.this.new c(this.b + 1);
      }
   }
}
