import javax.annotation.Nullable;

public record adl(int a, @Nullable adp b) implements vd<adk> {
   private static final int c = 1048576;

   public static adl b(so $$0) {
      int $$1 = $$0.m();
      return new adl($$1, a($$1, $$0));
   }

   private static adp a(int $$0, so $$1) {
      return c($$1);
   }

   private static adp c(so $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return adr.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(adk $$0) {
      $$0.a(this);
   }

   @Nullable
   public adp d() {
      return this.b;
   }
}
