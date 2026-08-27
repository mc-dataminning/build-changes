import javax.annotation.Nullable;

public class acu implements xf<za> {
   private static final int a = 1;
   private static final int b = 2;
   @Nullable
   private final ahg c;
   @Nullable
   private final art d;

   public acu(@Nullable ahg $$0, @Nullable art $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public acu(ui $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.d = $$0.b(art.class);
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
   public void a(ui $$0) {
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
   public ahg a() {
      return this.c;
   }

   @Nullable
   public art d() {
      return this.d;
   }

   public void a(za $$0) {
      $$0.a(this);
   }
}
