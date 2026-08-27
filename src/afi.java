import javax.annotation.Nullable;

public class afi implements zb<abm> {
   public static final ys<vu, afi> a = zb.a(afi::a, afi::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final akh d;
   @Nullable
   private final avd e;

   public afi(@Nullable akh $$0, @Nullable avd $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private afi(vu $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(avd.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(vu $$0) {
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
   public zd<afi> a() {
      return afx.aU;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   @Nullable
   public akh b() {
      return this.d;
   }

   @Nullable
   public avd e() {
      return this.e;
   }
}
