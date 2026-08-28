import javax.annotation.Nullable;

public class afp implements yw<abl> {
   public static final yn<vl, afp> a = yw.a(afp::a, afp::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final akv d;
   @Nullable
   private final awb e;

   public afp(@Nullable akv $$0, @Nullable awb $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private afp(vl $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(awb.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(vl $$0) {
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
   public yy<afp> a() {
      return age.aY;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   @Nullable
   public akv b() {
      return this.d;
   }

   @Nullable
   public awb e() {
      return this.e;
   }
}
