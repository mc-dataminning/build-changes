import javax.annotation.Nullable;

public class afv implements zd<abs> {
   public static final yu<vs, afv> a = zd.a(afv::a, afv::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final ale d;
   @Nullable
   private final awm e;

   public afv(@Nullable ale $$0, @Nullable awm $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private afv(vs $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(awm.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(vs $$0) {
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
   public zf<afv> a() {
      return agl.aY;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   @Nullable
   public ale b() {
      return this.d;
   }

   @Nullable
   public awm e() {
      return this.e;
   }
}
