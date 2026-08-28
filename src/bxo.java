import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public interface bxo {
   bxo a = new bxo() {
      @Override
      public void a(bxp $$0) {
      }

      @Override
      public void a(bxp $$0, Consumer<bwv> $$1) {
      }

      @Override
      public void b(bxp $$0, Consumer<bwv> $$1) {
      }
   };

   void a(bxp var1);

   void a(bxp var1, Consumer<bwv> var2);

   void b(bxp var1, Consumer<bwv> var2);

   public static class a implements bxo {
      private static final bxp[] b = bxp.values();
      private static final int c = -1;
      private final Set<bxp> d = EnumSet.noneOf(bxp.class);
      private final Map<bxp, List<Consumer<bwv>>> e = ag.a(bxp.class, $$0 -> new ArrayList<>());
      private final Map<bxp, List<Consumer<bwv>>> f = ag.a(bxp.class, $$0 -> new ArrayList<>());
      private final List<Consumer<bwv>> g = new ArrayList<>();
      private int h = -1;

      public void a(int $$0) {
         if (this.h != $$0) {
            this.h = $$0;
            this.a();
         }
      }

      public void a(bwv $$0) {
         this.a();

         for (Consumer<bwv> $$1 : this.g) {
            if (!$$0.bJ()) {
               break;
            }

            $$1.accept($$0);
         }

         this.g.clear();
         this.h = -1;
      }

      private void a() {
         for (bxp $$0 : b) {
            List<Consumer<bwv>> $$1 = this.e.get($$0);
            this.g.addAll($$1);
            $$1.clear();
            if (this.d.remove($$0)) {
               this.g.add($$0.a());
            }

            List<Consumer<bwv>> $$2 = this.f.get($$0);
            this.g.addAll($$2);
            $$2.clear();
         }
      }

      @Override
      public void a(bxp $$0) {
         this.d.add($$0);
      }

      @Override
      public void a(bxp $$0, Consumer<bwv> $$1) {
         this.e.get($$0).add($$1);
      }

      @Override
      public void b(bxp $$0, Consumer<bwv> $$1) {
         this.f.get($$0).add($$1);
      }
   }
}
