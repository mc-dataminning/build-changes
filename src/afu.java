import javax.annotation.Nullable;

public class afu implements zc<abr> {
   public static final yt<vr, afu> a = zc.a(afu::a, afu::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final ald d;
   @Nullable
   private final awl e;

   public afu(@Nullable ald $$0, @Nullable awl $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private afu(vr $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(awl.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(vr $$0) {
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
   public ze<afu> a() {
      return agk.aY;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   @Nullable
   public ald b() {
      return this.d;
   }

   @Nullable
   public awl e() {
      return this.e;
   }
}
