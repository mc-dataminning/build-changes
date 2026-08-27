import javax.annotation.Nullable;

public class aee implements xz<aai> {
   public static final xq<us, aee> a = xz.a(aee::a, aee::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final ajc d;
   @Nullable
   private final atq e;

   public aee(@Nullable ajc $$0, @Nullable atq $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private aee(us $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(atq.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(us $$0) {
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
   public yb<aee> a() {
      return aet.aU;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   @Nullable
   public ajc b() {
      return this.d;
   }

   @Nullable
   public atq e() {
      return this.e;
   }
}
