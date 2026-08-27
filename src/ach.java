import javax.annotation.Nullable;

public class ach implements wu<yo> {
   private static final int a = 1;
   private static final int b = 2;
   @Nullable
   private final agt c;
   @Nullable
   private final ard d;

   public ach(@Nullable agt $$0, @Nullable ard $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public ach(ue $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.d = $$0.b(ard.class);
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
   public void a(ue $$0) {
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
   public agt a() {
      return this.c;
   }

   @Nullable
   public ard d() {
      return this.d;
   }

   public void a(yo $$0) {
      $$0.a(this);
   }
}
