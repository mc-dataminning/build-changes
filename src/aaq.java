import javax.annotation.Nullable;

public class aaq implements ve<wx> {
   private static final int a = 1;
   private static final int b = 2;
   @Nullable
   private final aez c;
   @Nullable
   private final aph d;

   public aaq(@Nullable aez $$0, @Nullable aph $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public aaq(so $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.d = $$0.b(aph.class);
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
   public void a(so $$0) {
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
   public aez a() {
      return this.c;
   }

   @Nullable
   public aph d() {
      return this.d;
   }

   public void a(wx $$0) {
      $$0.a(this);
   }
}
