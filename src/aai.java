import javax.annotation.Nullable;

public class aai implements uw<wo> {
   private static final int a = 1;
   private static final int b = 2;
   @Nullable
   private final aep c;
   @Nullable
   private final aov d;

   public aai(@Nullable aep $$0, @Nullable aov $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public aai(sh $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.d = $$0.b(aov.class);
      } else {
         this.d = null;
      }

      if (($$1 & 2) > 0) {
         this.c = $$0.s();
      } else {
         this.c = null;
      }
   }

   @Override
   public void a(sh $$0) {
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
   public aep a() {
      return this.c;
   }

   @Nullable
   public aov d() {
      return this.d;
   }

   public void a(wo $$0) {
      $$0.a(this);
   }
}
