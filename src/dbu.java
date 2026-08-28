import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dbu {
   public static final dbu a = new dbu(List.of(), List.of(), List.of());
   private final List<dbr> b;
   private final List<cps.a<jq<cxc>>> c;
   private final List<Optional<dbu.a>> d;

   private dbu(List<dbr> $$0, List<cps.a<jq<cxc>>> $$1, List<Optional<dbu.a>> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static cps.a<jq<cxc>> a(dbr $$0) {
      return cpt.a($$0.a().stream());
   }

   public static dbu b(dbr $$0) {
      if ($$0.a().isEmpty()) {
         return a;
      } else {
         cps.a<jq<cxc>> $$1 = a($$0);
         dbu.a $$2 = new dbu.a(0);
         return new dbu(List.of($$0), List.of($$1), List.of(Optional.of($$2)));
      }
   }

   public static dbu a(List<Optional<dbr>> $$0) {
      int $$1 = $$0.size();
      List<dbr> $$2 = new ArrayList<>($$1);
      List<cps.a<jq<cxc>>> $$3 = new ArrayList<>($$1);
      List<Optional<dbu.a>> $$4 = new ArrayList<>($$1);
      int $$5 = 0;

      for (Optional<dbr> $$6 : $$0) {
         if ($$6.isPresent()) {
            dbr $$7 = $$6.get();
            if ($$7.a().isEmpty()) {
               return a;
            }

            $$2.add($$7);
            $$3.add(a($$7));
            $$4.add(Optional.of(new dbu.a($$5++)));
         } else {
            $$4.add(Optional.empty());
         }
      }

      return new dbu($$2, $$3, $$4);
   }

   public static dbu b(List<dbr> $$0) {
      int $$1 = $$0.size();
      List<cps.a<jq<cxc>>> $$2 = new ArrayList<>($$1);
      List<Optional<dbu.a>> $$3 = new ArrayList<>($$1);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         dbr $$5 = $$0.get($$4);
         if ($$5.a().isEmpty()) {
            return a;
         }

         $$2.add(a($$5));
         $$3.add(Optional.of(new dbu.a($$4)));
      }

      return new dbu($$0, $$2, $$3);
   }

   public List<Optional<dbu.a>> a() {
      return this.d;
   }

   public List<dbr> b() {
      return this.b;
   }

   public List<cps.a<jq<cxc>>> c() {
      return this.c;
   }

   public boolean d() {
      return this.d.isEmpty();
   }

   public static record a(int a) {
   }
}
