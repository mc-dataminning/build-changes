import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public interface bxx {
   bxx a = new bxx() {
      @Override
      public void a(bxy $$0) {
      }

      @Override
      public void a(bxy $$0, Consumer<bxe> $$1) {
      }

      @Override
      public void b(bxy $$0, Consumer<bxe> $$1) {
      }
   };

   void a(bxy var1);

   void a(bxy var1, Consumer<bxe> var2);

   void b(bxy var1, Consumer<bxe> var2);

   public static class a implements bxx {
      private static final bxy[] b = bxy.values();
      private static final int c = -1;
      private final Set<bxy> d = EnumSet.noneOf(bxy.class);
      private final Map<bxy, List<Consumer<bxe>>> e = ag.a(bxy.class, $$0 -> new ArrayList<>());
      private final Map<bxy, List<Consumer<bxe>>> f = ag.a(bxy.class, $$0 -> new ArrayList<>());
      private final List<Consumer<bxe>> g = new ArrayList<>();
      private int h = -1;

      public void a(int $$0) {
         if (this.h != $$0) {
            this.h = $$0;
            this.a();
         }
      }

      public void a(bxe $$0) {
         this.a();

         for (Consumer<bxe> $$1 : this.g) {
            if (!$$0.bJ()) {
               break;
            }

            $$1.accept($$0);
         }

         this.g.clear();
         this.h = -1;
      }

      private void a() {
         for (bxy $$0 : b) {
            List<Consumer<bxe>> $$1 = this.e.get($$0);
            this.g.addAll($$1);
            $$1.clear();
            if (this.d.remove($$0)) {
               this.g.add($$0.a());
            }

            List<Consumer<bxe>> $$2 = this.f.get($$0);
            this.g.addAll($$2);
            $$2.clear();
         }
      }

      @Override
      public void a(bxy $$0) {
         this.d.add($$0);
      }

      @Override
      public void a(bxy $$0, Consumer<bxe> $$1) {
         this.e.get($$0).add($$1);
      }

      @Override
      public void b(bxy $$0, Consumer<bxe> $$1) {
         this.f.get($$0).add($$1);
      }
   }
}
