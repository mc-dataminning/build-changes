import javax.annotation.Nullable;

public class aeb implements xx<aag> {
   public static final xo<uq, aeb> a = xx.a(aeb::a, aeb::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final aiy d;
   @Nullable
   private final atl e;

   public aeb(@Nullable aiy $$0, @Nullable atl $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private aeb(uq $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(atl.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.s();
      } else {
         this.d = null;
      }
   }

   private void a(uq $$0) {
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
   public xz<aeb> a() {
      return aeq.aT;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   @Nullable
   public aiy b() {
      return this.d;
   }

   @Nullable
   public atl e() {
      return this.e;
   }
}
