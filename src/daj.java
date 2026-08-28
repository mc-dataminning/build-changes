import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class daj {
   public static final daj a = new daj(List.of(), List.of());
   private final List<cob.a<jo<cvn>>> b;
   private final List<Optional<daj.a>> c;

   private daj(List<cob.a<jo<cvn>>> $$0, List<Optional<daj.a>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private static cob.a<jo<cvn>> c(List<cvs> $$0) {
      return coc.a($$0.stream().map(cvs::i));
   }

   private static List<cvs> b(dag $$0) {
      return $$0.a().stream().map(cvs::new).toList();
   }

   public static daj a(dag $$0) {
      List<cvs> $$1 = b($$0);
      if ($$1.isEmpty()) {
         return a;
      } else {
         cob.a<jo<cvn>> $$2 = c($$1);
         daj.a $$3 = new daj.a($$1, 0);
         return new daj(List.of($$2), List.of(Optional.of($$3)));
      }
   }

   public static daj a(List<Optional<dag>> $$0) {
      int $$1 = $$0.size();
      List<cob.a<jo<cvn>>> $$2 = new ArrayList<>($$1);
      List<Optional<daj.a>> $$3 = new ArrayList<>($$1);
      int $$4 = 0;

      for (Optional<dag> $$5 : $$0) {
         if ($$5.isPresent()) {
            List<cvs> $$6 = b($$5.get());
            if ($$6.isEmpty()) {
               return a;
            }

            $$2.add(c($$6));
            $$3.add(Optional.of(new daj.a($$6, $$4++)));
         } else {
            $$3.add(Optional.empty());
         }
      }

      return new daj($$2, $$3);
   }

   public static daj b(List<dag> $$0) {
      int $$1 = $$0.size();
      List<cob.a<jo<cvn>>> $$2 = new ArrayList<>($$1);
      List<Optional<daj.a>> $$3 = new ArrayList<>($$1);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         dag $$5 = $$0.get($$4);
         List<cvs> $$6 = b($$5);
         if ($$6.isEmpty()) {
            return a;
         }

         $$2.add(c($$6));
         $$3.add(Optional.of(new daj.a($$6, $$4)));
      }

      return new daj($$2, $$3);
   }

   public List<Optional<daj.a>> a() {
      return this.c;
   }

   public List<cob.a<jo<cvn>>> b() {
      return this.b;
   }

   public boolean c() {
      return this.c.isEmpty();
   }

   public static record a(List<cvs> a, int b) {
      public a(List<cvs> a, int b) {
         if (a.isEmpty()) {
            throw new IllegalArgumentException("Possible items list must be not empty");
         } else {
            this.a = a;
            this.b = b;
         }
      }
   }
}
