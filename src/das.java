import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class das {
   public static final das a = new das(List.of(), List.of());
   private final List<cov.a<jq<cwb>>> b;
   private final List<Optional<das.a>> c;

   private das(List<cov.a<jq<cwb>>> $$0, List<Optional<das.a>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private static cov.a<jq<cwb>> c(List<cwf> $$0) {
      return cow.a($$0.stream().map(cwf::i));
   }

   private static List<cwf> b(dap $$0) {
      return $$0.a().stream().map(cwf::new).toList();
   }

   public static das a(dap $$0) {
      List<cwf> $$1 = b($$0);
      if ($$1.isEmpty()) {
         return a;
      } else {
         cov.a<jq<cwb>> $$2 = c($$1);
         das.a $$3 = new das.a($$1, 0);
         return new das(List.of($$2), List.of(Optional.of($$3)));
      }
   }

   public static das a(List<Optional<dap>> $$0) {
      int $$1 = $$0.size();
      List<cov.a<jq<cwb>>> $$2 = new ArrayList<>($$1);
      List<Optional<das.a>> $$3 = new ArrayList<>($$1);
      int $$4 = 0;

      for (Optional<dap> $$5 : $$0) {
         if ($$5.isPresent()) {
            List<cwf> $$6 = b($$5.get());
            if ($$6.isEmpty()) {
               return a;
            }

            $$2.add(c($$6));
            $$3.add(Optional.of(new das.a($$6, $$4++)));
         } else {
            $$3.add(Optional.empty());
         }
      }

      return new das($$2, $$3);
   }

   public static das b(List<dap> $$0) {
      int $$1 = $$0.size();
      List<cov.a<jq<cwb>>> $$2 = new ArrayList<>($$1);
      List<Optional<das.a>> $$3 = new ArrayList<>($$1);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         dap $$5 = $$0.get($$4);
         List<cwf> $$6 = b($$5);
         if ($$6.isEmpty()) {
            return a;
         }

         $$2.add(c($$6));
         $$3.add(Optional.of(new das.a($$6, $$4)));
      }

      return new das($$2, $$3);
   }

   public List<Optional<das.a>> a() {
      return this.c;
   }

   public List<cov.a<jq<cwb>>> b() {
      return this.b;
   }

   public boolean c() {
      return this.c.isEmpty();
   }

   public static record a(List<cwf> a, int b) {
      public a(List<cwf> a, int b) {
         if (a.isEmpty()) {
            throw new IllegalArgumentException("Possible items list must be not empty");
         } else {
            this.a = a;
            this.b = b;
         }
      }
   }
}
