import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;

public class ftq {
   int a;
   final Map<ftq.a, ftq.b> b = Maps.newTreeMap(Comparator.<ftq.a, ftm>comparing($$0 -> $$0.a).thenComparing($$0 -> $$0.b));

   public void a(Consumer<ftn> $$0) {
      this.a++;
      $$0.accept(new ftq.c(0));
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
      final ftm a;
      final int b;

      a(ftm $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }

   static class b {
      ftp<?> a;
      int b;
      boolean c;

      b() {
         this.a = ftp.a;
         this.b = -1;
      }

      public ftq.b a(int $$0, ftp<?> $$1) {
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

   class c implements ftn {
      private final int b;

      c(final int $$0) {
         this.b = $$0;
      }

      @Override
      public void a(ftm $$0, ftp<?> $$1) {
         ftq.this.b.computeIfAbsent(new ftq.a($$0, this.b), $$0x -> new ftq.b()).a(ftq.this.a, $$1);
      }

      @Override
      public ftn a() {
         return ftq.this.new c(this.b + 1);
      }
   }
}
