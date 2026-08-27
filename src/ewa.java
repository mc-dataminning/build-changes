import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;

public class ewa {
   int a;
   final Map<ewa.a, ewa.b> b = Maps.newTreeMap(Comparator.<ewa.a, evw>comparing($$0 -> $$0.a).thenComparing($$0 -> $$0.b));

   public void a(Consumer<evx> $$0) {
      this.a++;
      $$0.accept(new ewa.c(0));
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
      final evw a;
      final int b;

      a(evw $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }

   static class b {
      evz<?> a;
      int b;
      boolean c;

      b() {
         this.a = evz.a;
         this.b = -1;
      }

      public ewa.b a(int $$0, evz<?> $$1) {
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

   class c implements evx {
      private final int b;

      c(int $$0) {
         this.b = $$0;
      }

      @Override
      public void a(evw $$0, evz<?> $$1) {
         ewa.this.b.computeIfAbsent(new ewa.a($$0, this.b), $$0x -> new ewa.b()).a(ewa.this.a, $$1);
      }

      @Override
      public evx a() {
         return ewa.this.new c(this.b + 1);
      }
   }
}
