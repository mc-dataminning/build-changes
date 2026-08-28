import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public interface bxb {
   bxb a = new bxb() {
      @Override
      public void a(bxc $$0) {
      }

      @Override
      public void a(bxc $$0, Consumer<bwi> $$1) {
      }

      @Override
      public void b(bxc $$0, Consumer<bwi> $$1) {
      }
   };

   void a(bxc var1);

   void a(bxc var1, Consumer<bwi> var2);

   void b(bxc var1, Consumer<bwi> var2);

   public static class a implements bxb {
      private static final bxc[] b = bxc.values();
      private static final int c = -1;
      private final Set<bxc> d = EnumSet.noneOf(bxc.class);
      private final Map<bxc, List<Consumer<bwi>>> e = ag.a(bxc.class, $$0 -> new ArrayList<>());
      private final Map<bxc, List<Consumer<bwi>>> f = ag.a(bxc.class, $$0 -> new ArrayList<>());
      private final List<Consumer<bwi>> g = new ArrayList<>();
      private int h = -1;

      public void a(int $$0) {
         if (this.h != $$0) {
            this.h = $$0;
            this.a();
         }
      }

      public void a(bwi $$0) {
         this.a();

         for (Consumer<bwi> $$1 : this.g) {
            if (!$$0.bI()) {
               break;
            }

            $$1.accept($$0);
         }

         this.g.clear();
         this.h = -1;
      }

      private void a() {
         for (bxc $$0 : b) {
            List<Consumer<bwi>> $$1 = this.e.get($$0);
            this.g.addAll($$1);
            $$1.clear();
            if (this.d.remove($$0)) {
               this.g.add($$0.a());
            }

            List<Consumer<bwi>> $$2 = this.f.get($$0);
            this.g.addAll($$2);
            $$2.clear();
         }
      }

      @Override
      public void a(bxc $$0) {
         this.d.add($$0);
      }

      @Override
      public void a(bxc $$0, Consumer<bwi> $$1) {
         this.e.get($$0).add($$1);
      }

      @Override
      public void b(bxc $$0, Consumer<bwi> $$1) {
         this.f.get($$0).add($$1);
      }
   }
}
