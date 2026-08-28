import javax.annotation.Nullable;

public record aix(int b, @Nullable ajb c) implements zg<aiw> {
   public static final yx<vw, aix> a = zg.a(aix::c, aix::a);
   private static final int d = 1048576;

   private static aix a(vw $$0) {
      int $$1 = $$0.l();
      return new aix($$1, a($$1, $$0));
   }

   private static ajb a(int $$0, vw $$1) {
      return b($$1);
   }

   private static ajb b(vw $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return ajd.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(vw $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zi<aix> a() {
      return aiu.f;
   }

   public void a(aiw $$0) {
      $$0.a(this);
   }

   @Nullable
   public ajb e() {
      return this.c;
   }
}
