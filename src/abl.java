import javax.annotation.Nullable;

public class abl implements uo<abk> {
   private static final int a = 1048576;
   private final int b;
   @Nullable
   private final sf c;

   public abl(int $$0, @Nullable sf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public abl(sf $$0) {
      this.b = $$0.m();
      this.c = $$0.c($$0x -> {
         int $$1 = $$0x.readableBytes();
         if ($$1 >= 0 && $$1 <= 1048576) {
            return new sf($$0x.readBytes($$1));
         } else {
            throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
         }
      });
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$0x.writeBytes($$1.slice()));
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   @Nullable
   public sf c() {
      return this.c;
   }
}
