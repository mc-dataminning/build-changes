import javax.annotation.Nullable;

public record aiq(int b, @Nullable aiu c) implements zb<aip> {
   public static final ys<vr, aiq> a = zb.a(aiq::c, aiq::a);
   private static final int d = 1048576;

   private static aiq a(vr $$0) {
      int $$1 = $$0.l();
      return new aiq($$1, a($$1, $$0));
   }

   private static aiu a(int $$0, vr $$1) {
      return b($$1);
   }

   private static aiu b(vr $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return aiw.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(vr $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zd<aiq> a() {
      return ain.f;
   }

   public void a(aip $$0) {
      $$0.a(this);
   }

   @Nullable
   public aiu e() {
      return this.c;
   }
}
