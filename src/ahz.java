import javax.annotation.Nullable;

public record ahz(int b, @Nullable aid c) implements yn<ahy> {
   public static final ye<vg, ahz> a = yn.a(ahz::c, ahz::a);
   private static final int d = 1048576;

   private static ahz a(vg $$0) {
      int $$1 = $$0.l();
      return new ahz($$1, a($$1, $$0));
   }

   private static aid a(int $$0, vg $$1) {
      return b($$1);
   }

   private static aid b(vg $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return aif.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(vg $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yp<ahz> a() {
      return ahw.f;
   }

   public void a(ahy $$0) {
      $$0.a(this);
   }

   @Nullable
   public aid e() {
      return this.c;
   }
}
