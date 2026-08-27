import javax.annotation.Nullable;

public record aft(int a, @Nullable afx b) implements xf<afs> {
   private static final int c = 1048576;

   public static aft b(ui $$0) {
      int $$1 = $$0.n();
      return new aft($$1, a($$1, $$0));
   }

   private static afx a(int $$0, ui $$1) {
      return c($$1);
   }

   private static afx c(ui $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return afz.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(afs $$0) {
      $$0.a(this);
   }

   @Nullable
   public afx d() {
      return this.b;
   }
}
