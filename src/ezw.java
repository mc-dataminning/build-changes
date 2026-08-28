import java.util.Objects;

public interface ezw {
   static ezw a() {
      return fab.a;
   }

   static ezw a(bui $$0) {
      Objects.requireNonNull($$0);

      return (ezw)(switch ($$0) {
         case cqo $$1 -> cqo.b($$1.dY()) ? new faf($$1, false) : new fab($$0, false);
         default -> new fab($$0, false);
      });
   }

   static ezw a(bui $$0, boolean $$1) {
      return new fab($$0, $$1);
   }

   boolean b();

   boolean a(fal var1, jh var2, boolean var3);

   boolean a(cwb var1);

   boolean a(ero var1, ero var2);

   fal a(dvo var1, deo var2, jh var3);
}
