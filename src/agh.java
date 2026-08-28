import javax.annotation.Nullable;

public class agh implements zs<ach> {
   public static final zj<wi, agh> a = zs.a(agh::a, agh::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final all d;
   @Nullable
   private final awp e;

   public agh(@Nullable all $$0, @Nullable awp $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private agh(wi $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(awp.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(wi $$0) {
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
   public zu<agh> a() {
      return agw.aV;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   @Nullable
   public all b() {
      return this.d;
   }

   @Nullable
   public awp e() {
      return this.e;
   }
}
