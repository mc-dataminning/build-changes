import javax.annotation.Nullable;

public record afg(int a, @Nullable afk b) implements wu<aff> {
   private static final int c = 1048576;

   public static afg b(ue $$0) {
      int $$1 = $$0.n();
      return new afg($$1, a($$1, $$0));
   }

   private static afk a(int $$0, ue $$1) {
      return c($$1);
   }

   private static afk c(ue $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return afm.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(ue $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(aff $$0) {
      $$0.a(this);
   }

   @Nullable
   public afk d() {
      return this.b;
   }
}
