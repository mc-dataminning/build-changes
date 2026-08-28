import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;

public class fst {
   int a;
   final Map<fst.a, fst.b> b = Maps.newTreeMap(Comparator.<fst.a, fsp>comparing($$0 -> $$0.a).thenComparing($$0 -> $$0.b));

   public void a(Consumer<fsq> $$0) {
      this.a++;
      $$0.accept(new fst.c(0));
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
      final fsp a;
      final int b;

      a(fsp $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }

   static class b {
      fss<?> a;
      int b;
      boolean c;

      b() {
         this.a = fss.a;
         this.b = -1;
      }

      public fst.b a(int $$0, fss<?> $$1) {
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

   class c implements fsq {
      private final int b;

      c(final int $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fsp $$0, fss<?> $$1) {
         fst.this.b.computeIfAbsent(new fst.a($$0, this.b), $$0x -> new fst.b()).a(fst.this.a, $$1);
      }

      @Override
      public fsq a() {
         return fst.this.new c(this.b + 1);
      }
   }
}
