import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class daz {
   public static final daz a = new daz(List.of(), List.of());
   private final List<coy.a<jq<cwi>>> b;
   private final List<Optional<daz.a>> c;

   private daz(List<coy.a<jq<cwi>>> $$0, List<Optional<daz.a>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private static coy.a<jq<cwi>> c(List<cwm> $$0) {
      return coz.a($$0.stream().map(cwm::i));
   }

   private static List<cwm> b(daw $$0) {
      return $$0.a().stream().map(cwm::new).toList();
   }

   public static daz a(daw $$0) {
      List<cwm> $$1 = b($$0);
      if ($$1.isEmpty()) {
         return a;
      } else {
         coy.a<jq<cwi>> $$2 = c($$1);
         daz.a $$3 = new daz.a($$1, 0);
         return new daz(List.of($$2), List.of(Optional.of($$3)));
      }
   }

   public static daz a(List<Optional<daw>> $$0) {
      int $$1 = $$0.size();
      List<coy.a<jq<cwi>>> $$2 = new ArrayList<>($$1);
      List<Optional<daz.a>> $$3 = new ArrayList<>($$1);
      int $$4 = 0;

      for (Optional<daw> $$5 : $$0) {
         if ($$5.isPresent()) {
            List<cwm> $$6 = b($$5.get());
            if ($$6.isEmpty()) {
               return a;
            }

            $$2.add(c($$6));
            $$3.add(Optional.of(new daz.a($$6, $$4++)));
         } else {
            $$3.add(Optional.empty());
         }
      }

      return new daz($$2, $$3);
   }

   public static daz b(List<daw> $$0) {
      int $$1 = $$0.size();
      List<coy.a<jq<cwi>>> $$2 = new ArrayList<>($$1);
      List<Optional<daz.a>> $$3 = new ArrayList<>($$1);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         daw $$5 = $$0.get($$4);
         List<cwm> $$6 = b($$5);
         if ($$6.isEmpty()) {
            return a;
         }

         $$2.add(c($$6));
         $$3.add(Optional.of(new daz.a($$6, $$4)));
      }

      return new daz($$2, $$3);
   }

   public List<Optional<daz.a>> a() {
      return this.c;
   }

   public List<coy.a<jq<cwi>>> b() {
      return this.b;
   }

   public boolean c() {
      return this.c.isEmpty();
   }

   public static record a(List<cwm> a, int b) {
      public a(List<cwm> a, int b) {
         if (a.isEmpty()) {
            throw new IllegalArgumentException("Possible items list must be not empty");
         } else {
            this.a = a;
            this.b = b;
         }
      }
   }
}
