import javax.annotation.Nullable;

public class afo implements yv<abk> {
   public static final ym<vl, afo> a = yv.a(afo::a, afo::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final aku d;
   @Nullable
   private final awb e;

   public afo(@Nullable aku $$0, @Nullable awb $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private afo(vl $$0) {
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
   public yx<afo> a() {
      return agd.aY;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   @Nullable
   public aku b() {
      return this.d;
   }

   @Nullable
   public awb e() {
      return this.e;
   }
}
