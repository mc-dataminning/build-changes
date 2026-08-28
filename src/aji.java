import javax.annotation.Nullable;

public record aji(int b, @Nullable ajm c) implements zd<ajh> {
   public static final yu<vs, aji> a = zd.a(aji::c, aji::a);
   private static final int d = 1048576;

   private static aji a(vs $$0) {
      int $$1 = $$0.l();
      return new aji($$1, a($$1, $$0));
   }

   private static ajm a(int $$0, vs $$1) {
      return b($$1);
   }

   private static ajm b(vs $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.k($$1);
         return ajo.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(vs $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zf<aji> a() {
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
