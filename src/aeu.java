import javax.annotation.Nullable;

public class aeu implements yn<aay> {
   public static final ye<vg, aeu> a = yn.a(aeu::a, aeu::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final ajt d;
   @Nullable
   private final aun e;

   public aeu(@Nullable ajt $$0, @Nullable aun $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private aeu(vg $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(aun.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(vg $$0) {
      if (this.e != null) {
         if (this.d != null) {
            $$0.k(3);
            $$0.a(this.e);
            $$0.a(this.d);
         } else {
            $$0.k(1);
            $$0.a(this.e);
         }
      } else if (this.d != null) {
         $$0.k(2);
         $$0.a(this.d);
      } else {
         $$0.k(0);
      }
   }

   @Override
   public yp<aeu> a() {
      return afj.aU;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   @Nullable
   public ajt b() {
      return this.d;
   }

   @Nullable
   public aun e() {
      return this.e;
   }
}
