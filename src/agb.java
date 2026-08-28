import javax.annotation.Nullable;

public class agb implements zs<ace> {
   public static final zj<wl, agb> a = zs.a(agb::a, agb::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final alb d;
   @Nullable
   private final avx e;

   public agb(@Nullable alb $$0, @Nullable avx $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private agb(wl $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(avx.class);
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
   public zu<agb> a() {
      return agq.aU;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   @Nullable
   public alb b() {
      return this.d;
   }

   @Nullable
   public avx e() {
      return this.e;
   }
}
