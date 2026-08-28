import javax.annotation.Nullable;

public class afz implements zh<abw> {
   public static final yy<vw, afz> a = zh.a(afz::a, afz::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final ali d;
   @Nullable
   private final awq e;

   public afz(@Nullable ali $$0, @Nullable awq $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private afz(vw $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(awq.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(vw $$0) {
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
   public zj<afz> a() {
      return agp.aY;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   @Nullable
   public ali b() {
      return this.d;
   }

   @Nullable
   public awq e() {
      return this.e;
   }
}
