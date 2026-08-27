import javax.annotation.Nullable;

public record ais(int b, @Nullable aiw c) implements ze<air> {
   public static final yv<vx, ais> a = ze.a(ais::c, ais::a);
   private static final int d = 1048576;

   private static ais a(vx $$0) {
      int $$1 = $$0.l();
      return new ais($$1, a($$1, $$0));
   }

   private static aiw a(int $$0, vx $$1) {
      return b($$1);
   }

   private static aiw b(vx $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return aiy.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(vx $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zg<ais> a() {
      return aip.f;
   }

   public void a(air $$0) {
      $$0.a(this);
   }

   @Nullable
   public aiw e() {
      return this.c;
   }
}
