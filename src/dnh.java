import java.util.List;
import java.util.Optional;

public interface dnh {
   boolean a(dkc var1, iw var2, ebg var3);

   boolean a(djz var1, azz var2, iw var3, ebg var4);

   void a(aru var1, azz var2, iw var3, ebg var4);

   static boolean a_(dkc $$0, iw $$1, ebg $$2) {
      return a(jc.c.a.a().toList(), $$0, $$1, $$2).isPresent();
   }

   static Optional<iw> a(djz $$0, iw $$1, ebg $$2) {
      return a(jc.c.a.c($$0.A), $$0, $$1, $$2);
   }

   private static Optional<iw> a(List<jc> $$0, dkc $$1, iw $$2, ebg $$3) {
      for (jc $$4 : $$0) {
         iw $$5 = $$2.a($$4);
         if ($$1.v($$5) && $$3.a($$1, $$5)) {
            return Optional.of($$5);
         }
      }

      return Optional.empty();
   }

   default iw a(iw $$0) {
      return switch (this.ar_()) {
         case a -> $$0.d();
         case b -> $$0;
      };
   }

   default dnh.a ar_() {
      return dnh.a.b;
   }

   public static enum a {
      a,
      b;
   }
}
