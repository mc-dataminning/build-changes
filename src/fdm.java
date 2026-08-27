import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;

public class fdm {
   int a;
   final Map<fdm.a, fdm.b> b = Maps.newTreeMap(Comparator.<fdm.a, fdi>comparing($$0 -> $$0.a).thenComparing($$0 -> $$0.b));

   public void a(Consumer<fdj> $$0) {
      this.a++;
      $$0.accept(new fdm.c(0));
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
      final fdi a;
      final int b;

      a(fdi $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }

   static class b {
      fdl<?> a;
      int b;
      boolean c;

      b() {
         this.a = fdl.a;
         this.b = -1;
      }

      public fdm.b a(int $$0, fdl<?> $$1) {
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

   class c implements fdj {
      private final int b;

      c(int $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fdi $$0, fdl<?> $$1) {
         fdm.this.b.computeIfAbsent(new fdm.a($$0, this.b), $$0x -> new fdm.b()).a(fdm.this.a, $$1);
      }

      @Override
      public fdj a() {
         return fdm.this.new c(this.b + 1);
      }
   }
}
