import javax.annotation.Nullable;

public class acv implements xg<zb> {
   private static final int a = 1;
   private static final int b = 2;
   @Nullable
   private final ahh c;
   @Nullable
   private final aru d;

   public acv(@Nullable ahh $$0, @Nullable aru $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public acv(uj $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.d = $$0.b(aru.class);
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
   public void a(uj $$0) {
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
   public ahh a() {
      return this.c;
   }

   @Nullable
   public aru d() {
      return this.d;
   }

   public void a(zb $$0) {
      $$0.a(this);
   }
}
