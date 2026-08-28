import javax.annotation.Nullable;

public class agb implements zj<aby> {
   public static final za<vy, agb> a = zj.a(agb::a, agb::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final alk d;
   @Nullable
   private final aws e;

   public agb(@Nullable alk $$0, @Nullable aws $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private agb(vy $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(aws.class);
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
   public zl<agb> a() {
      return agr.aY;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   @Nullable
   public alk b() {
      return this.d;
   }

   @Nullable
   public aws e() {
      return this.e;
   }
}
