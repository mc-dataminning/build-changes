import javax.annotation.Nullable;

public class aaq implements ve<wx> {
   private static final int a = 1;
   private static final int b = 2;
   @Nullable
   private final aex c;
   @Nullable
   private final apf d;

   public aaq(@Nullable aex $$0, @Nullable apf $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public aaq(sp $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.d = $$0.b(apf.class);
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
   public void a(sp $$0) {
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
   public aex a() {
      return this.c;
   }

   @Nullable
   public apf d() {
      return this.d;
   }

   public void a(wx $$0) {
      $$0.a(this);
   }
}
