import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dao {
   public static final dao a = new dao(List.of(), List.of());
   private final List<cor.a<jq<cvx>>> b;
   private final List<Optional<dao.a>> c;

   private dao(List<cor.a<jq<cvx>>> $$0, List<Optional<dao.a>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private static cor.a<jq<cvx>> c(List<cwb> $$0) {
      return cos.a($$0.stream().map(cwb::i));
   }

   private static List<cwb> b(dal $$0) {
      return $$0.a().stream().map(cwb::new).toList();
   }

   public static dao a(dal $$0) {
      List<cwb> $$1 = b($$0);
      if ($$1.isEmpty()) {
         return a;
      } else {
         cor.a<jq<cvx>> $$2 = c($$1);
         dao.a $$3 = new dao.a($$1, 0);
         return new dao(List.of($$2), List.of(Optional.of($$3)));
      }
   }

   public static dao a(List<Optional<dal>> $$0) {
      int $$1 = $$0.size();
      List<cor.a<jq<cvx>>> $$2 = new ArrayList<>($$1);
      List<Optional<dao.a>> $$3 = new ArrayList<>($$1);
      int $$4 = 0;

      for (Optional<dal> $$5 : $$0) {
         if ($$5.isPresent()) {
            List<cwb> $$6 = b($$5.get());
            if ($$6.isEmpty()) {
               return a;
            }

            $$2.add(c($$6));
            $$3.add(Optional.of(new dao.a($$6, $$4++)));
         } else {
            $$3.add(Optional.empty());
         }
      }

      return new dao($$2, $$3);
   }

   public static dao b(List<dal> $$0) {
      int $$1 = $$0.size();
      List<cor.a<jq<cvx>>> $$2 = new ArrayList<>($$1);
      List<Optional<dao.a>> $$3 = new ArrayList<>($$1);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         dal $$5 = $$0.get($$4);
         List<cwb> $$6 = b($$5);
         if ($$6.isEmpty()) {
            return a;
         }

         $$2.add(c($$6));
         $$3.add(Optional.of(new dao.a($$6, $$4)));
      }

      return new dao($$2, $$3);
   }

   public List<Optional<dao.a>> a() {
      return this.c;
   }

   public List<cor.a<jq<cvx>>> b() {
      return this.b;
   }

   public boolean c() {
      return this.c.isEmpty();
   }

   public static record a(List<cwb> a, int b) {
      public a(List<cwb> a, int b) {
         if (a.isEmpty()) {
            throw new IllegalArgumentException("Possible items list must be not empty");
         } else {
            this.a = a;
            this.b = b;
         }
      }
   }
}
