import javax.annotation.Nullable;

public class aar implements vf<wy> {
   private static final int a = 1;
   private static final int b = 2;
   @Nullable
   private final aey c;
   @Nullable
   private final apg d;

   public aar(@Nullable aey $$0, @Nullable apg $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public aar(sq $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.d = $$0.b(apg.class);
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
   public void a(sq $$0) {
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
   public aey a() {
      return this.c;
   }

   @Nullable
   public apg d() {
      return this.d;
   }

   public void a(wy $$0) {
      $$0.a(this);
   }
}
