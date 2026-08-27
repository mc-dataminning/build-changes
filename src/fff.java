import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;

public class fff {
   int a;
   final Map<fff.a, fff.b> b = Maps.newTreeMap(Comparator.<fff.a, ffb>comparing($$0 -> $$0.a).thenComparing($$0 -> $$0.b));

   public void a(Consumer<ffc> $$0) {
      this.a++;
      $$0.accept(new fff.c(0));
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
      final ffb a;
      final int b;

      a(ffb $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }

   static class b {
      ffe<?> a;
      int b;
      boolean c;

      b() {
         this.a = ffe.a;
         this.b = -1;
      }

      public fff.b a(int $$0, ffe<?> $$1) {
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

   class c implements ffc {
      private final int b;

      c(int $$0) {
         this.b = $$0;
      }

      @Override
      public void a(ffb $$0, ffe<?> $$1) {
         fff.this.b.computeIfAbsent(new fff.a($$0, this.b), $$0x -> new fff.b()).a(fff.this.a, $$1);
      }

      @Override
      public ffc a() {
         return fff.this.new c(this.b + 1);
      }
   }
}
