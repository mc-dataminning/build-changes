import javax.annotation.Nullable;

public record aji(int b, @Nullable ajm c) implements zl<ajh> {
   public static final zc<wb, aji> a = zl.a(aji::c, aji::a);
   private static final int d = 1048576;

   private static aji a(wb $$0) {
      int $$1 = $$0.l();
      return new aji($$1, a($$1, $$0));
   }

   private static ajm a(int $$0, wb $$1) {
      return b($$1);
   }

   private static ajm b(wb $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.k($$1);
         return ajo.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(wb $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zn<aji> a() {
      return ajf.f;
   }

   public void a(ajh $$0) {
      $$0.a(this);
   }

   @Nullable
   public ajm e() {
      return this.c;
   }
}
