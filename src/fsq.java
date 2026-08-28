import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;

public class fsq {
   int a;
   final Map<fsq.a, fsq.b> b = Maps.newTreeMap(Comparator.<fsq.a, fsm>comparing($$0 -> $$0.a).thenComparing($$0 -> $$0.b));

   public void a(Consumer<fsn> $$0) {
      this.a++;
      $$0.accept(new fsq.c(0));
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
      final fsm a;
      final int b;

      a(fsm $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }

   static class b {
      fsp<?> a;
      int b;
      boolean c;

      b() {
         this.a = fsp.a;
         this.b = -1;
      }

      public fsq.b a(int $$0, fsp<?> $$1) {
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

   class c implements fsn {
      private final int b;

      c(final int $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fsm $$0, fsp<?> $$1) {
         fsq.this.b.computeIfAbsent(new fsq.a($$0, this.b), $$0x -> new fsq.b()).a(fsq.this.a, $$1);
      }

      @Override
      public fsn a() {
         return fsq.this.new c(this.b + 1);
      }
   }
}
