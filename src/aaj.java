import javax.annotation.Nullable;

public class aaj implements ux<wp> {
   private static final int a = 1;
   private static final int b = 2;
   @Nullable
   private final aer c;
   @Nullable
   private final aox d;

   public aaj(@Nullable aer $$0, @Nullable aox $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public aaj(si $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.d = $$0.b(aox.class);
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
   public void a(si $$0) {
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
   public aer a() {
      return this.c;
   }

   @Nullable
   public aox d() {
      return this.d;
   }

   public void a(wp $$0) {
      $$0.a(this);
   }
}
