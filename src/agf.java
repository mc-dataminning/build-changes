import javax.annotation.Nullable;

public class agf implements zw<aci> {
   public static final zn<wm, agf> a = zw.a(agf::a, agf::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final alf d;
   @Nullable
   private final awb e;

   public agf(@Nullable alf $$0, @Nullable awb $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private agf(wm $$0) {
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

   private void a(wm $$0) {
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
   public zy<agf> a() {
      return agu.aU;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   @Nullable
   public alf b() {
      return this.d;
   }

   @Nullable
   public awb e() {
      return this.e;
   }
}
