import javax.annotation.Nullable;

public class aei implements yb<aam> {
   public static final xs<uu, aei> a = yb.a(aei::a, aei::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final ajh d;
   @Nullable
   private final atz e;

   public aei(@Nullable ajh $$0, @Nullable atz $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private aei(uu $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(atz.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(uu $$0) {
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
   public yd<aei> a() {
      return aex.aU;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   @Nullable
   public ajh b() {
      return this.d;
   }

   @Nullable
   public atz e() {
      return this.e;
   }
}
