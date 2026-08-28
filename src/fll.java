import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;

public class fll {
   int a;
   final Map<fll.a, fll.b> b = Maps.newTreeMap(Comparator.<fll.a, flh>comparing($$0 -> $$0.a).thenComparing($$0 -> $$0.b));

   public void a(Consumer<fli> $$0) {
      this.a++;
      $$0.accept(new fll.c(0));
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
      final flh a;
      final int b;

      a(flh $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }

   static class b {
      flk<?> a;
      int b;
      boolean c;

      b() {
         this.a = flk.a;
         this.b = -1;
      }

      public fll.b a(int $$0, flk<?> $$1) {
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

   class c implements fli {
      private final int b;

      c(final int $$0) {
         this.b = $$0;
      }

      @Override
      public void a(flh $$0, flk<?> $$1) {
         fll.this.b.computeIfAbsent(new fll.a($$0, this.b), $$0x -> new fll.b()).a(fll.this.a, $$1);
      }

      @Override
      public fli a() {
         return fll.this.new c(this.b + 1);
      }
   }
}
