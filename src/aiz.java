import javax.annotation.Nullable;

public record aiz(int b, @Nullable ajd c) implements zl<aiy> {
   public static final zc<we, aiz> a = zl.a(aiz::c, aiz::a);
   private static final int d = 1048576;

   private static aiz a(we $$0) {
      int $$1 = $$0.l();
      return new aiz($$1, a($$1, $$0));
   }

   private static ajd a(int $$0, we $$1) {
      return b($$1);
   }

   private static ajd b(we $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return ajf.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(we $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zn<aiz> a() {
      return aiw.f;
   }

   public void a(aiy $$0) {
      $$0.a(this);
   }

   @Nullable
   public ajd e() {
      return this.c;
   }
}
