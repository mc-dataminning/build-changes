import java.util.List;
import java.util.Optional;

public interface dnr {
   boolean a(dkm var1, iw var2, ebq var3);

   boolean a(dkj var1, bai var2, iw var3, ebq var4);

   void a(asb var1, bai var2, iw var3, ebq var4);

   static boolean a_(dkm $$0, iw $$1, ebq $$2) {
      return a(jc.c.a.a().toList(), $$0, $$1, $$2).isPresent();
   }

   static Optional<iw> a(dkj $$0, iw $$1, ebq $$2) {
      return a(jc.c.a.c($$0.A), $$0, $$1, $$2);
   }

   private static Optional<iw> a(List<jc> $$0, dkm $$1, iw $$2, ebq $$3) {
      for (jc $$4 : $$0) {
         iw $$5 = $$2.a($$4);
         if ($$1.v($$5) && $$3.a($$1, $$5)) {
            return Optional.of($$5);
         }
      }

      return Optional.empty();
   }

   default iw a(iw $$0) {
      return switch (this.an_()) {
         case a -> $$0.d();
         case b -> $$0;
      };
   }

   default dnr.a an_() {
      return dnr.a.b;
   }

   public static enum a {
      a,
      b;
   }
}
