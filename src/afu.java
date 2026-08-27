import javax.annotation.Nullable;

public class afu implements zl<abw> {
   public static final zc<we, afu> a = zl.a(afu::a, afu::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final akt d;
   @Nullable
   private final avq e;

   public afu(@Nullable akt $$0, @Nullable avq $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private afu(we $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(avq.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(we $$0) {
      if (this.e != null) {
         if (this.d != null) {
            $$0.k(3);
            $$0.a(this.e);
            $$0.a(this.d);
         } else {
            $$0.k(1);
            $$0.a(this.e);
         }
      } else if (this.d != null) {
         $$0.k(2);
         $$0.a(this.d);
      } else {
         $$0.k(0);
      }
   }

   @Override
   public zn<afu> a() {
      return agj.aW;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   @Nullable
   public akt b() {
      return this.d;
   }

   @Nullable
   public avq e() {
      return this.e;
   }
}
