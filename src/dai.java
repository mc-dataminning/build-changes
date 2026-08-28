import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dai {
   public static final dai a = new dai(List.of(), List.of());
   private final List<col.a<jp<cvt>>> b;
   private final List<Optional<dai.a>> c;

   private dai(List<col.a<jp<cvt>>> $$0, List<Optional<dai.a>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private static col.a<jp<cvt>> c(List<cvx> $$0) {
      return com.a($$0.stream().map(cvx::i));
   }

   private static List<cvx> b(daf $$0) {
      return $$0.a().stream().map(cvx::new).toList();
   }

   public static dai a(daf $$0) {
      List<cvx> $$1 = b($$0);
      if ($$1.isEmpty()) {
         return a;
      } else {
         col.a<jp<cvt>> $$2 = c($$1);
         dai.a $$3 = new dai.a($$1, 0);
         return new dai(List.of($$2), List.of(Optional.of($$3)));
      }
   }

   public static dai a(List<Optional<daf>> $$0) {
      int $$1 = $$0.size();
      List<col.a<jp<cvt>>> $$2 = new ArrayList<>($$1);
      List<Optional<dai.a>> $$3 = new ArrayList<>($$1);
      int $$4 = 0;

      for (Optional<daf> $$5 : $$0) {
         if ($$5.isPresent()) {
            List<cvx> $$6 = b($$5.get());
            if ($$6.isEmpty()) {
               return a;
            }

            $$2.add(c($$6));
            $$3.add(Optional.of(new dai.a($$6, $$4++)));
         } else {
            $$3.add(Optional.empty());
         }
      }

      return new dai($$2, $$3);
   }

   public static dai b(List<daf> $$0) {
      int $$1 = $$0.size();
      List<col.a<jp<cvt>>> $$2 = new ArrayList<>($$1);
      List<Optional<dai.a>> $$3 = new ArrayList<>($$1);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         daf $$5 = $$0.get($$4);
         List<cvx> $$6 = b($$5);
         if ($$6.isEmpty()) {
            return a;
         }

         $$2.add(c($$6));
         $$3.add(Optional.of(new dai.a($$6, $$4)));
      }

      return new dai($$2, $$3);
   }

   public List<Optional<dai.a>> a() {
      return this.c;
   }

   public List<col.a<jp<cvt>>> b() {
      return this.b;
   }

   public boolean c() {
      return this.c.isEmpty();
   }

   public static record a(List<cvx> a, int b) {
      public a(List<cvx> a, int b) {
         if (a.isEmpty()) {
            throw new IllegalArgumentException("Possible items list must be not empty");
         } else {
            this.a = a;
            this.b = b;
         }
      }
   }
}
