import javax.annotation.Nullable;

public class aew implements yp<aba> {
   public static final yg<vi, aew> a = yp.a(aew::a, aew::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final ajv d;
   @Nullable
   private final aup e;

   public aew(@Nullable ajv $$0, @Nullable aup $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private aew(vi $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(aup.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(vi $$0) {
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
   public yr<aew> a() {
      return afl.aU;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   @Nullable
   public ajv b() {
      return this.d;
   }

   @Nullable
   public aup e() {
      return this.e;
   }
}
