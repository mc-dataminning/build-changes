import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dag {
   public static final dag a = new dag(List.of(), List.of());
   private final List<cny.a<jn<cvk>>> b;
   private final List<Optional<dag.a>> c;

   private dag(List<cny.a<jn<cvk>>> $$0, List<Optional<dag.a>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private static cny.a<jn<cvk>> c(List<cvp> $$0) {
      return cnz.a($$0.stream().map(cvp::i));
   }

   private static List<cvp> b(dad $$0) {
      return $$0.a().stream().map(cvp::new).toList();
   }

   public static dag a(dad $$0) {
      List<cvp> $$1 = b($$0);
      if ($$1.isEmpty()) {
         return a;
      } else {
         cny.a<jn<cvk>> $$2 = c($$1);
         dag.a $$3 = new dag.a($$1, 0);
         return new dag(List.of($$2), List.of(Optional.of($$3)));
      }
   }

   public static dag a(List<Optional<dad>> $$0) {
      int $$1 = $$0.size();
      List<cny.a<jn<cvk>>> $$2 = new ArrayList<>($$1);
      List<Optional<dag.a>> $$3 = new ArrayList<>($$1);
      int $$4 = 0;

      for (Optional<dad> $$5 : $$0) {
         if ($$5.isPresent()) {
            List<cvp> $$6 = b($$5.get());
            if ($$6.isEmpty()) {
               return a;
            }

            $$2.add(c($$6));
            $$3.add(Optional.of(new dag.a($$6, $$4++)));
         } else {
            $$3.add(Optional.empty());
         }
      }

      return new dag($$2, $$3);
   }

   public static dag b(List<dad> $$0) {
      int $$1 = $$0.size();
      List<cny.a<jn<cvk>>> $$2 = new ArrayList<>($$1);
      List<Optional<dag.a>> $$3 = new ArrayList<>($$1);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         dad $$5 = $$0.get($$4);
         List<cvp> $$6 = b($$5);
         if ($$6.isEmpty()) {
            return a;
         }

         $$2.add(c($$6));
         $$3.add(Optional.of(new dag.a($$6, $$4)));
      }

      return new dag($$2, $$3);
   }

   public List<Optional<dag.a>> a() {
      return this.c;
   }

   public List<cny.a<jn<cvk>>> b() {
      return this.b;
   }

   public boolean c() {
      return this.c.isEmpty();
   }

   public static record a(List<cvp> a, int b) {
      public a(List<cvp> a, int b) {
         if (a.isEmpty()) {
            throw new IllegalArgumentException("Possible items list must be not empty");
         } else {
            this.a = a;
            this.b = b;
         }
      }
   }
}
