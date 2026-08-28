import javax.annotation.Nullable;

public record ajm(int b, @Nullable ajq c) implements zp<ajl> {
   public static final zg<wf, ajm> a = zp.a(ajm::c, ajm::a);
   private static final int d = 1048576;

   private static ajm a(wf $$0) {
      int $$1 = $$0.l();
      return new ajm($$1, a($$1, $$0));
   }

   private static ajq a(int $$0, wf $$1) {
      return b($$1);
   }

   private static ajq b(wf $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.k($$1);
         return ajs.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(wf $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zr<ajm> a() {
      return ajj.f;
   }

   public void a(ajl $$0) {
      $$0.a(this);
   }

   @Nullable
   public ajq e() {
      return this.c;
   }
}
