import javax.annotation.Nullable;

public class aam implements va<ws> {
   private static final int a = 1;
   private static final int b = 2;
   @Nullable
   private final aeu c;
   @Nullable
   private final apa d;

   public aam(@Nullable aeu $$0, @Nullable apa $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public aam(sl $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.d = $$0.b(apa.class);
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
   public void a(sl $$0) {
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
   public aeu a() {
      return this.c;
   }

   @Nullable
   public apa d() {
      return this.d;
   }

   public void a(ws $$0) {
      $$0.a(this);
   }
}
