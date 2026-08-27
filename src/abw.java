import javax.annotation.Nullable;

public class abw implements wk<yd> {
   private static final int a = 1;
   private static final int b = 2;
   @Nullable
   private final agi c;
   @Nullable
   private final aqs d;

   public abw(@Nullable agi $$0, @Nullable aqs $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public abw(tu $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.d = $$0.b(aqs.class);
      } else {
         this.d = null;
      }

      if (($$1 & 2) > 0) {
         this.c = $$0.t();
      } else {
         this.c = null;
      }
   }

   @Override
   public void a(tu $$0) {
      if (this.d != null) {
         if (this.c != null) {
            $$0.k(3);
            $$0.a(this.d);
            $$0.a(this.c);
         } else {
            $$0.k(1);
            $$0.a(this.d);
         }
      } else if (this.c != null) {
         $$0.k(2);
         $$0.a(this.c);
      } else {
         $$0.k(0);
      }
   }

   @Nullable
   public agi a() {
      return this.c;
   }

   @Nullable
   public aqs d() {
      return this.d;
   }

   public void a(yd $$0) {
      $$0.a(this);
   }
}
