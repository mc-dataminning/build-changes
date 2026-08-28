import javax.annotation.Nullable;

public class age implements zv<ach> {
   public static final zm<wl, age> a = zv.a(age::a, age::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final ale d;
   @Nullable
   private final awa e;

   public age(@Nullable ale $$0, @Nullable awa $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private age(wl $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(awa.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(wl $$0) {
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
   public zx<age> a() {
      return agt.aU;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   @Nullable
   public ale b() {
      return this.d;
   }

   @Nullable
   public awa e() {
      return this.e;
   }
}
