import javax.annotation.Nullable;

public class agi implements zo<acf> {
   public static final ze<vy, agi> a = zo.a(agi::a, agi::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final alr d;
   @Nullable
   private final awz e;

   public agi(@Nullable alr $$0, @Nullable awz $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private agi(vy $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(awz.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(vy $$0) {
      if (this.e != null) {
         if (this.d != null) {
            $$0.l(3);
            $$0.a(this.e);
            $$0.a(this.d);
         } else {
            $$0.l(1);
            $$0.a(this.e);
         }
      } else if (this.d != null) {
         $$0.l(2);
         $$0.a(this.d);
      } else {
         $$0.l(0);
      }
   }

   @Override
   public zq<agi> a() {
      return agy.aY;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   @Nullable
   public alr b() {
      return this.d;
   }

   @Nullable
   public awz e() {
      return this.e;
   }
}
