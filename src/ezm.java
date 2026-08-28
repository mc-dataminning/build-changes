import java.util.Objects;

public interface ezm {
   static ezm a() {
      return ezr.a;
   }

   static ezm a(btz $$0) {
      Objects.requireNonNull($$0);

      return (ezm)(switch ($$0) {
         case cqf $$1 -> cqf.b($$1.dX()) ? new ezv($$1, false) : new ezr($$0, false);
         default -> new ezr($$0, false);
      });
   }

   static ezm a(btz $$0, boolean $$1) {
      return new ezr($$0, $$1);
   }

   boolean b();

   boolean a(fab var1, jg var2, boolean var3);

   boolean a(cvt var1);

   boolean a(ere var1, ere var2);

   fab a(dvd var1, dee var2, jg var3);
}
