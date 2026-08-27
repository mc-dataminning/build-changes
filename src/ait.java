import javax.annotation.Nullable;

public record ait(int b, @Nullable aix c) implements ze<ais> {
   public static final yv<vx, ait> a = ze.a(ait::c, ait::a);
   private static final int d = 1048576;

   private static ait a(vx $$0) {
      int $$1 = $$0.l();
      return new ait($$1, a($$1, $$0));
   }

   private static aix a(int $$0, vx $$1) {
      return b($$1);
   }

   private static aix b(vx $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return aiz.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(vx $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zg<ait> a() {
      return aiq.f;
   }

   public void a(ais $$0) {
      $$0.a(this);
   }

   @Nullable
   public aix e() {
      return this.c;
   }
}
