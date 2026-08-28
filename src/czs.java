import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class czs {
   public static final czs a = new czs(List.of(), List.of());
   private final List<cnt.a<jn<cvg>>> b;
   private final List<Optional<czs.a>> c;

   private czs(List<cnt.a<jn<cvg>>> $$0, List<Optional<czs.a>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private static cnt.a<jn<cvg>> c(List<cvl> $$0) {
      return cnu.a($$0.stream().map(cvl::i));
   }

   private static List<cvl> b(czp $$0) {
      return $$0.a().stream().map(cvl::new).toList();
   }

   public static czs a(czp $$0) {
      List<cvl> $$1 = b($$0);
      if ($$1.isEmpty()) {
         return a;
      } else {
         cnt.a<jn<cvg>> $$2 = c($$1);
         czs.a $$3 = new czs.a($$1, 0);
         return new czs(List.of($$2), List.of(Optional.of($$3)));
      }
   }

   public static czs a(List<Optional<czp>> $$0) {
      int $$1 = $$0.size();
      List<cnt.a<jn<cvg>>> $$2 = new ArrayList<>($$1);
      List<Optional<czs.a>> $$3 = new ArrayList<>($$1);
      int $$4 = 0;

      for (Optional<czp> $$5 : $$0) {
         if ($$5.isPresent()) {
            List<cvl> $$6 = b($$5.get());
            if ($$6.isEmpty()) {
               return a;
            }

            $$2.add(c($$6));
            $$3.add(Optional.of(new czs.a($$6, $$4++)));
         } else {
            $$3.add(Optional.empty());
         }
      }

      return new czs($$2, $$3);
   }

   public static czs b(List<czp> $$0) {
      int $$1 = $$0.size();
      List<cnt.a<jn<cvg>>> $$2 = new ArrayList<>($$1);
      List<Optional<czs.a>> $$3 = new ArrayList<>($$1);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         czp $$5 = $$0.get($$4);
         List<cvl> $$6 = b($$5);
         if ($$6.isEmpty()) {
            return a;
         }

         $$2.add(c($$6));
         $$3.add(Optional.of(new czs.a($$6, $$4)));
      }

      return new czs($$2, $$3);
   }

   public List<Optional<czs.a>> a() {
      return this.c;
   }

   public List<cnt.a<jn<cvg>>> b() {
      return this.b;
   }

   public boolean c() {
      return this.c.isEmpty();
   }

   public static record a(List<cvl> a, int b) {
      public a(List<cvl> a, int b) {
         if (a.isEmpty()) {
            throw new IllegalArgumentException("Possible items list must be not empty");
         } else {
            this.a = a;
            this.b = b;
         }
      }
   }
}
