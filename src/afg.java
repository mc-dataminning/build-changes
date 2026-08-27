import javax.annotation.Nullable;

public class afg implements yz<abk> {
   public static final yq<vs, afg> a = yz.a(afg::a, afg::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final akf d;
   @Nullable
   private final ava e;

   public afg(@Nullable akf $$0, @Nullable ava $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private afg(vs $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(ava.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(vs $$0) {
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
   public zb<afg> a() {
      return afv.aU;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   @Nullable
   public akf b() {
      return this.d;
   }

   @Nullable
   public ava e() {
      return this.e;
   }
}
