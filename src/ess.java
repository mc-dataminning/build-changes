import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;

public class ess {
   int a;
   final Map<ess.a, ess.b> b = Maps.newTreeMap(Comparator.<ess.a, eso>comparing($$0 -> $$0.a).thenComparing($$0 -> $$0.b));

   public void a(Consumer<esp> $$0) {
      this.a++;
      $$0.accept(new ess.c(0));
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
      final eso a;
      final int b;

      a(eso $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }

   static class b {
      esr<?> a;
      int b;
      boolean c;

      b() {
         this.a = esr.a;
         this.b = -1;
      }

      public ess.b a(int $$0, esr<?> $$1) {
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

   class c implements esp {
      private final int b;

      c(int $$0) {
         this.b = $$0;
      }

      @Override
      public void a(eso $$0, esr<?> $$1) {
         ess.this.b.computeIfAbsent(new ess.a($$0, this.b), $$0x -> new ess.b()).a(ess.this.a, $$1);
      }

      @Override
      public esp a() {
         return ess.this.new c(this.b + 1);
      }
   }
}
