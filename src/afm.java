import javax.annotation.Nullable;

public class afm implements ze<abq> {
   public static final yv<vx, afm> a = ze.a(afm::a, afm::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final akm d;
   @Nullable
   private final avi e;

   public afm(@Nullable akm $$0, @Nullable avi $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private afm(vx $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(avi.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(vx $$0) {
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
   public zg<afm> a() {
      return agb.aU;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   @Nullable
   public akm b() {
      return this.d;
   }

   @Nullable
   public avi e() {
      return this.e;
   }
}
