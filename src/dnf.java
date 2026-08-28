import java.util.List;
import java.util.Optional;

public interface dnf {
   boolean a(dka var1, iv var2, ebe var3);

   boolean a(djx var1, azx var2, iv var3, ebe var4);

   void a(ars var1, azx var2, iv var3, ebe var4);

   static boolean a_(dka $$0, iv $$1, ebe $$2) {
      return a(jb.c.a.a().toList(), $$0, $$1, $$2).isPresent();
   }

   static Optional<iv> a(djx $$0, iv $$1, ebe $$2) {
      return a(jb.c.a.c($$0.A), $$0, $$1, $$2);
   }

   private static Optional<iv> a(List<jb> $$0, dka $$1, iv $$2, ebe $$3) {
      for (jb $$4 : $$0) {
         iv $$5 = $$2.a($$4);
         if ($$1.v($$5) && $$3.a($$1, $$5)) {
            return Optional.of($$5);
         }
      }

      return Optional.empty();
   }

   default iv a(iv $$0) {
      return switch (this.ar_()) {
         case a -> $$0.d();
         case b -> $$0;
      };
   }

   default dnf.a ar_() {
      return dnf.a.b;
   }

   public static enum a {
      a,
      b;
   }
}
