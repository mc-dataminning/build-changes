import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dby {
   public static final dby a = new dby(List.of(), List.of(), List.of());
   private final List<dbv> b;
   private final List<cpw.a<jq<cxg>>> c;
   private final List<Optional<dby.a>> d;

   private dby(List<dbv> $$0, List<cpw.a<jq<cxg>>> $$1, List<Optional<dby.a>> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static cpw.a<jq<cxg>> a(dbv $$0) {
      return cpx.a($$0.a().stream());
   }

   public static dby b(dbv $$0) {
      if ($$0.a().isEmpty()) {
         return a;
      } else {
         cpw.a<jq<cxg>> $$1 = a($$0);
         dby.a $$2 = new dby.a(0);
         return new dby(List.of($$0), List.of($$1), List.of(Optional.of($$2)));
      }
   }

   public static dby a(List<Optional<dbv>> $$0) {
      int $$1 = $$0.size();
      List<dbv> $$2 = new ArrayList<>($$1);
      List<cpw.a<jq<cxg>>> $$3 = new ArrayList<>($$1);
      List<Optional<dby.a>> $$4 = new ArrayList<>($$1);
      int $$5 = 0;

      for (Optional<dbv> $$6 : $$0) {
         if ($$6.isPresent()) {
            dbv $$7 = $$6.get();
            if ($$7.a().isEmpty()) {
               return a;
            }

            $$2.add($$7);
            $$3.add(a($$7));
            $$4.add(Optional.of(new dby.a($$5++)));
         } else {
            $$4.add(Optional.empty());
         }
      }

      return new dby($$2, $$3, $$4);
   }

   public static dby b(List<dbv> $$0) {
      int $$1 = $$0.size();
      List<cpw.a<jq<cxg>>> $$2 = new ArrayList<>($$1);
      List<Optional<dby.a>> $$3 = new ArrayList<>($$1);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         dbv $$5 = $$0.get($$4);
         if ($$5.a().isEmpty()) {
            return a;
         }

         $$2.add(a($$5));
         $$3.add(Optional.of(new dby.a($$4)));
      }

      return new dby($$0, $$2, $$3);
   }

   public List<Optional<dby.a>> a() {
      return this.d;
   }

   public List<dbv> b() {
      return this.b;
   }

   public List<cpw.a<jq<cxg>>> c() {
      return this.c;
   }

   public boolean d() {
      return this.d.isEmpty();
   }

   public static record a(int a) {
   }
}
