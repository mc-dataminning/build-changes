import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;

public class eza {
   int a;
   final Map<eza.a, eza.b> b = Maps.newTreeMap(Comparator.<eza.a, eyw>comparing($$0 -> $$0.a).thenComparing($$0 -> $$0.b));

   public void a(Consumer<eyx> $$0) {
      this.a++;
      $$0.accept(new eza.c(0));
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
      final eyw a;
      final int b;

      a(eyw $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }

   static class b {
      eyz<?> a;
      int b;
      boolean c;

      b() {
         this.a = eyz.a;
         this.b = -1;
      }

      public eza.b a(int $$0, eyz<?> $$1) {
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

   class c implements eyx {
      private final int b;

      c(int $$0) {
         this.b = $$0;
      }

      @Override
      public void a(eyw $$0, eyz<?> $$1) {
         eza.this.b.computeIfAbsent(new eza.a($$0, this.b), $$0x -> new eza.b()).a(eza.this.a, $$1);
      }

      @Override
      public eyx a() {
         return eza.this.new c(this.b + 1);
      }
   }
}
