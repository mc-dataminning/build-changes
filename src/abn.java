import javax.annotation.Nullable;

public class abn implements wb<xu> {
   private static final int a = 1;
   private static final int b = 2;
   @Nullable
   private final afw c;
   @Nullable
   private final aqe d;

   public abn(@Nullable afw $$0, @Nullable aqe $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public abn(tl $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.d = $$0.b(aqe.class);
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
   public void a(tl $$0) {
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
   public afw a() {
      return this.c;
   }

   @Nullable
   public aqe d() {
      return this.d;
   }

   public void a(xu $$0) {
      $$0.a(this);
   }
}
