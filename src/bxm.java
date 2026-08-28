import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public interface bxm {
   bxm a = new bxm() {
      @Override
      public void a(bxn $$0) {
      }

      @Override
      public void a(bxn $$0, Consumer<bwt> $$1) {
      }

      @Override
      public void b(bxn $$0, Consumer<bwt> $$1) {
      }
   };

   void a(bxn var1);

   void a(bxn var1, Consumer<bwt> var2);

   void b(bxn var1, Consumer<bwt> var2);

   public static class a implements bxm {
      private static final bxn[] b = bxn.values();
      private static final int c = -1;
      private final Set<bxn> d = EnumSet.noneOf(bxn.class);
      private final Map<bxn, List<Consumer<bwt>>> e = ag.a(bxn.class, $$0 -> new ArrayList<>());
      private final Map<bxn, List<Consumer<bwt>>> f = ag.a(bxn.class, $$0 -> new ArrayList<>());
      private final List<Consumer<bwt>> g = new ArrayList<>();
      private int h = -1;

      public void a(int $$0) {
         if (this.h != $$0) {
            this.h = $$0;
            this.a();
         }
      }

      public void a(bwt $$0) {
         this.a();

         for (Consumer<bwt> $$1 : this.g) {
            if (!$$0.bJ()) {
               break;
            }

            $$1.accept($$0);
         }

         this.g.clear();
         this.h = -1;
      }

      private void a() {
         for (bxn $$0 : b) {
            List<Consumer<bwt>> $$1 = this.e.get($$0);
            this.g.addAll($$1);
            $$1.clear();
            if (this.d.remove($$0)) {
               this.g.add($$0.a());
            }

            List<Consumer<bwt>> $$2 = this.f.get($$0);
            this.g.addAll($$2);
            $$2.clear();
         }
      }

      @Override
      public void a(bxn $$0) {
         this.d.add($$0);
      }

      @Override
      public void a(bxn $$0, Consumer<bwt> $$1) {
         this.e.get($$0).add($$1);
      }

      @Override
      public void b(bxn $$0, Consumer<bwt> $$1) {
         this.f.get($$0).add($$1);
      }
   }
}
