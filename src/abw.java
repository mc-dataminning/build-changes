import javax.annotation.Nullable;

public class abw implements wk<yd> {
   private static final int a = 1;
   private static final int b = 2;
   @Nullable
   private final agg c;
   @Nullable
   private final aqo d;

   public abw(@Nullable agg $$0, @Nullable aqo $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public abw(tu $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.d = $$0.b(aqo.class);
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
   public agg a() {
      return this.c;
   }

   @Nullable
   public aqo d() {
      return this.d;
   }

   public void a(yd $$0) {
      $$0.a(this);
   }
}
