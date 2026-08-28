import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;

public class fss {
   int a;
   final Map<fss.a, fss.b> b = Maps.newTreeMap(Comparator.<fss.a, fso>comparing($$0 -> $$0.a).thenComparing($$0 -> $$0.b));

   public void a(Consumer<fsp> $$0) {
      this.a++;
      $$0.accept(new fss.c(0));
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
      final fso a;
      final int b;

      a(fso $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }

   static class b {
      fsr<?> a;
      int b;
      boolean c;

      b() {
         this.a = fsr.a;
         this.b = -1;
      }

      public fss.b a(int $$0, fsr<?> $$1) {
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

   class c implements fsp {
      private final int b;

      c(final int $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fso $$0, fsr<?> $$1) {
         fss.this.b.computeIfAbsent(new fss.a($$0, this.b), $$0x -> new fss.b()).a(fss.this.a, $$1);
      }

      @Override
      public fsp a() {
         return fss.this.new c(this.b + 1);
      }
   }
}
