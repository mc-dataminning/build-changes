import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dcc {
   public static final dcc a = new dcc(List.of(), List.of(), List.of());
   private final List<dbz> b;
   private final List<cqa.a<jq<cxk>>> c;
   private final List<Optional<dcc.a>> d;

   private dcc(List<dbz> $$0, List<cqa.a<jq<cxk>>> $$1, List<Optional<dcc.a>> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static cqa.a<jq<cxk>> a(dbz $$0) {
      return cqb.a($$0.a().stream());
   }

   public static dcc b(dbz $$0) {
      if ($$0.a().isEmpty()) {
         return a;
      } else {
         cqa.a<jq<cxk>> $$1 = a($$0);
         dcc.a $$2 = new dcc.a(0);
         return new dcc(List.of($$0), List.of($$1), List.of(Optional.of($$2)));
      }
   }

   public static dcc a(List<Optional<dbz>> $$0) {
      int $$1 = $$0.size();
      List<dbz> $$2 = new ArrayList<>($$1);
      List<cqa.a<jq<cxk>>> $$3 = new ArrayList<>($$1);
      List<Optional<dcc.a>> $$4 = new ArrayList<>($$1);
      int $$5 = 0;

      for (Optional<dbz> $$6 : $$0) {
         if ($$6.isPresent()) {
            dbz $$7 = $$6.get();
            if ($$7.a().isEmpty()) {
               return a;
            }

            $$2.add($$7);
            $$3.add(a($$7));
            $$4.add(Optional.of(new dcc.a($$5++)));
         } else {
            $$4.add(Optional.empty());
         }
      }

      return new dcc($$2, $$3, $$4);
   }

   public static dcc b(List<dbz> $$0) {
      int $$1 = $$0.size();
      List<cqa.a<jq<cxk>>> $$2 = new ArrayList<>($$1);
      List<Optional<dcc.a>> $$3 = new ArrayList<>($$1);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         dbz $$5 = $$0.get($$4);
         if ($$5.a().isEmpty()) {
            return a;
         }

         $$2.add(a($$5));
         $$3.add(Optional.of(new dcc.a($$4)));
      }

      return new dcc($$0, $$2, $$3);
   }

   public List<Optional<dcc.a>> a() {
      return this.d;
   }

   public List<dbz> b() {
      return this.b;
   }

   public List<cqa.a<jq<cxk>>> c() {
      return this.c;
   }

   public boolean d() {
      return this.d.isEmpty();
   }

   public static record a(int a) {
   }
}
