import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dcd {
   public static final dcd a = new dcd(List.of(), List.of(), List.of());
   private final List<dca> b;
   private final List<cqb.a<jq<cxl>>> c;
   private final List<Optional<dcd.a>> d;

   private dcd(List<dca> $$0, List<cqb.a<jq<cxl>>> $$1, List<Optional<dcd.a>> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static cqb.a<jq<cxl>> a(dca $$0) {
      return cqc.a($$0.a().stream());
   }

   public static dcd b(dca $$0) {
      if ($$0.a().isEmpty()) {
         return a;
      } else {
         cqb.a<jq<cxl>> $$1 = a($$0);
         dcd.a $$2 = new dcd.a(0);
         return new dcd(List.of($$0), List.of($$1), List.of(Optional.of($$2)));
      }
   }

   public static dcd a(List<Optional<dca>> $$0) {
      int $$1 = $$0.size();
      List<dca> $$2 = new ArrayList<>($$1);
      List<cqb.a<jq<cxl>>> $$3 = new ArrayList<>($$1);
      List<Optional<dcd.a>> $$4 = new ArrayList<>($$1);
      int $$5 = 0;

      for (Optional<dca> $$6 : $$0) {
         if ($$6.isPresent()) {
            dca $$7 = $$6.get();
            if ($$7.a().isEmpty()) {
               return a;
            }

            $$2.add($$7);
            $$3.add(a($$7));
            $$4.add(Optional.of(new dcd.a($$5++)));
         } else {
            $$4.add(Optional.empty());
         }
      }

      return new dcd($$2, $$3, $$4);
   }

   public static dcd b(List<dca> $$0) {
      int $$1 = $$0.size();
      List<cqb.a<jq<cxl>>> $$2 = new ArrayList<>($$1);
      List<Optional<dcd.a>> $$3 = new ArrayList<>($$1);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         dca $$5 = $$0.get($$4);
         if ($$5.a().isEmpty()) {
            return a;
         }

         $$2.add(a($$5));
         $$3.add(Optional.of(new dcd.a($$4)));
      }

      return new dcd($$0, $$2, $$3);
   }

   public List<Optional<dcd.a>> a() {
      return this.d;
   }

   public List<dca> b() {
      return this.b;
   }

   public List<cqb.a<jq<cxl>>> c() {
      return this.c;
   }

   public boolean d() {
      return this.d.isEmpty();
   }

   public static record a(int a) {
   }
}
