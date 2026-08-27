import javax.annotation.Nullable;

public class acr implements xd<yx> {
   private static final int a = 1;
   private static final int b = 2;
   @Nullable
   private final ahd c;
   @Nullable
   private final arn d;

   public acr(@Nullable ahd $$0, @Nullable arn $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public acr(ug $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.d = $$0.b(arn.class);
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
   public void a(ug $$0) {
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
   public ahd a() {
      return this.c;
   }

   @Nullable
   public arn d() {
      return this.d;
   }

   public void a(yx $$0) {
      $$0.a(this);
   }
}
